package me.list3.wt;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class WorldFinder implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (sender instanceof Player) {
		Player p = (Player) sender;
		String world = p.getWorld().getName();
		p.sendMessage("TRANSFER >> " + "You are in WORLD: " + world);
		return false;
		
		
	}
		return false;
	}
}
