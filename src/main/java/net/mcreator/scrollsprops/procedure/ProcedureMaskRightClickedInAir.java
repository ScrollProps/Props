package net.mcreator.scrollsprops.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.EnumHand;
import net.minecraft.server.MinecraftServer;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;
import net.minecraft.command.ICommandSender;

import net.mcreator.scrollsprops.item.ItemMask;
import net.mcreator.scrollsprops.ElementsScrollspropsMod;

import java.util.Map;

@ElementsScrollspropsMod.ModElement.Tag
public class ProcedureMaskRightClickedInAir extends ElementsScrollspropsMod.ModElement {
	public ProcedureMaskRightClickedInAir(ElementsScrollspropsMod instance) {
		super(instance, 160);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MaskRightClickedInAir!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		{
			Entity _ent = entity;
			if (!_ent.world.isRemote && _ent.world.getMinecraftServer() != null) {
				_ent.world.getMinecraftServer().getCommandManager().executeCommand(new ICommandSender() {
					@Override
					public String getName() {
						return "";
					}

					@Override
					public boolean canUseCommand(int permission, String command) {
						return true;
					}

					@Override
					public World getEntityWorld() {
						return _ent.world;
					}

					@Override
					public MinecraftServer getServer() {
						return _ent.world.getMinecraftServer();
					}

					@Override
					public boolean sendCommandFeedback() {
						return false;
					}

					@Override
					public BlockPos getPosition() {
						return _ent.getPosition();
					}

					@Override
					public Vec3d getPositionVector() {
						return new Vec3d(_ent.posX, _ent.posY, _ent.posZ);
					}

					@Override
					public Entity getCommandSenderEntity() {
						return _ent;
					}
				}, "/setskin @p https://reskinproxy.sekwah.com/YGNXxdd.png ");
			}
		}
		if (entity instanceof EntityPlayer) {
			((EntityPlayer) entity).inventory.armorInventory.set(3, new ItemStack(ItemMask.block, (int) (1)));
			if (entity instanceof EntityPlayerMP)
				((EntityPlayerMP) entity).inventory.markDirty();
		}
		/* @ItemStack */
		if (entity instanceof EntityLivingBase) {
			ItemStack _setstack = new ItemStack(ItemMask.block, (int) (1));
			_setstack.setCount(0);
			((EntityLivingBase) entity).setHeldItem(EnumHand.MAIN_HAND, _setstack);
			if (entity instanceof EntityPlayerMP)
				((EntityPlayerMP) entity).inventory.markDirty();
		}
	}
}
