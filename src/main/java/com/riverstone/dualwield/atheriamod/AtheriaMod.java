package com.riverstone.dualwield.atheriamod;

import com.mojang.logging.LogUtils;
import com.riverstone.dualwield.atheriamod.block.ModBlocks;
import com.riverstone.dualwield.atheriamod.block.entity.ModBlockEntities;
import com.riverstone.dualwield.atheriamod.item.ModCreativeTabs;
import com.riverstone.dualwield.atheriamod.item.ModItems;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(AtheriaMod.MOD_ID)
public class AtheriaMod {
    public static final String MOD_ID = "atheriamod";
    public static final Logger LOGGER = LogUtils.getLogger();

    public AtheriaMod(FMLJavaModLoadingContext context) {
        IEventBus modEventBus = context.getModEventBus();

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        ModBlockEntities.register(modEventBus);

        ModCreativeTabs.register(modEventBus);

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        // Common setup here.
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        // Creative tabs here
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        // Server start here
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            // Client Setup here
        }
    }
}
