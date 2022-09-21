package me.limpeex.smithing;

import dev.lone.itemsadder.api.CustomStack;
import dev.lone.itemsadder.api.Events.CustomBlockPlaceEvent;
import me.limpeex.keys.Keys;
import me.limpeex.pazar.NEWGUI;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataType;

public class SmithingSetup {
     static ItemStack itemSadderSwordGui;
     static  ItemMeta itemSadderSwordGuiMeta;

     static  ItemStack itemSadderPickaxeGui;
     static  ItemMeta itemSadderPickaxeGuiMeta;

      static ItemStack itemSadderAxeGui;
      static ItemMeta itemSadderAxeGuiMeta;

      static ItemStack itemSadderHoeGui;
      static ItemMeta itemSadderHoeGuiMeta;

      static ItemStack itemSadderShovelGui;
      static ItemMeta itemSadderShovelGuiMeta;


      private static ItemStack barrier;
      private static ItemMeta barrier_meta;
    private static ItemStack glass;
    private static ItemMeta glass_meta;

    private  static ItemStack rubySword;
    private  static ItemMeta rubySwordMeta;
    private  static ItemStack crystalSword;
    private  static ItemMeta crystalSwordMeta;
    private  static ItemStack bloodNiteSword;
    private  static ItemMeta bloodNiteSwordMeta;
    private static  ItemStack rubyDagger;
    private  static ItemMeta rubyDaggerMeta;
    private  static ItemStack blueLightSaber;
    private  static ItemMeta blueLightSaberSwordMeta;
    private  static ItemStack mastersSword;
    private  static ItemMeta mastersSwordMeta;
    private static  ItemStack floatingSword;
    private  static ItemMeta floatingSwordMeta;
    private  static ItemStack fireSword;
    private static  ItemMeta fireSwordMeta;
    private static  ItemStack vyderLightSword;
    private  static ItemMeta vyderLightSwordMeta;
    private static  ItemStack mysteriousSword;
    private  static ItemMeta mysteriousSwordMeta;

    private  static ItemStack demonicHammer;
    private  static ItemMeta demonicHammerMeta;
    private static  ItemStack demonicPickaxe;
    private  static ItemMeta demonicPickaxeMeta;
    private  static ItemStack spinelPickaxe;
    private  static ItemMeta spinelPickaxeMeta;
    private static  ItemStack amethystAxe;
    private static  ItemMeta amethystAxeMeta;
    private  static ItemStack bronzeAxe;
    private static  ItemMeta bronzeAxeMeta;
    private  static ItemStack rubyAxe;
    private  static ItemMeta rubyAxeMeta;
    private  static ItemStack rubyHoe;
    private  static ItemMeta rubyHoeMeta;
    private static  ItemStack spinelHoe;
    private  static ItemMeta spinelHoeMeta;
    private  static ItemStack rubyShovel;
    private static  ItemMeta rubyShovelMeta;
    private  static ItemStack bronzeShovel;
    private  static ItemMeta bronzeShovelMeta;


