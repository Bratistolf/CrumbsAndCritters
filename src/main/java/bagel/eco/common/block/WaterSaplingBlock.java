package bagel.eco.common.block;

import java.util.Random;

import javax.annotation.Nullable;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.BushBlock;
import net.minecraft.block.IGrowable;
import net.minecraft.block.ILiquidContainer;
import net.minecraft.block.trees.Tree;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.Fluids;
import net.minecraft.fluid.IFluidState;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

@SuppressWarnings("deprecation")
public class WaterSaplingBlock extends BushBlock implements IGrowable, ILiquidContainer, net.minecraftforge.common.IShearable {
	   public static final IntegerProperty STAGE = BlockStateProperties.STAGE_0_1;
	   protected static final VoxelShape SHAPE = Block.makeCuboidShape(2.0D, 0.0D, 2.0D, 14.0D, 12.0D, 14.0D);
	   private final Tree tree;

   public WaterSaplingBlock(Tree p_i48337_1_, Block.Properties properties) {
	      super(properties);
	      this.tree = p_i48337_1_;
	      this.setDefaultState(this.stateContainer.getBaseState().with(STAGE, Integer.valueOf(0)));
	   }

   public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
      return SHAPE;
   }

   protected boolean isValidGround(BlockState state, IBlockReader worldIn, BlockPos pos) {
      return state.func_224755_d(worldIn, pos, Direction.UP) && state.getBlock() == Blocks.DIRT;
   }

   @Nullable
   public BlockState getStateForPlacement(BlockItemUseContext context) {
      IFluidState ifluidstate = context.getWorld().getFluidState(context.getPos());
      return ifluidstate.isTagged(FluidTags.WATER) && ifluidstate.getLevel() == 8 ? super.getStateForPlacement(context) : null;
   }

   /**
    * Update the provided state given the provided neighbor facing and neighbor state, returning a new state.
    * For example, fences make their connections to the passed in state if possible, and wet concrete powder immediately
    * returns its solidified counterpart.
    * Note that this method should ideally consider only the specific face passed in.
    */
   public BlockState updatePostPlacement(BlockState stateIn, Direction facing, BlockState facingState, IWorld worldIn, BlockPos currentPos, BlockPos facingPos) {
      BlockState blockstate = super.updatePostPlacement(stateIn, facing, facingState, worldIn, currentPos, facingPos);
      if (!blockstate.isAir()) {
         worldIn.getPendingFluidTicks().scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickRate(worldIn));
      }

      return blockstate;
   }

   /**
    * Whether this IGrowable can grow
    */
   public boolean canGrow(IBlockReader worldIn, BlockPos pos, BlockState state, boolean isClient) {
      return true;
   }

   public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, BlockState state) {
	  return (double)worldIn.rand.nextFloat() < 0.45D;
   }

   public IFluidState getFluidState(BlockState state) {
      return Fluids.WATER.getStillFluidState(false);
   }

   public void grow(IWorld worldIn, BlockPos pos, BlockState state, Random rand) {
	      if (state.get(STAGE) == 0) {
	         worldIn.setBlockState(pos, state.cycle(STAGE), 4);
	      } else {
	         if (!net.minecraftforge.event.ForgeEventFactory.saplingGrowTree(worldIn, rand, pos)) return;
	         this.tree.spawn(worldIn, pos, state, rand);
	      }

	   }
   
   public void grow(World worldIn, Random rand, BlockPos pos, BlockState state) {
	  this.grow(worldIn, pos, state, rand);
      }


   public boolean canContainFluid(IBlockReader worldIn, BlockPos pos, BlockState state, Fluid fluidIn) {
      return false;
   }

   public boolean receiveFluid(IWorld worldIn, BlockPos pos, BlockState state, IFluidState fluidStateIn) {
      return false;
   }
   

	   protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
	      builder.add(STAGE);
	   }
}