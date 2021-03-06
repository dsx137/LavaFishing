package com.sunset.creativetab;

import com.sunset.util.Reference;
import com.sunset.util.RegistryCollections.ItemCollection;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public class TabLavaFishing extends CreativeModeTab
{
    public static final TabLavaFishing TAB_LAVA_FISHING = new TabLavaFishing(Reference.MOD_NAME);

    public TabLavaFishing(String label) {
        super(label);
    }

    @NotNull
    @Override
    public ItemStack makeIcon() {
        return new ItemStack(ItemCollection.OBSIDIAN_FISHING_ROD);
    }
}
