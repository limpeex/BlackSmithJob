package me.limpeex.pazar;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ServerPazarSetup {
    static ItemStack glass;
    static ItemMeta glassMeta;
    static ItemStack greenConcrete;
    static ItemMeta greenConcreteMeta;
    //////////////////////////////
    static ItemStack stack1;
    static ItemStack stack2;
    static ItemStack stack3;
    static ItemStack stack4;
    static ItemStack stack5;
    //////////////////////////////
    static ItemStack stoneSword;
    static ItemStack goldenSword;
    static ItemStack ironSword;
    static ItemStack diaSword;
    static ItemStack netheriteSword;

    static ItemMeta stoneSwordMeta;
    static ItemMeta goldenSwordMeta;
    static ItemMeta ironSwordMeta;
    static ItemMeta diaSwordMeta;
    static ItemMeta netheriteSwordMeta;
    //////////////////////////////
    //////////////////////////////
    static ItemStack carrotItem;
    static ItemStack beefItem;
    static ItemStack chickenItem;
    static ItemStack muttonItem;
    static ItemStack appleItem;

    static ItemMeta carrotMeta;
    static ItemMeta beefMeta;
    static ItemMeta chickenMeta;
    static ItemMeta muttonMeta;
    static ItemMeta appleMeta;
    //////////////////////////////
    static ItemStack stoneBlock;
    static ItemStack dirtBlock;
    static ItemStack spruceBlock;
    static ItemStack birchBlock;
    static ItemStack darkOakBlock;

    static ItemMeta stoneBlockMeta;
    static ItemMeta dirtBlockMeta;
    static ItemMeta spruceBlockMeta;
    static ItemMeta birchBlockMeta;
    static ItemMeta darkOakBlockMeta;
    //////////////////////////////
    static ItemStack diamondPickaxe;
    static ItemStack ironPickaxe;
    static ItemStack goldenPickaxe;
    static ItemStack netheritePickaxe;
    static ItemStack stonePickaxe;

    static ItemMeta diamondPickaxeMeta;
    static ItemMeta ironPickaxeMeta;
    static ItemMeta goldenPickaxeMeta;
    static ItemMeta netheritePickaxeMeta;
    static ItemMeta stonePickaxeMeta;
    //////////////////////////////
    static ItemStack ironIngot;
    static ItemStack diamondIngot;
    static ItemStack goldIngot;
    static ItemStack netheriteIngot;
    static ItemStack emeraldIngot;

    static ItemMeta ironMeta;
    static ItemMeta diamondMeta;
    static ItemMeta goldMeta;
    static ItemMeta netheriteMeta;
    static ItemMeta emeraldMeta;
    //////////////////////////////
    static ItemMeta meta1;
    static ItemMeta meta2;
    static ItemMeta meta3;
    static ItemMeta meta4;
    static ItemMeta meta5;
    /////////////////////////////
    static ItemStack barrierItem;
    static ItemMeta barrierMeta;


    public static ItemStack prepareItems(Material material, ItemStack is, ItemMeta meta, int i, String s) {
        is = new ItemStack(material);
        meta = is.getItemMeta();
        meta.setCustomModelData(i);
        meta.setDisplayName(s);
        is.setItemMeta(meta);
        return is;
    }
    public static void setupStacks() {
        stack1 = new ItemStack(Material.WOODEN_SWORD);
        meta1 = stack1.getItemMeta();
        meta1.setCustomModelData(1);
        meta1.setDisplayName(ChatColor.RED + "KILIÇLAR");
        stack1.setItemMeta(meta1);

        stack2 = new ItemStack(Material.CARROT);
        meta2 = stack2.getItemMeta();
        meta2.setCustomModelData(2);
        meta2.setDisplayName(ChatColor.RED + "YIYECEKLER");
        stack2.setItemMeta(meta2);

        stack3 = new ItemStack(Material.STONE);
        meta3 = stack3.getItemMeta();
        meta3.setCustomModelData(3);
        meta3.setDisplayName(ChatColor.RED + "BLOKLAR");
        stack3.setItemMeta(meta3);

        stack4 = new ItemStack(Material.IRON_PICKAXE);
        meta4 = stack4.getItemMeta();
        meta4.setCustomModelData(4);
        meta4.setDisplayName(ChatColor.RED + "ALETLER");
        stack4.setItemMeta(meta4);

        stack5 = new ItemStack(Material.IRON_INGOT);
        meta5 = stack5.getItemMeta();
        meta5.setCustomModelData(5);
        meta5.setDisplayName(ChatColor.RED + "MADENLER");
        stack5.setItemMeta(meta5);

        glass = new ItemStack(Material.ORANGE_STAINED_GLASS_PANE);
        glassMeta = glass.getItemMeta();
        glassMeta.setCustomModelData(100);
        glassMeta.setDisplayName(" ");
        glass.setItemMeta(glassMeta);
    }
    public static void setup() {
        setupStacks();
        NEWGUI swordGui = new NEWGUI(3);
        NEWGUI.swordGUI.setItem(20, prepareItems(Material.STONE_SWORD, stoneSword, stoneSwordMeta, 6, ChatColor.GRAY + "Taş Kılıç"));
        NEWGUI.swordGUI.setItem(21, prepareItems(Material.GOLDEN_SWORD, goldenSword, goldenSwordMeta, 7, ChatColor.GOLD + "Altın Kılıç"));
        NEWGUI.swordGUI.setItem(22, prepareItems(Material.IRON_SWORD, ironSword, ironSwordMeta, 10, ChatColor.DARK_GRAY + "Demir Kılıç"));
        NEWGUI.swordGUI.setItem(23, prepareItems(Material.DIAMOND_SWORD, diaSword, diaSwordMeta, 8, ChatColor.AQUA + "Elmas Kılıç"));
        NEWGUI.swordGUI.setItem(24, prepareItems(Material.NETHERITE_SWORD, netheriteSword, netheriteSwordMeta, 9, ChatColor.BLACK + "Netherite Kılıç"));
        NEWGUI.swordGUI.setItem(53, prepareItems(Material.BARRIER, barrierItem, barrierMeta, 31, ChatColor.RED + "Çıkış"));
        for(int i = 0; i<20; i++) {
            NEWGUI.swordGUI.setItem(i, glass);
        }
        for(int i = 25; i<53; i++) {
            NEWGUI.swordGUI.setItem(i, glass);
        }

        NEWGUI foodGui = new NEWGUI(4);
        NEWGUI.foodGUI.setItem(20, prepareItems(Material.CARROT, carrotItem, carrotMeta, 11, ChatColor.GOLD + "Havuç"));
        NEWGUI.foodGUI.setItem(21, prepareItems(Material.COOKED_BEEF, beefItem, beefMeta, 12, ChatColor.RED + "Pişmiş Et"));
        NEWGUI.foodGUI.setItem(22, prepareItems(Material.COOKED_CHICKEN, chickenItem, chickenMeta, 13, ChatColor.RED + "Pişmiş Tavuk"));
        NEWGUI.foodGUI.setItem(23, prepareItems(Material.COOKED_MUTTON, muttonItem, muttonMeta, 14, ChatColor.RED + "Pişmiş Tavşan Eti"));
        NEWGUI.foodGUI.setItem(24, prepareItems(Material.APPLE, appleItem, appleMeta, 15, ChatColor.RED + "Elma"));
        NEWGUI.foodGUI.setItem(53, prepareItems(Material.BARRIER, barrierItem, barrierMeta, 32, ChatColor.RED + "Çıkış"));
        for(int i = 0; i<20; i++) {
            NEWGUI.foodGUI.setItem(i, glass);
        }
        for(int i = 25; i<53; i++) {
            NEWGUI.foodGUI.setItem(i, glass);
        }

        NEWGUI blockGui = new NEWGUI(5);
        NEWGUI.blockGUI.setItem(20, prepareItems(Material.DIRT, dirtBlock, dirtBlockMeta, 16, ChatColor.BLACK + "Toprak"));
        NEWGUI.blockGUI.setItem(21, prepareItems(Material.STONE, stoneBlock, stoneBlockMeta, 17, ChatColor.GRAY + "Taş"));
        NEWGUI.blockGUI.setItem(22, prepareItems(Material.SPRUCE_PLANKS, spruceBlock, spruceBlockMeta, 18, ChatColor.BLACK + "Tahta"));
        NEWGUI.blockGUI.setItem(23, prepareItems(Material.BIRCH_PLANKS, birchBlock, birchBlockMeta, 19, ChatColor.BLACK + "Tahta"));
        NEWGUI.blockGUI.setItem(24, prepareItems(Material.DARK_OAK_PLANKS, darkOakBlock, darkOakBlockMeta, 20, ChatColor.BLACK + "Tahta"));
        NEWGUI.blockGUI.setItem(53, prepareItems(Material.BARRIER, barrierItem, barrierMeta, 33, ChatColor.RED + "Çıkış"));
        for(int i = 0; i<20; i++) {
            NEWGUI.blockGUI.setItem(i, glass);
        }
        for(int i = 25; i<53; i++) {
            NEWGUI.blockGUI.setItem(i, glass);
        }

        NEWGUI toolGui = new NEWGUI(6);
        NEWGUI.toolGUI.setItem(20, prepareItems(Material.DIAMOND_PICKAXE, diamondPickaxe, diamondPickaxeMeta, 21, ChatColor.AQUA + "Elmas Kazma"));
        NEWGUI.toolGUI.setItem(21, prepareItems(Material.IRON_PICKAXE, ironPickaxe, ironPickaxeMeta, 22, ChatColor.GRAY + "Demir Kazma"));
        NEWGUI.toolGUI.setItem(22, prepareItems(Material.GOLDEN_PICKAXE, goldenPickaxe, goldenPickaxeMeta, 23, ChatColor.GOLD + "Altın Kazma"));
        NEWGUI.toolGUI.setItem(23, prepareItems(Material.NETHERITE_PICKAXE, netheritePickaxe, netheritePickaxeMeta, 24, ChatColor.BLACK + "Netherite Kazma"));
        NEWGUI.toolGUI.setItem(24, prepareItems(Material.STONE_PICKAXE, stonePickaxe, stonePickaxeMeta, 25, ChatColor.GRAY + "Taş Kazma"));
        NEWGUI.toolGUI.setItem(53, prepareItems(Material.BARRIER, barrierItem, barrierMeta, 34, ChatColor.RED + "Çıkış"));
        for(int i = 0; i<20; i++) {
            NEWGUI.toolGUI.setItem(i, glass);
        }
        for(int i = 25; i<53; i++) {
            NEWGUI.toolGUI.setItem(i, glass);
        }

        NEWGUI mineGui = new NEWGUI(7);
        NEWGUI.mineGUI.setItem(20, prepareItems(Material.IRON_INGOT, ironIngot, ironMeta, 26, ChatColor.GRAY + "Demir"));
        NEWGUI.mineGUI.setItem(21, prepareItems(Material.DIAMOND, diamondIngot, diamondMeta, 27, ChatColor.AQUA + "Elmas"));
        NEWGUI.mineGUI.setItem(22, prepareItems(Material.GOLD_INGOT, goldIngot, goldMeta, 28, ChatColor.GOLD + "Altın"));
        NEWGUI.mineGUI.setItem(23, prepareItems(Material.NETHERITE_INGOT, netheriteIngot, netheriteMeta, 29, ChatColor.BLACK + "Netherite"));
        NEWGUI.mineGUI.setItem(24, prepareItems(Material.EMERALD, emeraldIngot, emeraldMeta, 30, ChatColor.GREEN + "Zümrüt"));
        NEWGUI.mineGUI.setItem(53, prepareItems(Material.BARRIER, barrierItem, barrierMeta, 35, ChatColor.RED + "Çıkış"));
        for(int i = 0; i<20; i++) {
            NEWGUI.mineGUI.setItem(i, glass);
        }
        for(int i = 25; i<53; i++) {
            NEWGUI.mineGUI.setItem(i, glass);
        }




        NEWGUI stackChoice = new NEWGUI(2);
        NEWGUI.stackGUI.setItem(20, prepareItems(Material.GREEN_CONCRETE, greenConcrete, greenConcreteMeta, 36, ChatColor.GREEN + "1 ADET"));
        NEWGUI.stackGUI.getItem(20).setAmount(1);
        NEWGUI.stackGUI.setItem(21, prepareItems(Material.GREEN_CONCRETE, greenConcrete, greenConcreteMeta, 37, ChatColor.GREEN + "8 ADET"));
        NEWGUI.stackGUI.getItem(21).setAmount(8);
        NEWGUI.stackGUI.setItem(22, prepareItems(Material.GREEN_CONCRETE, greenConcrete, greenConcreteMeta, 38, ChatColor.GREEN + "16 ADET"));
        NEWGUI.stackGUI.getItem(22).setAmount(16);
        NEWGUI.stackGUI.setItem(23, prepareItems(Material.GREEN_CONCRETE, greenConcrete, greenConcreteMeta, 39, ChatColor.GREEN + "32 ADET"));
        NEWGUI.stackGUI.getItem(23).setAmount(32);
        NEWGUI.stackGUI.setItem(24, prepareItems(Material.GREEN_CONCRETE, greenConcrete, greenConcreteMeta, 40, ChatColor.GREEN + "64 ADET"));
        NEWGUI.stackGUI.getItem(24).setAmount(64);
        for(int i = 0; i<20; i++) {
            NEWGUI.stackGUI.setItem(i, glass);
        }
        for(int i = 25; i<54; i++) {
            NEWGUI.stackGUI.setItem(i, glass);
        }

        NEWGUI NEWGUI1 = new NEWGUI(1);
        NEWGUI.sellGUI.setItem(20, getStack1());
        NEWGUI.sellGUI.setItem(21, getStack2());
        NEWGUI.sellGUI.setItem(22, getStack3());
        NEWGUI.sellGUI.setItem(23, getStack4());
        NEWGUI.sellGUI.setItem(24, getStack5());
        for(int i = 0; i<20; i++) {
            NEWGUI.sellGUI.setItem(i, glass);
        }
        for(int i = 25; i<54; i++) {
            NEWGUI.sellGUI.setItem(i, glass);
        }
    }

    public static ItemStack getStack1() {
        return stack1;
    }

    public static ItemStack getStack2() {
        return stack2;
    }

    public static ItemStack getStack3() {
        return stack3;
    }

    public static ItemStack getStack4() {
        return stack4;
    }

    public static ItemStack getStack5() {
        return stack5;
    }
}
