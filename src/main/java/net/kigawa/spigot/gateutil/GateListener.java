package net.kigawa.spigot.gateutil;

import net.kigawa.spigot.pluginutil.PluginBase;
import net.kigawa.spigot.pluginutil.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerMoveEvent;

public class GateListener extends Event {
    private final GateManager gate;

    public GateListener(PluginBase kigawaPlugin, GateManager gate) {
        super(kigawaPlugin);
        this.gate = gate;
    }

    @EventHandler
    public void moveEvent(PlayerMoveEvent event) {
        gate.moveEvent(event);
    }
}