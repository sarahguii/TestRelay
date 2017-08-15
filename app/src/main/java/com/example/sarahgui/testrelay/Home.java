package com.example.sarahgui.testrelay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void goToListings(View v) {
        Intent ListPage = new Intent(this, Listings.class);
        startActivity(ListPage);
    }

    public void goToCheckIn(View v) {
        Intent CheckPage = new Intent(this, CheckIn.class);
        startActivity(CheckPage);
    }

    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_relay, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void goToListings(View v) {
        Intent ListPage = new Intent(this, Listings.class);
        startActivity(ListPage);
    }

    public void goToCheckin(View v) {
        Intent CheckinPage = new Intent(this, CheckIn.class);
        startActivity(CheckinPage);
    }*/

}
