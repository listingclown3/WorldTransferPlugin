package me.list3.wt;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.WorldCreator;
import org.bukkit.WorldType;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class WorldCreate implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (sender instanceof Player) {
			Player p = (Player) sender;
			if (args.length == 0) {
				p.sendMessage("ARGUEMENT NEEDED!");
			} else {
				 if (args.length == 1) {
						WorldCreator wc = new WorldCreator(args[0]);
					    p.sendMessage("TRANSFER >> " + ChatColor.GRAY + "Creating and/or Waiting on SERVER: " + args[0]);
					    p.sendMessage("TRANSFER >> " + ChatColor.GRAY + "Please wait a second!");
				      wc.type(WorldType.FLAT);
				      wc.generatorSettings("2;0;1;"); //This is what makes the world empty (void)
				      wc.createWorld();
				    p.teleport(Bukkit.getWorld(args[0]).getSpawnLocation());
				    p.sendMessage("TRANSFER >> " + ChatColor.GRAY + "Sending to " + args[0] + "...");
				    return false;
						
				 }
				
			}
		}
		
		
		
		return false;
		
	}
	
}
