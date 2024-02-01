package klepto.tropica;


import klepto.tropica.registry.block.TropicaBlocks;
import klepto.tropica.registry.entity.TropicaEntities;
import klepto.tropica.registry.item.TropicaItems;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.block.Block;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;
import net.minecraft.client.render.block.entity.HangingSignBlockEntityRenderer;
import net.minecraft.client.render.block.entity.SignBlockEntityRenderer;
import net.minecraft.client.render.entity.BoatEntityRenderer;
import net.minecraft.client.render.entity.FlyingItemEntityRenderer;
import net.minecraft.entity.vehicle.BoatEntity;
import net.minecraft.util.Identifier;

public class TropicaRenderHandler{

        
        public static void registerEntityRenderers() {
            EntityRendererRegistry.register(TropicaEntities.COCONUT, FlyingItemEntityRenderer::new);
        }
    
        public static void registerBlockRenderLayerMaps() {
            getCutOutOfBlock(TropicaBlocks.COCONUT_LEAVES);
            getCutOutOfBlock(TropicaBlocks.COCONUT_SHOOT);

            getCutOutOfBlock(TropicaBlocks.COCONUT_1);
            getCutOutOfBlock(TropicaBlocks.COCONUT_2);
            getCutOutOfBlock(TropicaBlocks.COCONUT_3);
            getCutOutOfBlock(TropicaBlocks.COCONUT_4);
            
            getCutOutOfBlock(TropicaBlocks.BLACK_MANGROVE_LEAVES);
            getCutOutOfBlock(TropicaBlocks.BLACK_MANGROVE_PROPAGULE);
            
            getCutOutOfBlock(TropicaBlocks.AMARANTH_LEAVES);
            getCutOutOfBlock(TropicaBlocks.AMARANTH_SAPLING);
            
            getTranslucentOfBlock(TropicaBlocks.BLACK_MANGROVE_DOOR);
            getTranslucentOfBlock(TropicaBlocks.BLACK_MANGROVE_TRAPDOOR);
            getCutOutOfBlock(TropicaBlocks.COCONUT_DOOR);
            getCutOutOfBlock(TropicaBlocks.AMARANTH_DOOR);
            getCutOutOfBlock(TropicaBlocks.AMARANTH_TRAPDOOR);
            
            getCutOutOfBlock(TropicaBlocks.COCONUT_TUFT);
            getCutOutOfBlock(TropicaBlocks.BLACK_MANGROVE_KNEES);
            
            getCutOutOfBlock(TropicaBlocks.HAMMER_CORAL);
            getCutOutOfBlock(TropicaBlocks.DEAD_HAMMER_CORAL);
            getCutOutOfBlock(TropicaBlocks.HAMMER_CORAL_WALL_FAN);
            getCutOutOfBlock(TropicaBlocks.DEAD_HAMMER_CORAL_WALL_FAN);
            getCutOutOfBlock(TropicaBlocks.HAMMER_CORAL_FAN);
            getCutOutOfBlock(TropicaBlocks.DEAD_HAMMER_CORAL_FAN);
            
            getCutOutOfBlock(TropicaBlocks.BEACH_GRASS);
            getCutOutOfBlock(TropicaBlocks.TALL_BEACH_GRASS);
            getCutOutOfBlock(TropicaBlocks.WHITE_HIBISCUS);
            getCutOutOfBlock(TropicaBlocks.RED_HIBISCUS);
            getCutOutOfBlock(TropicaBlocks.TROPICAL_BUSH);
            getCutOutOfBlock(TropicaBlocks.LARGE_TROPICAL_BUSH);
            getCutOutOfBlock(TropicaBlocks.POISONOUS_VINES);
            getCutOutOfBlock(TropicaBlocks.POISONOUS_VINES_PLANT);
            getCutOutOfBlock(TropicaBlocks.HELICONIA);
        }
        
        private static void getCutOutOfBlock(Block block){
            BlockRenderLayerMap.INSTANCE.putBlock(block, RenderLayer.getCutout());
        }
        
        private static void getTranslucentOfBlock(Block block){
            BlockRenderLayerMap.INSTANCE.putBlock(block, RenderLayer.getTranslucent());
        }
    
        public static void registerColorProviders() {
            ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> 0x92c648, TropicaBlocks.BLACK_MANGROVE_LEAVES);
            ColorProviderRegistry.ITEM.register((stack, tintIndex) -> 0x92c648, TropicaBlocks.BLACK_MANGROVE_LEAVES.asItem());
            ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> 0x92c648, TropicaBlocks.AMARANTH_LEAVES);
            ColorProviderRegistry.ITEM.register((stack, tintIndex) -> 0x92c648, TropicaBlocks.AMARANTH_LEAVES.asItem());
            ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> 0x92c648, TropicaBlocks.TROPICAL_BUSH);
            ColorProviderRegistry.ITEM.register((stack, tintIndex) -> 0x92c648, TropicaBlocks.TROPICAL_BUSH.asItem());
            ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> 0x92c648, TropicaBlocks.LARGE_TROPICAL_BUSH);
            ColorProviderRegistry.ITEM.register((stack, tintIndex) -> 0x92c648, TropicaBlocks.LARGE_TROPICAL_BUSH.asItem());
        }
}