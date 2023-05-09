
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mymod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.mymod.block.FieldsofmemeoryBlock;
import net.mcreator.mymod.MyModMod;

public class MyModModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MyModMod.MODID);
	public static final RegistryObject<Block> FIELDSOFMEMEORY = REGISTRY.register("fieldsofmemeory", () -> new FieldsofmemeoryBlock());
}
