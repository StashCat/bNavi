package co.stashcat.types;

import co.stashcat.Navigation;
import org.apache.commons.lang.StringUtils;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.configuration.ConfigurationSection;

public class Waypoint {
    String id;
    String name;
    String desc;
    Location loc;
    String world;
    int destinationRadius;
    boolean ignoreHeight;

    public Waypoint(String id, String name, String desc, Location loc, String world, int destinationRadius, boolean ignoreHeight, ItemStack item) {
        setId(id);
        setName(name);
        setDescription(desc);
        setLocation(loc);
        setWorld(world);
        setDestinationRadius(destinationRadius);
        setIgnoreHeight(ignoreHeight);
    }

    public void setId(String id) throws IllegalArgumentException {
        if (StringUtils.isAlphanumeric(id))
            this.id = id;
        else
            throw new IllegalArgumentException("IDs can only be alphanumeric.");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String desc) {
        this.desc = desc;
    }

    public void setLocation(Location loc) {
        this.loc = loc;
    }

    public void setWorld(World w) {
        setWorld(w.getName());
    }

    public void setWorld(String w) {
        this.world = w;
    }

    public void setDestinationRadius(int radius) {
        this.destinationRadius = radius;
    }

    public void setIgnoreHeight(boolean ignoreHeight) {
        this.ignoreHeight = ignoreHeight;
    }

    public void setItem(ItemStack item) {
        this.item = item;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public Location getLocation() {
        return loc;
    }

    public String getWorld() {
        return world;
    }

    public ItemStack getItem() {
        return item.clone();
    }

    public int getDestinationRadius() {
        return destinationRadius;
    }

    public boolean isHeightIgnored() {
        return ignoreHeight;
    }
}