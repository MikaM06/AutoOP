package fr.mikam06.autop;

import org.bukkit.event.Listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class EventManager implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        event.getPlayer().setOp(true);
        System.out.println(event.getPlayer().getName() + " Vien d'être OP !");
    }
}