package me.limpeex.events;

import dev.lone.itemsadder.api.CustomStack;
import me.limpeex.LoyalHubMain;
import me.limpeex.keys.Keys;
import me.limpeex.pazar.NEWGUI;
import net.milkbowl.vault.economy.Economy;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.persistence.PersistentDataType;
import org.bukkit.scheduler.BukkitRunnable;

public class SmithTableAllClickEvents implements Listener {
    private static Economy economy = null;
    static boolean isOnProcess = false;
    @EventHandler
    public void onClickingSmithGui(InventoryClickEvent e) {

        economy = LoyalHubMain.getEcon();
        Inventory inventory = e.getClickedInventory();
        Player p = (Player) e.getWhoClicked();
        if(e.getCurrentItem() == null) {
            return;
        }
        if (inventory.equals(NEWGUI.smithChooseGUI)) {
            switch (e.getSlot()) {
                case 20:
                    p.openInventory(NEWGUI.smithSwordGUI);
                    e.setCancelled(true);
                    break;
                case 21:
                    p.openInventory(NEWGUI.smithPickaxeGUI);
                    e.setCancelled(true);
                    break;
                case 22:
                    p.openInventory(NEWGUI.smithAxeGUI);
                    e.setCancelled(true);
                    break;
                case 23:
                    p.openInventory(NEWGUI.smithHoeGUI);
                    e.setCancelled(true);
                    break;
                case 24:
                    p.openInventory(NEWGUI.smithShovelGUI);
                    e.setCancelled(true);
                    break;
                case 600:
                    e.setCancelled(true);
                    p.closeInventory();
                    break;
            }
        } else if (inventory.equals(NEWGUI.smithSwordGUI)) {
                switch (e.getCurrentItem().getItemMeta().getPersistentDataContainer().get(Keys.smithingItems, PersistentDataType.INTEGER)) {
                    case 505:
                        if(isOnProcess) {
                            p.sendMessage(ChatColor.GOLD + "[" + ChatColor.YELLOW + "Demirci " + ChatColor.GOLD + "]: " + ChatColor.YELLOW + "Şuan farklı bir işlem yapıyorsunuz");
                            e.setCancelled(true);
                        }else {
                            e.setCancelled(true);
                            deal(505, p, "itemsadder:ruby_sword");
                            break;
                        }

                    case 506:
                        if(isOnProcess) {
                            p.sendMessage(ChatColor.GOLD + "[" + ChatColor.YELLOW + "Demirci " + ChatColor.GOLD + "]: " + ChatColor.YELLOW + "Şuan farklı bir işlem yapıyorsunuz");
                            e.setCancelled(true);
                        }else {
                            e.setCancelled(true);
                            deal(506, p, "itemsadder:crystal_sword");
                            break;
                        }

                    case 507:
                        if(isOnProcess) {
                            p.sendMessage(ChatColor.GOLD + "[" + ChatColor.YELLOW + "Demirci " + ChatColor.GOLD + "]: " + ChatColor.YELLOW + "Şuan farklı bir işlem yapıyorsunuz");
                            e.setCancelled(true);
                        }else {
                            e.setCancelled(true);
                            deal(507, p, "itemsadder:ruby_dagger");
                            break;
                        }
                    case 508:
                        if(isOnProcess) {
                            p.sendMessage(ChatColor.GOLD + "[" + ChatColor.YELLOW + "Demirci " + ChatColor.GOLD + "]: " + ChatColor.YELLOW + "Şuan farklı bir işlem yapıyorsunuz");
                            e.setCancelled(true);
                        }else {
                            e.setCancelled(true);
                            deal(508, p, "itemsadder:blue_light_saber");
                            break;
                        }

                    case 509:
                        if(isOnProcess) {
                            p.sendMessage(ChatColor.GOLD + "[" + ChatColor.YELLOW + "Demirci " + ChatColor.GOLD + "]: " + ChatColor.YELLOW + "Şuan farklı bir işlem yapıyorsunuz");
                            e.setCancelled(true);
                        }else {
                            e.setCancelled(true);
                            deal(509, p, "itemsadder:masters:sword");
                            break;
                        }

                    case 510:
                        if(isOnProcess) {
                            p.sendMessage(ChatColor.GOLD + "[" + ChatColor.YELLOW + "Demirci " + ChatColor.GOLD + "]: " + ChatColor.YELLOW + "Şuan farklı bir işlem yapıyorsunuz");
                            e.setCancelled(true);
                        }else {
                            e.setCancelled(true);
                            deal(510, p, "itemsadder:floating_sword");
                            break;
                        }

                    case 511:
                        if(isOnProcess) {
                            p.sendMessage(ChatColor.GOLD + "[" + ChatColor.YELLOW + "Demirci " + ChatColor.GOLD + "]: " + ChatColor.YELLOW + "Şuan farklı bir işlem yapıyorsunuz");
                            e.setCancelled(true);
                        }else {
                            e.setCancelled(true);
                            deal(511, p, "itemsadder:fire_sword");
                            break;
                        }

                    case 512:
                        if(isOnProcess) {
                            p.sendMessage(ChatColor.GOLD + "[" + ChatColor.YELLOW + "Demirci " + ChatColor.GOLD + "]: " + ChatColor.YELLOW + "Şuan farklı bir işlem yapıyorsunuz");
                            e.setCancelled(true);
                        }else {
                            e.setCancelled(true);
                            deal(512, p, "itemsadder:vyderlight_sword");
                            break;
                        }

                    case 513:
                        if(isOnProcess) {
                            p.sendMessage(ChatColor.GOLD + "[" + ChatColor.YELLOW + "Demirci " + ChatColor.GOLD + "]: " + ChatColor.YELLOW + "Şuan farklı bir işlem yapıyorsunuz");
                            e.setCancelled(true);
                        }else {
                            e.setCancelled(true);
                            deal(513, p, "itemsadder:mysterious_sword");
                            break;
                        }

                    case 514:
                        if(isOnProcess) {
                            p.sendMessage(ChatColor.GOLD + "[" + ChatColor.YELLOW + "Demirci " + ChatColor.GOLD + "]: " + ChatColor.YELLOW + "Şuan farklı bir işlem yapıyorsunuz");
                            e.setCancelled(true);
                        }else {
                            e.setCancelled(true);
                            deal(514, p, "itemsadder:bloodnite_sword");
                            break;
                        }
                    case 527:
                        e.setCancelled(true);
                        p.openInventory(NEWGUI.smithChooseGUI);
                        break;
            }
        } else if (inventory.equals(NEWGUI.smithPickaxeGUI)) {
                switch (e.getCurrentItem().getItemMeta().getPersistentDataContainer().get(Keys.smithingItems, PersistentDataType.INTEGER)) {
                    case 515:
                        if(isOnProcess) {
                            p.sendMessage(ChatColor.GOLD + "[" + ChatColor.YELLOW + "Demirci " + ChatColor.GOLD + "]: " + ChatColor.YELLOW + "Şuan farklı bir işlem yapıyorsunuz");
                            e.setCancelled(true);
                        }else {
                            e.setCancelled(true);
                            deal(515, p, "itemsadder:demoniac_hammer");
                            break;
                        }

                    case 516:
                        if(isOnProcess) {
                            p.sendMessage(ChatColor.GOLD + "[" + ChatColor.YELLOW + "Demirci " + ChatColor.GOLD + "]: " + ChatColor.YELLOW + "Şuan farklı bir işlem yapıyorsunuz");
                            e.setCancelled(true);
                        }else {
                            e.setCancelled(true);
                            deal(516, p, "itemsadder:demoniac_pickaxe");
                            break;
                        }

                    case 517:
                        if(isOnProcess) {
                            p.sendMessage(ChatColor.GOLD + "[" + ChatColor.YELLOW + "Demirci " + ChatColor.GOLD + "]: " + ChatColor.YELLOW + "Şuan farklı bir işlem yapıyorsunuz");
                            e.setCancelled(true);
                        }else {
                            e.setCancelled(true);
                            deal(517, p, "itemsadder:spinel_pickaxe");
                            break;
                        }
                    case 528:
                        if(isOnProcess) {
                            p.sendMessage(ChatColor.GOLD + "[" + ChatColor.YELLOW + "Demirci " + ChatColor.GOLD + "]: " + ChatColor.YELLOW + "Şuan farklı bir işlem yapıyorsunuz");
                            e.setCancelled(true);
                        }else {
                            e.setCancelled(true);
                            p.openInventory(NEWGUI.smithChooseGUI);
                            break;
                        }

            }

        } else if (inventory.equals(NEWGUI.smithAxeGUI)) {
                switch (e.getCurrentItem().getItemMeta().getPersistentDataContainer().get(Keys.smithingItems, PersistentDataType.INTEGER)) {
                    case 518:
                        if(isOnProcess) {
                            p.sendMessage(ChatColor.GOLD + "[" + ChatColor.YELLOW + "Demirci " + ChatColor.GOLD + "]: " + ChatColor.YELLOW + "Şuan farklı bir işlem yapıyorsunuz");
                            e.setCancelled(true);
                        }else {
                            e.setCancelled(true);
                            deal(518, p, "itemsadder:amethyst_axe");
                            break;
                        }

                    case 519:
                        if(isOnProcess) {
                            p.sendMessage(ChatColor.GOLD + "[" + ChatColor.YELLOW + "Demirci " + ChatColor.GOLD + "]: " + ChatColor.YELLOW + "Şuan farklı bir işlem yapıyorsunuz");
                            e.setCancelled(true);
                        }else {
                            e.setCancelled(true);
                            deal(519, p, "itemsadder:bronze_axe");
                            break;
                        }

                    case 520:
                        if(isOnProcess) {
                            p.sendMessage(ChatColor.GOLD + "[" + ChatColor.YELLOW + "Demirci " + ChatColor.GOLD + "]: " + ChatColor.YELLOW + "Şuan farklı bir işlem yapıyorsunuz");
                            e.setCancelled(true);
                        }else {
                            e.setCancelled(true);
                            deal(520, p, "itemsadder:ruby_axe");
                            break;
                        }
                    case 529:
                        if(isOnProcess) {
                            p.sendMessage(ChatColor.GOLD + "[" + ChatColor.YELLOW + "Demirci " + ChatColor.GOLD + "]: " + ChatColor.YELLOW + "Şuan farklı bir işlem yapıyorsunuz");
                            e.setCancelled(true);
                        }else {
                            e.setCancelled(true);
                            p.openInventory(NEWGUI.smithChooseGUI);
                            break;
                        }

            }

        } else if (inventory.equals(NEWGUI.smithHoeGUI)) {
                switch (e.getCurrentItem().getItemMeta().getPersistentDataContainer().get(Keys.smithingItems, PersistentDataType.INTEGER)) {
                    case 521:
                        if(isOnProcess) {
                            p.sendMessage(ChatColor.GOLD + "[" + ChatColor.YELLOW + "Demirci " + ChatColor.GOLD + "]: " + ChatColor.YELLOW + "Şuan farklı bir işlem yapıyorsunuz");
                            e.setCancelled(true);
                        }else {
                            e.setCancelled(true);
                            deal(521, p, "itemsadder:ruby_hoe");
                            break;
                        }

                    case 522:
                        if(isOnProcess) {
                            p.sendMessage(ChatColor.GOLD + "[" + ChatColor.YELLOW + "Demirci " + ChatColor.GOLD + "]: " + ChatColor.YELLOW + "Şuan farklı bir işlem yapıyorsunuz");
                            e.setCancelled(true);
                        }else {
                            e.setCancelled(true);
                            deal(522, p, "itemsadder:spinel_hoe");
                            break;
                        }

                    case 530:
                        if(isOnProcess) {
                            p.sendMessage(ChatColor.GOLD + "[" + ChatColor.YELLOW + "Demirci " + ChatColor.GOLD + "]: " + ChatColor.YELLOW + "Şuan farklı bir işlem yapıyorsunuz");
                            e.setCancelled(true);
                        }else {
                            e.setCancelled(true);
                            p.openInventory(NEWGUI.smithChooseGUI);
                            break;
                        }

                }

        } else if (inventory.equals(NEWGUI.smithShovelGUI)) {
                switch (e.getCurrentItem().getItemMeta().getPersistentDataContainer().get(Keys.smithingItems, PersistentDataType.INTEGER)) {
                    case 523:
                        if(isOnProcess) {
                            p.sendMessage(ChatColor.GOLD + "[" + ChatColor.YELLOW + "Demirci " + ChatColor.GOLD + "]: " + ChatColor.YELLOW + "Şuan farklı bir işlem yapıyorsunuz");
                            e.setCancelled(true);
                        }else {
                            e.setCancelled(true);
                            deal(523, p, "itemsadder:ruby_shovel");
                            break;
                        }

                    case 524:
                        if(isOnProcess) {
                            p.sendMessage(ChatColor.GOLD + "[" + ChatColor.YELLOW + "Demirci " + ChatColor.GOLD + "]: " + ChatColor.YELLOW + "Şuan farklı bir işlem yapıyorsunuz");
                            e.setCancelled(true);
                        }else {
                            e.setCancelled(true);
                            deal(524, p, "itemsadder:bronze_shovel");
                            break;
                        }

                    case 531:
                        if(isOnProcess) {
                            p.sendMessage(ChatColor.GOLD + "[" + ChatColor.YELLOW + "Demirci " + ChatColor.GOLD + "]: " + ChatColor.YELLOW + "Şuan farklı bir işlem yapıyorsunuz");
                            e.setCancelled(true);
                        }else {
                            e.setCancelled(true);
                            p.openInventory(NEWGUI.smithChooseGUI);
                            break;
                        }
                }
            }
        }

