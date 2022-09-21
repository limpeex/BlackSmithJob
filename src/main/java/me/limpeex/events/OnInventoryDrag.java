package me.limpeex.events;

import dev.lone.itemsadder.api.CustomStack;
import me.limpeex.ia_items.CustomStacks;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.event.inventory.InventoryInteractEvent;
import org.bukkit.event.inventory.InventoryMoveItemEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.inventory.Inventory;

public class OnInventoryDrag  implements Listener {
    @EventHandler
    public void onDrag(InventoryClickEvent e) {
        if(e.getWhoClicked().isOp()) {
            return;
        }
        e.setCancelled(true);
    }
}
