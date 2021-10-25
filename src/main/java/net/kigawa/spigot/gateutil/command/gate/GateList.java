package net.kigawa.spigot.gateutil.command.gate;

import net.kigawa.spigot.gateutil.GateManager;
import net.kigawa.spigot.pluginutil.PluginBase;
import net.kigawa.spigot.pluginutil.PluginUtil;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.List;

public class GateList extends GateCommandBase {
    public GateList(PluginBase kigawaPlugin, GateManager gate) {
        super(kigawaPlugin, gate);
    }

    @Override
    public String getName() {
        return "list";
    }

    @Override
    public String onThisCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (strings.length == 1) {
            Player player = PluginUtil.getPlayer(commandSender);
            if (player != null) {
                getManager().sendGates(player);
                return "";
            }
        }
        return null;
    }

    @Override
    public String errorMessage() {
        return "/gate list";
    }

    @Override
    public boolean isDefault() {
        return false;
    }

    @Override
    public List<String> getTabStrings(CommandSender sender, Command command, String label, String[] strings) {
        return null;
    }
}
