package me.simmimine.CustomFood;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class itemHandler implements Listener {

    public itemHandler(CustomFood plugin) {
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler(priority= EventPriority.NORMAL)
    public void onPlayerConsume(PlayerInteractEvent event) {
        Player p = event.getPlayer();
        ItemStack mashedPotato = new headItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZGJmYjZkNGE1NGMxN2UyNzQ4NDM3YWNjNzA5OGZiYjFhM2ExMmE0MDdmNTFiM2U0OTU0MjMzMjcxNDg0NmZkOCJ9fX0=").getItemStack();
        ItemMeta meta = mashedPotato.getItemMeta();
        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add(ChatColor.DARK_GRAY + "-------------");
        lore.add(ChatColor.GOLD + " Custom Food ");
        lore.add(ChatColor.DARK_GRAY + "-------------");
        meta.setLore(lore);
        meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Mashed Potato");
        ItemStack applePie = new headItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDUzYzFlODdlNTM3ZjFhYjI3NzRkZGFmYjgzNDM5YjMzNmY0YTc3N2I0N2FkODJiY2IzMGQ1ZmNiZGY5YmMifX19").getItemStack();
        ItemMeta meta1 = applePie.getItemMeta();
        List<String> lore1 = new ArrayList<>();
        lore1.add("");
        lore1.add(ChatColor.DARK_GRAY + "-------------");
        lore1.add(ChatColor.GOLD + " Custom Food ");
        lore1.add(ChatColor.DARK_GRAY + "-------------");
        meta1.setLore(lore1);
        meta1.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "Apple Pie");
        ItemStack carrotCake = new headItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNmIyNmMxMjJlZGYwZDExZTQ2NWE1OTEyMDkwMDYwYWUyOTI3NGQyM2IxOWZkYjhkNzdiMWQ0YjM3NzNhN2VjZCJ9fX0=").getItemStack();
        ItemMeta meta2 = carrotCake.getItemMeta();
        List<String> lore2 = new ArrayList<>();
        lore2.add("");
        lore2.add(ChatColor.DARK_GRAY + "-------------");
        lore2.add(ChatColor.GOLD + " Custom Food ");
        lore2.add(ChatColor.DARK_GRAY + "-------------");
        meta2.setLore(lore2);
        meta2.setDisplayName(ChatColor.DARK_RED + "" + ChatColor.BOLD + "Carrot Cake");
        ItemStack beetrootJam = new headItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTE3MDhlZDM1MmUxN2NhODljMWM5NDg1Y2QxZGIwMTdjNGM4ODY4OTVhYjVjN2MyN2E5ZmY1NjRhZjIxNzJkIn19fQ==").getItemStack();
        ItemMeta meta3 = beetrootJam.getItemMeta();
        List<String> lore3 = new ArrayList<>();
        lore3.add("");
        lore3.add(ChatColor.DARK_GRAY + "-------------");
        lore3.add(ChatColor.GOLD + " Custom Food ");
        lore3.add(ChatColor.DARK_GRAY + "-------------");
        meta3.setLore(lore3);
        meta3.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Beetroot Jam");
        ItemStack tea = new headItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODI5ZTg4NThlNGUwYzE3NTEzMTNlZjU4YWRhZjM0YzIxNjk4N2Y3NzhiMmI5ODQ4MWU5ZWNiOTFhNzE5NCJ9fX0=").getItemStack();
        ItemMeta meta4 = tea.getItemMeta();
        List<String> lore4 = new ArrayList<>();
        lore4.add("");
        lore4.add(ChatColor.DARK_GRAY + "-------------");
        lore4.add(ChatColor.GOLD + " Custom Food ");
        lore4.add(ChatColor.DARK_GRAY + "-------------");
        meta4.setLore(lore4);
        meta4.setDisplayName(ChatColor.DARK_GRAY + "" + ChatColor.BOLD + "Cup Of Tea");
        if (p.getInventory().getItemInMainHand().getItemMeta() != null) {
            if (p.getInventory().getItemInMainHand().getItemMeta().equals(meta) || p.getInventory().getItemInMainHand().getItemMeta().equals(meta1) || p.getInventory().getItemInMainHand().getItemMeta().equals(meta2) || p.getInventory().getItemInMainHand().getItemMeta().equals(meta3) || p.getInventory().getItemInMainHand().getItemMeta().equals(meta4)) {
                if (p.getFoodLevel() <= 14) {
                    p.setFoodLevel(p.getFoodLevel() + 6);
                }
                if (p.getFoodLevel() >= 15 && p.getFoodLevel() <= 19) {
                    p.setFoodLevel(20);
                    p.getInventory().getItemInMainHand().setAmount(p.getInventory().getItemInMainHand().getAmount() - 1);
                }

            }
        }
    }
}
