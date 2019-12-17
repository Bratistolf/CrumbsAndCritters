package bagel.crumbsandcritters.common.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.goal.BreedGoal;
import net.minecraft.entity.ai.goal.LookAtGoal;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.ai.goal.TemptGoal;
import net.minecraft.entity.ai.goal.WaterAvoidingRandomWalkingGoal;
import net.minecraft.entity.passive.ParrotEntity;
import net.minecraft.entity.passive.RabbitEntity;
import net.minecraft.entity.passive.WolfEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.world.World;

public class FrogEntity extends RabbitEntity {

	public FrogEntity(EntityType<? extends FrogEntity> type, World worldIn) {
        super(type, worldIn);
    }
	
	@Override
	protected void registerGoals() {
	      this.goalSelector.addGoal(1, new SwimGoal(this));
	      this.goalSelector.addGoal(1, new FrogEntity.PanicGoal(this, 2.2D));
	      this.goalSelector.addGoal(2, new BreedGoal(this, 0.8D));
	      this.goalSelector.addGoal(3, new TemptGoal(this, 1.0D, Ingredient.fromItems(Items.SCUTE, Items.RABBIT), false));
	      this.goalSelector.addGoal(4, new FrogEntity.AvoidEntityGoal<>(this, PlayerEntity.class, 8.0F, 2.2D, 2.2D));
	      this.goalSelector.addGoal(4, new FrogEntity.AvoidEntityGoal<>(this, WolfEntity.class, 10.0F, 2.2D, 2.2D));
	      this.goalSelector.addGoal(4, new FrogEntity.AvoidEntityGoal<>(this, ParrotEntity.class, 4.0F, 2.2D, 2.2D));
	      this.goalSelector.addGoal(6, new WaterAvoidingRandomWalkingGoal(this, 0.6D));
	      this.goalSelector.addGoal(11, new LookAtGoal(this, PlayerEntity.class, 10.0F));
	   }
	
	static class AvoidEntityGoal<T extends LivingEntity> extends net.minecraft.entity.ai.goal.AvoidEntityGoal<T> {
	      public AvoidEntityGoal(FrogEntity frog, Class<T> p_i46403_2_, float p_i46403_3_, double p_i46403_4_, double p_i46403_6_) {
	         super(frog, p_i46403_2_, p_i46403_3_, p_i46403_4_, p_i46403_6_);
	      }
	      public boolean shouldExecute() {
	         return super.shouldExecute();
	      }
	   }
	
	   static class PanicGoal extends net.minecraft.entity.ai.goal.PanicGoal {
		      private final FrogEntity frog;

		      public PanicGoal(FrogEntity frog, double speedIn) {
		         super(frog, speedIn);
		         this.frog = frog;
		      }

		      /**
		       * Keep ticking a continuous task that has already been started
		       */
		      public void tick() {
		         super.tick();
		         this.frog.setMovementSpeed(this.speed);
		      }
		   }
}
