package com.paad.earthquake;

import android.preference.PreferenceActivity;

import java.util.List;

/**
 * Created by WangWei on 2014/12/18.
 */
public class FragmentPreferences extends PreferencesActivity {

    @Override
    public void onBuildHeaders(List<Header> target) {

        loadHeadersFromResource(R.xml.preferencs_hreders,target);

    }
}
