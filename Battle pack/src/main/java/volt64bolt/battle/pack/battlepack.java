package volt64bolt.battle.pack;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class battlepack implements ModInitializer {
	//sticks
	public static final Item SHORT_STICK = new Item(new Item.Settings().group(ItemGroup.MISC));
	public static final Item LONG_STICK = new Item(new Item.Settings().group(ItemGroup.MISC));
	public static final Item LONGEST_STICK = new Item(new Item.Settings().group(ItemGroup.MISC));
 
	//battle axes


	@Override
	public void onInitialize() {
		//sticks
		Registry.register(Registry.ITEM, new Identifier("battlepack", "short_stick"), SHORT_STICK);
		Registry.register(Registry.ITEM, new Identifier("battlepack", "long_stick"), LONG_STICK);
		Registry.register(Registry.ITEM, new Identifier("battlepack", "longest_stick"), LONGEST_STICK);

		//battle axes
		Registry.register(Registry.ITEM, new Identifier("battlepack", "wooden_battle_axe"), new wooden_battleaxe(new woodmaterial()));
		Registry.register(Registry.ITEM, new Identifier("battlepack", "stone_battle_axe"), new stone_battleaxe(new stonematerial()));
		Registry.register(Registry.ITEM, new Identifier("battlepack", "iron_battle_axe"), new iron_battleaxe(new ironmaterial()));
		Registry.register(Registry.ITEM, new Identifier("battlepack", "golden_battle_axe"), new golden_battleaxe(new goldmaterial()));
		Registry.register(Registry.ITEM, new Identifier("battlepack", "diamond_battle_axe"), new diamond_battleaxe(new diamondmaterial()));
		Registry.register(Registry.ITEM, new Identifier("battlepack", "netherite_battle_axe"), new netherite_battleaxe(new netheritematerial()));

	}
}
