package com.stagdagegaming.letsmodreboot.client.handler;


import akka.util.Switch;
import com.stagdagegaming.letsmodreboot.client.settings.KeyBindings;
import com.stagdagegaming.letsmodreboot.reference.Key;
import com.sun.java.util.jar.pack.Instruction;import akka.util.Switch;

import cpw.mods.fml.common.gameevent.InputEvent;


/**
 * Created by Stagdage on 23/02/2016.
 */
public class KeyInputEventHandler {

    public static Key getPressedKeyBinding()
    {
        if(KeyBindings.charge.isPressed())
        {
            return Key.CHARGED;
        }else if(KeyBindings.release.isPressed())
        {
            return Key.RELEASED;
        }

        return Key.UNKNOWN;
    }

    public void handleKeyInputEvent(InputEvent.KeyInputEvent event)
    {

    }
}
