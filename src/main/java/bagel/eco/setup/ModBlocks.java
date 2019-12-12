package bagel.eco.setup;

import bagel.eco.common.block.ModdedDeadBushBlock;
import bagel.eco.common.block.MudBlock;
import bagel.eco.common.block.WaterSaplingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.DoublePlantBlock;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.LogBlock;
import net.minecraft.block.PressurePlateBlock;
import net.minecraft.block.RotatedPillarBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.block.WoodButtonBlock;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.block.trees.OakTree;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModBlocks
{
	public static Block mangrove_log;
	public static Block mangrove_wood;
	public static Block stripped_mangrove_log;
	public static Block stripped_mangrove_wood;
	public static Block mangrove_leaves;
	public static Block mangrove_planks;
	public static Block mangrove_button;
	public static Block mangrove_fence;
	public static Block mangrove_fence_gate;
	public static Block mangrove_pressure_plate;
	public static Block mangrove_slab;
	public static Block mangrove_stairs;
	public static Block mangrove_sapling;
	public static Block mangrove_trapdoor;
	public static Block mangrove_door;
	public static Block mangrove_sign;
	
	public static Block mud_block;
	public static Block mud_bricks;
	public static Block mud_brick_stairs;
	public static Block mud_brick_slab;
	public static Block mud_brick_wall;
	
	public static Block basalt;
	public static Block basalt_stairs;
	public static Block basalt_slab;
	public static Block basalt_wall;
	public static Block polished_basalt;
	public static Block polished_basalt_stairs;
	public static Block polished_basalt_slab;
	
	public static Block limestone;
	public static Block limestone_stairs;
	public static Block limestone_slab;
	public static Block limestone_wall;
	public static Block polished_limestone;
	public static Block polished_limestone_stairs;
	public static Block polished_limestone_slab;
	
	public static Block marble;
	public static Block marble_stairs;
	public static Block marble_slab;
	public static Block marble_wall;
	public static Block polished_marble;
	public static Block polished_marble_stairs;
	public static Block polished_marble_slab;
	
	public static Block dead_bush;
	public static Block cattails;
	public static Block duckweed;

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event)
    {
    	
        mud_block = registerBlock(new MudBlock(Block.Properties.create(Material.EARTH).tickRandomly().hardnessAndResistance(0.5F, 2.5F).sound(SoundType.SLIME)), "mud_block", ItemGroup.BUILDING_BLOCKS);
        mud_bricks = registerBlock(new Block(Block.Properties.create(Material.ROCK, MaterialColor.BROWN_TERRACOTTA).hardnessAndResistance(2.0F, 30.0F)), "mud_bricks", ItemGroup.BUILDING_BLOCKS);
        mud_brick_stairs = registerBlock(new StairsBlock(() -> mud_bricks.getDefaultState(), Block.Properties.from(mud_bricks)), "mud_brick_stairs", ItemGroup.BUILDING_BLOCKS);
        mud_brick_slab = registerBlock(new SlabBlock(Block.Properties.from(mud_bricks)), "mud_brick_slab", ItemGroup.BUILDING_BLOCKS);
        mud_brick_wall = registerBlock(new WallBlock(Block.Properties.from(mud_bricks)),"mud_brick_wall", ItemGroup.BUILDING_BLOCKS);
        
        basalt = registerBlock(new Block(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F)), "basalt", ItemGroup.BUILDING_BLOCKS);
        basalt_stairs = registerBlock(new StairsBlock(() -> basalt.getDefaultState(), Block.Properties.from(basalt)), "basalt_stairs", ItemGroup.BUILDING_BLOCKS);
        basalt_slab = registerBlock(new SlabBlock(Block.Properties.from(basalt)), "basalt_slab", ItemGroup.BUILDING_BLOCKS);
        basalt_wall = registerBlock(new WallBlock(Block.Properties.from(basalt)),"basalt_wall", ItemGroup.BUILDING_BLOCKS);
        polished_basalt = registerBlock(new Block(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(1.5F, 6.0F)), "polished_basalt", ItemGroup.BUILDING_BLOCKS);
        polished_basalt_stairs = registerBlock(new StairsBlock(() -> polished_basalt.getDefaultState(), Block.Properties.from(polished_basalt)), "polished_basalt_stairs", ItemGroup.BUILDING_BLOCKS);
        polished_basalt_slab = registerBlock(new SlabBlock(Block.Properties.from(polished_basalt)), "polished_basalt_slab", ItemGroup.BUILDING_BLOCKS);
        
        limestone = registerBlock(new Block(Block.Properties.create(Material.ROCK, MaterialColor.WHITE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F)), "limestone", ItemGroup.BUILDING_BLOCKS);
        limestone_stairs = registerBlock(new StairsBlock(() -> limestone.getDefaultState(), Block.Properties.from(limestone)), "limestone_stairs", ItemGroup.BUILDING_BLOCKS);
        limestone_slab = registerBlock(new SlabBlock(Block.Properties.from(limestone)), "limestone_slab", ItemGroup.BUILDING_BLOCKS);
        limestone_wall = registerBlock(new WallBlock(Block.Properties.from(limestone)),"limestone_wall", ItemGroup.BUILDING_BLOCKS);
        polished_limestone = registerBlock(new Block(Block.Properties.create(Material.ROCK, MaterialColor.WHITE_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F)), "polished_limestone", ItemGroup.BUILDING_BLOCKS);
        polished_limestone_stairs = registerBlock(new StairsBlock(() -> polished_limestone.getDefaultState(), Block.Properties.from(polished_limestone)), "polished_limestone_stairs", ItemGroup.BUILDING_BLOCKS);
        polished_limestone_slab = registerBlock(new SlabBlock(Block.Properties.from(polished_limestone)), "polished_limestone_slab", ItemGroup.BUILDING_BLOCKS);
        
        marble = registerBlock(new Block(Block.Properties.create(Material.ROCK, MaterialColor.SNOW).hardnessAndResistance(1.5F, 6.0F)), "marble", ItemGroup.BUILDING_BLOCKS);
        marble_stairs = registerBlock(new StairsBlock(() -> marble.getDefaultState(), Block.Properties.from(marble)), "marble_stairs", ItemGroup.BUILDING_BLOCKS);
        marble_slab = registerBlock(new SlabBlock(Block.Properties.from(marble)), "marble_slab", ItemGroup.BUILDING_BLOCKS);
        marble_wall = registerBlock(new WallBlock(Block.Properties.from(marble)),"marble_wall", ItemGroup.BUILDING_BLOCKS);
        polished_marble = registerBlock(new Block(Block.Properties.create(Material.ROCK, MaterialColor.SNOW).hardnessAndResistance(1.5F, 6.0F)), "polished_marble", ItemGroup.BUILDING_BLOCKS);
        polished_marble_stairs = registerBlock(new StairsBlock(() -> polished_marble.getDefaultState(), Block.Properties.from(polished_marble)), "polished_marble_stairs", ItemGroup.BUILDING_BLOCKS);
        polished_marble_slab = registerBlock(new SlabBlock(Block.Properties.from(polished_marble)), "polished_marble_slab", ItemGroup.BUILDING_BLOCKS);
        
        mangrove_sapling = registerBlock(new WaterSaplingBlock(new OakTree(), Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().zeroHardnessAndResistance().sound(SoundType.PLANT)), "mangrove_sapling", ItemGroup.DECORATIONS);
        mangrove_leaves = registerBlock(new LeavesBlock(Block.Properties.create(Material.LEAVES, MaterialColor.EMERALD).hardnessAndResistance(0.2F).tickRandomly().sound(SoundType.PLANT)), "mangrove_leaves", ItemGroup.BUILDING_BLOCKS);
        mangrove_log = registerBlock(new LogBlock(MaterialColor.LIME_TERRACOTTA, Block.Properties.create(Material.WOOD, MaterialColor.LIGHT_GRAY_TERRACOTTA).hardnessAndResistance(2.0F).sound(SoundType.WOOD)), "mangrove_log", ItemGroup.BUILDING_BLOCKS);
        mangrove_wood = registerBlock(new RotatedPillarBlock(Block.Properties.create(Material.WOOD, MaterialColor.WHITE_TERRACOTTA).hardnessAndResistance(2.0F).sound(SoundType.WOOD)), "mangrove_wood", ItemGroup.BUILDING_BLOCKS);
        stripped_mangrove_log = registerBlock(new LogBlock(MaterialColor.LIME_TERRACOTTA, Block.Properties.create(Material.WOOD, MaterialColor.WHITE_TERRACOTTA).hardnessAndResistance(2.0F).sound(SoundType.WOOD)), "stripped_mangrove_log", ItemGroup.BUILDING_BLOCKS);
        stripped_mangrove_wood = registerBlock(new RotatedPillarBlock(Block.Properties.create(Material.WOOD, MaterialColor.WHITE_TERRACOTTA).hardnessAndResistance(2.0F).sound(SoundType.WOOD)), "stripped_mangrove_wood", ItemGroup.BUILDING_BLOCKS);
        mangrove_planks = registerBlock(new Block(Block.Properties.create(Material.WOOD, MaterialColor.WHITE_TERRACOTTA).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)), "mangrove_planks", ItemGroup.BUILDING_BLOCKS);
        mangrove_stairs = registerBlock(new StairsBlock(() -> mangrove_planks.getDefaultState(), Block.Properties.from(mangrove_planks)), "mangrove_stairs", ItemGroup.BUILDING_BLOCKS);
        mangrove_slab = registerBlock(new SlabBlock(Block.Properties.create(Material.WOOD, MaterialColor.WHITE_TERRACOTTA).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)), "mangrove_slab", ItemGroup.BUILDING_BLOCKS);
        mangrove_fence = registerBlock(new FenceBlock(Block.Properties.create(Material.WOOD, mangrove_planks.materialColor).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)), "mangrove_fence", ItemGroup.DECORATIONS);
        mangrove_fence_gate = registerBlock(new FenceGateBlock(Block.Properties.create(Material.WOOD, mangrove_planks.materialColor).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)), "mangrove_fence_gate", ItemGroup.REDSTONE);
        //mangrove_door = registerBlock(new DoorBlock(Block.Properties.create(Material.WOOD, mangrove_planks.materialColor).hardnessAndResistance(3.0F).sound(SoundType.WOOD)), "mangrove_door", ItemGroup.REDSTONE);
        //mangrove_trapdoor = registerBlock(new TrapDoorBlock(Block.Properties.create(Material.WOOD, MaterialColor.WHITE_TERRACOTTA).hardnessAndResistance(3.0F).sound(SoundType.WOOD)), "mangrove_trapdoor", ItemGroup.REDSTONE);
        mangrove_pressure_plate = registerBlock(new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, Block.Properties.create(Material.WOOD, mangrove_planks.materialColor).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)), "mangrove_pressure_plate", ItemGroup.REDSTONE);
        mangrove_button = registerBlock(new WoodButtonBlock(Block.Properties.create(Material.MISCELLANEOUS).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)), "mangrove_button", ItemGroup.REDSTONE);
        
        dead_bush = registerBlock(new ModdedDeadBushBlock(Block.Properties.from(Blocks.DEAD_BUSH)), "minecraft:dead_bush", ItemGroup.DECORATIONS);
        cattails = registerBlock(new DoublePlantBlock(Block.Properties.create(Material.PLANTS).tickRandomly().doesNotBlockMovement().zeroHardnessAndResistance().sound(SoundType.PLANT)), "cattails", ItemGroup.DECORATIONS);
    }
   

    public static Block registerBlock(Block block, String name, ItemGroup group)
    {
        BlockItem itemBlock = new BlockItem(block, new Item.Properties().group(group));
        block.setRegistryName(name);
        itemBlock.setRegistryName(name);
        ForgeRegistries.BLOCKS.register(block);
        ForgeRegistries.ITEMS.register(itemBlock);
        return block;
    }

    public static Block registerBlockNoGroup(Block block, String name)
    {
        BlockItem itemBlock = new BlockItem(block, new Item.Properties().group(null));
        block.setRegistryName(name);
        itemBlock.setRegistryName(name);
        ForgeRegistries.BLOCKS.register(block);
        ForgeRegistries.ITEMS.register(itemBlock);
        return block;
    }
    
    public static Block registerBlock(Block block, BlockItem itemBlock, String name) {
        block.setRegistryName(name);
        ForgeRegistries.BLOCKS.register(block);

        if (itemBlock != null) {
            itemBlock.setRegistryName(name);
            ForgeRegistries.ITEMS.register(itemBlock);
        }

        return block;
    }
}