package com.telepathicgrunt.the_bumblezone.modinit;

import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.telepathicgrunt.the_bumblezone.Bumblezone;
import com.telepathicgrunt.the_bumblezone.world.dimension.BzBiomeProvider;
import com.telepathicgrunt.the_bumblezone.world.dimension.BzChunkGenerator;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.biome.BiomeSource;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BzDimension {
    public static final ResourceKey<Level> BZ_WORLD_KEY = ResourceKey.create(Registry.DIMENSION_REGISTRY, Bumblezone.MOD_DIMENSION_ID);

    public static final DeferredRegister<Codec<? extends ChunkGenerator>> CHUNK_GENERATOR = DeferredRegister.create(Registry.CHUNK_GENERATOR_REGISTRY, Bumblezone.MODID);
    public static final DeferredRegister<Codec<? extends BiomeSource>> BIOME_SOURCE = DeferredRegister.create(Registry.BIOME_SOURCE_REGISTRY, Bumblezone.MODID);

    public static final RegistryObject<Codec<BzChunkGenerator>> BZ_CHUNK_GENERATOR = CHUNK_GENERATOR.register("chunk_generator", () -> BzChunkGenerator.CODEC);
    public static final RegistryObject<Codec<BzBiomeProvider>> BZ_BIOME_SOURCE = BIOME_SOURCE.register("biome_source", () -> BzBiomeProvider.CODEC);
}
