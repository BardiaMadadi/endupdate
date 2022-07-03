package com.gameowner.endupdate.items;

import com.gameowner.endupdate.Endupdate;
import com.gameowner.endupdate.endcreativemodetab.EndUpdateCreativeModeTab;
import com.gameowner.endupdate.items.custom.EndSpear;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.TridentItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(
            ForgeRegistries.ITEMS,
            Endupdate.MOD_ID
    );


    public static final RegistryObject<Item> END_INGOT = ITEMS.register("end_ingot",
            () -> new Item(new Item.Properties()
                    .tab(EndUpdateCreativeModeTab.EndUpdateCreativeModeTab)));

    public static final RegistryObject<Item> RAW_END_INGOT = ITEMS.register("raw_end_ingot",
            () -> new Item(new Item.Properties()
                    .tab(EndUpdateCreativeModeTab.EndUpdateCreativeModeTab)));

    public static final RegistryObject<Item> END_SPEAR = ITEMS.register("end_spear",
            () -> new EndSpear((new Item.Properties()).durability(250).tab(CreativeModeTab.TAB_COMBAT)));



    // Helpers :
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }


}


