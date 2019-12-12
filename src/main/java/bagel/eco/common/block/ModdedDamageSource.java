package bagel.eco.common.block;

import net.minecraft.util.DamageSource;

public class ModdedDamageSource extends DamageSource {
	public ModdedDamageSource(String damageTypeIn) {
		super(damageTypeIn);
	}
	
	public static final DamageSource DEADBUSH = new DamageSource("dead_bush");
	
}
