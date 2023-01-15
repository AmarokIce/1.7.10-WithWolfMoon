package wolf.someoneice.manamoon.api;

import net.minecraft.item.ItemStack;

public abstract class MoonCraftTable {
    private MoonCraftTable() {}

    public static class MoonCraftTableShapedRecipe extends MoonCraftTable {
        public ItemStack output;
        public Object[] recipe;

        public MoonCraftTableShapedRecipe(ItemStack result, Object ... recipe) {
            this.output = result;
            this.recipe = recipe;
        }
    }

    public static class MoonCraftTableShaplessRecipe extends MoonCraftTable {
        public ItemStack output;
        public Object[] recipe;

        public MoonCraftTableShaplessRecipe(ItemStack result, Object ... recipe) {
            this.output = result;
            this.recipe = recipe;
        }
    }
}
