package com.bull.things.event;

import com.bull.things.Things;
import com.bull.things.entity.ModEntityTypes;
import com.bull.things.entity.custom.StronkZombieEntity;
import com.bull.things.entity.custom.TlalocEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;



public class ModEvents {
    @Mod.EventBusSubscriber(modid = Things.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ModEventBusEvents{
        @SubscribeEvent
        public static void entityAttributeEvent(EntityAttributeCreationEvent event){
            event.put(ModEntityTypes.TLALOC.get(), TlalocEntity.setAttributes());
            event.put(ModEntityTypes.STRONKZOMBIE.get(), StronkZombieEntity.setAttributes());
        }
    }

}
