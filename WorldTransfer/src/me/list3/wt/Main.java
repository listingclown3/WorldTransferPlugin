package me.list3.wt;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		getCommand("getworld").setExecutor(new WorldFinder());
		getCommand("worldcreate").setExecutor(new WorldCreate());
		getCommand("worldwarp").setExecutor(new WarpWorld());
		getCommand("pingworlds").setExecutor(new GetExistingWorlds());
		getCommand("unloadworld").setExecutor(new UnloadWorld());
		getCommand("worldfiledir").setExecutor(new GetWorldDirectory());
		getCommand("ip").setExecutor(new Logger());
		
	}
	
	@Override
	public void onDisable() {
		
	}
}
