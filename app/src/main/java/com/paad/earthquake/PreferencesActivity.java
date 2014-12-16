package com.paad.earthquake;

import android.app.Activity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.Spinner;

/**
 * Created by WangWei on 2014/12/16.
 */
public class PreferencesActivity extends Activity {

    private CheckBox autoUpdate;
    private Spinner updateFreqSpinner;
    private Spinner magnitudeSpinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.preferences);

        autoUpdate = (CheckBox) findViewById(R.id.checkbox_auto_update);
        updateFreqSpinner = (Spinner) findViewById(R.id.spinner_update_freq);
        magnitudeSpinner = (Spinner) findViewById(R.id.spinner_quake_mag);
        populateSpinners();
    }

    private void populateSpinners() {

    }
}
