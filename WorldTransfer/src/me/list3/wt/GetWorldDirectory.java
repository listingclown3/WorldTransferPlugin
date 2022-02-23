package me.list3.wt;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GetWorldDirectory implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (sender instanceof Player) {
			Player p = (Player) sender;
			String FileDIR = Bukkit.getWorldContainer().getAbsolutePath();
			p.sendMessage("WorldDirectory: " + FileDIR);
		}
		
		return false;
		
		
	}

}
