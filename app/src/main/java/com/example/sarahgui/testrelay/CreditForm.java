package com.example.sarahgui.testrelay;

import android.content.Intent;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.craftman.cardform.Card;
import com.craftman.cardform.CardForm;
import com.craftman.cardform.OnPayBtnClickListner;

public class CreditForm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credit_form);

        CardForm cardForm = (CardForm)findViewById(R.id.card_form);
        TextView txtDes = (TextView) findViewById(R.id.payment_amount);
        Button btnPay = (Button) findViewById(R.id.btn_pay);

        txtDes.setText("$19.99");
        btnPay.setText(String.format("Pay %s", txtDes.getText()));

        cardForm.setPayBtnClickListner(new OnPayBtnClickListner() {
            @Override
            public void onClick(Card card) {
                Toast.makeText(CreditForm.this, "Name : "+card.getName()+"  | Last 4 digits : "+card.getLast4(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    public void goToHome(View v) {
        Intent HomePage = new Intent(this, Home.class);
        startActivity(HomePage);
    }
}
