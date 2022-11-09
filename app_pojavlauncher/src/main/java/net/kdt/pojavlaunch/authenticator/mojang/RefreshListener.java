package net.kdt.pojavlaunch.vulkan.authenticator.mojang;

import net.kdt.pojavlaunch.vulkan.*;
import net.kdt.pojavlaunch.vulkan.value.*;

public interface RefreshListener
{
	public void onFailed(Throwable e);
	public void onSuccess(MinecraftAccount profile);
}
