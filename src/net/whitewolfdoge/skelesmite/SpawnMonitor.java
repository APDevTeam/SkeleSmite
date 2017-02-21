package net.whitewolfdoge.skelesmite;

import org.bukkit.entity.Horse;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;

public class SpawnMonitor implements Listener{
	
	@EventHandler
	public void onCreatureSpawnEvent(CreatureSpawnEvent ee){
		if(ee.getEntity() instanceof Horse && ((Horse)ee.getEntity()).getVariant().equals(Horse.Variant.SKELETON_HORSE))
			ee.setCancelled(true);
	}
}
