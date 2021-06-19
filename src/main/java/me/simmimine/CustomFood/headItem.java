package me.simmimine.CustomFood;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

import java.util.UUID;

public class headItem {

    public static int[] convertUUID(UUID uuid) {
        if (uuid == null) return new int[4];

        //Get most and least significant bits
        long most = uuid.getMostSignificantBits();
        long least = uuid.getLeastSignificantBits();

        //Convert to ints
        int mostmost = (int) (most >> 32);
        int mostleast = (int) ((most << 32) >> 32);
        int leastmost = (int) (least >> 32);
        int leastleast = (int) ((least << 32) >> 32);

        //Return converted UUID
        return new int[]{mostmost, mostleast, leastmost, leastleast};
    }

    private final String baseTexture;
    private final UUID uuid;

    /*
     * Constructors
     */
    public headItem(String baseTexture, UUID uuid) {
        this.baseTexture = baseTexture;
        this.uuid = uuid;
    }

    public headItem(String baseTexture) {
        this.baseTexture = baseTexture;
        this.uuid = null;
    }

    public headItem(UUID uuid) {
        this.baseTexture = null;
        this.uuid = uuid;
    }

    /*
     * Public methods
     */
    public ItemStack getItemStack() {
        //Create skull
        String sUUID;
        String sTexture = "";

        //If no base Texture is given use the skull meta
        if (this.uuid != null && this.baseTexture == null) {
            ItemStack stack = new ItemStack(Material.PLAYER_HEAD);
            SkullMeta meta = (SkullMeta) stack.getItemMeta();
            meta.setOwningPlayer(Bukkit.getOfflinePlayer(this.uuid));
            stack.setItemMeta(meta);
            return stack;
        }

        //Setup UUID if given
        if (this.uuid != null) {
            int[] playerUUID = convertUUID(this.uuid);
            sUUID = String.format("Id:[I;%d,%d,%d,%d]",
                    playerUUID[0],
                    playerUUID[1],
                    playerUUID[2],
                    playerUUID[3]
            );
        } else {
            sUUID = "Id:[I;0,0,0,0]";
        }

        //Setup base Texture if given
        if (this.baseTexture != null) {
            sTexture = String.format("Properties:{textures:[{Value:\"%s\"}]}",
                    this.baseTexture
            );
        }

        //Return created head item
        return Bukkit.getUnsafe().modifyItemStack(new ItemStack(Material.PLAYER_HEAD), String.format("{SkullOwner:{%s,%s}}",
                sUUID,
                sTexture
        ));
    }

}
