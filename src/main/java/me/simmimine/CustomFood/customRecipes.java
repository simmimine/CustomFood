package me.simmimine.CustomFood;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;

import java.util.ArrayList;
import java.util.List;

public class customRecipes {

    private Plugin plugin = CustomFood.getPlugin(CustomFood.class);

    public ShapedRecipe mashedPotatoRecipe() {
        ItemStack mashedPotato = new headItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZGJmYjZkNGE1NGMxN2UyNzQ4NDM3YWNjNzA5OGZiYjFhM2ExMmE0MDdmNTFiM2U0OTU0MjMzMjcxNDg0NmZkOCJ9fX0=").getItemStack();
        ItemMeta meta = mashedPotato.getItemMeta();
        meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Mashed Potato");
        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add(ChatColor.DARK_GRAY + "-------------");
        lore.add(ChatColor.GOLD + " Custom Food ");
        lore.add(ChatColor.DARK_GRAY + "-------------");
        meta.setLore(lore);
        mashedPotato.setItemMeta(meta);
        NamespacedKey key = new NamespacedKey(plugin, "mashed_potato");
        ShapedRecipe mashedpotatorecipe = new ShapedRecipe(key, mashedPotato);
        mashedpotatorecipe.shape("PPP","PPP","PPP");
        mashedpotatorecipe.setIngredient('P', Material.BAKED_POTATO);
        return mashedpotatorecipe;
    }

    public ShapedRecipe applePieRecipe() {
        ItemStack applePie = new headItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDUzYzFlODdlNTM3ZjFhYjI3NzRkZGFmYjgzNDM5YjMzNmY0YTc3N2I0N2FkODJiY2IzMGQ1ZmNiZGY5YmMifX19").getItemStack();
        ItemMeta meta = applePie.getItemMeta();
        meta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "Apple Pie");
        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add(ChatColor.DARK_GRAY + "-------------");
        lore.add(ChatColor.GOLD + " Custom Food ");
        lore.add(ChatColor.DARK_GRAY + "-------------");
        meta.setLore(lore);
        applePie.setItemMeta(meta);
        NamespacedKey key = new NamespacedKey(plugin, "apple_pie");
        ShapedRecipe applepierecipe = new ShapedRecipe(key, applePie);
        applepierecipe.shape("WWW","AAA","WWW");
        applepierecipe.setIngredient('W', Material.WHEAT);
        applepierecipe.setIngredient('A', Material.APPLE);
        return applepierecipe;
    }

    public ShapedRecipe carrotCakeRecipe() {
        ItemStack carrotCake = new headItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNmIyNmMxMjJlZGYwZDExZTQ2NWE1OTEyMDkwMDYwYWUyOTI3NGQyM2IxOWZkYjhkNzdiMWQ0YjM3NzNhN2VjZCJ9fX0=").getItemStack();
        ItemMeta meta = carrotCake.getItemMeta();
        meta.setDisplayName(ChatColor.DARK_RED + "" + ChatColor.BOLD + "Carrot Cake");
        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add(ChatColor.DARK_GRAY + "-------------");
        lore.add(ChatColor.GOLD + " Custom Food ");
        lore.add(ChatColor.DARK_GRAY + "-------------");
        meta.setLore(lore);
        carrotCake.setItemMeta(meta);
        NamespacedKey key = new NamespacedKey(plugin, "carrot_cake");
        ShapedRecipe carrotcakerecipe = new ShapedRecipe(key, carrotCake);
        carrotcakerecipe.shape("CCC","CCC","WWW");
        carrotcakerecipe.setIngredient('W', Material.WHEAT);
        carrotcakerecipe.setIngredient('C', Material.CARROT);
        return carrotcakerecipe;
    }

    public ShapedRecipe beetrootJamRecipe() {
        ItemStack beetrootJam = new headItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTE3MDhlZDM1MmUxN2NhODljMWM5NDg1Y2QxZGIwMTdjNGM4ODY4OTVhYjVjN2MyN2E5ZmY1NjRhZjIxNzJkIn19fQ==").getItemStack();
        ItemMeta meta = beetrootJam.getItemMeta();
        meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Beetroot Jam");
        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add(ChatColor.DARK_GRAY + "-------------");
        lore.add(ChatColor.GOLD + " Custom Food ");
        lore.add(ChatColor.DARK_GRAY + "-------------");
        meta.setLore(lore);
        beetrootJam.setItemMeta(meta);
        NamespacedKey key = new NamespacedKey(plugin, "beetroot_jam");
        ShapedRecipe beetrootjamrecipe = new ShapedRecipe(key, beetrootJam);
        beetrootjamrecipe.shape("BBB","BGB","BBB");
        beetrootjamrecipe.setIngredient('B', Material.BEETROOT);
        beetrootjamrecipe.setIngredient('G', Material.GLASS_BOTTLE);
        return beetrootjamrecipe;
    }

    public ShapedRecipe cupOfTeaRecipe() {
        ItemStack tea = new headItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODI5ZTg4NThlNGUwYzE3NTEzMTNlZjU4YWRhZjM0YzIxNjk4N2Y3NzhiMmI5ODQ4MWU5ZWNiOTFhNzE5NCJ9fX0=").getItemStack();
        ItemMeta meta = tea.getItemMeta();
        meta.setDisplayName(ChatColor.DARK_GRAY + "" + ChatColor.BOLD + "Cup Of Tea");
        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add(ChatColor.DARK_GRAY + "-------------");
        lore.add(ChatColor.GOLD + " Custom Food ");
        lore.add(ChatColor.DARK_GRAY + "-------------");
        meta.setLore(lore);
        tea.setItemMeta(meta);
        NamespacedKey key = new NamespacedKey(plugin, "cup_of_tea");
        ShapedRecipe tearecipe = new ShapedRecipe(key, tea);
        tearecipe.shape("SSS","SGS","SSS");
        tearecipe.setIngredient('S', Material.WHEAT_SEEDS);
        tearecipe.setIngredient('G', Material.GLASS_BOTTLE);
        return tearecipe;
    }

}
