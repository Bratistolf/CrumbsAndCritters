package bagel.eco.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.passive.PigEntity;
import net.minecraft.pathfinding.PathType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;

public class MudBlock extends Block {
	   protected static final VoxelShape SHAPE = Block.makeCuboidShape(1.0D, 0.0D, 1.0D, 15.0D, 15.0D, 15.0D);

	   public MudBlock(Block.Properties properties) {
	      super(properties);
	   }
	   
	   public boolean isStickyBlock(BlockState state) {
	        return true;
	    }

	   public VoxelShape getCollisionShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
	      return SHAPE;
	   }

	   public void onEntityCollision(BlockState state, World worldIn, BlockPos pos, Entity entityIn) 
	   {
		   if(!(entityIn instanceof PigEntity))
		   {
			   entityIn.setMotionMultiplier(state, new Vec3d(0.5D, (double)0.15F, 0.5D));
		   }
	   }

	   public void neighborChanged(BlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos, boolean isMoving) {
	      worldIn.getPendingBlockTicks().scheduleTick(pos, this, this.tickRate(worldIn));
	   }

	   public boolean isNormalCube(BlockState state, IBlockReader worldIn, BlockPos pos) {
	      return true;
	   }

	   /**
	    * How many world ticks before ticking
	    */
	   public int tickRate(IWorldReader worldIn) {
	      return 20;
	   }

	   public void onBlockAdded(BlockState state, World worldIn, BlockPos pos, BlockState oldState, boolean isMoving) {
	      worldIn.getPendingBlockTicks().scheduleTick(pos, this, this.tickRate(worldIn));
	   }

	   public boolean allowsMovement(BlockState state, IBlockReader worldIn, BlockPos pos, PathType type) {
	      return false;
	   }

	   public boolean canEntitySpawn(BlockState state, IBlockReader worldIn, BlockPos pos, EntityType<?> type) {
	      return true;
	   }
	   
	   public void onFallenUpon(World worldIn, BlockPos pos, Entity entityIn, float fallDistance) {
		         entityIn.fall(fallDistance, 0.0F);
	   }


		   public void onLanded(IBlockReader worldIn, Entity entityIn) {
		         Vec3d vec3d = entityIn.getMotion();
		         if (vec3d.y < 0.0D) {
		            double d0 = entityIn instanceof LivingEntity ? 0.0D : 0.0D;
		            entityIn.setMotion(vec3d.x, -vec3d.y * d0, vec3d.z);
		         }
		   }
}
