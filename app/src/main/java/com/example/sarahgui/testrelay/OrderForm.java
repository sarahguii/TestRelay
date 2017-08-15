package com.example.sarahgui.testrelay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class OrderForm extends AppCompatActivity {
    //EditText message_text;
    public final static String MESSAGE_KEY = "com.example.sarahgui.testrelay.message_key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_form);
    }

    public void goToProfile(View v) {
        Intent ProfilePage = new Intent(this, Profile.class);
        startActivity(ProfilePage);
    }

    /*public void sendMessage(View v) {
        message_text = (EditText) findViewById(R.id.message_text);
        String message = message_text.getText().toString();
        Intent intent = new Intent(this, SendOrder.class);
        intent.putExtra(MESSAGE_KEY, message);
        startActivity(intent);
    }*/
}
