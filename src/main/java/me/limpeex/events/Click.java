package me.limpeex.events;

import me.limpeex.pazar.NEWGUI;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class Click implements Listener {
    @EventHandler
    public void onClick(PlayerInteractEvent e) {
        Player p = e.getPlayer();
        if(e.getClickedBlock() == null) {
            return;
        }
        if (e.getClickedBlock().getLocation().equals(new Location(Bukkit.getWorld("world"), 90, 70, -42))) {
            p.openInventory(NEWGUI.sellGUI);
        }
    }
}
