package com.example.shs.farmer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tubers extends AppCompatActivity {

    Button maravali,karunai,urulai,sakaravali,panang,seppan;
    String catid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tubers);

        maravali = (Button)findViewById(R.id.button_maravali);
        karunai = (Button)findViewById(R.id.button2_karunai);
        urulai = (Button)findViewById(R.id.button3_urulai);
        sakaravali = (Button)findViewById(R.id.button4_sakaravali);
        panang = (Button)findViewById(R.id.button5_panang);
        seppan = (Button)findViewById(R.id.button6_seppan);

        Bundle b = getIntent().getExtras();
        catid = (String) b.get("id");

        maravali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Tubers.this,View_Farmlist.class);
                a.putExtra("catid",catid);
                a.putExtra("item","Maravalli");
                startActivity(a);
            }
        });

        karunai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Tubers.this,View_Farmlist.class);
                a.putExtra("catid",catid);
                a.putExtra("item","Karunai");
                startActivity(a);
            }
        });

        urulai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Tubers.this,View_Farmlist.class);
                a.putExtra("catid",catid);
                a.putExtra("item","Urulai");
                startActivity(a);
            }
        });

        sakaravali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Tubers.this,View_Farmlist.class);
                a.putExtra("catid",catid);
                a.putExtra("item","Sakaravalli");
                startActivity(a);
            }
        });

        panang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Tubers.this,View_Farmlist.class);
                a.putExtra("catid",catid);
                a.putExtra("item","Panang kilangu");
                startActivity(a);
            }
        });

        seppan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Tubers.this,View_Farmlist.class);
                a.putExtra("catid",catid);
                a.putExtra("item","Seppan kilangu");
                startActivity(a);
            }
        });

    }
}
