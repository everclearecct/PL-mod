package net.kdt.pojavlaunch.vulkan.authenticator.mojang.yggdrasil;

import java.util.UUID;

public class AuthenticateResponse {
    public String accessToken;
    public Profile[] availableProfiles;
    public UUID clientToken;
    public Profile selectedProfile;
}