
package net.mcreator.scrollsprops.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.scrollsprops.item.ItemNumber27;
import net.mcreator.scrollsprops.ElementsScrollspropsMod;

@ElementsScrollspropsMod.ModElement.Tag
public class TabNumberCards extends ElementsScrollspropsMod.ModElement {
	public TabNumberCards(ElementsScrollspropsMod instance) {
		super(instance, 62);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabnumber_cards") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemNumber27.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
