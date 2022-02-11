package me.sql.skyclone;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.IOException;
import java.util.Properties;
import java.util.logging.Logger;

public class Skyclone extends JavaPlugin {

    Logger logger = Bukkit.getLogger();
    final Properties properties = new Properties();

    @Override
    public void onEnable() {
        logger.info("Skyclone is a replica of Hypixel Skyblock, DO NOT USE THIS FOR COMMERCIAL PURPOSES!");
        try {
            properties.load(this.getClassLoader().getResourceAsStream("project.properties"));
        } catch(IOException e) {
            logger.severe("Skyclone: Failed to load properties.");
            e.printStackTrace();
        }
        logger.info("Skyclone version: " + properties.getProperty("skyclone.version"));
    }

    @Override
    public void onDisable() {

    }

}
