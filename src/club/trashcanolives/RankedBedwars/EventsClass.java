package club.trashcanolives.RankedBedwars;

import club.trashcanolives.RankedBedwars.player.PlayerManager;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import java.util.UUID;

public class EventsClass implements Listener
{
    private Main plugin = Main.getPlugin(Main.class);

//    @Override
    public void onJoin(PlayerJoinEvent event){
        Player player = event.getPlayer();
        UUID uuid = player.getUniqueId();

        plugin.playerManager.add(new PlayerManager(uuid, false, 0, false));
    }
}
