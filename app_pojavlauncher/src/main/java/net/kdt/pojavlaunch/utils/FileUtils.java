package net.kdt.pojavlaunch.vulkan.utils;

import java.io.File;

public class FileUtils {
    public static boolean exists(String filePath){
        return new File(filePath).exists();
    }
}