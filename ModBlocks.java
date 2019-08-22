//registers Mod Blocks
package com.kerbywolf.auramod.block;

import com.kerbywolf.auramod.lists.BlockList;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {

	public static void init() {
		BlockList.aura_ore = registerBlock(
				new Block((Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0F).harvestLevel(3).sound(SoundType.GROUND)).lightValue(5)),"aura_ore"); // name at end of string is most important
		BlockList.aura_block = registerBlock(
				new Block((Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0F).harvestLevel(2).sound(SoundType.GROUND)).lightValue(14)),"aura_block");
	}
	
	public static Block registerBlock(Block block, String name)
    {
        BlockItem itemBlock = new BlockItem(block, new Item.Properties().group(ItemGroup.MATERIALS));
        block.setRegistryName(name);
        itemBlock.setRegistryName(name);
        ForgeRegistries.BLOCKS.register(block);
        ForgeRegistries.ITEMS.register(itemBlock);
        return block;
    }

    public static Block registerBlock(Block block, BlockItem itemBlock, String name)
    {
        block.setRegistryName(name);
        ForgeRegistries.BLOCKS.register(block);

        if (itemBlock != null)
        {
            itemBlock.setRegistryName(name);
            ForgeRegistries.ITEMS.register(itemBlock);
        }

        return block;
    }
}
