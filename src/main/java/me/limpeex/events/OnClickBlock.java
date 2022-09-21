package me.limpeex.events;

import me.limpeex.ia_items.CustomStacks;
import me.limpeex.keys.Keys;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.persistence.PersistentDataType;

import java.util.ArrayList;
import java.util.Random;

public class OnClickBlock implements Listener{
    private static ArrayList<String> couponTookPlayers = new ArrayList<>();
    @EventHandler
    public void onClick(PlayerInteractEvent e) {
        Block block = e.getClickedBlock();
        Location loc = new Location(Bukkit.getWorld("world"), 9, 72, 46);
        Random random = new Random();
        Player p = e.getPlayer();
        if(block == null || !block.getLocation().equals(loc)) {
            return;
        }
        if(p.getPersistentDataContainer().has(Keys.couponPlayers, PersistentDataType.INTEGER)) {
            p.sendMessage(ChatColor.RED + "Daha önceden bir bilet aldınız...");
            return;
        }
        int num = random.nextInt(9);
        if(block.getLocation().equals(loc)) {
            if(num == 0) {
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "iagive " + p.getName() + " itemsadder:black_coupon");
                p.sendMessage(ChatColor.GREEN + "Başarılı bir şekilde biletinizi aldınız...");
                p.getPersistentDataContainer().set(Keys.couponPlayers, PersistentDataType.INTEGER, 0);
            }else if(num == 1) {
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "iagive " + p.getName() + " itemsadder:purple_coupon");
                p.sendMessage(ChatColor.GREEN + "Başarılı bir şekilde biletinizi aldınız...");
                p.getPersistentDataContainer().set(Keys.couponPlayers, PersistentDataType.INTEGER, 0);
            }else if(num == 2) {
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "iagive " + p.getName() + " itemsadder:green_coupon");
                p.sendMessage(ChatColor.GREEN + "Başarılı bir şekilde biletinizi aldınız...");
                p.getPersistentDataContainer().set(Keys.couponPlayers, PersistentDataType.INTEGER, 0);
            }else if(num == 3) {
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "iagive " + p.getName() + " itemsadder:red_coupon");
                p.sendMessage(ChatColor.GREEN + "Başarılı bir şekilde biletinizi aldınız...");
                p.getPersistentDataContainer().set(Keys.couponPlayers, PersistentDataType.INTEGER, 0);
            }else if(num == 4) {
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "iagive " + p.getName() + " itemsadder:white_coupon");
                p.sendMessage(ChatColor.GREEN + "Başarılı bir şekilde biletinizi aldınız...");
                p.getPersistentDataContainer().set(Keys.couponPlayers, PersistentDataType.INTEGER, 0);
            }else if(num == 5) {
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "iagive " + p.getName() + " itemsadder:turquoise_coupon");
                p.sendMessage(ChatColor.GREEN + "Başarılı bir şekilde biletinizi aldınız...");
                p.getPersistentDataContainer().set(Keys.couponPlayers, PersistentDataType.INTEGER, 0);
            }else if(num == 6) {
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "iagive " + p.getName() + " itemsadder:light_blue_coupon");
                p.sendMessage(ChatColor.GREEN + "Başarılı bir şekilde biletinizi aldınız...");
                p.getPersistentDataContainer().set(Keys.couponPlayers, PersistentDataType.INTEGER, 0);
            }else if(num == 7) {
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "iagive " + p.getName() + " itemsadder:golden_coupon");
                p.sendMessage(ChatColor.GREEN + "Başarılı bir şekilde biletinizi aldınız...");
                p.getPersistentDataContainer().set(Keys.couponPlayers, PersistentDataType.INTEGER, 0);
            }
        }

















        /*CouponList.load();
        if(CouponList.get().getStringList("list").contains(p.getUniqueId().toString())) {
            p.sendMessage(ChatColor.RED + "Zaten daha önce bir bilet aldınız...");
            return;
        }
        int num = random.nextInt(9);
        if(block.getLocation().equals(loc)) {
            if(num == 0) {
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "iagive " + p.getName() + " itemsadder:black_coupon");
                p.sendMessage(ChatColor.GREEN + "Başarılı bir şekilde biletinizi aldınız...");
                CouponList.load();
                couponTookPlayers.add(p.getUniqueId().toString());
                CouponList.get().set("list", couponTookPlayers);
                CouponList.save();
            }else if(num == 1) {
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "iagive " + p.getName() + " itemsadder:purple_coupon");
                p.sendMessage(ChatColor.GREEN + "Başarılı bir şekilde biletinizi aldınız...");
                CouponList.load();
                couponTookPlayers.add(p.getUniqueId().toString());
                CouponList.get().set("list", couponTookPlayers);
                CouponList.save();
            }else if(num == 2) {
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "iagive " + p.getName() + " itemsadder:green_coupon");
                p.sendMessage(ChatColor.GREEN + "Başarılı bir şekilde biletinizi aldınız...");
                CouponList.load();
                couponTookPlayers.add(p.getUniqueId().toString());
                CouponList.get().set("list", couponTookPlayers);
                CouponList.save();
            }else if(num == 3) {
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "iagive " + p.getName() + " itemsadder:red_coupon");
                p.sendMessage(ChatColor.GREEN + "Başarılı bir şekilde biletinizi aldınız...");
                CouponList.load();
                couponTookPlayers.add(p.getUniqueId().toString());
                CouponList.get().set("list", couponTookPlayers);
                CouponList.save();
            }else if(num == 4) {
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "iagive " + p.getName() + " itemsadder:white_coupon");
                p.sendMessage(ChatColor.GREEN + "Başarılı bir şekilde biletinizi aldınız...");
                CouponList.load();
                couponTookPlayers.add(p.getUniqueId().toString());
                CouponList.get().set("list", couponTookPlayers);
                CouponList.save();
            }else if(num == 5) {
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "iagive " + p.getName() + " itemsadder:turquoise_coupon");
                p.sendMessage(ChatColor.GREEN + "Başarılı bir şekilde biletinizi aldınız...");
                CouponList.load();
                couponTookPlayers.add(p.getUniqueId().toString());
                CouponList.get().set("list", couponTookPlayers);
                CouponList.save();
            }else if(num == 6) {
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "iagive " + p.getName() + " itemsadder:light_blue_coupon");
                p.sendMessage(ChatColor.GREEN + "Başarılı bir şekilde biletinizi aldınız...");
                CouponList.load();
                couponTookPlayers.add(p.getUniqueId().toString());
                CouponList.get().set("list", couponTookPlayers);
                CouponList.save();
            }else if(num == 7) {
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "iagive " + p.getName() + " itemsadder:golden_coupon");
                p.sendMessage(ChatColor.GREEN + "Başarılı bir şekilde biletinizi aldınız...");
                CouponList.load();
                couponTookPlayers.add(p.getUniqueId().toString());
                CouponList.get().set("list", couponTookPlayers);
                CouponList.save();
            }
        }*/
    }
}
