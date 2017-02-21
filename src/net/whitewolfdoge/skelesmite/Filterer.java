package net.whitewolfdoge.skelesmite;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;

import net.minecraft.server.v1_10_R1.EntityHorse;
import net.minecraft.server.v1_10_R1.EnumHorseType;

public class Filterer{

	/**
	 * The following method takes and entity and removes it from the game if it is a skeleton horse.
	 * @param ent The entity to be examined
	 */
	protected static void filterEntityHorseSkeleton(Entity ent){
		EntityType et = ent.getType();
		
		if(et.equals(EntityType.HORSE)){ // If the entity is a Horse
			EntityHorse eh = (EntityHorse)ent;
			if(eh.equals(EnumHorseType.SKELETON)){ // If the Horse type is a Skeleton horse
				ent.remove(); // Remove it
				int x = ent.getLocation().getBlockX(), y = ent.getLocation().getBlockY(), z = ent.getLocation().getBlockZ();
				World wld = ent.getWorld();
				String msg = String.format("Purged Skeleton Horse at (%d, %d, %d) in %s!", x, y, z, wld.getName());
				Bukkit.getLogger().info(msg);
			}
		}
	}
	
}
