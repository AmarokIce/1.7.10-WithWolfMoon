package wolf.someoneice.manamoon.api.helper;

import net.minecraft.item.ItemStack;
import wolf.someoneice.manamoon.common.block.tile.moonCraftingTable.crafting.MoonTableCrafting;

public class ShapelessOreRecipes {
    public ShapelessOreRecipes(ItemStack result, Object... recipe) {
        MoonTableCrafting.getInstance().addShapelessOreRecipe(result, recipe);
    }
}
