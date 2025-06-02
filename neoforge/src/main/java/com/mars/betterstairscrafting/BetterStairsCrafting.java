package com.mars.betterstairscrafting;


import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(Constants.MOD_ID)
public class BetterStairsCrafting {
    public BetterStairsCrafting(IEventBus eventBus) {
        CommonClass.init();
    }
}
