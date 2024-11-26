package com.riverstone.dualwield.atheriamod.block;

import com.riverstone.dualwield.atheriamod.AtheriaMod;
import com.riverstone.dualwield.atheriamod.block.custom.AeonForgeBlock;
import com.riverstone.dualwield.atheriamod.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, AtheriaMod.MOD_ID);

    public static final RegistryObject<Block> AEON_FORGE = registerBlock("aeon_forge",
            () -> new AeonForgeBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).lightLevel((pState) -> 15).noOcclusion()));

    private static <T extends Block> RegistryObject<Block> registerBlock(String name, Supplier<T> block) {
        RegistryObject<Block> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static RegistryObject<Item> registerBlockItem(String name, RegistryObject<Block> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
