package com.paad.earthquake;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Spinner;


/**
 * Created by WangWei on 2014/12/16.
 */
public class PreferencesActivity extends PreferenceActivity {

//    private CheckBox autoUpdate;
//    private Spinner updateFreqSpinner;
//    private Spinner magnitudeSpinner;

    private static final String USER_PREFERENCE = "USER_PREFERENCE";
    public static final String PREF_AUTO_UPDATE = "PREF_AUTO_UPDATE";
    private static final String PREF_MIN_MAG_INDEX = "PREF_MIN_MAG_INDEX";
    private static final String PREF_UPDATE_FREQ_INDEX = "PREF_UPDATE_FREQ_INDEX";

    public static final String PREF_MIN_MAG = "PREF_MIN_MAG";
    public static final String PREF_UPDATE_FREQ = "PREF_UPDATE_FREQ";


    SharedPreferences prefs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.userperferences);


//
//        autoUpdate = (CheckBox) findViewById(R.id.checkbox_auto_update);
//        updateFreqSpinner = (Spinner) findViewById(R.id.spinner_update_freq);
//        magnitudeSpinner = (Spinner) findViewById(R.id.spinner_quake_mag);
//        populateSpinners();

//        Context context= getApplicationContext();
//        prefs = PreferenceManager.getDefaultSharedPreferences(context);
//        updateUIFromPreference();

//        Button okButton = (Button) findViewById(R.id.okButton);
//        Button cancelButton = (Button) findViewById(R.id.cancelButton);

//        okButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                savePreference();
//                PreferencesActivity.this.setResult(RESULT_OK);
//                finish();
//            }
//        });
//
//        cancelButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                PreferencesActivity.this.setResult(RESULT_CANCELED);
//                finish();
//            }
//        });
    }

   /* private void savePreference() {
        int updateIndex = updateFreqSpinner.getSelectedItemPosition();
        int minMagIndex = magnitudeSpinner.getSelectedItemPosition();
        boolean autoUpdateChecked =  autoUpdate.isChecked();

        SharedPreferences.Editor edit = prefs.edit();
        edit.putBoolean(PREF_AUTO_UPDATE,autoUpdateChecked);
        edit.putInt(PREF_UPDATE_FREQ_INDEX,updateIndex);
        edit.putInt(PREF_MIN_MAG_INDEX,minMagIndex);
        edit.apply();
    }*/

/*    private void updateUIFromPreference() {
        boolean autoUpchecked = prefs.getBoolean(PREF_AUTO_UPDATE,false);
        int updateFreqIndex = prefs.getInt(PREF_UPDATE_FREQ_INDEX,2);
        int minMagIndex = prefs.getInt(PREF_MIN_MAG_INDEX,0);
        updateFreqSpinner.setSelection(updateFreqIndex);
        magnitudeSpinner.setSelection(minMagIndex);
        autoUpdate.setChecked(autoUpchecked);
    }*/

/*    private void populateSpinners() {
        //填充更新频率为条框
        ArrayAdapter<CharSequence> fAdapter;
        fAdapter = ArrayAdapter.createFromResource(this,R.array.update_freq_options,android.R.layout.simple_spinner_item);
        int spinner_dd_item = android.R.layout.simple_spinner_dropdown_item;
        fAdapter.setDropDownViewResource(spinner_dd_item);
        updateFreqSpinner.setAdapter(fAdapter);
        //填充最小甄姬微调框
        ArrayAdapter<CharSequence> mAdapter;
        mAdapter = ArrayAdapter.createFromResource(this,R.array.magnitude_options,android.R.layout.simple_spinner_item);
        mAdapter.setDropDownViewResource(spinner_dd_item);
        magnitudeSpinner.setAdapter(mAdapter);

    }*/
}
