package com.example.shs.farmer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Greens extends AppCompatActivity {

    Button murungai,agathi,ponangani,palak,thandu,araikeerai;
    String catid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greens);

        murungai = (Button)findViewById(R.id.button_murungi);
        agathi = (Button)findViewById(R.id.button2_agathi);
        ponangani = (Button)findViewById(R.id.button3_ponangani);
        palak = (Button)findViewById(R.id.button4_palak);
        thandu = (Button)findViewById(R.id.button5_thandu);
        araikeerai = (Button)findViewById(R.id.button6_araikeerai);

        Bundle b = getIntent().getExtras();
        catid = (String) b.get("id");

        murungai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Greens.this,View_Farmlist.class);
                a.putExtra("catid",catid);
                a.putExtra("item","Murungai");
                startActivity(a);
            }
        });

        agathi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Greens.this,View_Farmlist.class);
                a.putExtra("catid",catid);
                a.putExtra("item","Agathi");
                startActivity(a);
            }
        });

        ponangani.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Greens.this,View_Farmlist.class);
                a.putExtra("catid",catid);
                a.putExtra("item","Ponangani");
                startActivity(a);
            }
        });

        palak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Greens.this,View_Farmlist.class);
                a.putExtra("catid",catid);
                a.putExtra("item","Palak");
                startActivity(a);
            }
        });

        thandu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Greens.this,View_Farmlist.class);
                a.putExtra("catid",catid);
                a.putExtra("item","Thandu");
                startActivity(a);
            }
        });

        araikeerai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Greens.this,View_Farmlist.class);
                a.putExtra("catid",catid);
                a.putExtra("item","Araikeerai");
                startActivity(a);
            }
        });

    }
}
