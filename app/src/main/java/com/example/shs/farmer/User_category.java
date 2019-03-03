package com.example.shs.farmer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class User_category extends AppCompatActivity {

    Button first,fruit,vege,green,tuber,pulse;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_category);
        first = (Button)findViewById(R.id.button_first);
        fruit = (Button)findViewById(R.id.button2_fruit);
        vege = (Button)findViewById(R.id.button3_vege);
        green = (Button)findViewById(R.id.button4_green);
        tuber = (Button)findViewById(R.id.button5_Tubers);
        pulse = (Button)findViewById(R.id.button6_pulse);

        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(User_category.this,First_foods.class);
                a.putExtra("id","0");
                startActivity(a);
            }
        });

        fruit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(User_category.this,Fruits.class);
                b.putExtra("id","1");
                startActivity(b);
            }
        });

        vege.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c = new Intent(User_category.this,Vegetable.class);
                c.putExtra("id","2");
                startActivity(c);
            }
        });

        green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent d = new Intent(User_category.this,Greens.class);
                d.putExtra("id","3");
                startActivity(d);
            }
        });

        tuber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent e = new Intent(User_category.this,Tubers.class);
                e.putExtra("id","4");
                startActivity(e);
            }
        });

        pulse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent f = new Intent(User_category.this,Pulses.class);
                f.putExtra("id","5");
                startActivity(f);
            }
        });

    }
}
