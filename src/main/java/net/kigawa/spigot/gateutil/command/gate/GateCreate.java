package net.kigawa.spigot.gateutil.command.gate;

import net.kigawa.spigot.gateutil.GateManager;
import net.kigawa.spigot.pluginutil.PluginBase;
import net.kigawa.spigot.pluginutil.PluginUtil;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.List;

public class GateCreate extends GateCommandBase {
    public GateCreate(PluginBase kigawaPlugin, GateManager gate) {
        super(kigawaPlugin, gate);
    }

    @Override
    public String getName() {
        return "create";
    }

    @Override
    public String onThisCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (strings.length == 2) {
            Player player = PluginUtil.getPlayer(commandSender);
            if (player != null) {
                return getManager().create(strings[1], player);
            }
        }
        return null;
    }

    @Override
    public String errorMessage() {
        return "/gate create <name>";
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