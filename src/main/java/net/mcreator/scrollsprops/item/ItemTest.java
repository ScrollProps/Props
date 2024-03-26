
package net.mcreator.scrollsprops.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemRecord;
import net.minecraft.item.Item;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.scrollsprops.ElementsScrollspropsMod;

import java.util.List;

@ElementsScrollspropsMod.ModElement.Tag
public class ItemTest extends ElementsScrollspropsMod.ModElement {
	@GameRegistry.ObjectHolder("scrollsprops:test")
	public static final Item block = null;
	public ItemTest(ElementsScrollspropsMod instance) {
		super(instance, 158);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("scrollsprops:test", "inventory"));
	}
	public static class MusicDiscItemCustom extends ItemRecord {
		public MusicDiscItemCustom() {
			super("test", ElementsScrollspropsMod.sounds.get(new ResourceLocation("scrollsprops:catsounds")));
			setUnlocalizedName("test");
			setRegistryName("test");
			setCreativeTab(null);
		}

		@Override
		@SideOnly(Side.CLIENT)
		public boolean hasEffect(ItemStack itemstack) {
			return true;
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<String> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add("DO NOT USE ITS ONLY A TEST");
		}
	}
}
