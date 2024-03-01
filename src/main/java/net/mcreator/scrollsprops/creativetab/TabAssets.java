
package net.mcreator.scrollsprops.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.scrollsprops.item.ItemDeckboxI;
import net.mcreator.scrollsprops.ElementsScrollspropsMod;

@ElementsScrollspropsMod.ModElement.Tag
public class TabAssets extends ElementsScrollspropsMod.ModElement {
	public TabAssets(ElementsScrollspropsMod instance) {
		super(instance, 5);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabassets") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemDeckboxI.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static CreativeTabs tab;
}
