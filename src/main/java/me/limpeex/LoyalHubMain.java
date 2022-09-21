package me.limpeex;

import me.limpeex.events.*;
import me.limpeex.pazar.NEWGUI;
import me.limpeex.pazar.ServerPazarSetup;
import me.limpeex.smithing.ISmithing;
import me.limpeex.smithing.SmithingSetup;
import net.milkbowl.vault.chat.Chat;
import net.milkbowl.vault.economy.Economy;
import net.milkbowl.vault.permission.Permission;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public class LoyalHubMain extends JavaPlugin {
    private static final Logger log = Logger.getLogger("Minecraft");
    private static Economy econ = null;
    private static Permission perms = null;
    private static Chat chat = null;
    private static Plugin pl;

    @Override
    public void onEnable() {
        pl = this;
        eventRegister();
        if (!setupEconomy() ) {
            log.severe(String.format("[%s] - Disabled due to no Vault dependency found!", getDescription().getName()));
            getServer().getPluginManager().disablePlugin(this);
            return;
        }
        ServerPazarSetup.setup();
        SmithingSetup.setGuis();
    }
    @Override
    public void onDisable() {
    }
    public void eventRegister() {
        getServer().getPluginManager().registerEvents(new OnClickBlock(), this);
        getServer().getPluginManager().registerEvents(new Click(), this);
        getServer().getPluginManager().registerEvents(new InventoryClick(), this);
        getServer().getPluginManager().registerEvents(new SmithTableClicking(), this);
        getServer().getPluginManager().registerEvents(new SmithTableAllClickEvents(), this);
        //getServer().getPluginManager().registerEvents(new OnItemDrop(), this);
        //getServer().getPluginManager().registerEvents(new OnInventoryDrag(), this);
    }
    private boolean setupEconomy() {
        if (getServer().getPluginManager().getPlugin("Vault") == null) {
            return false;
        }
        RegisteredServiceProvider<Economy> rsp = getServer().getServicesManager().getRegistration(Economy.class);
        if (rsp == null) {
            return false;
        }
        econ = rsp.getProvider();
        return econ != null;
    }
    private boolean setupChat() {
        RegisteredServiceProvider<Chat> rsp = getServer().getServicesManager().getRegistration(Chat.class);
        chat = rsp.getProvider();
        return chat != null;
    }

    private boolean setupPermissions() {
        RegisteredServiceProvider<Permission> rsp = getServer().getServicesManager().getRegistration(Permission.class);
        perms = rsp.getProvider();
        return perms != null;
    }
    public static Plugin plugin() {
        return pl;
    }

    public static Economy getEcon() {
        return econ;
    }

    public static Permission getPerms() {
        return perms;
    }

    public static Chat getChat() {
        return chat;
    }

    public static Plugin getPl() {
        return pl;
    }
}
