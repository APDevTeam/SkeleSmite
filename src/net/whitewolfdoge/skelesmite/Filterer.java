package net.whitewolfdoge.skelesmite;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.craftbukkit.v1_9_R1.entity.CraftHorse;
import org.bukkit.entity.Entity;

import net.minecraft.server.v1_9_R1.EntityHorse;
import net.minecraft.server.v1_9_R1.EnumHorseType;

public class Filterer{

	/**
	 * The following method takes and entity and removes it from the game if it is a skeleton horse.
	 * @param ent The entity to be examined
	 */
	protected static void filterEntityHorseSkeleton(Entity rawEnt){
		if(rawEnt instanceof CraftHorse){
			CraftHorse ch = (CraftHorse)rawEnt;
			EntityHorse eh = ch.getHandle();
			if(eh.getType().equals(EnumHorseType.SKELETON)){ // If the Horse is Skeleton Horse
				rawEnt.remove(); // Remove it
				int x = rawEnt.getLocation().getBlockX(), y = rawEnt.getLocation().getBlockY(), z = rawEnt.getLocation().getBlockZ();
				World wld = rawEnt.getWorld();
				String msg = String.format("[SkeleSmite] Purged Skeleton Horse at (%d, %d, %d) in %s!", x, y, z, wld.getName());
				Bukkit.getLogger().info(msg);
			}
		}
	}
}
