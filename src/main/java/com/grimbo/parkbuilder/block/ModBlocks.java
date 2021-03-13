package com.grimbo.parkbuilder.block;


import com.grimbo.parkbuilder.ParkBuilder;
import com.grimbo.parkbuilder.util.Registration;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = ParkBuilder.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModBlocks {

    public static final RegistryObject<Block> SHIT_BLOCK = register("shit_block",
            () -> new Block(AbstractBlock.Properties.create(Material.EARTH)
                    .hardnessAndResistance(1f, 2f).sound(SoundType.PLANT)));


    public static void register() { }










    private static <T extends Block>RegistryObject<T> register(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = Registration.BLOCKS.register(name,block);
        Registration.ITEMS.register(name, () -> new BlockItem(toReturn.get(),
                new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
        return toReturn;


    }

}