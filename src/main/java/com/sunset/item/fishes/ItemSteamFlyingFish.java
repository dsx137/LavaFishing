package com.sunset.item.fishes;

import com.sunset.creativetab.TabLavaFishing;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

import static com.sunset.util.RegistryCollections.EffectCollection.EFFECT_LAVA_WALKER;

public class ItemSteamFlyingFish extends Item
{
    public ItemSteamFlyingFish() {
        super(GetProperties());
    }

    @Override
    public ItemStack finishUsingItem(ItemStack pStack, Level pLevel, LivingEntity pLivingEntity) {
        pLivingEntity.addEffect(new MobEffectInstance(EFFECT_LAVA_WALKER, 300));
        return super.finishUsingItem(pStack, pLevel, pLivingEntity);
    }

    public static Properties GetProperties() {
        FoodProperties foodProperties = new FoodProperties.Builder()
                .nutrition(3)
                .saturationMod(0.6F)
                .build();
        return new Properties()
                .tab(TabLavaFishing.TAB_LAVA_FISHING)
                .food(foodProperties)
                .fireResistant();
    }
}
