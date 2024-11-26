package com.riverstone.dualwield.atheriamod.block.entity;

import com.riverstone.dualwield.atheriamod.AtheriaMod;
import com.riverstone.dualwield.atheriamod.block.ModBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, AtheriaMod.MOD_ID);

    public static final RegistryObject<BlockEntityType<AeonForgeBlockEntity>> AEON_FORGE_BE =
            BLOCK_ENTITIES.register("aeon_forge_be", () ->
                    BlockEntityType.Builder.of(AeonForgeBlockEntity::new,
                            ModBlocks.AEON_FORGE.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
