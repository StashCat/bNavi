package co.stashcat.navigation.commands;

import co.stashcat.navigation.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class WaypointCommand implements CommandExecutor {

    public WaypointCommand(Main p) {
        p.getCommand("waypoint").setExecutor(this);
    }

    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        return false;
    }
}