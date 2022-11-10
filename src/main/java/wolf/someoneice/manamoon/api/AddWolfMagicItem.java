package wolf.someoneice.manamoon.api;

import project.studio.manametalmod.core.ManaItemType;
import project.studio.manametalmod.magic.magicItem.IMagicEffect;
import wolf.someoneice.manamoon.util.bean.item.magic_item.MoonMagicItem;
import wolf.someoneice.manamoon.util.enums.Wolf;

public abstract class AddWolfMagicItem {
    /**
     * What can these things do? If you know, you know. ;)
     * So. Did you know ...?
     * 
     * @param Name The Item name.
     * @param needLV The lv player needs.
     * @param wolf Which wolf lv should player in?
     * @param type The Mana-type.
     * @param IMagicEffect Something you know. Did you?
     * @return A MagicItem in Manametalmod.
     */
    
    abstract MoonMagicItem MoonMagicItem(String Name, int needLV, Wolf wolf, ManaItemType type, IMagicEffect[] IMagicEffect);
}
