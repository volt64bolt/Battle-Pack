package volt64bolt.battle.pack;

import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolMaterial;

public class wooden_battleaxe extends AxeItem{

    protected wooden_battleaxe(ToolMaterial material) {
        super(material, 8, -3.4f, new Item.Settings().group(ItemGroup.COMBAT));

    }
    
}