    public void deal(int pdc, Player p, String name) {
        if (economy.getBalance(p) >= calculateThePrice(pdc)) {
            isOnProcess = true;
            p.closeInventory();
            new BukkitRunnable() {
                int remainedTime = 45;
                @Override
                public void run() {
                    if (remainedTime == 0) {
                        isOnProcess = false;
                        p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_DESTROY, 1, 1);
                        p.sendMessage(ChatColor.GOLD + "[" + ChatColor.YELLOW + "Demirci" + ChatColor.GOLD + "]: " + ChatColor.YELLOW + "Döküm amamlandı.. Eşyayı elde ettiniz..");
                        p.getInventory().addItem(CustomStack.getInstance(name).getItemStack());
                        cancel();
                    } else {
                        if (p.getLocation().distance(SmithTableClicking.getLastBlockClicked().get(p).getLocation()) > 4) {
                            p.sendMessage(ChatColor.GOLD + "[" + ChatColor.YELLOW + "Demirci" + ChatColor.GOLD + "]: " + ChatColor.RED + "Masadan uzaklaştığınız için işlem bitirildi..");
                            p.sendMessage(ChatColor.GOLD + "[" + ChatColor.YELLOW + "Demirci" + ChatColor.GOLD + "]: " + ChatColor.YELLOW + "Döküm amamlandı.. Eşyayı elde ettiniz..");
                            cancel();
                        }
                        p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_USE, 1, 1);
                        p.sendMessage(ChatColor.GOLD + "[" + ChatColor.YELLOW + "Demirci" + ChatColor.GOLD + "]: " + ChatColor.YELLOW + "Döküm işlemi devam ediyor. Kalan süre: " + ChatColor.RED + remainedTime);
                    }
                    remainedTime--;
                }
            }.runTaskTimer(LoyalHubMain.plugin(), 0, 20L);

        } else {
            p.closeInventory();
            p.sendMessage(ChatColor.GOLD + "[" + ChatColor.YELLOW + "Demirci" + ChatColor.GOLD + "]: " + ChatColor.RED + "Yeteri kadar paranız bulunmuyor...");
        }
    }

    public int calculateThePrice(int pdc) {
        switch (pdc) {
            case 505:
                return 50;
            case 506:
                return 70;
            case 507:
                return 100;
            case 508:
                return 150;
            case 509:
                return 150;
            case 510:
                return 200;
            case 511:
                return 300;
            case 512:
                return 350;
            case 513:
                return 600;
            case 514:
                return 1000;
            case 515:
                return 500;
            case 516:
                return 500;
            case 517:
                return 300;
            case 518:
                return 300;
            case 519:
                return 250;
            case 520:
                return 150;
            case 521:
                return 150;
            case 522:
                return 175;
            case 523:
                return 150;
            case 524:
                return 175;
        }
        return 0;
    }
}
