package com.mars.betterstairscrafting;

import com.google.common.collect.Lists;
import com.mars.deimos.config.DeimosConfig;
import com.mars.deimos.datagen.DeimosRecipeGenerator;
import net.minecraft.resources.ResourceLocation;

import static com.mars.betterstairscrafting.BetterStairsCraftingConfig.add_recipes_manually;
import static com.mars.betterstairscrafting.Constants.MOD_ID;

public class CommonClass {
    public static void init() {
        DeimosConfig.init(MOD_ID, BetterStairsCraftingConfig.class);

        if(add_recipes_manually){
            for (int i = 0; i < BetterStairsCraftingConfig.block_stairs_list.size(); i++) {
                String current = BetterStairsCraftingConfig.block_stairs_list.get(i);
                String[] set = ((current).replaceAll("\\s","")).split(",");

                DeimosRecipeGenerator.createShapedRecipeJson(
                        Lists.newArrayList(
                                '#'
                        ),
                        Lists.newArrayList(new ResourceLocation(set[0])),
                        Lists.newArrayList("item"),
                        Lists.newArrayList(
                                "#  ",
                                "## "
                        ),
                        new ResourceLocation(set[1]), BetterStairsCraftingConfig.stair_amount);
            }
        }
    }
}
