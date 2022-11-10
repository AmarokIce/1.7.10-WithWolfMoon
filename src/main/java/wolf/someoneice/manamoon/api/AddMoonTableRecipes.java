package wolf.someoneice.manamoon.api;

import net.minecraft.item.ItemStack;
import wolf.someoneice.manamoon.api.helper.ShapedRecipes;
import wolf.someoneice.manamoon.api.helper.ShapelessOreRecipes;
import wolf.someoneice.manamoon.api.helper.ShapelessRecipes;


public abstract class AddMoonTableRecipes {
    /**
     *
     * @param result The output.
     * @param recipe The recipes items.
     * @return A recipes in MoonTable.
     */

    abstract ShapedRecipes ShapedRecipes(ItemStack result, Object ... recipe);

    abstract ShapelessRecipes ShapelessRecipes(ItemStack result, Object... recipe);

    abstract ShapelessOreRecipes ShapelessOreRecipes(ItemStack result, Object... recipe);
}
