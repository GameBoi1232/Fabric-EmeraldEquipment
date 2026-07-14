package net.tbbtly.emeraldequipment.events;

import net.tbbtly.emeraldequipment.events.fabric.FabricLootEventHooks;

public class EventRegistry
{
    public static void registerEvents()
    {
        FabricLootEventHooks.init();
    }
}
