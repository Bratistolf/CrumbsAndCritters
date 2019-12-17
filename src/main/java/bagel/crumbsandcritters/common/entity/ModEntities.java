/*package bagel.crumbsandcritters.common.entity;

import bagel.crumbsandcritters.setup.CrumbsAndCritters;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEntities {
	
	@ObjectHolder("crumbsandcritters:frog")
	public static EntityType<FrogEntity> FROG;
	
	@SubscribeEvent
	public static void onEntityRegistry(final RegistryEvent.Register<EntityType<?>> event) {
        event.getRegistry().register(EntityType.Builder.create(FrogEntity::new, EntityClassification.CREATURE)
                .size(0.5F, 0.5F)
                .setShouldReceiveVelocityUpdates(false)
                .build("frog").setRegistryName(CrumbsAndCritters.modid, "frog"));
    }
	
	@SubscribeEvent
	public static void registerModels(ModelRegistryEvent event) {
		RenderingRegistry.registerEntityRenderingHandler(FrogEntity.class, FrogRenderer::new);
	}
	
	public static Item registerItem(Item item, String name)
    {
    	item.setRegistryName(name);
        ForgeRegistries.ITEMS.register(item);
        return item;
    }
}

*/
/*

package bagel.crumbsandcritters.common.entity;

import java.util.List;
import java.util.Random;
import com.google.common.collect.Lists;

import bagel.crumbsandcritters.setup.CrumbsAndCritters;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntitySpawnPlacementRegistry;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.Heightmap;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEntities {

public static final DeferredRegister<EntityType<?>> ENTITIES = new DeferredRegister<>(ForgeRegistries.ENTITIES, CrumbsAndCritters.modid);
	
	private static List<EntityType<?>> entities = Lists.newArrayList();
	
	
	public static final EntityType<FrogEntity> FROG = createEntity(FrogEntity::new, EntityClassification.CREATURE, "frog", 0.5F, 0.5F, 14596231, 16744272);
	
	
	
	private static <T extends Entity> EntityType<T> createEntity(EntityType.IFactory<T> factory, EntityClassification entityClassification, String name, float width, float height, int eggPrimary, int eggSecondary) {
		ResourceLocation location = new ResourceLocation(CrumbsAndCritters.modid, name);
        
		EntityType<T> entity = EntityType.Builder.create(factory, entityClassification)
			.size(width, height).setTrackingRange(64)
			.setShouldReceiveVelocityUpdates(true)
			.setUpdateInterval(3)
			.build(location.toString());
        
		entity.setRegistryName(location);
        
		entities.add(entity);
		spawnEggs.add(createSpawnEggForEntity(entity, eggPrimary, eggSecondary, ItemGroup.MISC));

		return entity;
	}
    
	@SubscribeEvent
	public static void registerEntities(RegistryEvent.Register<EntityType<?>> event) {
		for(EntityType<?> entity : entities) {
			event.getRegistry().register(entity);
		}
		EntitySpawnPlacementRegistry.register(FROG, EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ModEntities::swampCondition);
	}
	
	
	
	public static boolean swampCondition(EntityType<FrogEntity> p_223366_0_, IWorld p_223366_1_, SpawnReason reason, BlockPos p_223366_3_, Random randomIn) {
	      if (p_223366_1_.getWorldInfo().getGenerator().handleSlimeSpawnReduction(randomIn, p_223366_1_) && randomIn.nextInt(4) != 1) {
	         return false;
	      } else {
	         Biome biome = p_223366_1_.getBiome(p_223366_3_);
	         if (biome == Biomes.SWAMP && p_223366_3_.getY() > 50 && p_223366_3_.getY() < 70 && randomIn.nextFloat() < 0.8F ) {
	            return MobEntity.func_223315_a(p_223366_0_, p_223366_1_, reason, p_223366_3_, randomIn);
	         }
	         return false;
	      }
	   }
	
	@SubscribeEvent
	public static void registerModels(ModelRegistryEvent event) {
		RenderingRegistry.registerEntityRenderingHandler(FrogEntity.class, FrogRenderer::new);
	}
}
*/