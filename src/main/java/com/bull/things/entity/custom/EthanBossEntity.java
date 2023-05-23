package com.bull.things.entity.custom;

import com.bull.things.sound.ModSounds;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerBossEvent;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.BossEvent;
import net.minecraft.world.Difficulty;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.FlyingMob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.control.MoveControl;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.item.PrimedTnt;
import net.minecraft.world.entity.monster.Enemy;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.RangedAttackMob;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.LargeFireball;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import software.bernie.geckolib3.core.AnimationState;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;
import software.bernie.geckolib3.util.GeckoLibUtil;

import java.util.EnumSet;

public class EthanBossEntity extends FlyingMob implements IAnimatable, Enemy, RangedAttackMob {
    public void checkDespawn() {
        if (this.level.getDifficulty() == Difficulty.PEACEFUL && this.shouldDespawnInPeaceful()) {
            this.discard();
        } else {
            this.noActionTime = 0;
        }
    }
    private int explosionPower = 1;
    private static final EntityDataAccessor<Boolean> DATA_IS_CHARGING = SynchedEntityData.defineId(EthanBossEntity.class, EntityDataSerializers.BOOLEAN);
    private AnimationFactory factory = GeckoLibUtil.createFactory(this);
    public EthanBossEntity(EntityType<? extends FlyingMob> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
        this.moveControl = new DrHakimMoveControl(this);
        this.xpReward = 5000;
    }
    private final ServerBossEvent bossInfo = new ServerBossEvent(Component.literal("Ethan"), BossEvent.BossBarColor.BLUE, BossEvent.BossBarOverlay.PROGRESS);
    @Override
    public void startSeenByPlayer(ServerPlayer player) {
        super.startSeenByPlayer(player);
        this.bossInfo.addPlayer(player);
    }

