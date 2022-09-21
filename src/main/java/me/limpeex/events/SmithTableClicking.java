package me.limpeex.events;

import me.limpeex.pazar.NEWGUI;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

import java.util.HashMap;

public class SmithTableClicking implements Listener{
    private static  HashMap<Player, Block> lastBlockClicked = new HashMap<>();
    @EventHandler
    public void onTouchSmithTable(PlayerInteractEvent e) {
        Player p = e.getPlayer();
        Block block = e.getClickedBlock();
        if(block != null) {
            if(block.getType() == Material.SMITHING_TABLE) {
                if(p.hasPermission("demirci")) {
                    lastBlockClicked.put(p,e.getClickedBlock());
                    p.openInventory(NEWGUI.smithChooseGUI);
                }else {
                    p.sendMessage(ChatColor.GREEN + "Demircilik yeteneğiniz bulunmuyor.. Krallık binasından başvuru yapmalısınız.");
                }

            }
        }
    }

    public static HashMap<Player, Block> getLastBlockClicked() {
        return lastBlockClicked;
    }
}
