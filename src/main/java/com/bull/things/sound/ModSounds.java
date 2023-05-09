package com.bull.things.sound;

import com.bull.things.Things;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, Things.MOD_ID);

    public static RegistryObject<SoundEvent> DIE = registerSoundEvent("die");
    public static RegistryObject<SoundEvent> DIE_2 = registerSoundEvent("die_2");

    public static RegistryObject<SoundEvent> DR_HAKIM_AMBIENT = registerSoundEvent("dr_hakim_ambient");
    public static RegistryObject<SoundEvent> DR_HAKIM_DIE = registerSoundEvent("dr_hakim_die");
    public static RegistryObject<SoundEvent> DR_HAKIM_HURT = registerSoundEvent("dr_hakim_hurt");
    private static RegistryObject<SoundEvent> registerSoundEvent(String name) {
        return SOUND_EVENTS.register(name, () -> new SoundEvent(new ResourceLocation(Things.MOD_ID, name)));
    }
    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }

}
