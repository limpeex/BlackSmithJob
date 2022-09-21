package me.limpeex.events;

import dev.lone.itemsadder.api.CustomStack;
import me.limpeex.ia_items.CustomStacks;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;

public class OnItemDrop implements Listener {
    @EventHandler
    public void onItemDrop(PlayerDropItemEvent e) {
        CustomStacks.addingComponents();
        for(CustomStack stack: CustomStacks.list) {
            if(e.getItemDrop().getItemStack().equals(stack.getItemStack())) {
                e.setCancelled(true);
            }
        }
    }
}
