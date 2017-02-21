package net.whitewolfdoge.skelesmite;

import org.bukkit.entity.Entity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntitySpawnEvent;

public class SpawnMonitor implements Listener{
	
	@EventHandler
	public void onEntitySpawnEvent(EntitySpawnEvent ee){
		Entity e = ee.getEntity();
		Filterer.filterEntityHorseSkeleton(e);
	}
}
