package net.whitewolfdoge.skelesmite;

import org.bukkit.Chunk;
import org.bukkit.entity.Entity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.world.ChunkLoadEvent;

public class ChunkLoadMonitor implements Listener{
	
	@EventHandler
	public void onChunkLoadEvent(ChunkLoadEvent cle){
		Chunk chk = cle.getChunk();
		Entity[] ents = chk.getEntities();
		for(Entity ent : ents){
			Filterer.filterEntityHorseSkeleton(ent);
		}
	}
}
