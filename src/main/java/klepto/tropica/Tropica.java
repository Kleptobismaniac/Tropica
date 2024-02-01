package klepto.tropica;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import klepto.tropica.registry.block.TropicaBlocks;
import klepto.tropica.registry.entity.TropicaEntities;
import klepto.tropica.registry.item.TropicaItemGroup;
import klepto.tropica.registry.item.TropicaItems;
import klepto.tropica.registry.sound.TropicaSounds;
import klepto.tropica.registry.status_effects.TropicaEffects;

public class Tropica implements ModInitializer {

	public static final String MOD_ID = "tropica";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		TropicaSounds.registerModSounds();
		TropicaItems.registerModItems();
		TropicaBlocks.registerModBlocks();
		TropicaEffects.registerModEffects();
		TropicaEntities.registerModEntities();
		TropicaItemGroup.registerModItemGroup();
	}
}