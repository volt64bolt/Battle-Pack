package volt64bolt.battle.pack;

import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolMaterial;

public class golden_battleaxe extends AxeItem{

    protected golden_battleaxe(ToolMaterial material) {
        super(material, 8, -3.2f, new Item.Settings().group(ItemGroup.COMBAT));

    }
    
}
