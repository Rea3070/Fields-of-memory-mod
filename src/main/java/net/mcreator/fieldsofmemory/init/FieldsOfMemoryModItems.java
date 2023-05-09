
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fieldsofmemory.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.fieldsofmemory.item.WhatwevebecomeItem;
import net.mcreator.fieldsofmemory.item.TheyDontFearItem;
import net.mcreator.fieldsofmemory.item.TheFieldsItem;
import net.mcreator.fieldsofmemory.item.PslamItem;
import net.mcreator.fieldsofmemory.item.PersonaldoomItem;
import net.mcreator.fieldsofmemory.item.ImscaredItem;
import net.mcreator.fieldsofmemory.item.FindyouItem;
import net.mcreator.fieldsofmemory.item.ConfessItem;
import net.mcreator.fieldsofmemory.item.CloserItem;
import net.mcreator.fieldsofmemory.FieldsOfMemoryMod;

public class FieldsOfMemoryModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, FieldsOfMemoryMod.MODID);
	public static final RegistryObject<Item> CLOSER = REGISTRY.register("closer", () -> new CloserItem());
	public static final RegistryObject<Item> THE_FIELDS = REGISTRY.register("the_fields", () -> new TheFieldsItem());
	public static final RegistryObject<Item> THEY_DONT_FEAR = REGISTRY.register("they_dont_fear", () -> new TheyDontFearItem());
	public static final RegistryObject<Item> PSLAM = REGISTRY.register("pslam", () -> new PslamItem());
	public static final RegistryObject<Item> PERSONALDOOM = REGISTRY.register("personaldoom", () -> new PersonaldoomItem());
	public static final RegistryObject<Item> FINDYOU = REGISTRY.register("findyou", () -> new FindyouItem());
	public static final RegistryObject<Item> CONFESS = REGISTRY.register("confess", () -> new ConfessItem());
	public static final RegistryObject<Item> WHATWEVEBECOME = REGISTRY.register("whatwevebecome", () -> new WhatwevebecomeItem());
	public static final RegistryObject<Item> IMSCARED = REGISTRY.register("imscared", () -> new ImscaredItem());
	public static final RegistryObject<Item> FIELDSOFMEMEORY = block(FieldsOfMemoryModBlocks.FIELDSOFMEMEORY, null);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
