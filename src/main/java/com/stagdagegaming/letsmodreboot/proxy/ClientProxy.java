package com.stagdagegaming.letsmodreboot.proxy;

import com.stagdagegaming.letsmodreboot.client.settings.KeyBindings;
import cpw.mods.fml.client.registry.ClientRegistry;

/**
 * Created by Stagdage-Desktop on 21/02/2016.
 */
public class ClientProxy extends CommonProxy {
    @Override
    public void registerKeyBindings() {
        ClientRegistry.registerKeyBinding(KeyBindings.charge);
        ClientRegistry.registerKeyBinding(KeyBindings.release);
    }
}
