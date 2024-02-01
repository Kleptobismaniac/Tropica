package klepto.tropica.registry.sound;

import klepto.tropica.Tropica;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class TropicaSounds {
    
    public static SoundEvent COCONUT_BREAK = registerSoundEvent("coconut_break");


    private static SoundEvent registerSoundEvent(String name){
        Identifier id = new Identifier(Tropica.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerModSounds(){
        System.out.println("Registering ModSounds for " + Tropica.MOD_ID);
    } 

}
