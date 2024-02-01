package klepto.tropica.registry.entity;

import klepto.tropica.Tropica;
import klepto.tropica.registry.entity.coconut.CoconutEntityHandler;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class TropicaEntities {

        //public static final EntityType<TropicaBoat> COCONUT_BOAT = FabricEntityTypeBuilder.create(SpawnGroup.MISC, TropicaBoat::new).build();
        @SuppressWarnings("unchecked")
        public static final EntityType<CoconutEntityHandler> COCONUT = registerEntities("coconut", FabricEntityTypeBuilder.<CoconutEntityHandler>create(SpawnGroup.MISC, CoconutEntityHandler::new)
            .dimensions(EntityDimensions.fixed(0.25f, 0.25f))
            .trackRangeBlocks(4)
            .trackedUpdateRate(10)
            .build());

        private static EntityType registerEntities(String name, EntityType entity){
                return Registry.register(Registries.ENTITY_TYPE, new Identifier(Tropica.MOD_ID, name), entity);
        }

        public static void registerModEntities(){
                System.out.println("Registering ModEntities for " + Tropica.MOD_ID);
            }  

}
