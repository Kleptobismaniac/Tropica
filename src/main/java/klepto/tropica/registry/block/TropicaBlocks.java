package klepto.tropica.registry.block;

import klepto.tropica.Tropica;
import klepto.tropica.registry.item.TropicaItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSetType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.ButtonBlock;
import net.minecraft.block.CaveVinesBodyBlock;
import net.minecraft.block.CaveVinesHeadBlock;
import net.minecraft.block.CoralBlock;
import net.minecraft.block.CoralBlockBlock;
import net.minecraft.block.CoralFanBlock;
import net.minecraft.block.CoralWallFanBlock;
import net.minecraft.block.DeadCoralBlock;
import net.minecraft.block.DeadCoralFanBlock;
import net.minecraft.block.DeadCoralWallFanBlock;
import net.minecraft.block.DoorBlock;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.block.FernBlock;
import net.minecraft.block.GrassBlock;
import net.minecraft.block.PillarBlock;
import net.minecraft.block.PlantBlock;
import net.minecraft.block.PressurePlateBlock;
import net.minecraft.block.PropaguleBlock;
import net.minecraft.block.SandBlock;
import net.minecraft.block.SaplingBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.TallFlowerBlock;
import net.minecraft.block.TallPlantBlock;
import net.minecraft.block.TrapdoorBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.block.WoodType;
import net.minecraft.block.sapling.AcaciaSaplingGenerator;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;

public class TropicaBlocks {

    public static final BlockState DEFAULT_STAIR_STATE = Blocks.OAK_STAIRS.getDefaultState();


