package com.eclipsekingdom.fractalforest.trees;

import com.eclipsekingdom.fractalforest.trees.effect.EffectType;
import com.eclipsekingdom.fractalforest.trees.effect.IEffects;
import com.eclipsekingdom.fractalforest.trees.gen.fractal.FractalGrowthPattern;
import com.eclipsekingdom.fractalforest.trees.gen.fractal.FractalTreeBuilder;
import com.eclipsekingdom.fractalforest.trees.gen.fractal.genome.GenomeType;
import com.eclipsekingdom.fractalforest.trees.gen.fractal.genome.IGenome;
import com.eclipsekingdom.fractalforest.trees.habitat.HabitatType;
import com.eclipsekingdom.fractalforest.trees.habitat.IHabitat;
import com.eclipsekingdom.fractalforest.util.ChatUtil;
import com.eclipsekingdom.fractalforest.util.Scale;
import com.eclipsekingdom.fractalforest.util.X.FSapling;
import com.eclipsekingdom.fractalforest.util.theme.ITheme;
import com.eclipsekingdom.fractalforest.util.theme.ThemeType;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.permissions.Permission;
import org.bukkit.plugin.PluginManager;
import org.checkerframework.checker.units.qual.A;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static com.eclipsekingdom.fractalforest.sys.language.Message.LABEL_SAPLING;
import static com.eclipsekingdom.fractalforest.sys.language.Message.LABEL_SPECIES;

/**
 * This class represents a specific Species of sapling.
 * This used to be an enum, but was converted into a class to allow other plugins to add custom species
 */
public class Species {
    public static final Species MAGNOLIA = new Species("MAGNOLIA", Scale.SMALL, GenomeType.MAGNOLIA.value(), FSapling.OAK_SAPLING, ThemeType.OAK.getTheme());
    public static final Species BUCK_EYE = new Species("BUCK_EYE", Scale.MEDIUM, GenomeType.BUCK_EYE.value(), FSapling.OAK_SAPLING, ThemeType.OAK.getTheme());
    public static final Species FLOWERING_HAWTHORN = new Species("FLOWERING_HAWTHORN", Scale.MEDIUM, GenomeType.BUCK_EYE.value(), FSapling.OAK_SAPLING, ThemeType.FLOWERING_HAWTHORN.getTheme());
    public static final Species OAK = new Species("OAK", Scale.MASSIVE, GenomeType.OAK.value(), FSapling.OAK_SAPLING, ThemeType.OAK.getTheme());
    public static final Species ELM = new Species("ELM", Scale.MASSIVE, GenomeType.ELM.value(), FSapling.OAK_SAPLING, ThemeType.OAK.getTheme());
    public static final Species BIRCH = new Species("BIRCH", Scale.BIG, GenomeType.BIRCH.value(), FSapling.BIRCH_SAPLING, ThemeType.BIRCH.getTheme());
    public static final Species FALL_BIRCH = new Species("FALL_BIRCH", Scale.BIG, GenomeType.BIRCH.value(), FSapling.BIRCH_SAPLING, ThemeType.FALL_BIRCH.getTheme());
    public static final Species FALL_OAK = new Species("FALL_OAK", Scale.MASSIVE, GenomeType.OAK.value(), FSapling.OAK_SAPLING, ThemeType.FALL_OAK.getTheme());
    public static final Species FALL_ELM = new Species("FALL_ELM", Scale.MASSIVE, GenomeType.ELM.value(), FSapling.OAK_SAPLING, ThemeType.FALL_ELM.getTheme());
    public static final Species FALL_MAPLE = new Species("FALL_MAPLE", Scale.MASSIVE, GenomeType.OAK.value(), FSapling.OAK_SAPLING, ThemeType.FALL_MAPLE.getTheme());
    public static final Species WEIRWOOD = new Species("WEIRWOOD", Scale.MASSIVE, GenomeType.WEIRWOOD.value(), FSapling.BIRCH_SAPLING, ThemeType.WEIRWOOD.getTheme());
    public static final Species WHITE_ASH = new Species("WHITE_ASH", Scale.BIG, GenomeType.WHITE_ASH.value(), FSapling.ACACIA_SAPLING, ThemeType.WHITE_ASH.getTheme());
    public static final Species NARROW_LEAF_ASH = new Species("NARROW_LEAF_ASH", Scale.BIG, GenomeType.NARROW_LEAF_ASH.value(), FSapling.ACACIA_SAPLING, ThemeType.WHITE_ASH.getTheme());
    public static final Species SHANTUNG_MAPLE = new Species("SHANTUNG_MAPLE", Scale.MASSIVE, GenomeType.SHANTUNG_MAPLE.value(), FSapling.OAK_SAPLING, ThemeType.OAK.getTheme());
    public static final Species HICKORY = new Species("HICKORY", Scale.BIG, GenomeType.HICKORY.value(), FSapling.OAK_SAPLING, ThemeType.OAK.getTheme());

