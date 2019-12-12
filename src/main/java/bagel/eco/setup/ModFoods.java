package bagel.eco.setup;

import net.minecraft.item.Food;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class ModFoods {

	public static Food frog_leg;
	public static Food cooked_frog_leg;
	public static Food prickly_pear;
	
	static {
		frog_leg = (new Food.Builder()).hunger(3).saturation(0.2F).fastToEat().effect(new EffectInstance(Effects.JUMP_BOOST, 160, 0), 0.2F).setAlwaysEdible().build();
		cooked_frog_leg = (new Food.Builder()).hunger(5).saturation(0.3F).fastToEat().effect(new EffectInstance(Effects.JUMP_BOOST, 220, 1), 0.6F).setAlwaysEdible().build();
		prickly_pear = (new Food.Builder()).hunger(4).saturation(0.6F).build();
	}
}
