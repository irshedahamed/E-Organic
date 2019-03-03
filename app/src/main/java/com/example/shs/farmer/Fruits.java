package com.example.shs.farmer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Fruits extends AppCompatActivity {

    Button papaya,guava,custard,sapota,banana,mango;
    String catid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruits);

        papaya = (Button)findViewById(R.id.button_papaya);
        guava = (Button)findViewById(R.id.button2_guava);
        custard = (Button)findViewById(R.id.button3_custard);
        sapota = (Button)findViewById(R.id.button4_sapota);
        banana = (Button)findViewById(R.id.button5_banana);
        mango = (Button)findViewById(R.id.button6_mango);

        Bundle b = getIntent().getExtras();
        catid = (String) b.get("id");

        papaya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Fruits.this,View_Farmlist.class);
                a.putExtra("catid",catid);
                a.putExtra("item","Papaya");
                startActivity(a);
            }
        });

        guava.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Fruits.this,View_Farmlist.class);
                a.putExtra("catid",catid);
                a.putExtra("item","Guava");
                startActivity(a);
            }
        });

        custard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Fruits.this,View_Farmlist.class);
                a.putExtra("catid",catid);
                a.putExtra("item","Custard apple");
                startActivity(a);
            }
        });

        sapota.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Fruits.this,View_Farmlist.class);
                a.putExtra("catid",catid);
                a.putExtra("item","Sapota");
                startActivity(a);
            }
        });

        banana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Fruits.this,View_Farmlist.class);
                a.putExtra("catid",catid);
                a.putExtra("item","Banana");
                startActivity(a);
            }
        });

        mango.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Fruits.this,View_Farmlist.class);
                a.putExtra("catid",catid);
                a.putExtra("item","Mango");
                startActivity(a);
            }
        });

    }
}
