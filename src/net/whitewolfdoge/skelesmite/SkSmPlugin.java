package net.whitewolfdoge.skelesmite;

import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntitySpawnEvent;
import org.bukkit.event.world.ChunkLoadEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class SkSmPlugin extends JavaPlugin{
	Listener spawnMon, chkMon;
	
	@Override
	public void onLoad(){
		spawnMon = new SpawnMonitor();
		chkMon = new ChunkLoadMonitor();
	}
	
	@Override
	public void onEnable(){
		getServer().getPluginManager().registerEvents(spawnMon, this);
	}
	
	@Override
	public void onDisable(){
		EntitySpawnEvent.getHandlerList().unregister(spawnMon);
		spawnMon = null;
		
		ChunkLoadEvent.getHandlerList().unregister(chkMon);
		chkMon = null;
	}
}
