package com.example.shs.farmer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pulses extends AppCompatActivity {

    Button soya,butter,mochai,peas,channa,kollu;
    String catid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pulses);

        soya = (Button)findViewById(R.id.button_soya);
        butter = (Button)findViewById(R.id.button2_butter);
        mochai = (Button)findViewById(R.id.button3_mochai);
        peas = (Button)findViewById(R.id.button4_peas);
        channa = (Button)findViewById(R.id.button5_channa);
        kollu = (Button)findViewById(R.id.button6_kollu);

        Bundle b = getIntent().getExtras();
        catid = (String) b.get("id");

        soya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Pulses.this,View_Farmlist.class);
                a.putExtra("catid",catid);
                a.putExtra("item","Soya");
                startActivity(a);
            }
        });

        butter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Pulses.this,View_Farmlist.class);
                a.putExtra("catid",catid);
                a.putExtra("item","Butter beans");
                startActivity(a);
            }
        });

        mochai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Pulses.this,View_Farmlist.class);
                a.putExtra("catid",catid);
                a.putExtra("item","Mochai");
                startActivity(a);
            }
        });

        peas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Pulses.this,View_Farmlist.class);
                a.putExtra("catid",catid);
                a.putExtra("item","Peas");
                startActivity(a);
            }
        });

        channa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Pulses.this,View_Farmlist.class);
                a.putExtra("catid",catid);
                a.putExtra("item","Channa");
                startActivity(a);
            }
        });

        kollu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Pulses.this,View_Farmlist.class);
                a.putExtra("catid",catid);
                a.putExtra("item","Kollu");
                startActivity(a);
            }
        });

    }
}
