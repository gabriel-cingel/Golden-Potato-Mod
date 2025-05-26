package net.clueless.mcmod.item;

import net.clueless.mcmod.Mcmod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item GOLDEN_POTATO = registerItem("golden_potato", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(Mcmod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Mcmod.LOGGER.info("Registering Mod Items for " + Mcmod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(GOLDEN_POTATO);
        });
    }
}