    @Override
    public void stopSeenByPlayer(ServerPlayer player) {
        super.stopSeenByPlayer(player);
        this.bossInfo.removePlayer(player);
    }
    public static AttributeSupplier setAttributes() {
        return Monster.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 500.0D)
                .add(Attributes.ATTACK_DAMAGE, 8.0f)
                .add(Attributes.ATTACK_SPEED, 4.0f)
                .add(Attributes.ATTACK_KNOCKBACK, 1.0f)
                .add(Attributes.FLYING_SPEED, 30.0f).add(Attributes.FOLLOW_RANGE, 100.0f).build();
    }
    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(7, new RandomFloatAroundGoal(this));
        this.goalSelector.addGoal(7, new DrHakimLookGoal(this));
        this.goalSelector.addGoal(7, new DrHakimShootFireballGoal(this));

        this.targetSelector.addGoal(1, new NearestAttackableTargetGoal<>(this, Player.class, 20, true, false, (p_32755_) -> {return Math.abs(p_32755_.getY() - this.getY()) <= 4.0D;}));
    }


    private <E extends IAnimatable> PlayState predicate(AnimationEvent<E> event) {
        if (event.isMoving()) {
            event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.ethanboss.walk", true));
            return PlayState.CONTINUE;
        }
        event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.ethanboss.idle", true));
        return PlayState.CONTINUE;
    }
    private PlayState attackPredicate(AnimationEvent event) {
        if(this.swinging && event.getController().getAnimationState().equals(AnimationState.Stopped)) {
            event.getController().markNeedsReload();
            event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.ethanboss.attack", false));
            this.swinging = false;
        }
        return PlayState.CONTINUE;
    }


    @Override
    public void registerControllers(AnimationData data) {
        data.addAnimationController(new AnimationController(this, "controller",
                0, this::predicate));
        data.addAnimationController(new AnimationController(this, "attackController",
                0, this::attackPredicate));
    }



    @Override
    public AnimationFactory getFactory() {
        return factory;
    }
    protected void playStepSound(BlockPos pos, BlockState blockIn) {
        this.playSound(SoundEvents.SAND_STEP, 1.0F, 0.5F);
    }

    protected SoundEvent getAmbientSound() {
        return ModSounds.DR_HAKIM_AMBIENT.get();
    }

    protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
        return ModSounds.DR_HAKIM_HURT.get();
    }

    protected SoundEvent getDeathSound() {
        return ModSounds.DR_HAKIM_DIE.get();
    }

    protected float getSoundVolume() {
        return 1.0F;
    }

    @Override
    public void tick() {
        super.tick();
        this.bossInfo.setProgress(this.getHealth() / this.getMaxHealth());
    }

    @Override
    public void performRangedAttack(LivingEntity pTarget, float pVelocity) {
    }
    static class DrHakimShootFireballGoal extends Goal {
        private final EthanBossEntity drHakimEntity;
        public int chargeTime;

        public DrHakimShootFireballGoal(EthanBossEntity drHakimEntity) {
            this.drHakimEntity = drHakimEntity;
        }

        /**
         * Returns whether execution should begin. You can also read and cache any state necessary for execution in this
         * method as well.
         */
        public boolean canUse() {
            return this.drHakimEntity.getTarget() != null;
        }

        /**
         * Execute a one shot task or start executing a continuous task
         */
        public void start() {
            this.chargeTime = 0;
        }

        /**
         * Reset the task's internal state. Called when this task is interrupted by another one
         */
        public void stop() {
            this.drHakimEntity.setCharging(false);
        }

        public boolean requiresUpdateEveryTick() {
            return true;
        }

        /**
         * Keep ticking a continuous task that has already been started
         */
        public void tick() {
            LivingEntity livingentity = this.drHakimEntity.getTarget();
            if (livingentity != null) {
                double d0 = 64.0D;
                if (livingentity.distanceToSqr(this.drHakimEntity) < 4096.0D && this.drHakimEntity.hasLineOfSight(livingentity)) {
                    Level level = this.drHakimEntity.level;
                    ++this.chargeTime;
                    if (this.chargeTime == 10 && !this.drHakimEntity.isSilent()) {
                        level.levelEvent((Player)null, 1015, this.drHakimEntity.blockPosition(), 0);
                    }

                    if (this.chargeTime == 15) {
                        double d1 = 4.0D;
                        Vec3 vec3 = this.drHakimEntity.getViewVector(1.0F);
                        double d2 = livingentity.getX() - (this.drHakimEntity.getX() + vec3.x * 1.0D);
                        double d3 = livingentity.getY(0.5D) - (0.5D + this.drHakimEntity.getY(0.5D));
                        double d4 = livingentity.getZ() - (this.drHakimEntity.getZ() + vec3.z * 1.0D);
                        if (!this.drHakimEntity.isSilent()) {
                            level.levelEvent((Player)null, 1016, this.drHakimEntity.blockPosition(), 0);
                        }

                        PrimedTnt tnt = new PrimedTnt(level, d2, d3, d4, this.drHakimEntity);
                        tnt.setPos(this.drHakimEntity.getX() + vec3.x * 1.0D, this.drHakimEntity.getY(0.5D) + 0.5D, tnt.getZ() + vec3.z * 1.0D);
                        level.addFreshEntity(tnt);
                        this.chargeTime = -5;
                    }
                } else if (this.chargeTime > 0) {
                    --this.chargeTime;
                }

                this.drHakimEntity.setCharging(this.chargeTime > 10);
            }
        }
    }
    public boolean isCharging() {
        return this.entityData.get(DATA_IS_CHARGING);
    }

    public void setCharging(boolean pCharging) {
        this.entityData.set(DATA_IS_CHARGING, pCharging);
    }
    public int getExplosionPower() {
        return this.explosionPower;
    }
    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(DATA_IS_CHARGING, false);
    }
    static class DrHakimMoveControl extends MoveControl {
        private final EthanBossEntity drHakimEntity;
        private int floatDuration;

        public DrHakimMoveControl(EthanBossEntity drHakimEntity) {
            super(drHakimEntity);
            this.drHakimEntity = drHakimEntity;
        }

        public void tick() {
            if (this.operation == Operation.MOVE_TO) {
                if (this.floatDuration-- <= 0) {
                    this.floatDuration += this.drHakimEntity.getRandom().nextInt(5) + 2;
                    Vec3 vec3 = new Vec3(this.wantedX - this.drHakimEntity.getX(), this.wantedY - this.drHakimEntity.getY(), this.wantedZ - this.drHakimEntity.getZ());
                    double d0 = vec3.length();
                    vec3 = vec3.normalize();
                    if (this.canReach(vec3, Mth.ceil(d0))) {
                        this.drHakimEntity.setDeltaMovement(this.drHakimEntity.getDeltaMovement().add(vec3.scale(0.1D)));
                    } else {
                        this.operation = Operation.WAIT;
                    }
                }

            }
        }

        private boolean canReach(Vec3 pPos, int pLength) {
            AABB aabb = this.drHakimEntity.getBoundingBox();

            for(int i = 1; i < pLength; ++i) {
                aabb = aabb.move(pPos);
                if (!this.drHakimEntity.level.noCollision(this.drHakimEntity, aabb)) {
                    return false;
                }
            }

            return true;
        }
    }
    static class DrHakimLookGoal extends Goal {
        private final EthanBossEntity drHakimEntity;

        public DrHakimLookGoal(EthanBossEntity drHakimEntity) {
            this.drHakimEntity = drHakimEntity;
            this.setFlags(EnumSet.of(Flag.LOOK));
        }

        /**
         * Returns whether execution should begin. You can also read and cache any state necessary for execution in this
         * method as well.
         */
        public boolean canUse() {
            return true;
        }

        public boolean requiresUpdateEveryTick() {
            return true;
        }

        /**
         * Keep ticking a continuous task that has already been started
         */
        public void tick() {
            if (this.drHakimEntity.getTarget() == null) {
                Vec3 vec3 = this.drHakimEntity.getDeltaMovement();
                this.drHakimEntity.setYRot(-((float)Mth.atan2(vec3.x, vec3.z)) * (180F / (float)Math.PI));
                this.drHakimEntity.yBodyRot = this.drHakimEntity.getYRot();
            } else {
                LivingEntity livingentity = this.drHakimEntity.getTarget();
                double d0 = 64.0D;
                if (livingentity.distanceToSqr(this.drHakimEntity) < 4096.0D) {
                    double d1 = livingentity.getX() - this.drHakimEntity.getX();
                    double d2 = livingentity.getZ() - this.drHakimEntity.getZ();
                    this.drHakimEntity.setYRot(-((float)Mth.atan2(d1, d2)) * (180F / (float)Math.PI));
                    this.drHakimEntity.yBodyRot = this.drHakimEntity.getYRot();
                }
            }

        }
    }
    static class RandomFloatAroundGoal extends Goal {
        private final EthanBossEntity drHakimEntity;

        public RandomFloatAroundGoal(EthanBossEntity drHakimEntity) {
            this.drHakimEntity = drHakimEntity;
            this.setFlags(EnumSet.of(Flag.MOVE));
        }

        /**
         * Returns whether execution should begin. You can also read and cache any state necessary for execution in this
         * method as well.
         */
        public boolean canUse() {
            MoveControl movecontrol = this.drHakimEntity.getMoveControl();
            if (!movecontrol.hasWanted()) {
                return true;
            } else {
                double d0 = movecontrol.getWantedX() - this.drHakimEntity.getX();
                double d1 = movecontrol.getWantedY() - this.drHakimEntity.getY();
                double d2 = movecontrol.getWantedZ() - this.drHakimEntity.getZ();
                double d3 = d0 * d0 + d1 * d1 + d2 * d2;
                return d3 < 1.0D || d3 > 3600.0D;
            }
        }

        /**
         * Returns whether an in-progress EntityAIBase should continue executing
         */
        public boolean canContinueToUse() {
            return false;
        }

        /**
         * Execute a one shot task or start executing a continuous task
         */
        public void start() {
            RandomSource randomsource = this.drHakimEntity.getRandom();
            double d0 = this.drHakimEntity.getX() + (double)((randomsource.nextFloat() * 2.0F - 1.0F) * 16.0F);
            double d1 = this.drHakimEntity.getY() + (double)((randomsource.nextFloat() * 2.0F - 1.0F) * 16.0F);
            double d2 = this.drHakimEntity.getZ() + (double)((randomsource.nextFloat() * 2.0F - 1.0F) * 16.0F);
            this.drHakimEntity.getMoveControl().setWantedPosition(d0, d1, d2, 1.0D);
        }
    }
    private static boolean isReflectedFireball(DamageSource p_238408_) {
        return p_238408_.getDirectEntity() instanceof LargeFireball && p_238408_.getEntity() instanceof Player;
    }

    /**
     * Returns whether this Entity is invulnerable to the given DamageSource.
     */
    public boolean isInvulnerableTo(DamageSource pSource) {
        return !isReflectedFireball(pSource) && super.isInvulnerableTo(pSource);
    }

    /**
     * Called when the entity is attacked.
     */
    public boolean hurt(DamageSource pSource, float pAmount) {
        if (isReflectedFireball(pSource)) {
            super.hurt(pSource, 50.0F);
            return true;
        } else {
            return this.isInvulnerableTo(pSource) ? false : super.hurt(pSource, pAmount);
        }
    }

    @Override
    protected boolean shouldDespawnInPeaceful() {
        return true;
    }
}
