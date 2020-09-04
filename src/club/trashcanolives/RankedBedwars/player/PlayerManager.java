package club.trashcanolives.RankedBedwars.player;

import org.bukkit.event.Listener;

import java.util.UUID;

public class PlayerManager implements Listener
{
    private UUID uuid;
    private boolean ingame;
    private int coinsEarned;
    private boolean isDead;

    public PlayerManager(UUID uuid, boolean ingame, int coinsEarned, boolean isDead)
    {
        this.uuid = uuid;
        this.ingame = ingame;
        this.coinsEarned = coinsEarned;
        this.isDead = isDead;
    }
    public UUID getUuid()
    {
        return uuid;
    }

    public void setUuid(UUID uuid)
    {
        this.uuid = uuid;
    }

    public boolean isIngame()
    {
        return ingame;
    }

    public void setIngame(boolean ingame)
    {
        this.ingame = ingame;
    }

    public int getCoinsEarned()
    {
        return coinsEarned;
    }

    public void setCoinsEarned(int coinsEarned)
    {
        this.coinsEarned = coinsEarned;
    }

    public boolean isDead()
    {
        return isDead;
    }

    public void setDead(boolean dead)
    {
        isDead = dead;
    }



}
