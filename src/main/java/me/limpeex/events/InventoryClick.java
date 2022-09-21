package me.limpeex.events;

import me.limpeex.LoyalHubMain;
import me.limpeex.pazar.NEWGUI;
import me.limpeex.pazar.PazarSlotThrower;
import net.milkbowl.vault.chat.Chat;
import net.milkbowl.vault.economy.Economy;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.*;

public class InventoryClick implements Listener {
    private static final Economy economy = LoyalHubMain.getEcon();
    private static final Chat chat = LoyalHubMain.getChat();
    HashMap<UUID, ItemStack> playerMap = new HashMap<UUID, ItemStack>();
    public static <K, V> Set<K> getKeys(Map<K, V> map, V value) {
        Set<K> keys = new HashSet<>();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (entry.getValue().equals(value)) {
                keys.add(entry.getKey());
            }
        }
        return keys;
    }
    @EventHandler
    public void onClick(InventoryClickEvent e) {
        int slot;
        int price;
        Player p = (Player) e.getWhoClicked();
        if(e.getCurrentItem() == null){
            return;
        }
        if(e.getCurrentItem().getItemMeta() == null) {
            return;
        }else {
            if(!e.getCurrentItem().getItemMeta().hasCustomModelData()) {
               return;
            }
        }
        p.sendMessage("giriyo");
        int  data = e.getCurrentItem().getItemMeta().getCustomModelData();
        Inventory inventory = e.getClickedInventory();
        if(e.getCurrentItem().hasItemMeta()) {
            if(e.getCurrentItem().getItemMeta().hasCustomModelData()) {
                if(e.getCurrentItem().getItemMeta().getCustomModelData() == 100) {
                    e.setCancelled(true);
                }
            }
        }
        if(e.getClickedInventory().equals(NEWGUI.stackGUI)){
            for(UUID uuid: playerMap.keySet()) {
                if(p.getUniqueId().equals(uuid)) {
                    ItemStack stack = playerMap.get(uuid);
                    switch (e.getSlot()) {
                        case 20 -> {
                            if(economy.getBalance(p) >= calculateThePrice(p, stack, 1)) {
                                stack.setAmount(1);
                                p.getInventory().addItem(stack);
                                p.sendMessage(ChatColor.GREEN + " Alışverişiniz başarıyla tamamlandı..." + " Tutar: " + ChatColor.GOLD + calculateThePrice(p,stack,1));
                                economy.withdrawPlayer(p, calculateThePrice(p, stack, 1));
                                //Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "eco take " + p.getName() + " " +calculateThePrice(p, stack, 1));
                            } else {
                                p.sendMessage(ChatColor.RED + "Yeterli paranız bulunmuyor...");
                            }
                        }
                        case 21 -> {
                            if(economy.getBalance(p) >= calculateThePrice(p, stack, 8)) {
                                stack.setAmount(8);
                                p.getInventory().addItem(stack);
                                p.sendMessage(ChatColor.GREEN + " Alışverişiniz başarıyla tamamlandı..." + " Tutar: " + ChatColor.GOLD + calculateThePrice(p,stack,8));                                economy.withdrawPlayer(p, calculateThePrice(p, stack, 8));
                                //Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "eco take " + p.getName() + " " +calculateThePrice(p, stack, 8));
                            } else {
                                p.sendMessage(ChatColor.RED + "Yeterli paranız bulunmuyor...");
                            }
                        }
                        case 22 -> {
                            if(economy.getBalance(p) >= calculateThePrice(p, stack, 16)) {
                                stack.setAmount(16);
                                p.getInventory().addItem(stack);
                                p.sendMessage(ChatColor.GREEN + " Alışverişiniz başarıyla tamamlandı..." + " Tutar: " + ChatColor.GOLD + calculateThePrice(p,stack,16));
                                economy.withdrawPlayer(p, calculateThePrice(p, stack, 16));
                                //Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "eco take " + p.getName()+  " " + calculateThePrice(p, stack, 16));
                            } else {
                                p.sendMessage(ChatColor.RED + "Yeterli paranız bulunmuyor...");
                            }
                        }
                        case 23 -> {
                            if(economy.getBalance(p) >= calculateThePrice(p, stack, 32)) {
                                stack.setAmount(32);
                                p.getInventory().addItem(stack);
                                p.sendMessage(ChatColor.GREEN + " Alışverişiniz başarıyla tamamlandı..." + " Tutar: " + ChatColor.GOLD + calculateThePrice(p,stack,32));
                                economy.withdrawPlayer(p, calculateThePrice(p, stack, 32));
                                //Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "eco take " + p.getName()+  " " + calculateThePrice(p, stack, 32));
                            } else {
                                p.sendMessage(ChatColor.RED + "Yeterli paranız bulunmuyor... ");
                            }
                        }
                        case 24 -> {
                            if(economy.getBalance(p) >= calculateThePrice(p, stack, 64)) {
                                stack.setAmount(64);
                                p.getInventory().addItem(stack);
                                p.sendMessage(ChatColor.GREEN + " Alışverişiniz başarıyla tamamlandı..." + " Tutar: " + ChatColor.GOLD + calculateThePrice(p,stack,64));
                                economy.withdrawPlayer(p, calculateThePrice(p, stack, 64));
                                //Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "eco take " + p.getName()+  " " + calculateThePrice(p, stack, 64));
                            } else {
                                p.sendMessage(ChatColor.RED + "Yeterli paranız bulunmuyor...");
                            }
                        }
                    }
                }
            }
            /*for(ItemStack stack: playerMap.values()) {
                if(p.getUniqueId().equals(getKeys(playerMap, stack))) {
                    p.sendMessage("4");
                    switch(e.getSlot()) {
                        case 20: stack.setAmount(1); p.getInventory().addItem(stack); break;
                        case 21: stack.setAmount(8); p.getInventory().addItem(stack); break;
                        case 22: stack.setAmount(16); p.getInventory().addItem(stack); break;
                        case 23: stack.setAmount(32); p.getInventory().addItem(stack); break;
                        case 24: stack.setAmount(64); p.getInventory().addItem(stack); break;
                    }
                }
            }*/
        }
        if(data == 36 || data == 37 || data == 38 || data == 39 || data == 40) {
            e.setCancelled(true);
        }
        if(data == 31 || data == 32 || data == 33 || data == 34 || data == 35) {
            p.openInventory(NEWGUI.sellGUI);
        }
        for(int i = 6; i < 32; i++) {
            if(data == i) {
                p.sendMessage(String.valueOf(data));
                e.setCancelled(true);
            }
        }
        if(e.getClickedInventory().equals(NEWGUI.swordGUI)) {
            switch (e.getSlot()) {
                case 20: playerMap.put(p.getUniqueId(), new ItemStack(Material.STONE_SWORD)); p.openInventory(NEWGUI.stackGUI); break;
                case 21: playerMap.put(p.getUniqueId(), new ItemStack(Material.GOLDEN_SWORD)); p.openInventory(NEWGUI.stackGUI); break;
                case 22: playerMap.put(p.getUniqueId(), new ItemStack(Material.IRON_SWORD)); p.openInventory(NEWGUI.stackGUI); break;
                case 23: playerMap.put(p.getUniqueId(), new ItemStack(Material.DIAMOND_SWORD)); p.openInventory(NEWGUI.stackGUI); break;
                case 24: playerMap.put(p.getUniqueId(), new ItemStack(Material.NETHERITE_SWORD)); p.openInventory(NEWGUI.stackGUI); break;
            }
        }else if(e.getClickedInventory().equals(NEWGUI.foodGUI)) {
            switch (e.getSlot()) {
                case 20: playerMap.put(p.getUniqueId(), new ItemStack(Material.CARROT)); p.openInventory(NEWGUI.stackGUI); break;
                case 21: playerMap.put(p.getUniqueId(), new ItemStack(Material.COOKED_BEEF)); p.openInventory(NEWGUI.stackGUI); break;
                case 22: playerMap.put(p.getUniqueId(), new ItemStack(Material.COOKED_CHICKEN)); p.openInventory(NEWGUI.stackGUI); break;
                case 23: playerMap.put(p.getUniqueId(), new ItemStack(Material.COOKED_MUTTON)); p.openInventory(NEWGUI.stackGUI); break;
                case 24: playerMap.put(p.getUniqueId(), new ItemStack(Material.APPLE)); p.openInventory(NEWGUI.stackGUI); break;
            }
        }else if(e.getClickedInventory().equals(NEWGUI.blockGUI)) {
            switch (e.getSlot()) {
                case 20: playerMap.put(p.getUniqueId(), new ItemStack(Material.DIRT)); p.openInventory(NEWGUI.stackGUI); break;
                case 21: playerMap.put(p.getUniqueId(), new ItemStack(Material.STONE)); p.openInventory(NEWGUI.stackGUI); break;
                case 22: playerMap.put(p.getUniqueId(), new ItemStack(Material.SPRUCE_PLANKS)); p.openInventory(NEWGUI.stackGUI); break;
                case 23: playerMap.put(p.getUniqueId(), new ItemStack(Material.BIRCH_PLANKS)); p.openInventory(NEWGUI.stackGUI); break;
                case 24: playerMap.put(p.getUniqueId(), new ItemStack(Material.DARK_OAK_PLANKS)); p.openInventory(NEWGUI.stackGUI); break;
            }
        }else if(e.getClickedInventory().equals(NEWGUI.mineGUI)) {
            switch (e.getSlot()) {
                case 20: playerMap.put(p.getUniqueId(), new ItemStack(Material.IRON_INGOT)); p.openInventory(NEWGUI.stackGUI); break;
                case 21: playerMap.put(p.getUniqueId(), new ItemStack(Material.DIAMOND)); p.openInventory(NEWGUI.stackGUI); break;
                case 22: playerMap.put(p.getUniqueId(), new ItemStack(Material.GOLD_INGOT)); p.openInventory(NEWGUI.stackGUI); break;
                case 23: playerMap.put(p.getUniqueId(), new ItemStack(Material.NETHERITE_INGOT)); p.openInventory(NEWGUI.stackGUI); break;
                case 24: playerMap.put(p.getUniqueId(), new ItemStack(Material.EMERALD)); p.openInventory(NEWGUI.stackGUI); break;
            }
        }else if(e.getClickedInventory().equals(NEWGUI.toolGUI)) {
            switch (e.getSlot()) {
                case 20: playerMap.put(p.getUniqueId(), new ItemStack(Material.STONE_SWORD)); p.openInventory(NEWGUI.stackGUI); break;
                case 21: playerMap.put(p.getUniqueId(), new ItemStack(Material.GOLDEN_SWORD)); p.openInventory(NEWGUI.stackGUI); break;
                case 22: playerMap.put(p.getUniqueId(), new ItemStack(Material.IRON_SWORD)); p.openInventory(NEWGUI.stackGUI); break;
                case 23: playerMap.put(p.getUniqueId(), new ItemStack(Material.DIAMOND_SWORD)); p.openInventory(NEWGUI.stackGUI); break;
                case 24: playerMap.put(p.getUniqueId(), new ItemStack(Material.NETHERITE_SWORD)); p.openInventory(NEWGUI.stackGUI); break;
            }
        }
        switch (data) {
            case 1 -> p.openInventory(NEWGUI.swordGUI);
            case 2 -> p.openInventory(NEWGUI.foodGUI);
            case 3 -> p.openInventory(NEWGUI.blockGUI);
            case 4 -> p.openInventory(NEWGUI.toolGUI);
            case 5 -> p.openInventory(NEWGUI.mineGUI);
        }
        if(e.getCurrentItem().hasItemMeta()) {
            if(e.getCurrentItem().getItemMeta().hasCustomModelData()) {
                if(e.getCurrentItem().getItemMeta().getCustomModelData() == 1 ||
                        e.getCurrentItem().getItemMeta().getCustomModelData() == 2||
                        e.getCurrentItem().getItemMeta().getCustomModelData() == 3||
                        e.getCurrentItem().getItemMeta().getCustomModelData() == 4||
                        e.getCurrentItem().getItemMeta().getCustomModelData() == 5) {
                    e.setCancelled(true);
                }
            }
        }
    }public static int calculateThePrice(Player p, ItemStack stack, int amount) {
        if(stack.isSimilar(new ItemStack(Material.STONE_SWORD))) {
            return 20 * amount;
        }else if(stack.isSimilar(new ItemStack(Material.GOLDEN_SWORD))) {
            return 50 * amount;
        }else if(stack.isSimilar(new ItemStack(Material.IRON_SWORD))) {
            return 70 * amount;
        }else if(stack.isSimilar(new ItemStack(Material.DIAMOND_SWORD))) {
            return 100 * amount;
        }else if(stack.isSimilar(new ItemStack(Material.NETHERITE_SWORD))) {
            return 200 * amount;
        }else if(stack.isSimilar(new ItemStack(Material.CARROT))) {
            return 20 * amount;
        }else if(stack.isSimilar(new ItemStack(Material.COOKED_BEEF))) {
            return 100 * amount;
        }else if(stack.isSimilar(new ItemStack(Material.COOKED_CHICKEN))) {
            return 70 * amount;
        }else if(stack.isSimilar(new ItemStack(Material.COOKED_MUTTON))) {
            return 70 * amount;
        }else if(stack.isSimilar(new ItemStack(Material.APPLE))) {
            return 40 * amount;
        }else if(stack.isSimilar(new ItemStack(Material.DIRT))) {
            return 15 * amount;
        }else if(stack.isSimilar(new ItemStack(Material.STONE))) {
            return 30 * amount;
        }else if(stack.isSimilar(new ItemStack(Material.SPRUCE_PLANKS))) {
            return 20 * amount;
        }else if(stack.isSimilar(new ItemStack(Material.BIRCH_PLANKS))) {
            return 20 * amount;
        }else if(stack.isSimilar(new ItemStack(Material.DARK_OAK_PLANKS))) {
            return 20 * amount;
        }else if(stack.isSimilar(new ItemStack(Material.DIAMOND_PICKAXE))) {
            return 100 * amount;
        }else if(stack.isSimilar(new ItemStack(Material.IRON_PICKAXE))) {
            return 60 * amount;
        }else if(stack.isSimilar(new ItemStack(Material.GOLDEN_PICKAXE))) {
            return 50 * amount;
        }else if(stack.isSimilar(new ItemStack(Material.NETHERITE_PICKAXE))) {
            return 200 * amount;
        }else if(stack.isSimilar(new ItemStack(Material.STONE_PICKAXE))) {
            return 30 * amount;
        }else if(stack.isSimilar(new ItemStack(Material.IRON_INGOT))) {
            return 20 * amount;
        }else if(stack.isSimilar(new ItemStack(Material.DIAMOND))) {
            return 40 * amount;
        }else if(stack.isSimilar(new ItemStack(Material.GOLD_INGOT))) {
            return 30 * amount;
        }else if(stack.isSimilar(new ItemStack(Material.NETHERITE_INGOT))) {
            return 60 * amount;
        }else if(stack.isSimilar(new ItemStack(Material.EMERALD))) {
            return 60 * amount;
        }

        else {
            p.sendMessage("Didnt even entered");
            p.sendMessage(stack.toString() + "               "  + amount);
            return 0;
        }
    }
}
