package me.limpeex.pazar;

import net.milkbowl.vault.chat.Chat;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.UUID;

public class NEWGUI {
    private UUID[]  owners;
    private int number;
    public static Inventory sellGUI;
    public static Inventory stackGUI;
    public static Inventory swordGUI;
    public static Inventory foodGUI;
    public  static  Inventory blockGUI;
    public  static Inventory toolGUI;
    public static  Inventory mineGUI;
    public static Inventory smithChooseGUI;
    public static Inventory smithSwordGUI;
    public static Inventory smithPickaxeGUI;
    public static Inventory smithAxeGUI;
    public static Inventory smithHoeGUI;
    public static Inventory smithShovelGUI;


    public NEWGUI(UUID[] owners, int number) {
        this.owners = owners;
        this.number = number;
    }

    public NEWGUI(int number) {
        if(number == 1) {
            sellGUI = Bukkit.createInventory(null, 54, ChatColor.GREEN + "                Market");
        }else if(number == 2) {
            stackGUI = Bukkit.createInventory(null, 54, ChatColor.GREEN + "            Adet Seçiniz");
        }else if(number == 3) {
             swordGUI = Bukkit.createInventory(null, 54, ChatColor.GREEN + "             Kılıç Marketi");
        }else if(number == 4) {
             foodGUI = Bukkit.createInventory(null, 54, ChatColor.GREEN + "           Yiyecek Marketi");
        }else if(number == 5) {
             blockGUI = Bukkit.createInventory(null, 54, ChatColor.GREEN + "            Blok Marketi");
        }else if(number == 6) {
             toolGUI = Bukkit.createInventory(null, 54, ChatColor.GREEN + "            Alet Marketi");
        }else if(number == 7) {
             mineGUI = Bukkit.createInventory(null, 54, ChatColor.GREEN + "            Maden Marketi");
        }else if(number == 8) {
             smithChooseGUI = Bukkit.createInventory(null, 54, ChatColor.RED + "          DEMIRCI MENUSU");
        }else if(number == 9) {
             smithSwordGUI = Bukkit.createInventory(null, 54, ChatColor.RED +   "        ALETINIZI SECINIZ");
        }else if(number == 10) {
            smithPickaxeGUI = Bukkit.createInventory(null, 54, ChatColor.RED +   "        ALETINIZI SECINIZ");
        }else if(number == 11) {
            smithAxeGUI = Bukkit.createInventory(null, 54, ChatColor.RED +   "        ALETINIZI SECINIZ");
        }else if(number == 12) {
            smithHoeGUI = Bukkit.createInventory(null, 54, ChatColor.RED +   "        ALETINIZI SECINIZ");
        }else if(number == 13) {
            smithShovelGUI = Bukkit.createInventory(null, 54, ChatColor.RED +   "        ALETINIZI SECINIZ");
        }
    }

    public static Inventory getInv1() {
        return sellGUI;
    }

    public static Inventory getInv2() {
        return stackGUI;
    }

    public static Inventory getSwordGUI() {
        return swordGUI;
    }

    public static Inventory getFoodGUI() {
        return foodGUI;
    }

    public static Inventory getBlockGUI() {
        return blockGUI;
    }

    public static Inventory getToolGUI() {
        return toolGUI;
    }

    public static Inventory getMineGUI() {
        return mineGUI;
    }

    public static Inventory getSmithChooseGUI() {
        return smithChooseGUI;
    }


    public UUID[] getOwners() {
        return owners;
    }

    public void setOwners(UUID[] owners) {
        this.owners = owners;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public static void makeTheBuy(Player p, ItemStack is, int amount) {
        is.setAmount(amount);
        p.getInventory().addItem(is);
    }
}
