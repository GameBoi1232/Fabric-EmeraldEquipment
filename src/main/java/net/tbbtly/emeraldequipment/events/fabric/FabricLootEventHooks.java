package net.tbbtly.emeraldequipment.events.fabric;

import net.tbbtly.emeraldequipment.events.LootEvents;
import net.tbbtly.emeraldequipment.events.params.LootTableLoadEvent;
import net.fabricmc.fabric.api.loot.v3.LootTableEvents;

public final class FabricLootEventHooks
{
    private static final LootEvents LOOT_EVENTS = new LootEvents();
    private static boolean initialized = false;

    private FabricLootEventHooks()
    {}

    public static void init()
    {
        if (initialized) return;
        initialized = true;

        LootTableEvents.MODIFY.register((key, tableBuilder, source, registries) ->
                LOOT_EVENTS.onChestLootTableLoad(new LootTableLoadEvent(key, tableBuilder)));
    }
}
