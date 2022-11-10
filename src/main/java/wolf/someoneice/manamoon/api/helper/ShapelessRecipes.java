package wolf.someoneice.manamoon.api.helper;

import net.minecraft.item.ItemStack;
import wolf.someoneice.manamoon.common.block.tile.moonCraftingTable.crafting.MoonTableCrafting;

public class ShapelessRecipes {
    public ShapelessRecipes(ItemStack result, Object ... recipe) {
        MoonTableCrafting.getInstance().addShapelessRecipe(result, recipe);
    }
}
