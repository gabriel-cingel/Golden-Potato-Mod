package net.clueless.mcmod.item;

import net.clueless.mcmod.Mcmod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static Item GOLDEN_POTATO;

    public static void registerModItems() {
        Mcmod.LOGGER.info("Registering Mod Items for " + Mcmod.MOD_ID);

        GOLDEN_POTATO = Registry.register(
                Registries.ITEM,
                Identifier.of(Mcmod.MOD_ID, "golden_potato"),
                new Item(new Item.Settings())
        );

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(GOLDEN_POTATO);
        });
    }
}