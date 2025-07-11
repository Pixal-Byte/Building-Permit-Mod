package net.pixalbyte.permitmod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.pixalbyte.permitmod.PermitMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, PermitMod.MOD_ID);

    public static final RegistryObject<Item> PERMIT_BLUE = ITEMS.register("permit_blue",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PERMIT_RED = ITEMS.register("permit_red",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PERMIT_YELLOW = ITEMS.register("permit_yellow",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
