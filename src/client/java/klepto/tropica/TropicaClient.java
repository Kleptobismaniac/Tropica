package klepto.tropica;

import net.fabricmc.api.ClientModInitializer;

public class TropicaClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
        TropicaRenderHandler.registerEntityRenderers();
        TropicaRenderHandler.registerBlockRenderLayerMaps();
        TropicaRenderHandler.registerColorProviders();
	}
}