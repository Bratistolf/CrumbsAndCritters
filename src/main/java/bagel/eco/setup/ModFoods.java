package bagel.eco.setup;

import net.minecraft.item.Food;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class ModFoods {

	public static Food frog_leg;
	public static Food cooked_frog_leg;
	
	public static Food berry_pie;
	public static Food prickly_pear;
	public static Food onion;
	public static Food cheese;
	public static Food grapes;
	public static Food corn;
	public static Food lettuce;
	public static Food salt;
	public static Food coffee_bean;
	public static Food red_pepper;
	public static Food yellow_pepper;
	public static Food green_pepper;
	public static Food tomato;
	public static Food cucumber;
	public static Food eggplant;
	public static Food coconut;
	public static Food banana;
	public static Food strawberry;
	public static Food blueberries;
	public static Food pear;
	public static Food pineapple;
	public static Food orange;
	
	static {
		frog_leg = (new Food.Builder()).hunger(3).saturation(0.2F).fastToEat().effect(new EffectInstance(Effects.JUMP_BOOST, 160, 0), 0.2F).setAlwaysEdible().build();
		cooked_frog_leg = (new Food.Builder()).hunger(5).saturation(0.3F).fastToEat().effect(new EffectInstance(Effects.JUMP_BOOST, 220, 1), 0.6F).setAlwaysEdible().build();
		
		berry_pie = (new Food.Builder()).hunger(4).saturation(0.6F).build();
		prickly_pear = (new Food.Builder()).hunger(4).saturation(0.6F).build();
		onion = (new Food.Builder()).hunger(4).saturation(0.6F).build();
		cheese = (new Food.Builder()).hunger(4).saturation(0.6F).build();
		grapes = (new Food.Builder()).hunger(4).saturation(0.6F).build();
		corn = (new Food.Builder()).hunger(4).saturation(0.6F).build();
		lettuce = (new Food.Builder()).hunger(4).saturation(0.6F).build();
		salt = (new Food.Builder()).hunger(4).saturation(0.6F).build();
		coffee_bean = (new Food.Builder()).hunger(4).saturation(0.6F).build();
		red_pepper = (new Food.Builder()).hunger(4).saturation(0.6F).build();
		yellow_pepper = (new Food.Builder()).hunger(4).saturation(0.6F).build();
		green_pepper = (new Food.Builder()).hunger(4).saturation(0.6F).build();
		tomato = (new Food.Builder()).hunger(4).saturation(0.6F).build();
		cucumber = (new Food.Builder()).hunger(4).saturation(0.6F).build();
		eggplant = (new Food.Builder()).hunger(4).saturation(0.6F).build();
		coconut = (new Food.Builder()).hunger(4).saturation(0.6F).build();
		banana = (new Food.Builder()).hunger(4).saturation(0.6F).build();
		strawberry = (new Food.Builder()).hunger(4).saturation(0.6F).build();
		blueberries = (new Food.Builder()).hunger(4).saturation(0.6F).build();
		pear = (new Food.Builder()).hunger(4).saturation(0.6F).build();
		pineapple = (new Food.Builder()).hunger(4).saturation(0.6F).build();
		orange = (new Food.Builder()).hunger(4).saturation(0.6F).build();
	}
}
