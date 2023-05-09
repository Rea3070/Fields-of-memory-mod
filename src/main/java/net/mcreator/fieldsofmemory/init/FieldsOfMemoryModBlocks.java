
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fieldsofmemory.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.fieldsofmemory.block.FieldsofmemeoryBlock;
import net.mcreator.fieldsofmemory.FieldsOfMemoryMod;

public class FieldsOfMemoryModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, FieldsOfMemoryMod.MODID);
	public static final RegistryObject<Block> FIELDSOFMEMEORY = REGISTRY.register("fieldsofmemeory", () -> new FieldsofmemeoryBlock());
}
