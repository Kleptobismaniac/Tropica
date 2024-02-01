package klepto.tropica.registry.status_effects;

import klepto.tropica.Tropica;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class TropicaEffects {

    public static final StatusEffect SLIPPERY = registerEffect("slippery", new PerfumeEffect(null, 0));
    


    private static StatusEffect registerEffect(String name, StatusEffect effect){
        return Registry.register(Registries.STATUS_EFFECT, new Identifier(Tropica.MOD_ID, name), effect);
	}

    public static void registerModEffects(){
        System.out.println("Registering ModEffects for " + Tropica.MOD_ID);
    }
}