    private static final FabricBlockSettings LOG_SETTINGS = FabricBlockSettings.copyOf(Blocks.OAK_LOG);
    private static final FabricBlockSettings WOOD_SETTINGS = FabricBlockSettings.copyOf(Blocks.OAK_WOOD);
    private static final FabricBlockSettings STRIPPED_LOG_SETTINGS = FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG);
    private static final FabricBlockSettings STRIPPED_WOOD_SETTINGS = FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD);
    private static final FabricBlockSettings PLANKS_SETTINGS = FabricBlockSettings.copyOf(Blocks.OAK_PLANKS);
    private static final FabricBlockSettings WOODEN_SLAB_SETTINGS = FabricBlockSettings.copyOf(Blocks.OAK_SLAB);
    private static final FabricBlockSettings STONE_SLAB_SETTINGS = FabricBlockSettings.copyOf(Blocks.SANDSTONE_SLAB);
    private static final FabricBlockSettings WOODEN_STAIRS_SETTINGS = FabricBlockSettings.copyOf(Blocks.OAK_STAIRS);
    private static final FabricBlockSettings STONE_STAIRS_SETTINGS = FabricBlockSettings.copyOf(Blocks.SANDSTONE_STAIRS);
    private static final FabricBlockSettings BUTTON_SETTINGS = FabricBlockSettings.copyOf(Blocks.OAK_BUTTON);
    private static final FabricBlockSettings PRESSURE_PLATE_SETTINGS = FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE);
    private static final FabricBlockSettings FENCE_SETTINGS = FabricBlockSettings.copyOf(Blocks.OAK_FENCE);
    private static final FabricBlockSettings FENCE_GATE_SETTINGS = FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE);
    private static final FabricBlockSettings WALL_SETTINGS = FabricBlockSettings.copyOf(Blocks.SANDSTONE_WALL);
    private static final FabricBlockSettings TRAPDOOR_SETTINGS = FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR);
    private static final FabricBlockSettings DOOR_SETTINGS = FabricBlockSettings.copyOf(Blocks.OAK_DOOR);
    private static final FabricBlockSettings SIGN_SETTINGS = FabricBlockSettings.copyOf(Blocks.OAK_SIGN);
    private static final FabricBlockSettings WALL_SIGN_SETTINGS = FabricBlockSettings.copyOf(Blocks.OAK_WALL_SIGN);
    private static final FabricBlockSettings HANGING_SIGN_SETTINGS = FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN);
    private static final FabricBlockSettings WALL_HANGING_SIGN_SETTINGS = FabricBlockSettings.copyOf(Blocks.OAK_WALL_HANGING_SIGN);
    private static final FabricBlockSettings LEAVES_SETTINGS = FabricBlockSettings.copyOf(Blocks.OAK_LEAVES);

    public static final BlockSetType BLACK_MANGROVE_BLOCK_SET_TYPE = new BlockSetType("black_mangrove", true, BlockSoundGroup.WOOD, SoundEvents.BLOCK_WOODEN_DOOR_CLOSE, SoundEvents.BLOCK_WOODEN_DOOR_OPEN, SoundEvents.BLOCK_WOODEN_TRAPDOOR_CLOSE, SoundEvents.BLOCK_WOODEN_TRAPDOOR_OPEN, SoundEvents.BLOCK_WOODEN_PRESSURE_PLATE_CLICK_OFF, SoundEvents.BLOCK_WOODEN_PRESSURE_PLATE_CLICK_ON, SoundEvents.BLOCK_WOODEN_BUTTON_CLICK_OFF, SoundEvents.BLOCK_WOODEN_BUTTON_CLICK_ON);
    public static final BlockSetType COCONUT_BLOCK_SET_TYPE = new BlockSetType("coconut", true, BlockSoundGroup.WOOD, SoundEvents.BLOCK_WOODEN_DOOR_CLOSE, SoundEvents.BLOCK_WOODEN_DOOR_OPEN, SoundEvents.BLOCK_WOODEN_TRAPDOOR_CLOSE, SoundEvents.BLOCK_WOODEN_TRAPDOOR_OPEN, SoundEvents.BLOCK_WOODEN_PRESSURE_PLATE_CLICK_OFF, SoundEvents.BLOCK_WOODEN_PRESSURE_PLATE_CLICK_ON, SoundEvents.BLOCK_WOODEN_BUTTON_CLICK_OFF, SoundEvents.BLOCK_WOODEN_BUTTON_CLICK_ON);
    public static final BlockSetType AMARANTH_BLOCK_SET_TYPE = new BlockSetType("amaranth", true, BlockSoundGroup.WOOD, SoundEvents.BLOCK_WOODEN_DOOR_CLOSE, SoundEvents.BLOCK_WOODEN_DOOR_OPEN, SoundEvents.BLOCK_WOODEN_TRAPDOOR_CLOSE, SoundEvents.BLOCK_WOODEN_TRAPDOOR_OPEN, SoundEvents.BLOCK_WOODEN_PRESSURE_PLATE_CLICK_OFF, SoundEvents.BLOCK_WOODEN_PRESSURE_PLATE_CLICK_ON, SoundEvents.BLOCK_WOODEN_BUTTON_CLICK_OFF, SoundEvents.BLOCK_WOODEN_BUTTON_CLICK_ON);
    public static final WoodType BLACK_MANGROVE_WOOD_TYPE = new WoodType("black_mangrove", BLACK_MANGROVE_BLOCK_SET_TYPE);
    public static final WoodType COCONUT_WOOD_TYPE = new WoodType("coconut", COCONUT_BLOCK_SET_TYPE);
    public static final WoodType AMARANTH_WOOD_TYPE = new WoodType("amaranth", AMARANTH_BLOCK_SET_TYPE);


    
    //Wood
    public static final Block BLACK_MANGROVE_LOG = registerBlock("black_mangrove_log", new PillarBlock(LOG_SETTINGS));
    public static final Block COCONUT_LOG = registerBlock("coconut_log", new PillarBlock(LOG_SETTINGS));
    public static final Block AMARANTH_LOG = registerBlock("amaranth_log", new PillarBlock(LOG_SETTINGS));

    public static final Block STRIPPED_BLACK_MANGROVE_LOG = registerBlock("stripped_black_mangrove_log", new PillarBlock(STRIPPED_LOG_SETTINGS));
    public static final Block STRIPPED_COCONUT_LOG = registerBlock("stripped_coconut_log", new PillarBlock(STRIPPED_LOG_SETTINGS));
    public static final Block STRIPPED_AMARANTH_LOG = registerBlock("stripped_amaranth_log", new PillarBlock(STRIPPED_LOG_SETTINGS));

    public static final Block BLACK_MANGROVE_PLANK = registerBlock("black_mangrove_planks", new Block(PLANKS_SETTINGS));
    public static final Block AMARANTH_PLANK = registerBlock("amaranth_planks", new Block(PLANKS_SETTINGS));
    public static final Block COCONUT_PLANK = registerBlock("coconut_planks", new Block(PLANKS_SETTINGS));


    //Stairs
    public static final Block BLACK_MANGROVE_STAIRS = registerBlock("black_mangrove_stairs", new StairsBlock(DEFAULT_STAIR_STATE, WOODEN_STAIRS_SETTINGS));
    public static final Block COCONUT_STAIRS = registerBlock("coconut_stairs", new StairsBlock(DEFAULT_STAIR_STATE, WOODEN_STAIRS_SETTINGS));
    public static final Block AMARANTH_STAIRS = registerBlock("amaranth_stairs", new StairsBlock(DEFAULT_STAIR_STATE, WOODEN_STAIRS_SETTINGS));


    //Slabs
    public static final Block BLACK_MANGROVE_SLAB = registerBlock("black_mangrove_slab", new SlabBlock(WOODEN_SLAB_SETTINGS));
    public static final Block COCONUT_SLAB = registerBlock("coconut_slab", new SlabBlock(WOODEN_SLAB_SETTINGS));
    public static final Block AMARANTH_SLAB = registerBlock("amaranth_slab", new SlabBlock(WOODEN_SLAB_SETTINGS));


    //Doors
    public static final Block BLACK_MANGROVE_DOOR = registerBlock("black_mangrove_door", new DoorBlock(DOOR_SETTINGS, BLACK_MANGROVE_BLOCK_SET_TYPE));
    public static final Block AMARANTH_DOOR = registerBlock("amaranth_door", new DoorBlock(DOOR_SETTINGS, AMARANTH_BLOCK_SET_TYPE));
    public static final Block COCONUT_DOOR = registerBlock("coconut_door", new DoorBlock(DOOR_SETTINGS, COCONUT_BLOCK_SET_TYPE));


    //Trapdoors
    public static final Block BLACK_MANGROVE_TRAPDOOR = registerBlock("black_mangrove_trapdoor", new TrapdoorBlock(TRAPDOOR_SETTINGS, BLACK_MANGROVE_BLOCK_SET_TYPE));
    public static final Block AMARANTH_TRAPDOOR = registerBlock("amaranth_trapdoor", new TrapdoorBlock(TRAPDOOR_SETTINGS, AMARANTH_BLOCK_SET_TYPE));
    public static final Block COCONUT_TRAPDOOR = registerBlock("coconut_trapdoor", new TrapdoorBlock(TRAPDOOR_SETTINGS, COCONUT_BLOCK_SET_TYPE));


    //Fences & Fence Gates
    public static final Block BLACK_MANGROVE_FENCE = registerBlock("black_mangrove_fence", new FenceBlock(FENCE_SETTINGS));
    public static final Block AMARANTH_FENCE = registerBlock("amaranth_fence", new FenceBlock(FENCE_SETTINGS));
    public static final Block COCONUT_FENCE = registerBlock("coconut_fence", new FenceBlock(FENCE_SETTINGS));

    public static final Block COCONUT_FENCE_GATE = registerBlock("coconut_fence_gate", new FenceGateBlock(FENCE_GATE_SETTINGS, COCONUT_WOOD_TYPE));
    public static final Block BLACK_MANGROVE_FENCE_GATE = registerBlock("black_mangrove_fence_gate", new FenceGateBlock(FENCE_GATE_SETTINGS, BLACK_MANGROVE_WOOD_TYPE));
    public static final Block AMARANTH_FENCE_GATE = registerBlock("amaranth_fence_gate", new FenceGateBlock(FENCE_GATE_SETTINGS, AMARANTH_WOOD_TYPE));

    //Redstone
    public static final Block AMARANTH_PRESSURE_PLATE = registerBlock("amaranth_pressure_plate", new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, PRESSURE_PLATE_SETTINGS, AMARANTH_BLOCK_SET_TYPE));
    public static final Block COCONUT_PRESSURE_PLATE = registerBlock("coconut_pressure_plate", new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, PRESSURE_PLATE_SETTINGS, COCONUT_BLOCK_SET_TYPE));
    public static final Block BLACK_MANGROVE_PRESSURE_PLATE = registerBlock("black_mangrove_pressure_plate", new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, PRESSURE_PLATE_SETTINGS, BLACK_MANGROVE_BLOCK_SET_TYPE));

    public static final Block AMARANTH_BUTTON = registerBlock("amaranth_button", new ButtonBlock(BUTTON_SETTINGS, AMARANTH_BLOCK_SET_TYPE, 30, true));
    public static final Block COCONUT_BUTTON = registerBlock("coconut_button", new ButtonBlock(BUTTON_SETTINGS, COCONUT_BLOCK_SET_TYPE, 30, true));
    public static final Block BLACK_MANGROVE_BUTTON = registerBlock("black_mangrove_button", new ButtonBlock(BUTTON_SETTINGS, BLACK_MANGROVE_BLOCK_SET_TYPE, 30, true));


    //TODO Make Signs


    //Leaves
    public static final Block BLACK_MANGROVE_LEAVES = registerBlock("black_mangrove_leaves", new Block(LEAVES_SETTINGS));
    public static final Block AMARANTH_LEAVES = registerBlock("amaranth_leaves", new Block(LEAVES_SETTINGS));
    public static final Block COCONUT_LEAVES = registerBlock("coconut_leaves", new Block(LEAVES_SETTINGS));

    //Saplings
    public static final Block BLACK_MANGROVE_PROPAGULE = registerBlock("black_mangrove_propagule", new PropaguleBlock(FabricBlockSettings.copyOf(Blocks.MANGROVE_PROPAGULE)));
    public static final Block AMARANTH_SAPLING = registerBlock("amaranth_sapling", new SaplingBlock(new AcaciaSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.ACACIA_SAPLING)));
    public static final Block COCONUT_SHOOT = registerBlock("coconut_shoot", new PropaguleBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_SAPLING)));

    //Organics
    public static final Block BLACK_MANGROVE_KNEES = registerBlock("black_mangrove_knees", new Block(FabricBlockSettings.copyOf(Blocks.MANGROVE_ROOTS).nonOpaque()));
    public static final Block BROWN_COCONUT_BLOCK = registerBlock("brown_coconut_block", new Block(FabricBlockSettings.copyOf(Blocks.PUMPKIN)));
    public static final Block YELLOW_COCONUT_BLOCK = registerBlock("yellow_coconut_block", new Block(FabricBlockSettings.copyOf(Blocks.PUMPKIN)));
    public static final Block GREEN_COCONUT_BLOCK = registerBlock("green_coconut_block", new Block(FabricBlockSettings.copyOf(Blocks.PUMPKIN)));
    public static final Block COCONUT_TUFT = registerBlock("coconut_tuft", new Block(FabricBlockSettings.copyOf(Blocks.COCOA).nonOpaque().breakInstantly()));
    
    public static final Block COCONUT_0 = registerBlock("coconut_0", new Block(FabricBlockSettings.copyOf(Blocks.COCOA)));
    public static final Block COCONUT_1 = registerBlock("coconut_1", new Block(FabricBlockSettings.copyOf(Blocks.COCOA)));
    public static final Block COCONUT_2 = registerBlock("coconut_2", new Block(FabricBlockSettings.copyOf(Blocks.COCOA)));
    public static final Block COCONUT_3 = registerBlock("coconut_3", new Block(FabricBlockSettings.copyOf(Blocks.COCOA)));
    public static final Block COCONUT_4 = registerBlock("coconut_4", new Block(FabricBlockSettings.copyOf(Blocks.COCOA)));




    public static final Block WHITE_SAND = registerBlock("white_sand", new SandBlock(0, FabricBlockSettings.copyOf(Blocks.SAND).mapColor(DyeColor.WHITE)));
    public static final Block BLACK_SAND = registerBlock("black_sand", new SandBlock(1, FabricBlockSettings.copyOf(Blocks.SAND).mapColor(DyeColor.BLACK)));

    public static final Block BLACK_SANDSTONE = registerBlock("black_sandstone", new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE).mapColor(DyeColor.BLACK)));
    public static final Block BLACK_SANDSTONE_STAIRS = registerBlock("black_sandstone_stairs", new StairsBlock(DEFAULT_STAIR_STATE, STONE_STAIRS_SETTINGS.mapColor(DyeColor.BLACK)));
    public static final Block BLACK_SANDSTONE_SLAB = registerBlock("black_sandstone_slab", new SlabBlock(STONE_SLAB_SETTINGS.mapColor(DyeColor.BLACK)));
    public static final Block BLACK_SANDSTONE_WALL = registerBlock("black_sandstone_wall", new WallBlock(WALL_SETTINGS));
    
    public static final Block CUT_BLACK_SANDSTONE = registerBlock("cut_black_sandstone", new Block(FabricBlockSettings.copyOf(Blocks.CUT_SANDSTONE).mapColor(DyeColor.BLACK)));
    public static final Block CUT_BLACK_SANDSTONE_SLAB = registerBlock("cut_black_sandstone_slab", new SlabBlock(STONE_SLAB_SETTINGS.mapColor(DyeColor.BLACK)));
    
    public static final Block SMOOTH_BLACK_SANDSTONE = registerBlock("smooth_black_sandstone", new Block(FabricBlockSettings.copyOf(Blocks.SMOOTH_SANDSTONE).mapColor(DyeColor.BLACK)));
    public static final Block SMOOTH_BLACK_SANDSTONE_STAIRS = registerBlock("smooth_black_sandstone_stairs", new StairsBlock(DEFAULT_STAIR_STATE, STONE_STAIRS_SETTINGS.mapColor(DyeColor.BLACK)));
    public static final Block SMOOTH_BLACK_SANDSTONE_SLAB = registerBlock("smooth_black_sandstone_slab", new SlabBlock(STONE_SLAB_SETTINGS.mapColor(DyeColor.BLACK)));
    
    public static final Block CHISELED_BLACK_SANDSTONE = registerBlock("chiseled_black_sandstone", new Block(FabricBlockSettings.copyOf(Blocks.CHISELED_SANDSTONE).mapColor(DyeColor.BLACK)));



    public static final Block DEAD_HAMMER_CORAL_BLOCK = registerBlock("dead_hammer_coral_block", new Block(FabricBlockSettings.copyOf(Blocks.DEAD_BRAIN_CORAL_BLOCK)));
    public static final Block HAMMER_CORAL_BLOCK = registerBlock("hammer_coral_block", new CoralBlockBlock(DEAD_HAMMER_CORAL_BLOCK, FabricBlockSettings.copyOf(Blocks.BRAIN_CORAL_BLOCK)));
    
    public static final Block DEAD_HAMMER_CORAL = registerBlock("dead_hammer_coral", new DeadCoralBlock(FabricBlockSettings.copyOf(Blocks.DEAD_BRAIN_CORAL)));
    public static final Block HAMMER_CORAL = registerBlock("hammer_coral", new CoralBlock(DEAD_HAMMER_CORAL, FabricBlockSettings.copyOf(Blocks.BRAIN_CORAL)));
    
    public static final Block DEAD_HAMMER_CORAL_FAN = registerBlock("dead_hammer_coral_fan", new DeadCoralFanBlock(FabricBlockSettings.copyOf(Blocks.DEAD_BRAIN_CORAL_FAN)));
    public static final Block HAMMER_CORAL_FAN = registerBlock("hammer_coral_fan", new CoralFanBlock(DEAD_HAMMER_CORAL_FAN, FabricBlockSettings.copyOf(Blocks.BRAIN_CORAL_FAN)));
    
    public static final Block DEAD_HAMMER_CORAL_WALL_FAN = registerBlock("dead_hammer_coral_wall_fan", new DeadCoralWallFanBlock(FabricBlockSettings.copyOf(Blocks.DEAD_BRAIN_CORAL_WALL_FAN)));
    public static final Block HAMMER_CORAL_WALL_FAN = registerBlock("hammer_coral_wall_fan", new CoralWallFanBlock(DEAD_HAMMER_CORAL_WALL_FAN, FabricBlockSettings.copyOf(Blocks.BRAIN_CORAL_WALL_FAN)));


    public static final Block TROPICAL_BUSH = registerBlock("tropical_bush",new FernBlock(FabricBlockSettings.copyOf(Blocks.FERN)));
    public static final Block LARGE_TROPICAL_BUSH = registerBlock("large_tropical_bush",new TallPlantBlock(FabricBlockSettings.copyOf(Blocks.LARGE_FERN)));
    public static final Block BEACH_GRASS = registerBlock("beach_grass",new GrassBlock(FabricBlockSettings.copyOf(Blocks.GRASS)));
    public static final Block TALL_BEACH_GRASS = registerBlock("large_beach_grass",new GrassBlock(FabricBlockSettings.copyOf(Blocks.TALL_GRASS)));
    public static final Block HELICONIA = registerBlock("heliconia",new TallFlowerBlock(FabricBlockSettings.copyOf(Blocks.ROSE_BUSH)));
    public static final Block POISONOUS_VINES = registerBlock("poisonous_vines",new CaveVinesHeadBlock(FabricBlockSettings.copyOf(Blocks.CAVE_VINES)));
    public static final Block POISONOUS_VINES_PLANT = registerBlock("poisonous_vines_plant",new CaveVinesBodyBlock(FabricBlockSettings.copyOf(Blocks.CAVE_VINES_PLANT)));
    public static final Block RED_HIBISCUS = registerBlock("red_hibiscus",new PlantBlock(FabricBlockSettings.copyOf(Blocks.POPPY)));
    public static final Block WHITE_HIBISCUS = registerBlock("white_hibiscus",new PlantBlock(FabricBlockSettings.copyOf(Blocks.POPPY)));

    

    

    private static Block registerBlock(String name, Block block){
        //ItemGroupEvents.modifyEntriesEvent(TropicaItemGroup.TROPICA).register(content -> {content.add(block);});
		//registerBlockItem(name, block);
        TropicaItemGroup.items.add(registerBlockItem(name, block));
		return Registry.register(Registries.BLOCK, new Identifier(Tropica.MOD_ID, name), block);
	}

    private static BlockItem registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(Tropica.MOD_ID, name), new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks(){
        System.out.println("Registering ModBlocks for " + Tropica.MOD_ID);
    }
}
