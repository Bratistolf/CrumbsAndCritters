package bagel.crumbsandcritters.setup;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModItems
{
	public static Item frog_leg;
	public static Item cooked_frog_leg;

	public static Item berry_pie;
	public static Item prickly_pear;
	public static Item onion;
	public static Item cheese;
	public static Item grapes;
	public static Item corn;
	public static Item lettuce;
	public static Item salt;
	public static Item coffee_bean;
	public static Item red_pepper;
	public static Item yellow_pepper;
	public static Item green_pepper;
	public static Item tomato;
	public static Item cucumber;
	public static Item eggplant;
	public static Item coconut;
	public static Item banana;
	public static Item strawberry;
	public static Item blueberries;
	public static Item pear;
	public static Item pineapple;
	public static Item orange;
	
	public static Item mud_glob;
	
	public static Item mangrove_boat;
	
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event)
	{
        mud_glob = registerItem(new Item(new Item.Properties().group(ItemGroup.MISC)), "mud_glob");
    	frog_leg = registerItem(new Item(new Item.Properties().food(ModFoods.frog_leg).group(ItemGroup.FOOD)), "frog_leg");
    	cooked_frog_leg = registerItem(new Item(new Item.Properties().food(ModFoods.cooked_frog_leg).group(ItemGroup.FOOD)), "cooked_frog_leg");
    	prickly_pear = registerItem(new Item(new Item.Properties().food(ModFoods.prickly_pear).group(ItemGroup.FOOD)), "prickly_pear");
    	berry_pie = registerItem(new Item(new Item.Properties().food(ModFoods.berry_pie).group(ItemGroup.FOOD)), "berry_pie");
    	onion = registerItem(new Item(new Item.Properties().food(ModFoods.onion).group(ItemGroup.FOOD)), "onion");
    	cheese = registerItem(new Item(new Item.Properties().food(ModFoods.cheese).group(ItemGroup.FOOD)), "cheese");
    	grapes = registerItem(new Item(new Item.Properties().food(ModFoods.grapes).group(ItemGroup.FOOD)), "grapes");
    	corn = registerItem(new Item(new Item.Properties().food(ModFoods.corn).group(ItemGroup.FOOD)), "corn");
    	lettuce = registerItem(new Item(new Item.Properties().food(ModFoods.lettuce).group(ItemGroup.FOOD)), "lettuce");
    	salt = registerItem(new Item(new Item.Properties().group(ItemGroup.FOOD)), "salt");
    	coffee_bean = registerItem(new Item(new Item.Properties().group(ItemGroup.FOOD)), "coffee_bean");
    	red_pepper = registerItem(new Item(new Item.Properties().food(ModFoods.red_pepper).group(ItemGroup.FOOD)), "red_pepper");
    	yellow_pepper = registerItem(new Item(new Item.Properties().food(ModFoods.green_pepper).group(ItemGroup.FOOD)), "yellow_pepper");
    	green_pepper = registerItem(new Item(new Item.Properties().food(ModFoods.yellow_pepper).group(ItemGroup.FOOD)), "green_pepper");
    	tomato = registerItem(new Item(new Item.Properties().food(ModFoods.tomato).group(ItemGroup.FOOD)), "tomato");
    	cucumber = registerItem(new Item(new Item.Properties().food(ModFoods.cucumber).group(ItemGroup.FOOD)), "cucumber");
    	eggplant = registerItem(new Item(new Item.Properties().food(ModFoods.eggplant).group(ItemGroup.FOOD)), "eggplant");
    	coconut = registerItem(new Item(new Item.Properties().food(ModFoods.coconut).group(ItemGroup.FOOD)), "coconut");
    	banana = registerItem(new Item(new Item.Properties().food(ModFoods.banana).group(ItemGroup.FOOD)), "banana");
    	//strawberry = registerItem(new Item(new Item.Properties().food(ModFoods.strawberry).group(ItemGroup.FOOD)), "strawberry");
    	blueberries = registerItem(new Item(new Item.Properties().food(ModFoods.blueberries).group(ItemGroup.FOOD)), "blueberries");
    	//pear = registerItem(new Item(new Item.Properties().food(ModFoods.pear).group(ItemGroup.FOOD)), "pear");
    	//pineapple = registerItem(new Item(new Item.Properties().food(ModFoods.pineapple).group(ItemGroup.FOOD)), "pineapple");
    	orange = registerItem(new Item(new Item.Properties().food(ModFoods.orange).group(ItemGroup.FOOD)), "orange");
	}

    public static Item registerItem(Item item, String name)
    {
    	item.setRegistryName(name);
        ForgeRegistries.ITEMS.register(item);
        return item;
    }
}