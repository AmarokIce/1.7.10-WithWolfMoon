package wolf.someoneice.manamoon.api;

import net.minecraft.item.ItemStack;

import java.util.ArrayList;
import java.util.List;

public class ManaMoonAPI {
    public static List<MoonCraftTable> craftTables = new ArrayList<MoonCraftTable>();

    public static void addShapedMoonCraftRecipe(ItemStack result, Object ... recipe) {
        craftTables.add(new MoonCraftTable.MoonCraftTableShapedRecipe(result, recipe));
    }

    public static void addShaplessMoonCraftRecipe(ItemStack result, Object ... recipe) {
        craftTables.add(new MoonCraftTable.MoonCraftTableShaplessRecipe(result, recipe));
    }
}
