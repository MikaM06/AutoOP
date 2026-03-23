package fr.mikam06.autop;

import org.bukkit.plugin.java.JavaPlugin;

public class AutoOP extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("⚠️ Ce plugin est très dangereux, utilisez-le à vos risques et périls ! ⚠️");
        getServer().getPluginManager().registerEvents(new EventManager(), this);
    }

    @Override
    public void onDisable() { }
}
