package com.eclipsekingdom.fractalforest.util.X;

import com.eclipsekingdom.fractalforest.sys.Version;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockState;

public class FMaterial {

    public static final FMaterial NETHER_WART_BLOCK = new FMaterial(XMaterial.NETHER_WART_BLOCK);
    public static final FMaterial NETHER_BRICK_FENCE = new FMaterial(XMaterial.NETHER_BRICK_FENCE);
    public static final FMaterial RED_NETHER_BRICK_WALL = new FMaterial(XMaterial.RED_NETHER_BRICK_WALL);
    public static final FMaterial NETHER_BRICKS = new FMaterial(XMaterial.NETHER_BRICKS);
    public static final FMaterial RED_NETHER_BRICKS = new FMaterial(XMaterial.RED_NETHER_BRICKS);
    public static final FMaterial NETHERRACK = new FMaterial(XMaterial.NETHERRACK);
    public static final FMaterial MAGMA_BLOCK = new FMaterial(XMaterial.MAGMA_BLOCK);
    public static final FMaterial GLOWSTONE = new FMaterial(XMaterial.GLOWSTONE);
    public static final FMaterial ANDESITE_WALL = new FMaterial(XMaterial.ANDESITE_WALL);
    public static final FMaterial DIORITE_WALL = new FMaterial(XMaterial.DIORITE_WALL);
    public static final FMaterial OBSIDIAN = new FMaterial(XMaterial.OBSIDIAN);
    public static final FMaterial MUSHROOM_STEM = new FMaterial(XMaterial.MUSHROOM_STEM);
    public static final FMaterial MUSHROOM_LEGACY = new FMaterial(XMaterial.BROWN_MUSHROOM_BLOCK, 15);

    public static final FMaterial OAK_WOOD = new FMaterial(XMaterial.OAK_WOOD, 0);
    public static final FMaterial SPRUCE_WOOD = new FMaterial(XMaterial.SPRUCE_WOOD, 1);
    public static final FMaterial BIRCH_WOOD = new FMaterial(XMaterial.BIRCH_WOOD, 2);
    public static final FMaterial JUNGLE_WOOD = new FMaterial(XMaterial.JUNGLE_WOOD, 3);
    public static final FMaterial ACACIA_WOOD = new FMaterial(XMaterial.ACACIA_WOOD, 0);
    public static final FMaterial DARK_OAK_WOOD = new FMaterial(XMaterial.DARK_OAK_WOOD, 1);

    public static final FMaterial OAK_FENCE = new FMaterial(XMaterial.OAK_FENCE);
    public static final FMaterial SPRUCE_FENCE = new FMaterial(XMaterial.SPRUCE_FENCE);
    public static final FMaterial BIRCH_FENCE = new FMaterial(XMaterial.BIRCH_FENCE);
    public static final FMaterial JUNGLE_FENCE = new FMaterial(XMaterial.JUNGLE_FENCE);
    public static final FMaterial ACACIA_FENCE = new FMaterial(XMaterial.ACACIA_FENCE);
    public static final FMaterial DARK_OAK_FENCE = new FMaterial(XMaterial.DARK_OAK_FENCE);

    public static final FMaterial OAK_LEAVES = new FMaterial(XMaterial.OAK_LEAVES, 4);
    public static final FMaterial SPRUCE_LEAVES = new FMaterial(XMaterial.SPRUCE_LEAVES, 5);
    public static final FMaterial BIRCH_LEAVES = new FMaterial(XMaterial.BIRCH_LEAVES, 6);
    public static final FMaterial JUNGLE_LEAVES = new FMaterial(XMaterial.JUNGLE_LEAVES, 7);
    public static final FMaterial ACACIA_LEAVES = new FMaterial(XMaterial.ACACIA_LEAVES, 4);
    public static final FMaterial DARK_OAK_LEAVES = new FMaterial(XMaterial.DARK_OAK_LEAVES, 5);

