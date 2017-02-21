package net.whitewolfdoge.skelesmite;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.entity.Horse;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Horse.Variant;


public class Filterer{

	/**
	 * The following method takes and entity and removes it from the game if it is a skeleton horse.
	 * @param rawEnt The entity to be examined
	 */
	@SuppressWarnings("deprecation")
	protected static void filterEntityHorseSkeleton(Entity rawEnt){
		if(rawEnt instanceof Horse && ((Horse)rawEnt).getVariant().equals(Variant.SKELETON_HORSE)){
				rawEnt.remove(); // Remove it
				int x = rawEnt.getLocation().getBlockX(), y = rawEnt.getLocation().getBlockY(), z = rawEnt.getLocation().getBlockZ();
				World wld = rawEnt.getWorld();
				String msg = String.format("[SkeleSmite] Purged Skeleton Horse at (%d, %d, %d) in %s!", x, y, z, wld.getName());
				Bukkit.getLogger().info(msg);
		}
	}
}
