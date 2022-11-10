package wolf.someoneice.manamoon.api;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import wolf.someoneice.manamoon.util.bean.recipes_book.MoonRecipesBase;

public abstract class AddRecipesBookHelper {
    /**
     * If you wanna to make a new ManaRecipePage, get this to your mod ItemList or extends the MoonRecipesBase to your init.
     *
     * @param name The RecipePage's name.
     * @param output The RecipesPage output item.
     * @param hard The difficulty of recipe, The difficulty affects the number of rounds of reading and the failure rate of each round, and the round = difficulty*2.
     * @param risk The risk of recipe, The risk is the probability that the item will be consumed after failure, and even if the player does not succeed, the corresponding item in the backpack will be consumed at risk
     * @param needMoon If should player can read the Moonlight Inscription, return true.
     * @param needMoonManaEffect If should player had activation of MoonPower(Effect), return true.
     * @param needFullMoon If should in FullMoon, return true.
     * @param needNewMoon If should in NewMoon, return true. If FullMoon is true and NewMoon is true, Player can in Full or New Moon do the recipe.
     * @param isPrint If it can use other tool to make the making-time be easy, let it in true. Or let it in false.
     * @return Register this, It will make a new ManaRecipePage. It's White Wolf s' ManaRecipesPage.
     */
    abstract MoonRecipesBase MoonRecipesBase(String name, ItemStack output, int hard, int risk, boolean needMoon, boolean needMoonManaEffect, boolean needFullMoon, boolean needNewMoon, boolean isPrint);
}
