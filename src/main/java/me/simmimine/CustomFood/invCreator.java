package me.simmimine.CustomFood;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

import static me.simmimine.CustomFood.CustomFood.replaceEmpty;

public class invCreator implements InventoryHolder {

    @Override
    public Inventory getInventory() {
        return null;
    }
    public Inventory createInv() {
        Inventory inv = Bukkit.createInventory(this, 45, ChatColor.GOLD + "Custom Food Recipes");

        ItemStack mashedPotato = new headItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZGJmYjZkNGE1NGMxN2UyNzQ4NDM3YWNjNzA5OGZiYjFhM2ExMmE0MDdmNTFiM2U0OTU0MjMzMjcxNDg0NmZkOCJ9fX0=").getItemStack();
        ItemStack applePie = new headItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDUzYzFlODdlNTM3ZjFhYjI3NzRkZGFmYjgzNDM5YjMzNmY0YTc3N2I0N2FkODJiY2IzMGQ1ZmNiZGY5YmMifX19").getItemStack();
        ItemStack carrotCake = new headItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNmIyNmMxMjJlZGYwZDExZTQ2NWE1OTEyMDkwMDYwYWUyOTI3NGQyM2IxOWZkYjhkNzdiMWQ0YjM3NzNhN2VjZCJ9fX0=").getItemStack();
        ItemStack beetrootJam = new headItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTE3MDhlZDM1MmUxN2NhODljMWM5NDg1Y2QxZGIwMTdjNGM4ODY4OTVhYjVjN2MyN2E5ZmY1NjRhZjIxNzJkIn19fQ==").getItemStack();
        ItemStack tea = new headItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODI5ZTg4NThlNGUwYzE3NTEzMTNlZjU4YWRhZjM0YzIxNjk4N2Y3NzhiMmI5ODQ4MWU5ZWNiOTFhNzE5NCJ9fX0=").getItemStack();
        ItemStack closeButton = new ItemStack(Material.BARRIER);
        ItemMeta meta = mashedPotato.getItemMeta();

        // Mashed Potato
        meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Mashed Potato");
        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.RED + "Click For Recipe");
        lore.add("");
        lore.add(ChatColor.DARK_GRAY + "-------------");
        lore.add(ChatColor.GOLD + " Custom Food ");
        lore.add(ChatColor.DARK_GRAY + "-------------");
        meta.setLore(lore);
        mashedPotato.setItemMeta(meta);
        inv.setItem(18, mashedPotato);

        // Apple Pie
        meta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "Apple Pie");
        applePie.setItemMeta(meta);
        inv.setItem(20, applePie);

        // Carrot Cake
        meta.setDisplayName(ChatColor.DARK_RED + "" + ChatColor.BOLD + "Carrot Cake");
        carrotCake.setItemMeta(meta);
        inv.setItem(22, carrotCake);

        // Beetroot Jam
        meta.setDisplayName(ChatColor.DARK_PURPLE + ""  + ChatColor.BOLD + "Beetroot Jam");
        beetrootJam.setItemMeta(meta);
        inv.setItem(24, beetrootJam);

        // Tea
        meta.setDisplayName(ChatColor.DARK_GRAY + "" + ChatColor.BOLD + "Cup Of Tea");
        tea.setItemMeta(meta);
        inv.setItem(26, tea);

        // Close Button
        meta.setDisplayName(ChatColor.DARK_RED + "" + ChatColor.BOLD + "Close");
        lore.clear();
        meta.setLore(lore);
        closeButton.setItemMeta(meta);
        inv.setItem(40, closeButton);

        // Filling Inv With Grey Glass Panes
        replaceEmpty(inv);
        return inv;
    }

    public Inventory createRecipeInv(String food) {
        return Bukkit.createInventory(this,45, food);
    }
}
