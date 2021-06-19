package me.simmimine.CustomFood;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;

import java.util.List;

public class invExecutor implements CommandExecutor {

    private final Inventory inventory ;
    private final List<Inventory> inv;

    public invExecutor(Inventory inventory, List<Inventory> inv) {
        this.inventory = inventory;
        this.inv = inv;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (label.equalsIgnoreCase("customcook") || label.equalsIgnoreCase("cc")) {
            if (sender instanceof Player) {
                Player player = (Player) sender;
                if (args.length == 0) {
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', ("&f[&6Custom Food&f]opened custom cooking gui")));
                    player.openInventory(this.inventory);
                    return true;
                }
                else {
                    return false;
                }
            }
        }
        return false;
    }

}
