
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mymod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.mymod.item.TheFieldsItem;
import net.mcreator.mymod.MyModMod;

public class MyModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MyModMod.MODID);
	public static final RegistryObject<Item> THE_FIELDS = REGISTRY.register("the_fields", () -> new TheFieldsItem());
}
