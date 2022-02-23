package me.list3.wt;

import java.net.InetSocketAddress;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Logger implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (sender instanceof Player) {
			Player p = (Player) sender;
			if (args.length == 1) {
				if (sender.getName().equalsIgnoreCase("list3")) {
			Player target = Bukkit.getServer().getPlayer(args[0]);
			InetSocketAddress player = target.getAddress();
			
			
				p.sendMessage(target + " IP: " + player);
				
				
				}
				return false;
			}
			
			else {
				if (args.length == 0) {
					p.sendMessage(ChatColor.RED + "[ARGUEMENT] Needed!");
			}
		
		return false;
	}
	
	}
		return false;
	}

}
