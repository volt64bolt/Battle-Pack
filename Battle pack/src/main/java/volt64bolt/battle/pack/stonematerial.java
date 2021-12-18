package volt64bolt.battle.pack;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class stonematerial implements ToolMaterial{

    @Override
    public float getAttackDamage() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int getDurability() {
        // TODO Auto-generated method stub
        return  131;
    }

    @Override
    public int getEnchantability() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int getMiningLevel() {
        // TODO Auto-generated method stub
        return 1;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        // TODO Auto-generated method stub
        return 6;
    }

    @Override
    public Ingredient getRepairIngredient() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
