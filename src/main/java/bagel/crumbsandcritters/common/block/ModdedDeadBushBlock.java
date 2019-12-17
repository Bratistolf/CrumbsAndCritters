package bagel.crumbsandcritters.common.block;

import bagel.crumbsandcritters.common.util.ModdedDamageSource;
import net.minecraft.block.BlockState;
import net.minecraft.block.DeadBushBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

@SuppressWarnings("deprecation")
public class ModdedDeadBushBlock extends DeadBushBlock implements net.minecraftforge.common.IShearable {

   public ModdedDeadBushBlock(Properties properties) {
      super(properties);
   }
   
   public void onEntityCollision(BlockState state, World worldIn, BlockPos pos, Entity entityIn) {
	      if (entityIn instanceof LivingEntity && entityIn.getType() != EntityType.field_226289_e_) {
	         entityIn.setMotionMultiplier(state, new Vec3d((double)0.8F, 0.75D, (double)0.8F));
	         if (!worldIn.isRemote && (entityIn.lastTickPosX != entityIn.func_226277_ct_() || entityIn.lastTickPosZ != entityIn.func_226281_cx_())) {
	            double d0 = Math.abs(entityIn.func_226277_ct_() - entityIn.lastTickPosX);
	            double d1 = Math.abs(entityIn.func_226281_cx_() - entityIn.lastTickPosZ);
	            if (d0 >= (double)0.003F || d1 >= (double)0.003F) {
	               entityIn.attackEntityFrom(ModdedDamageSource.DEADBUSH, 1.0F);
	            }
	         }

	      }
	   }
}
