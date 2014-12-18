package com.paad.earthquake;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.Menu;
import android.view.MenuItem;

import java.net.ContentHandler;


public class EarthquakeActivity extends Activity {

    private static final int MENU_PREFERENCE = Menu.FIRST+1;
    private static final int SHOW_PREFERENCE = 1;
    private static final int MENU_UPDATE = Menu.FIRST+2;
    private int minimmMagnitude;
    private int updateFreq;
    private boolean autoUpdateChecked;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_earthquake);
    }

    private void updateFromPreferences(){
        Context context=getApplicationContext();
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        minimmMagnitude = Integer.parseInt(prefs.getString(PreferencesActivity.PREF_MIN_MAG,"3"));
        updateFreq = Integer.parseInt(prefs.getString(PreferencesActivity.PREF_UPDATE_FREQ,"60"));
        autoUpdateChecked = prefs.getBoolean(PreferencesActivity.PREF_AUTO_UPDATE,false);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==SHOW_PREFERENCE){
            updateFromPreferences();

            FragmentManager fm = getFragmentManager();
            final EarthquakeListFragment earthquakeList = (EarthquakeListFragment) fm.findFragmentById(R.id.EarthquakeListFragment);

            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {
                    earthquakeList.refreshEarthquakes();
                }
            });
            t.start();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        super.onCreateOptionsMenu(menu);
        menu.add(0,MENU_PREFERENCE,Menu.NONE,R.string.menu_preferences);
        return true;
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        super.onOptionsItemSelected(item);
        switch (item.getItemId()){
            case (MENU_PREFERENCE) : {

                Class c = Build.VERSION.SDK_INT<Build.VERSION_CODES.HONEYCOMB?
                        PreferencesActivity.class:FragmentPreferences.class;

                Intent i = new Intent(this,c);
                startActivityForResult(i,SHOW_PREFERENCE);
                return true;
            }
        }
        return false;
    }
}
