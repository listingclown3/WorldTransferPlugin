package me.list3.wt;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class UnloadWorld implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (sender instanceof Player) {
			Player p = (Player) sender;
			if (args.length == 0) {
				p.sendMessage("TRANSFER >> " + "ARGUEMENT NEEDED");
			}
			if (args.length == 1) {
				p.sendMessage("TRANSFER >> " + "ARGUEMENT NEEDED");
			}
				if (args.length == 2) {
					p.sendMessage(ChatColor.GRAY + "Now teleporting to a safe place!");
				p.teleport(Bukkit.getWorld(args[1]).getSpawnLocation());
				p.sendMessage(ChatColor.GRAY + "Attempting to unload " + args[0]);
				Bukkit.unloadWorld(args[0], true);
				p.sendMessage(ChatColor.GREEN + "Success!");
				
				
		        }
			
		
		
		return false;
	}
	
		return false;
	}
	
}
