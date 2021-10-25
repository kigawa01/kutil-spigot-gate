package net.kigawa.spigot.gateutil;

import net.kigawa.spigot.pluginutil.recorder.RecorderData;
import net.kigawa.spigot.worldeditutil.world.PlayerRegion;

public class GateData extends RecorderData {
    String world;
    double[] center;
    double[] size;
    String[] linked;

    public String[] getLinked() {
        return linked;
    }

    public void setLinked(String[] linked) {
        this.linked = linked;
    }

    public String getWorld() {
        return world;
    }

    public void setWorld(String world) {
        this.world = world;
    }

    public void setRegion(PlayerRegion region) {
        world = region.getWorld();
        center = new double[]{
                region.getcX(), region.getcY(), region.getcZ()
        };
        size = new double[]{
                region.getWidth(), region.getHeight(), region.getLength()
        };
    }

    public double[] getSize() {
        return size;
    }

    public void setSize(double[] size) {
        this.size = size;
    }

    public double[] getCenter() {
        return center;
    }

    public void setCenter(double[] center) {
        this.center = center;
    }
}
