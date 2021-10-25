package net.kigawa.spigot.gateutil.command.gate;

import net.kigawa.spigot.gateutil.GateManager;
import net.kigawa.spigot.pluginutil.PluginBase;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

import java.util.List;

public class SetLinked extends GateCommandBase {
    public SetLinked(PluginBase kigawaPlugin, GateManager gate) {
        super(kigawaPlugin, gate);
    }

    @Override
    public String getName() {
        return "setlinked";
    }

    @Override
    public String onThisCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (strings.length == 3) {
            return getManager().setLinked(strings[1], strings[2]);
        }
        return null;
    }

    @Override
    public String errorMessage() {
        return "/gate setlinked <gate name> <linked>";
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
