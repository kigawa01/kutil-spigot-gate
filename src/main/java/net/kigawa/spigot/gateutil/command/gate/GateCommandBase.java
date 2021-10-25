package net.kigawa.spigot.gateutil.command.gate;

import net.kigawa.spigot.gateutil.GateManager;
import net.kigawa.spigot.pluginutil.PluginBase;
import net.kigawa.spigot.pluginutil.command.Subcommand;

public abstract class GateCommandBase extends Subcommand {
    private final GateManager manager;

    public GateCommandBase(PluginBase kigawaPlugin, GateManager gate) {
        super(kigawaPlugin);
        this.manager = gate;
    }

    public GateManager getManager() {
        return manager;
    }
}
