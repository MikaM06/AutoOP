package fr.mikam06.autop;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public class AutoOP extends JavaPlugin {

    public static Logger logger;

    @Override
    public void onEnable() {
        logger = getLogger();

        logger.severe("==================================================");
        logger.severe("⚠️ Ce plugin est très dangereux, utilisez-le à vos risques et périls ! ⚠️");
        logger.severe("==================================================");
        getServer().getPluginManager().registerEvents(new EventManager(), this);
    }

    @Override
    public void onDisable() { }
}