    public static final Species BLOOD_BUSH = new Species("BLOOD_BUSH", Scale.SMALL, GenomeType.BLOOD_BUSH.value(), FSapling.NETHER_WART, ThemeType.BLOOD_BUSH.getTheme(), HabitatType.NETHER.getHabitat(), EffectType.NETHER.getEffects());
    public static final Species FLAME_TREE = new Species("FLAME_TREE", Scale.MEDIUM, GenomeType.FLAME_TREE.value(), FSapling.NETHER_WART, ThemeType.FLAME_TREE.getTheme(), HabitatType.NETHER.getHabitat(), EffectType.NETHER.getEffects());

    public static final Species CYGNI = new Species("CYGNI", Scale.MEDIUM, GenomeType.CYGNI.value(), FSapling.CHORUS, ThemeType.CYGNI.getTheme(), HabitatType.END.getHabitat(), EffectType.END.getEffects());
    public static final Species SECCHI = new Species("SECCHI", Scale.SMALL, GenomeType.SECCHI.value(), FSapling.CHORUS, ThemeType.SECCHI.getTheme(), HabitatType.END.getHabitat(), EffectType.END.getEffects());


    private Scale scale;
    private FractalGrowthPattern growthPattern;
    private FSapling fSapling;
    private IHabitat habitat;
    private IEffects effects;
    private ITheme theme;
    private String plantingPermString;
    private String formattedName;
    private String name;

    public Species(String name, Scale scale, IGenome genome, FSapling fSapling, ITheme theme, IHabitat habitat, IEffects effects) {
        init(name, scale, genome, fSapling, theme, habitat, effects);
    }

    public Species(Scale scale, IGenome genome, FSapling fSapling, ITheme theme, IHabitat habitat, IEffects effects) {
        init("", scale, genome, fSapling, theme, habitat, effects);
    }

    public Species(String name, Scale scale, IGenome genome, FSapling fSapling, ITheme theme) {
        init(name, scale, genome, fSapling, theme, HabitatType.FOREST.getHabitat(), EffectType.FOREST.getEffects());
    }

    public Species(Scale scale, IGenome genome, FSapling fSapling, ITheme theme) {
        init("", scale, genome, fSapling, theme, HabitatType.FOREST.getHabitat(), EffectType.FOREST.getEffects());
    }

    private Species() {

    }

    private void init(String name, Scale scale, IGenome genome, FSapling fSapling, ITheme theme, IHabitat habitat, IEffects effects) {
        this.name = name;
        this.scale = scale;
        this.growthPattern = new FractalGrowthPattern(genome);
        this.fSapling = fSapling;
        this.habitat = habitat;
        this.effects = effects;
        this.theme = theme;
        this.plantingPermString = "forest.plant." + toString().replace("_", "").toLowerCase();
        this.formattedName = ChatUtil.format(toString());
    }

    public ITree getIndividual(Player planter, Location seed) {
        return new FractalTreeBuilder(this, planter, seed, growthPattern.generateBlueprint());
    }

    public ItemStack getSapling() {
        String species = toString();
        ItemStack itemStack = fSapling.getItemStack();
        ItemMeta meta = itemStack.getItemMeta();
        meta.setDisplayName(ChatColor.GREEN + formattedName + " " + LABEL_SAPLING);
        meta.addEnchant(Enchantment.UNBREAKING, 1, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        ArrayList<String> lore = new ArrayList<>();
        lore.add(ChatColor.DARK_GREEN + LABEL_SPECIES.toString() + ": " + ChatColor.GRAY + species);
        lore.add(ChatColor.DARK_GREEN + "Size: " + ChatColor.GRAY + scale.getFormatted());
        meta.setLore(lore);
        itemStack.setItemMeta(meta);
        return itemStack;
    }

    public IHabitat getHabitat() {
        return habitat;
    }

    public IEffects getEffects() {
        return effects;
    }

    public ITheme getTheme() {
        return theme;
    }

    public String format() {
        return formattedName;
    }

    public String getPlanterPerm() {
        return plantingPermString;
    }

    public static Species from(String string) {

        for (Species species : values()) {
            if (species.toString().equalsIgnoreCase(string)) {
                return species;
            }
        }
        return null;
    }

    public static void registerPermissions() {
        PluginManager pm = Bukkit.getServer().getPluginManager();
        for (Species species : values()) {
            pm.addPermission(new Permission(species.getPlanterPerm(), "allows player to plant " + species.format() + " sapling."));
        }
    }

    private static final HashMap<String, Species> species = new HashMap<>();

    private static boolean initializedStaticVals = false;

    /**
     * Returns an array of all registered species
     * @return An array of all registered species
     */
    public static Species[] values() {
        // This block automatically takes all of the static values and adds them to the species hashmap.
        if (!initializedStaticVals) {
            Species blankSpecies = new Species();

            Field[] fields = Species.class.getDeclaredFields();
            for (Field f : fields) {
                if (Modifier.isStatic(f.getModifiers()) && f.getType().equals(Species.class)) {
                    try {
                        Species sp = (Species) f.get(blankSpecies);
                        species.put(sp.name(), sp);
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            }
            initializedStaticVals = true;
        }
        return species.values().toArray(new Species[0]);
    }

    /**
     * Adds a new species to the map
     * @param newSpecies The new species to add
     */
    public static void addSpecies(Species newSpecies) {
        species.put(newSpecies.name(), newSpecies);
    }

    public String name() {
        return name;
    }

    public static Species valueOf(String name) {
        return species.get(name);
    }

    public String toString() {
        return name;
    }
}
