package apdevteam.skelesmite;

import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntitySpawnEvent;
import org.bukkit.event.world.ChunkLoadEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class SkSmPlugin extends JavaPlugin{
	private Listener spawnMon, chkMon;
	
	@Override
	public void onLoad(){
		spawnMon = new SpawnMonitor();
		chkMon = new ChunkLoadMonitor();
	}
	
	@Override
	public void onEnable(){
		getServer().getPluginManager().registerEvents(spawnMon, this);
		getServer().getPluginManager().registerEvents(chkMon, this);
	}
	
	@Override
	public void onDisable(){
		EntitySpawnEvent.getHandlerList().unregister(spawnMon);
		spawnMon = null;
		
		ChunkLoadEvent.getHandlerList().unregister(chkMon);
		chkMon = null;
	}
}
