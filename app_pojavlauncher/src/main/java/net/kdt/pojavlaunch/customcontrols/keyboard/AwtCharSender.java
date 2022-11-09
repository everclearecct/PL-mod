package net.kdt.pojavlaunch.vulkan.customcontrols.keyboard;

import net.kdt.pojavlaunch.vulkan.AWTInputBridge;
import net.kdt.pojavlaunch.vulkan.AWTInputEvent;

/** Send chars via the AWT Bridgee */
public class AwtCharSender implements CharacterSenderStrategy {
    @Override
    public void sendBackspace() {
        AWTInputBridge.sendKey(' ', AWTInputEvent.VK_BACK_SPACE);
    }

    @Override
    public void sendEnter() {
        AWTInputBridge.sendKey(' ', AWTInputEvent.VK_ENTER);
    }

    @Override
    public void sendChar(char character) {
        AWTInputBridge.sendChar(character);
    }

}
