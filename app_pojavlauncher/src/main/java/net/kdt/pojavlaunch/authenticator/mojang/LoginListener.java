package net.kdt.pojavlaunch.vulkan.authenticator.mojang;

public interface LoginListener
{
    public void onBeforeLogin();
    public void onLoginDone(String[] result);
}