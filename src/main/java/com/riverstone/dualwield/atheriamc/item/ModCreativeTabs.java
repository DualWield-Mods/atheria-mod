package com.riverstone.dualwield.atheriamc.item;

import com.riverstone.dualwield.atheriamc.AtheriaMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AtheriaMod.MOD_ID);

    public static void register(IEventBus eventBus) {
        CREATIVE_TABS.register(eventBus);
    }
}
