package com.example.sarahgui.testrelay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }

    public void goToListings(View v) {
        Intent ListPage = new Intent(this, Listings.class);
        startActivity(ListPage);
    }

    public void goToHome(View v) {
        Intent HomePage = new Intent(this, Home.class);
        startActivity(HomePage);
    }

    public void goToPay(View v) {
        Intent PayPage = new Intent(this, CreditForm.class);
        startActivity(PayPage);
    }
}
