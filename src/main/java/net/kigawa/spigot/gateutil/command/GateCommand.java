package net.kigawa.spigot.gateutil.command;

import net.kigawa.spigot.gateutil.GateManager;
import net.kigawa.spigot.gateutil.command.gate.GateCreate;
import net.kigawa.spigot.gateutil.command.gate.GateList;
import net.kigawa.spigot.gateutil.command.gate.GateTeleport;
import net.kigawa.spigot.gateutil.command.gate.SetLinked;
import net.kigawa.spigot.pluginutil.PluginBase;
import net.kigawa.spigot.pluginutil.PluginUtil;
import net.kigawa.spigot.pluginutil.command.FirstCommand;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.List;

public class GateCommand extends FirstCommand {
    private final GateManager manager;
    private final PluginBase plugin;

    public GateCommand(PluginBase plugin, GateManager manager) {
        super(plugin);
        this.plugin = plugin;
        this.manager = manager;
        addSubcommands(new GateCreate(plugin, manager));
        addSubcommands(new GateList(plugin, manager));
        addSubcommands(new GateTeleport(plugin, manager));
        addSubcommands(new SetLinked(plugin, manager));
    }

    @Override
    public String getName() {
        return "gate";
    }

    @Override
    public String onThisCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (strings.length == 1) {
            Player player = PluginUtil.getPlayer(commandSender);
            if (player != null) {
                manager.teleport(strings[0], player);
                return "";
            }
        }
        return null;
    }

    @Override
    public String errorMessage() {
        return "/gate <subcommand>";
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