    public static ItemStack setMeta(String displayName, ItemStack stack, ItemMeta meta, int pdcValue, int cmd, Material material) {
          stack = new ItemStack(material);
          meta = stack.getItemMeta();
          meta.setCustomModelData(cmd);
          meta.getPersistentDataContainer().set(Keys.smithingItems, PersistentDataType.INTEGER, pdcValue);
          meta.setDisplayName(displayName);
          stack.setItemMeta(meta);
          return stack;
    }
    public static ItemStack setMeta(ItemStack stack, ItemMeta meta, int pdcValue, int cmd, Material material) {
        stack = new ItemStack(material);
        meta = stack.getItemMeta();
        meta.setCustomModelData(cmd);
        meta.getPersistentDataContainer().set(Keys.smithingItems, PersistentDataType.INTEGER, pdcValue);
        stack.setItemMeta(meta);
        return stack;
    }
    public static void setupSmithingGuis() {
        NEWGUI.smithChooseGUI.setItem(20, setMeta(ChatColor.RED + "Kılıçlar", itemSadderSwordGui, itemSadderSwordGuiMeta, 500, 10014,Material.DIAMOND_SWORD));
        NEWGUI.smithChooseGUI.setItem(21, setMeta(ChatColor.RED + "Kazmalar", itemSadderPickaxeGui, itemSadderPickaxeGuiMeta, 501, 10003,Material.DIAMOND_PICKAXE));
        NEWGUI.smithChooseGUI.setItem(22, setMeta(ChatColor.RED + "Baltalar", itemSadderAxeGui, itemSadderAxeGuiMeta, 502, 10000,Material.DIAMOND_AXE));
        NEWGUI.smithChooseGUI.setItem(23, setMeta(ChatColor.RED + "Çapalar", itemSadderHoeGui, itemSadderHoeGuiMeta, 503, 10000,Material.DIAMOND_HOE));
        NEWGUI.smithChooseGUI.setItem(24, setMeta(ChatColor.RED + "Kürekler", itemSadderShovelGui, itemSadderShovelGuiMeta, 504, 10000,Material.DIAMOND_SHOVEL));
        NEWGUI.smithSwordGUI.setItem(20, setMeta(ChatColor.RED + "Ruby Sword",rubySword, rubySwordMeta, 505, 10014, Material.DIAMOND_SWORD));
        NEWGUI.smithSwordGUI.setItem(21, setMeta(ChatColor.RED + "Crystal Sword",crystalSword, crystalSwordMeta, 506, 10003, Material.WOODEN_SWORD));
        NEWGUI.smithSwordGUI.setItem(22, setMeta(ChatColor.RED + "Ruby Dagger",rubyDagger, rubyDaggerMeta, 507, 10000, Material.DIAMOND_SWORD));
        NEWGUI.smithSwordGUI.setItem(23, setMeta(ChatColor.RED + "Blue Light Saber Sword",blueLightSaber, blueLightSaberSwordMeta, 508, 10001, Material.DIAMOND_SWORD));
        NEWGUI.smithSwordGUI.setItem(24, setMeta(ChatColor.RED + "Masters Sword",mastersSword, mastersSwordMeta, 509, 10004, Material.DIAMOND_SWORD));
        NEWGUI.smithSwordGUI.setItem(29, setMeta(ChatColor.RED + "Floating Sword",floatingSword, floatingSwordMeta, 510, 10005, Material.DIAMOND_SWORD));
        NEWGUI.smithSwordGUI.setItem(30, setMeta(ChatColor.RED + "Fire Sword",fireSword, fireSwordMeta, 511, 10009, Material.DIAMOND_SWORD));
        NEWGUI.smithSwordGUI.setItem(31, setMeta(ChatColor.RED + "VyderLight Sword",vyderLightSword, vyderLightSwordMeta, 512, 10013, Material.DIAMOND_SWORD));
        NEWGUI.smithSwordGUI.setItem(32, setMeta(ChatColor.RED + "Mysterious Sword",mysteriousSword, mysteriousSwordMeta, 513, 10019, Material.DIAMOND_SWORD));
        NEWGUI.smithSwordGUI.setItem(33, setMeta(ChatColor.RED + "Bloodnite Sword",bloodNiteSword, bloodNiteSwordMeta, 514, 10012, Material.DIAMOND_SWORD));
        NEWGUI.smithSwordGUI.setItem(53, setMeta(ChatColor.RED + "Çıkış",barrier, barrier_meta, 527, 4454654, Material.BARRIER));

        NEWGUI.smithPickaxeGUI.setItem(20, setMeta(ChatColor.RED + "Demoniac Hammer",demonicHammer, demonicHammerMeta, 515, 10009, Material.DIAMOND_PICKAXE));
        NEWGUI.smithPickaxeGUI.setItem(21, setMeta(ChatColor.RED + "Demoniac Pickaxe",demonicPickaxe, demonicPickaxeMeta, 516, 10002, Material.DIAMOND_PICKAXE));
        NEWGUI.smithPickaxeGUI.setItem(22, setMeta(ChatColor.RED + "Spinel Pickaxe",spinelPickaxe, spinelPickaxeMeta, 517, 10004, Material.DIAMOND_PICKAXE));
        NEWGUI.smithPickaxeGUI.setItem(53, setMeta(ChatColor.RED + "Çıkış",barrier, barrier_meta, 528, 4454654, Material.BARRIER));

        NEWGUI.smithAxeGUI.setItem(20, setMeta(ChatColor.RED + "Amethyst Axe",amethystAxe, amethystAxeMeta, 518, 10004, Material.DIAMOND_AXE));
        NEWGUI.smithAxeGUI.setItem(21, setMeta(ChatColor.RED + "Bronze Axe",bronzeAxe, bronzeAxeMeta, 519, 10005, Material.DIAMOND_AXE));
        NEWGUI.smithAxeGUI.setItem(22, setMeta(ChatColor.RED + "Ruby Axe",rubyAxe, rubyAxeMeta, 520, 10000, Material.DIAMOND_AXE));
        NEWGUI.smithAxeGUI.setItem(53, setMeta(ChatColor.RED + "Çıkış",barrier, barrier_meta, 529, 4454654, Material.BARRIER));

        NEWGUI.smithHoeGUI.setItem(20, setMeta(ChatColor.RED + "Ruby Hoe",rubyHoe, rubyHoeMeta, 521, 10000, Material.DIAMOND_HOE));
        NEWGUI.smithHoeGUI.setItem(21, setMeta(ChatColor.RED + "Spinel Hoe",spinelHoe, spinelHoeMeta, 522, 10001, Material.DIAMOND_HOE));
        NEWGUI.smithHoeGUI.setItem(53, setMeta(ChatColor.RED + "Çıkış",barrier, barrier_meta, 530, 4454654, Material.BARRIER));

        NEWGUI.smithShovelGUI.setItem(20, setMeta(ChatColor.RED + "Ruby Shovel",rubyShovel, rubyShovelMeta, 523, 10000, Material.DIAMOND_SHOVEL));
        NEWGUI.smithShovelGUI.setItem(21, setMeta(ChatColor.RED + "Bronze Shovel",bronzeShovel, bronzeShovelMeta, 524, 10005, Material.DIAMOND_SHOVEL));
        NEWGUI.smithShovelGUI.setItem(53, setMeta(ChatColor.RED + "Çıkış",barrier, barrier_meta, 531, 4454654, Material.BARRIER));
    }

