package klepto.tropica.registry.status_effects;

import net.minecraft.block.Blocks;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;

public class PerfumeEffect extends StatusEffect{

  BlockPos pos;

    protected PerfumeEffect(StatusEffectCategory category, int color) {
        super(StatusEffectCategory.NEUTRAL, 0x00B4D8);
    }
    
    @Override
  public boolean canApplyUpdateEffect(int duration, int amplifier) {
    // In our case, we just make it return true so that it applies the status effect every tick.
    return true;
  }

  @Override
  public void applyUpdateEffect(LivingEntity entity, int amplifier) {
    if (entity instanceof PlayerEntity) {
    } 
  }
}


