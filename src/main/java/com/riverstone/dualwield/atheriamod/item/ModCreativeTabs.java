package com.riverstone.dualwield.atheriamod.item;

import com.riverstone.dualwield.atheriamod.AtheriaMod;
import com.riverstone.dualwield.atheriamod.block.ModBlocks;
import com.riverstone.dualwield.atheriamod.util.MiscUtil;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AtheriaMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ATHERIA_TAB = CREATIVE_TABS.register("atheria_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.AEON_FORGE.get()))
                    .title(MiscUtil.createTranslatableComponent("creative_tab", new ResourceLocation(AtheriaMod.MOD_ID, "atheria_tab")))
                    .displayItems(((pParameters, pOutput) -> {
                        pOutput.accept(ModBlocks.AEON_FORGE.get());
                    })).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_TABS.register(eventBus);
    }
}