    public static void setGuis() {
        NEWGUI smithingGUI = new NEWGUI(8);
        NEWGUI smithingSwordGui = new NEWGUI(9);
        NEWGUI smithingPickaxeGui = new NEWGUI(10);
        NEWGUI smithingAxeGui = new NEWGUI(11);
        NEWGUI smithingHoeGui = new NEWGUI(12);
        NEWGUI smithingShovelGui = new NEWGUI(13);
        setupSmithingGuis();

    }


    public static ItemStack getItemSadderSwordGui() {
        return itemSadderSwordGui;
    }

    public static ItemMeta getItemSadderSwordGuiMeta() {
        return itemSadderSwordGuiMeta;
    }

    public static ItemStack getItemSadderPickaxeGui() {
        return itemSadderPickaxeGui;
    }

    public static ItemMeta getItemSadderPickaxeGuiMeta() {
        return itemSadderPickaxeGuiMeta;
    }

    public static ItemStack getItemSadderAxeGui() {
        return itemSadderAxeGui;
    }

    public static ItemMeta getItemSadderAxeGuiMeta() {
        return itemSadderAxeGuiMeta;
    }

    public static ItemStack getItemSadderHoeGui() {
        return itemSadderHoeGui;
    }

    public static ItemMeta getItemSadderHoeGuiMeta() {
        return itemSadderHoeGuiMeta;
    }