    public static final FMaterial WHITE_TERRACOTTA = new FMaterial(XMaterial.WHITE_TERRACOTTA, 0);
    public static final FMaterial ORANGE_TERRACOTTA = new FMaterial(XMaterial.ORANGE_TERRACOTTA, 1);
    public static final FMaterial MAGENTA_TERRACOTTA = new FMaterial(XMaterial.MAGENTA_TERRACOTTA, 2);
    public static final FMaterial LIGHT_BLUE_TERRACOTTA = new FMaterial(XMaterial.LIGHT_BLUE_TERRACOTTA, 3);
    public static final FMaterial YELLOW_TERRACOTTA = new FMaterial(XMaterial.YELLOW_TERRACOTTA, 4);
    public static final FMaterial LIME_TERRACOTTA = new FMaterial(XMaterial.LIME_TERRACOTTA, 5);
    public static final FMaterial PINK_TERRACOTTA = new FMaterial(XMaterial.PINK_TERRACOTTA, 6);
    public static final FMaterial GRAY_TERRACOTTA = new FMaterial(XMaterial.GRAY_TERRACOTTA, 7);
    public static final FMaterial LIGHT_GRAY_TERRACOTTA = new FMaterial(XMaterial.LIGHT_GRAY_TERRACOTTA, 8);
    public static final FMaterial CYAN_TERRACOTTA = new FMaterial(XMaterial.CYAN_TERRACOTTA, 9);
    public static final FMaterial PURPLE_TERRACOTTA = new FMaterial(XMaterial.PURPLE_TERRACOTTA, 10);
    public static final FMaterial BLUE_TERRACOTTA = new FMaterial(XMaterial.BLUE_TERRACOTTA, 11);
    public static final FMaterial BROWN_TERRACOTTA = new FMaterial(XMaterial.BROWN_TERRACOTTA, 12);
    public static final FMaterial GREEN_TERRACOTTA = new FMaterial(XMaterial.GREEN_TERRACOTTA, 13);
    public static final FMaterial RED_TERRACOTTA = new FMaterial(XMaterial.RED_TERRACOTTA, 14);
    public static final FMaterial BLACK_TERRACOTTA = new FMaterial(XMaterial.BLACK_TERRACOTTA, 15);

    public static final FMaterial WHITE_CONCRETE = new FMaterial(XMaterial.WHITE_CONCRETE, 0);
    public static final FMaterial ORANGE_CONCRETE = new FMaterial(XMaterial.ORANGE_CONCRETE, 1);
    public static final FMaterial MAGENTA_CONCRETE = new FMaterial(XMaterial.MAGENTA_CONCRETE, 2);
    public static final FMaterial LIGHT_BLUE_CONCRETE = new FMaterial(XMaterial.LIGHT_BLUE_CONCRETE, 3);
    public static final FMaterial YELLOW_CONCRETE = new FMaterial(XMaterial.YELLOW_CONCRETE, 4);
    public static final FMaterial LIME_CONCRETE = new FMaterial(XMaterial.LIME_CONCRETE, 5);
    public static final FMaterial PINK_CONCRETE = new FMaterial(XMaterial.PINK_CONCRETE, 6);
    public static final FMaterial GRAY_CONCRETE = new FMaterial(XMaterial.GRAY_CONCRETE, 7);
    public static final FMaterial LIGHT_GRAY_CONCRETE = new FMaterial(XMaterial.LIGHT_GRAY_CONCRETE, 8);
    public static final FMaterial CYAN_CONCRETE = new FMaterial(XMaterial.CYAN_CONCRETE, 9);
    public static final FMaterial PURPLE_CONCRETE = new FMaterial(XMaterial.PURPLE_CONCRETE, 10);
    public static final FMaterial BLUE_CONCRETE = new FMaterial(XMaterial.BLUE_CONCRETE, 11);
    public static final FMaterial BROWN_CONCRETE = new FMaterial(XMaterial.BROWN_CONCRETE, 12);
    public static final FMaterial GREEN_CONCRETE = new FMaterial(XMaterial.GREEN_CONCRETE, 13);
    public static final FMaterial RED_CONCRETE = new FMaterial(XMaterial.RED_CONCRETE, 14);
    public static final FMaterial BLACK_CONCRETE = new FMaterial(XMaterial.BLACK_CONCRETE, 15);

