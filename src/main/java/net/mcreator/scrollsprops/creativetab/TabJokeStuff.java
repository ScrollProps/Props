
package net.mcreator.scrollsprops.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.scrollsprops.item.ItemSilentHonarArkMamoa;
import net.mcreator.scrollsprops.ElementsScrollspropsMod;

@ElementsScrollspropsMod.ModElement.Tag
public class TabJokeStuff extends ElementsScrollspropsMod.ModElement {
	public TabJokeStuff(ElementsScrollspropsMod instance) {
		super(instance, 154);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabjoke_stuff") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemSilentHonarArkMamoa.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static CreativeTabs tab;
}
