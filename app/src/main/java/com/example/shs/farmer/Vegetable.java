package com.example.shs.farmer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Vegetable extends AppCompatActivity {

    Button brinjal,radish,vendai,avarai,thakkali,onion;
    String catid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vegetable);

        brinjal = (Button)findViewById(R.id.button_brinjal);
        radish = (Button)findViewById(R.id.button2_radish);
        vendai = (Button)findViewById(R.id.button3_vendai);
        avarai = (Button)findViewById(R.id.button4_avarai);
        thakkali = (Button)findViewById(R.id.button5_thakali);
        onion = (Button)findViewById(R.id.button6_onion);

        Bundle b = getIntent().getExtras();
        catid = (String) b.get("id");

        brinjal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Vegetable.this,View_Farmlist.class);
                a.putExtra("catid",catid);
                a.putExtra("item","Brinjal");
                startActivity(a);
            }
        });

        radish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Vegetable.this,View_Farmlist.class);
                a.putExtra("catid",catid);
                a.putExtra("item","Radish");
                startActivity(a);
            }
        });

        vendai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Vegetable.this,View_Farmlist.class);
                a.putExtra("catid",catid);
                a.putExtra("item","Vendai");
                startActivity(a);
            }
        });

        avarai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Vegetable.this,View_Farmlist.class);
                a.putExtra("catid",catid);
                a.putExtra("item","Avarai");
                startActivity(a);
            }
        });

        thakkali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Vegetable.this,View_Farmlist.class);
                a.putExtra("catid",catid);
                a.putExtra("item","Thakkali");
                startActivity(a);
            }
        });

        onion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Vegetable.this,View_Farmlist.class);
                a.putExtra("catid",catid);
                a.putExtra("item","Onion");
                startActivity(a);
            }
        });

    }
}
