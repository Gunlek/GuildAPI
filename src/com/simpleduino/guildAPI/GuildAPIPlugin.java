package com.simpleduino.guildAPI;

import com.simpleduino.guildAPI.APIObjects.InitGuildAPI;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by Simple-Duino on 23/08/2016.
 * Copyrights Simple-Duino, all rights reserved
 */
public class GuildAPIPlugin extends JavaPlugin {

    public void onEnable()
    {
        new InitGuildAPI();
        this.getLogger().info("Plugin succesfuly enabled");
        this.getLogger().info("We can now work with others plugins");
    }

    public void onDisable()
    {
        this.getLogger().info("Plugin succesfuly disabled");
    }

}
