package com.kerbywolf.auramod.world;

import com.kerbywolf.auramod.config.OregenConfig;
import com.kerbywolf.auramod.lists.BlockList;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage.Decoration;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig.FillerBlockType;
import net.minecraftforge.registries.ForgeRegistries;

public class OreGeneration {
	public static void setupOreGeneration()
	{
		for(Biome biome : ForgeRegistries.BIOMES) //this inputs it into every biome
		{
			biome.addFeature(Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(FillerBlockType.NATURAL_STONE, BlockList.aura_ore.getDefaultState(), OregenConfig.tutorial_chance.get()), Placement.COUNT_RANGE, new CountRangeConfig(10, 20, 1, 100)));
			//biome.addFeature(Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(FillerBlockType.NATURAL_STONE, TutorialBlocks.tutorial_ore.getDefaultState(), OregenConfig.tutorial_chance.get()), Placement.COUNT_RANGE, new CountRangeConfig(10, 20, 0, 100)));
		}
		
	}

}
