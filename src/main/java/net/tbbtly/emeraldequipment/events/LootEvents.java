package net.tbbtly.emeraldequipment.events;

import net.tbbtly.emeraldequipment.events.params.LootTableLoadEvent;
import net.tbbtly.emeraldequipment.item.ModItems;
import net.minecraft.world.level.storage.loot.BuiltInLootTables;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.entries.EmptyLootItem;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;

//LootTable code borrowed from Spekarchik
//https://github.com/spekarchik/LymoniteHorseArmor?tab=License-1-ov-file

public class LootEvents implements IEventHandler
{
    public void onChestLootTableLoad(LootTableLoadEvent event)
    {
        //where nautilus armor can generate
        if ((event.getKey().equals(BuiltInLootTables.SHIPWRECK_TREASURE))
                || (event.getKey().equals(BuiltInLootTables.SHIPWRECK_MAP))
                || (event.getKey().equals(BuiltInLootTables.SHIPWRECK_SUPPLY))
                || (event.getKey().equals(BuiltInLootTables.BURIED_TREASURE))
                || (event.getKey().equals(BuiltInLootTables.UNDERWATER_RUIN_SMALL))
                || (event.getKey().equals(BuiltInLootTables.UNDERWATER_RUIN_BIG)))
        {
            var pool = LootPool.lootPool()  //3% chance for nautilus armor to generate
                    .add(LootItem.lootTableItem(ModItems.EMERALD_NAUTILUS_ARMOR).setWeight(3))
                    .add(EmptyLootItem.emptyItem().setWeight(100))
                    .setRolls(ConstantValue.exactly(1F));

            event.getTable().withPool(pool);
            return;
        }

        //where horse armor can generate
        if ((event.getKey().equals(BuiltInLootTables.DESERT_PYRAMID))
                || (event.getKey().equals(BuiltInLootTables.SIMPLE_DUNGEON)
                || (event.getKey().equals(BuiltInLootTables.VILLAGE_ARMORER)))) {
            var pool = LootPool.lootPool()  //10%
                    .add(LootItem.lootTableItem(ModItems.EMERALD_HORSE_ARMOR).setWeight(1))
                    .add(EmptyLootItem.emptyItem().setWeight(10))
                    .setRolls(ConstantValue.exactly(1F));

            event.getTable().withPool(pool);
            return;
        }
        if ((event.getKey().equals(BuiltInLootTables.END_CITY_TREASURE))
                || (event.getKey().equals(BuiltInLootTables.JUNGLE_TEMPLE))) {
            var pool = LootPool.lootPool()  //5%
                    .add(LootItem.lootTableItem(ModItems.EMERALD_HORSE_ARMOR).setWeight(1))
                    .add(EmptyLootItem.emptyItem().setWeight(20))
                    .setRolls(ConstantValue.exactly(1F));

            event.getTable().withPool(pool);
            return;
        }
        if (event.getKey().equals(BuiltInLootTables.STRONGHOLD_CORRIDOR)) {
            var pool = LootPool.lootPool()  //2%
                    .add(LootItem.lootTableItem(ModItems.EMERALD_HORSE_ARMOR).setWeight(1))
                    .add(EmptyLootItem.emptyItem().setWeight(50))
                    .setRolls(ConstantValue.exactly(1F));

            event.getTable().withPool(pool);
            return;
        }
    }
}
