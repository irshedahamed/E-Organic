package com.example.shs.farmer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class First_foods extends AppCompatActivity {

    Button wheat,ragi,millet,rawrice,redrice,idlyrice;
    String catid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_foods);

        wheat = (Button)findViewById(R.id.button_wheat);
        ragi = (Button)findViewById(R.id.button2_ragi);
        millet = (Button)findViewById(R.id.button3_millet);
        rawrice = (Button)findViewById(R.id.button4_rawrice);
        redrice = (Button)findViewById(R.id.button5_redrice);
        idlyrice = (Button)findViewById(R.id.button6_idly);

        Bundle b = getIntent().getExtras();
        catid = (String) b.get("id");


        wheat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(First_foods.this,View_Farmlist.class);
                a.putExtra("catid",catid);
                a.putExtra("item","Wheat");
                startActivity(a);
            }
        });

        ragi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(First_foods.this,View_Farmlist.class);
                a.putExtra("catid",catid);
                a.putExtra("item","Ragi");
                startActivity(a);
            }
        });

        millet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(First_foods.this,View_Farmlist.class);
                a.putExtra("catid",catid);
                a.putExtra("item","Millet");
                startActivity(a);
            }
        });

        rawrice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(First_foods.this,View_Farmlist.class);
                a.putExtra("catid",catid);
                a.putExtra("item","Raw rice");
                startActivity(a);
            }
        });

        redrice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(First_foods.this,View_Farmlist.class);
                a.putExtra("catid",catid);
                a.putExtra("item","Red rice");
                startActivity(a);
            }
        });

        idlyrice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(First_foods.this,View_Farmlist.class);
                a.putExtra("catid",catid);
                a.putExtra("item","Idly rice");
                startActivity(a);
            }
        });

    }
}
