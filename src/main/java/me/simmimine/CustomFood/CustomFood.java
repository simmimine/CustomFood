package me.simmimine.CustomFood;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.PluginCommand;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;

public class CustomFood extends JavaPlugin {

    private Material getMaterial(String str) {
        if (str == null) {
            return Material.AIR;
        }
        Material temp = Material.getMaterial(str.toUpperCase());
        return temp == null ? Material.AIR : temp;
    }

    private List<Inventory> loadConfig(invCreator creator) {
        //Load config
        FileConfiguration cfg = getConfig();

        //Return
        List<Inventory> rtnList = new ArrayList<>();

        //Get inventory
        ConfigurationSection curInventory;
        Material curMat;
        List<Integer> curSlots;
        Inventory curInv;
        //Iterate through inventories
        for (String x : cfg.getKeys(false)) {
            curInventory = cfg.getConfigurationSection(x);
            if (curInventory == null) continue;

            //Create inventory
            curInv = creator.createRecipeInv(x);

            //Iterate through items in the inventory
            for (String info : curInventory.getKeys(false)) {
                curMat = getMaterial(curInventory.getString(info + ".materialType"));
                curSlots = curInventory.getIntegerList(info + ".slotInt");

                //Handle the rest
                for (int slotID : curSlots)
                    curInv.setItem(slotID, new ItemStack(curMat));
            }
            replaceEmpty(curInv);
            rtnList.add(curInv);
        }
        return rtnList;
    }



    @Override
    public void onEnable() {

        saveDefaultConfig();
        invCreator creator= new invCreator();
        List<Inventory> invs = loadConfig(creator);
        InvHandler invh = new InvHandler(this, creator.createInv(), invs);

        PluginManager pluginManager = getServer().getPluginManager();
        pluginManager.registerEvents(invh, this);
        pluginManager.registerEvents(new itemHandler(this), this);

        PluginCommand command = getCommand("customcook");
        command.setExecutor(new invExecutor(creator.createInv(), invs));
        command.setTabCompleter(new tabComplete());

        customRecipes cr = new customRecipes();
        Bukkit.addRecipe(cr.mashedPotatoRecipe());
        Bukkit.addRecipe(cr.carrotCakeRecipe());
        Bukkit.addRecipe(cr.applePieRecipe());
        Bukkit.addRecipe(cr.beetrootJamRecipe());
        Bukkit.addRecipe(cr.cupOfTeaRecipe());
    }

    public static void replaceEmpty(Inventory CurInv) {
        ItemStack Filler = new ItemStack(Material.GRAY_STAINED_GLASS_PANE, 1);
        ItemMeta NFMeta = Filler.getItemMeta();
        NFMeta.setDisplayName(" ");
        Filler.setItemMeta(NFMeta);

        for (int i = 0; i < CurInv.getSize(); i++) {
            if (CurInv.getItem(i) == null) {
                //Place Gray Glass pane
                CurInv.setItem(i, Filler);
            }
        }
    }


}
