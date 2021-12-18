package volt64bolt.battle.pack;

import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolMaterial;

public class iron_battleaxe extends AxeItem{

    protected iron_battleaxe(ToolMaterial material) {
        super(material, 10, -3.3f, new Item.Settings().group(ItemGroup.COMBAT));

    }
    
}
