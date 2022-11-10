package wolf.someoneice.manamoon.api.helper;

import net.minecraft.item.ItemStack;
import wolf.someoneice.manamoon.common.block.tile.moonCraftingTable.crafting.MoonTableCrafting;

public class ShapedRecipes {
    public ShapedRecipes(ItemStack result, Object ... recipe) {
        MoonTableCrafting.getInstance().addRecipe(result, recipe);
    }
}

