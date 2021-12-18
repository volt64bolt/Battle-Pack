package volt64bolt.battle.pack;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class ironmaterial implements ToolMaterial{

    @Override
    public float getAttackDamage() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int getDurability() {
        // TODO Auto-generated method stub
        return 250;
    }

    @Override
    public int getEnchantability() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int getMiningLevel() {
        // TODO Auto-generated method stub
        return 2;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        // TODO Auto-generated method stub
        return 8;
    }

    @Override
    public Ingredient getRepairIngredient() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