    public static ItemStack getItemSadderShovelGui() {
        return itemSadderShovelGui;
    }

    public static ItemMeta getItemSadderShovelGuiMeta() {
        return itemSadderShovelGuiMeta;
    }

    public static ItemStack getRubySword() {
        return rubySword;
    }

    public static ItemMeta getRubySwordMeta() {
        return rubySwordMeta;
    }

    public static ItemStack getCrystalSword() {
        return crystalSword;
    }

    public static ItemMeta getCrystalSwordMeta() {
        return crystalSwordMeta;
    }


    public static ItemStack getRubyDagger() {
        return rubyDagger;
    }

    public static ItemMeta getRubyDaggerMeta() {
        return rubyDaggerMeta;
    }

    public static ItemStack getBlueLightSaber() {
        return blueLightSaber;
    }

    public static ItemMeta getBlueLightSaberSwordMeta() {
        return blueLightSaberSwordMeta;
    }

    public static ItemStack getMastersSword() {
        return mastersSword;
    }

    public static ItemMeta getMastersSwordMeta() {
        return mastersSwordMeta;
    }

    public static ItemStack getFloatingSword() {
        return floatingSword;
    }

    public static ItemMeta getFloatingSwordMeta() {
        return floatingSwordMeta;
    }

    public static ItemStack getFireSword() {
        return fireSword;
    }

    public static ItemMeta getFireSwordMeta() {
        return fireSwordMeta;
    }

    public static ItemStack getVyderLightSword() {
        return vyderLightSword;
    }

    public static ItemMeta getVyderLightSwordMeta() {
        return vyderLightSwordMeta;
    }

    public static ItemStack getMysteriousSword() {
        return mysteriousSword;
    }

    public static ItemMeta getMysteriousSwordMeta() {
        return mysteriousSwordMeta;
    }

    public static ItemStack getDemonicHammer() {
        return demonicHammer;
    }

    public static ItemMeta getDemonicHammerMeta() {
        return demonicHammerMeta;
    }

    public static ItemStack getDemonicPickaxe() {
        return demonicPickaxe;
    }

    public static ItemMeta getDemonicPickaxeMeta() {
        return demonicPickaxeMeta;
    }

    public static ItemStack getSpinelPickaxe() {
        return spinelPickaxe;
    }

    public static ItemMeta getSpinelPickaxeMeta() {
        return spinelPickaxeMeta;
    }

    public static ItemStack getAmethystAxe() {
        return amethystAxe;
    }

    public static ItemMeta getAmethystAxeMeta() {
        return amethystAxeMeta;
    }

    public static ItemStack getBronzeAxe() {
        return bronzeAxe;
    }

    public static ItemMeta getBronzeAxeMeta() {
        return bronzeAxeMeta;
    }

    public static ItemStack getRubyAxe() {
        return rubyAxe;
    }

    public static ItemMeta getRubyAxeMeta() {
        return rubyAxeMeta;
    }

    public static ItemStack getRubyHoe() {
        return rubyHoe;
    }

    public static ItemMeta getRubyHoeMeta() {
        return rubyHoeMeta;
    }

    public static ItemStack getSpinelHoe() {
        return spinelHoe;
    }

    public static ItemMeta getSpinelHoeMeta() {
        return spinelHoeMeta;
    }

    public static ItemStack getRubyShovel() {
        return rubyShovel;
    }

    public static ItemMeta getRubyShovelMeta() {
        return rubyShovelMeta;
    }

    public static ItemStack getBronzeShovel() {
        return bronzeShovel;
    }

    public static ItemMeta getBronzeShovelMeta() {
        return bronzeShovelMeta;
    }
}
