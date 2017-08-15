package com.example.sarahgui.testrelay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Listings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listings);
    }

    public void goToHome(View v) {
        Intent HomePage = new Intent(this, Home.class);
        startActivity(HomePage);
    }

    public void goToOrder(View v) {
        Intent OrderPage = new Intent(this, OrderForm.class);
        startActivity(OrderPage);
    }
}
