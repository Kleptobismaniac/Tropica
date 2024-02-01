package klepto.tropica.registry.item;

import java.util.List;



import klepto.tropica.Tropica;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Block;
import net.minecraft.command.argument.RegistryKeyArgumentType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import java.util.ArrayList;

public class TropicaItemGroup {

    public static ArrayList<Item> items = new ArrayList<Item>();

    public static ItemStack getIcon() {
		return TropicaItems.COCONUT.getDefaultStack();
	}

    public static final ItemGroup TROPICA = registerItemGroup("tropica", FabricItemGroup.builder()
	    .icon(() -> new ItemStack(TropicaItems.COCONUT))
	    .displayName(Text.translatable("itemGroup.tropica.tropica"))
            .entries((context, entries) -> {
                for (int i = 0; i < items.size(); i++){
                    entries.add(items.get(i));
                }
	    })
	    .build());

    private static ItemGroup registerItemGroup(String name, ItemGroup itemGroup){
        return Registry.register(Registries.ITEM_GROUP, new Identifier(Tropica.MOD_ID, name), itemGroup);
	}

    public static void registerModItemGroup(){
        System.out.println("Registering ModItemGroup for " + Tropica.MOD_ID);
        for (int i = 0; i < items.size(); i++){
            System.out.println(items.get(i));
        }
    }  
}
