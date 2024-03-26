
package net.mcreator.scrollsprops.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.scrollsprops.item.ItemFireWallDragon;
import net.mcreator.scrollsprops.ElementsScrollspropsMod;

@ElementsScrollspropsMod.ModElement.Tag
public class TabLinkMonsters extends ElementsScrollspropsMod.ModElement {
	public TabLinkMonsters(ElementsScrollspropsMod instance) {
		super(instance, 163);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tablink_monsters") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemFireWallDragon.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
