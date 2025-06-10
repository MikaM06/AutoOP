package fr.mikam06.autop;

import org.bukkit.plugin.java.JavaPlugin;

public class AutoOP extends JavaPlugin {

    @Override
    public void onEnable() {
        // Register the event listener
        getServer().getPluginManager().registerEvents(new EventManager(), this);
    }

    @Override
    public void onDisable() { }
}
