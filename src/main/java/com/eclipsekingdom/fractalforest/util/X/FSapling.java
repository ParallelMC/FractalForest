package com.eclipsekingdom.fractalforest.util.X;

import com.eclipsekingdom.fractalforest.sys.Version;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class FSapling {

    public static final FSapling OAK_SAPLING = new FSapling(XMaterial.OAK_SAPLING, 0);
    public static final FSapling SPRUCE_SAPLING = new FSapling(XMaterial.SPRUCE_SAPLING, 1);
    public static final FSapling BIRCH_SAPLING = new FSapling(XMaterial.BIRCH_SAPLING, 2);
    public static final FSapling JUNGLE_SAPLING = new FSapling(XMaterial.JUNGLE_SAPLING, 3);
    public static final FSapling ACACIA_SAPLING = new FSapling(XMaterial.ACACIA_SAPLING, 4);
    public static final FSapling DARK_OAK_SAPLING = new FSapling(XMaterial.DARK_OAK_SAPLING, 5);
    public static final FSapling NETHER_WART = new FSapling(XMaterial.NETHER_WART);
    public static final FSapling CHORUS = new FSapling(XMaterial.CHORUS_PLANT, XMaterial.OBSIDIAN);
    public static final FSapling SEAGRASS = new FSapling(XMaterial.SEAGRASS, XMaterial.SAND);

    private static boolean legacy = Version.current.value <= 112;

    private Material material;
    private byte aByte;

    public FSapling(XMaterial material, XMaterial backup) {
        Material matOne = material.parseMaterial();
        this.material = matOne == null? backup.parseMaterial() : matOne;
        aByte = -1;
    }

    public FSapling(XMaterial material) {
        this.material = material.parseMaterial();
        aByte = -1;
    }

    public FSapling(XMaterial material, int aByte) {
        this.material = material.parseMaterial();
        this.aByte = (byte) aByte;
    }

    public ItemStack getItemStack() {
        if (!legacy || aByte == -1) {
            return new ItemStack(material);
        } else {
            return new ItemStack(material, 1, aByte);
        }
    }

}
