package volt64bolt.battle.pack;

import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolMaterial;

public class diamond_battleaxe extends AxeItem{

    protected diamond_battleaxe(ToolMaterial material) {
        super(material, 10, -3.2f, new Item.Settings().group(ItemGroup.COMBAT));

    }
    
}
