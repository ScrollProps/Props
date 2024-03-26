
package net.mcreator.scrollsprops.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.scrollsprops.item.ItemDarkMagicianGirl;
import net.mcreator.scrollsprops.ElementsScrollspropsMod;

@ElementsScrollspropsMod.ModElement.Tag
public class TabCards extends ElementsScrollspropsMod.ModElement {
	public TabCards(ElementsScrollspropsMod instance) {
		super(instance, 157);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabcards") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemDarkMagicianGirl.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static CreativeTabs tab;
}
