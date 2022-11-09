package net.kdt.pojavlaunch.vulkan.prefs.screens;

import android.os.Bundle;

import net.kdt.pojavlaunch.vulkan.R;

public class LauncherPreferenceExperimentalFragment extends LauncherPreferenceFragment {

    @Override
    public void onCreatePreferences(Bundle b, String str) {
        addPreferencesFromResource(R.xml.pref_experimental);
    }
}
