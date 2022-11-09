package net.kdt.pojavlaunch.vulkan.prefs.screens;


import android.graphics.Color;
import android.os.*;

import androidx.activity.OnBackPressedCallback;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.preference.*;
import net.kdt.pojavlaunch.vulkan.R;
import net.kdt.pojavlaunch.vulkan.prefs.LauncherPreferences;

import android.content.*;
import android.view.View;
import android.widget.Toast;

import static net.kdt.pojavlaunch.vulkan.Architecture.is32BitsDevice;
import static net.kdt.pojavlaunch.vulkan.Tools.getTotalDeviceMemory;
import static net.kdt.pojavlaunch.vulkan.prefs.LauncherPreferences.PREF_NOTCH_SIZE;

/**
 * Preference for the main screen, any sub-screen should inherit this class for consistent behavior,
 * overriding only onCreatePreferences
 */
public class LauncherPreferenceFragment extends PreferenceFragmentCompat implements SharedPreferences.OnSharedPreferenceChangeListener {

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        view.setBackgroundColor(Color.parseColor("#232323"));
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onCreatePreferences(Bundle b, String str) {
        addPreferencesFromResource(R.xml.pref_main);
    }

    @Override
    public void onResume() {
        super.onResume();
        getPreferenceManager().getSharedPreferences().registerOnSharedPreferenceChangeListener(this);
    }

    @Override
    public void onPause() {
        getPreferenceManager().getSharedPreferences().unregisterOnSharedPreferenceChangeListener(this);
        super.onPause();
    }

    @Override
    public void onSharedPreferenceChanged(SharedPreferences p, String s) {
        LauncherPreferences.loadPreferences(getContext());
    }


}
