package bagel.eco.setup;

import net.minecraftforge.event.village.WandererTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraft.entity.merchant.villager.VillagerProfession;
import net.minecraftforge.event.village.VillagerTradesEvent;

@Mod.EventBusSubscriber(modid = Eco.modid)
public class VillagerTrades {
	
	@SubscribeEvent
	public static void onVillagerTradesEvent(VillagerTradesEvent event) {
		if(event.getType() == VillagerProfession.FISHERMAN) {
        event.getTrades().get(5).add(new EntityUtil.EmeraldsForItemsTrade(ModItems.cheese, 8, 1, 5, 15));			
        event.getTrades().get(5).add(new EntityUtil.ItemsForEmeraldsTrade(ModItems.mud_glob, 1, 1, 5, 0));	
        event.getTrades().get(5).add(new EntityUtil.ItemsForEmeraldsAndItemsTrade(ModItems.mud_glob, 6, ModItems.cheese, 6, 16, 15));
		}
	}
    
	@SubscribeEvent
	public static void onWandererTradesEvent(WandererTradesEvent event) {
		event.getGenericTrades().add(new EntityUtil.ItemsForEmeraldsTrade(ModItems.coffee_bean, 1, 5, 8, 1));
		event.getGenericTrades().add(new EntityUtil.ItemsForEmeraldsTrade(ModItems.eggplant, 1, 3, 8, 1));
		event.getGenericTrades().add(new EntityUtil.ItemsForEmeraldsTrade(ModItems.red_pepper, 1, 2, 8, 1));
		event.getGenericTrades().add(new EntityUtil.ItemsForEmeraldsTrade(ModItems.yellow_pepper, 1, 2, 8, 1));
		event.getGenericTrades().add(new EntityUtil.ItemsForEmeraldsTrade(ModItems.green_pepper, 1, 3, 8, 1));
	}
}