package com.paad.earthquake;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class EarthquakeActivity extends Activity {

    private static final int MENU_PREFERENCE = Menu.FIRST+1;
    private static final int SHOW_PREFERENCE = 1;
    private static final int MENU_UPDATE = Menu.FIRST+2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_earthquake);
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
                Intent i = new Intent(this,PreferencesActivity.class);
                startActivityForResult(i,SHOW_PREFERENCE);
                return true;
            }
        }
        return false;
    }
}
