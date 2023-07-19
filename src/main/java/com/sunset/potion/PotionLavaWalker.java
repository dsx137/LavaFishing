package com.sunset.potion;

import com.sunset.util.RegistryCollections.EffectCollection;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.item.alchemy.Potion;

public class PotionLavaWalker extends Potion
{
    public PotionLavaWalker() {
        super(new MobEffectInstance(EffectCollection.EFFECT_LAVA_WALKER, 4800));
    }
}