    public static final FMaterial WHITE_WOOL = new FMaterial(XMaterial.WHITE_WOOL, 0);
    public static final FMaterial ORANGE_WOOL = new FMaterial(XMaterial.ORANGE_WOOL, 1);
    public static final FMaterial MAGENTA_WOOL = new FMaterial(XMaterial.MAGENTA_WOOL, 2);
    public static final FMaterial LIGHT_BLUE_WOOL = new FMaterial(XMaterial.LIGHT_BLUE_WOOL, 3);
    public static final FMaterial YELLOW_WOOL = new FMaterial(XMaterial.YELLOW_WOOL, 4);
    public static final FMaterial LIME_WOOL = new FMaterial(XMaterial.LIME_WOOL, 5);
    public static final FMaterial PINK_WOOL = new FMaterial(XMaterial.PINK_WOOL, 6);
    public static final FMaterial GRAY_WOOL = new FMaterial(XMaterial.GRAY_WOOL, 7);
    public static final FMaterial LIGHT_GRAY_WOOL = new FMaterial(XMaterial.LIGHT_GRAY_WOOL, 8);
    public static final FMaterial CYAN_WOOL = new FMaterial(XMaterial.CYAN_WOOL, 9);
    public static final FMaterial PURPLE_WOOL = new FMaterial(XMaterial.PURPLE_WOOL, 10);
    public static final FMaterial BLUE_WOOL = new FMaterial(XMaterial.BLUE_WOOL, 11);
    public static final FMaterial BROWN_WOOL = new FMaterial(XMaterial.BROWN_WOOL, 12);
    public static final FMaterial GREEN_WOOL = new FMaterial(XMaterial.GREEN_WOOL, 13);
    public static final FMaterial RED_WOOL = new FMaterial(XMaterial.RED_WOOL, 14);
    public static final FMaterial BLACK_WOOL = new FMaterial(XMaterial.BLACK_WOOL, 15);


    public static final FMaterial WHITE_STAINED_GLASS = new FMaterial(XMaterial.WHITE_STAINED_GLASS, 0);
    public static final FMaterial ORANGE_STAINED_GLASS = new FMaterial(XMaterial.ORANGE_STAINED_GLASS, 1);
    public static final FMaterial MAGENTA_STAINED_GLASS = new FMaterial(XMaterial.MAGENTA_STAINED_GLASS, 2);
    public static final FMaterial LIGHT_BLUE_STAINED_GLASS = new FMaterial(XMaterial.LIGHT_BLUE_STAINED_GLASS, 3);
    public static final FMaterial YELLOW_STAINED_GLASS = new FMaterial(XMaterial.YELLOW_STAINED_GLASS, 4);
    public static final FMaterial LIME_STAINED_GLASS = new FMaterial(XMaterial.LIME_STAINED_GLASS, 5);
    public static final FMaterial PINK_STAINED_GLASS = new FMaterial(XMaterial.PINK_STAINED_GLASS, 6);
    public static final FMaterial GRAY_STAINED_GLASS = new FMaterial(XMaterial.GRAY_STAINED_GLASS, 7);
    public static final FMaterial LIGHT_GRAY_STAINED_GLASS = new FMaterial(XMaterial.LIGHT_GRAY_STAINED_GLASS, 8);
    public static final FMaterial CYAN_STAINED_GLASS = new FMaterial(XMaterial.CYAN_STAINED_GLASS, 9);
    public static final FMaterial PURPLE_STAINED_GLASS = new FMaterial(XMaterial.PURPLE_STAINED_GLASS, 10);
    public static final FMaterial BLUE_STAINED_GLASS = new FMaterial(XMaterial.BLUE_STAINED_GLASS, 11);
    public static final FMaterial BROWN_STAINED_GLASS = new FMaterial(XMaterial.BROWN_STAINED_GLASS, 12);
    public static final FMaterial GREEN_STAINED_GLASS = new FMaterial(XMaterial.GREEN_STAINED_GLASS, 13);
    public static final FMaterial RED_STAINED_GLASS = new FMaterial(XMaterial.RED_STAINED_GLASS, 14);
    public static final FMaterial BLACK_STAINED_GLASS = new FMaterial(XMaterial.BLACK_STAINED_GLASS, 15);
    
    private static boolean legacy = Version.current.value <= 112;

    private Material material;
    private byte aByte;


    public FMaterial(Material material) {
        this.material = material;
        aByte = -1;
    }

    public FMaterial(XMaterial material) {
        this.material = material.parseMaterial();
        aByte = -1;
    }

    public FMaterial(XMaterial material, int aByte) {
        this.material = material.parseMaterial();
        this.aByte = (byte) aByte;
    }

    public Material getMaterial() {
        return material;
    }

    public void toBlock(Block block) {
        block.setType(material);
        if (legacy) {
            BlockState state = block.getState();
            state.setRawData(aByte);
            state.update(true);
        }
    }


}
