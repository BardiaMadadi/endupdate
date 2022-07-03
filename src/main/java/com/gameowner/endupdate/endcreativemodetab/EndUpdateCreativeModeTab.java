package com.gameowner.endupdate.endcreativemodetab;

import com.gameowner.endupdate.blocks.ModBlocks;
import com.gameowner.endupdate.items.ModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class EndUpdateCreativeModeTab {

    public static final CreativeModeTab EndUpdateCreativeModeTab = new CreativeModeTab("endupdatecreativemodetab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.END_ORE.get(),1);
        }
    };

}
