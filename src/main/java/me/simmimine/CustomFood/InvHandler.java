package me.simmimine.CustomFood;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;

import java.util.List;

public class InvHandler implements Listener {

    private final Inventory inventory;
    private final List<Inventory> inv;

    public InvHandler(CustomFood plugin, Inventory inventory, List<Inventory> inv) {
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
        this.inventory = inventory;
        this.inv = inv;
    }

    @EventHandler(priority= EventPriority.HIGH)
    public void onInventoryClick(InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();
        if (event.getView().getTitle().equalsIgnoreCase(ChatColor.GOLD + "Custom Food Recipes") && !event.getClickedInventory().equals(player.getInventory())) {
            if (event.getSlot() == 18) {
                player.openInventory(inv.get(0));
            }
            if (event.getSlot() == 20) {
                player.openInventory(inv.get(1));
            }
            if (event.getSlot() == 22) {
                player.openInventory(inv.get(2));
            }
            if (event.getSlot() == 24) {
                player.openInventory(inv.get(3));
            }
            if (event.getSlot() == 26) {
                player.openInventory(inv.get(4));
            }
            if(event.getSlot() == 40) {
                player.closeInventory();
            }
            event.setCancelled(true);
        }
        if (event.getView().getTitle().equalsIgnoreCase("Mashed Potato Recipe") || event.getView().getTitle().equalsIgnoreCase("Apple Pie Recipe") || event.getView().getTitle().equalsIgnoreCase("Mashed Potato Recipe") || event.getView().getTitle().equalsIgnoreCase("Carrot Cake Recipe") || event.getView().getTitle().equalsIgnoreCase("Beetroot Jam Recipe") || event.getView().getTitle().equalsIgnoreCase("Cup Of Tea Recipe")) {
            event.setCancelled(true);
        }
    }
}
