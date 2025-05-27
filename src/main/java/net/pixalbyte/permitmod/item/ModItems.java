package net.pixalbyte.permitmod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.pixalbyte.permitmod.PermitMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, PermitMod.MOD_ID);


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
