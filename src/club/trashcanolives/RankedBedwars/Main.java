package club.trashcanolives.RankedBedwars;

import club.trashcanolives.RankedBedwars.player.PlayerManager;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;

public class Main extends JavaPlugin
{
    public ArrayList<PlayerManager> playerManager = new ArrayList<PlayerManager>();

    @Override

    public void onEnable()
    {
        getServer().getConsoleSender().sendMessage("§8m§l-------------------------------\n\n§d§lRanked Bedwars §a§l(Enabled)\n\n§8m§l-------------------------------");
        getServer().getPluginManager().registerEvents(new EventsClass(), this);

    }

    @Override
    public void onDisable()
    {
        getServer().getConsoleSender().sendMessage("§8m§l-------------------------------\n\n§d§lRanked Bedwars §c§l(Disabled)\n\n§8m§l-------------------------------");

    }

    public void loadConfig()
    {
        getConfig().options().copyDefaults(true);
        saveConfig();

    }
}
