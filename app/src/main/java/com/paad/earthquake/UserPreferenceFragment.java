package com.paad.earthquake;

import android.os.Bundle;
import android.preference.PreferenceFragment;

/**
 * Created by WangWei on 2014/12/18.
 */
public class UserPreferenceFragment extends PreferenceFragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.userperferences);

    }
}
