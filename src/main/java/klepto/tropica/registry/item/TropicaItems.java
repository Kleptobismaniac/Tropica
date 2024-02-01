package klepto.tropica.registry.item;

import klepto.tropica.Tropica;
import klepto.tropica.registry.block.TropicaBlocks;
import klepto.tropica.registry.item.coconut.Coconut;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class TropicaItems {

    //MOD ID
    private static final String MOD_ID = Tropica.MOD_ID;
    
    //Stack Options
    public static final FabricItemSettings FULL_STACK = new FabricItemSettings().maxCount(64);
    public static final FabricItemSettings QUARTER_STACK = new FabricItemSettings().maxCount(16);
    public static final FabricItemSettings SINGLE = new FabricItemSettings().maxCount(1);
    
    public static final Item COCONUT = registerItem("coconut", new Coconut(TropicaBlocks.COCONUT_SHOOT, QUARTER_STACK));


    private static Item registerItem(String name, Item item){
        //ItemGroupEvents.modifyEntriesEvent(TropicaItemGroup.TROPICA).register(content -> {content.add(item);});
        TropicaItemGroup.items.add(item);
        return Registry.register(Registries.ITEM, new Identifier(Tropica.MOD_ID, name), item);
	}

    public static void registerModItems(){
        System.out.println("Registering ModItems for " + MOD_ID);
    }   

}
