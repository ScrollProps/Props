package net.mcreator.scrollsprops.procedure;

import net.minecraft.util.EnumHand;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.scrollsprops.item.ItemAcademyDiskPurple;
import net.mcreator.scrollsprops.ElementsScrollspropsMod;

import java.util.Map;

@ElementsScrollspropsMod.ModElement.Tag
public class ProcedureAcademyDiskPurpleRightClickedInAir extends ElementsScrollspropsMod.ModElement {
	public ProcedureAcademyDiskPurpleRightClickedInAir(ElementsScrollspropsMod instance) {
		super(instance, 161);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure AcademyDiskPurpleRightClickedInAir!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityLivingBase) {
			ItemStack _setstack = new ItemStack(ItemAcademyDiskPurple.block, (int) (1));
			_setstack.setCount(1);
			((EntityLivingBase) entity).setHeldItem(EnumHand.OFF_HAND, _setstack);
			if (entity instanceof EntityPlayerMP)
				((EntityPlayerMP) entity).inventory.markDirty();
		}
		if (entity instanceof EntityLivingBase) {
			ItemStack _setstack = new ItemStack(ItemAcademyDiskPurple.block, (int) (1));
			_setstack.setCount(0);
			((EntityLivingBase) entity).setHeldItem(EnumHand.MAIN_HAND, _setstack);
			if (entity instanceof EntityPlayerMP)
				((EntityPlayerMP) entity).inventory.markDirty();
		}
	}
}
