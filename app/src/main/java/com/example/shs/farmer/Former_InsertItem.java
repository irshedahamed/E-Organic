package com.example.shs.farmer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;

public class Former_InsertItem extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    TextView insertitem,category,itemname,quantity,cost;
    Button insert,view;
    EditText quantityb,costb;
    Spinner categorys,items;
    String state[]=null;
    String catid ;
    String farid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_former__insert_item);
        Bundle b = getIntent().getExtras();
        if(b!=null){
            farid=(String) b.get("id");
        }
        insertitem = (TextView)findViewById(R.id.textView_InsertItem);
        category = (TextView)findViewById(R.id.textView_Category);
        itemname = (TextView)findViewById(R.id.textView2_ItemName);
        quantity = (TextView)findViewById(R.id.textView4_Quantity);
        cost = (TextView)findViewById(R.id.textView5_Cost);
        quantityb = (EditText)findViewById(R.id.editText_quantity);
        costb = (EditText)findViewById(R.id.editText3_Cost);
        insert = (Button)findViewById(R.id.button_InsertItem);
        view = (Button)findViewById(R.id.button2_ViewItem);
        categorys = (Spinner)findViewById(R.id.spinner_category);
        items = (Spinner)findViewById(R.id.spinner_item);
        categorys.setOnItemSelectedListener(this);

        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String far_id = farid;//need tobe fetched from previous screen
                String c_id = catid;
                String item = items.getSelectedItem().toString();
                String quantity = quantityb.getText().toString();
                String pri = costb.getText().toString();
                Items obj = new Items(far_id,c_id,item,quantity,pri);
                Gson g = new Gson();
                String json =  g.toJson(obj).toString();
                Dbconnection db = new Dbconnection();
                String msg = db.insertItemdb(json);
                Toast.makeText(getApplicationContext(),msg,Toast.LENGTH_SHORT).show();
            }
        });

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mo = new Intent(Former_InsertItem.this,View_Inserted.class);
                mo.putExtra("id",farid);
                startActivity(mo);
            }
        });

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        this.catid = String.valueOf(position);

        if(position==0){
            state = new String[]{"Wheat", "Ragi", "Millet", "Raw rice", "Red rice", "Idly rice"};
        }
        if(position==1){
            state = new String[]{"Papaya", "Guava", "Custard apple", "Sapota", "Banana", "Mango"};
        }
        if(position==2){
            state = new String[]{"Brinjal", "Radish", "Vendai", "Avarai", "Thakkali", "Onion"};
        }
        if(position==3){
            state = new String[]{"Murungai", "Agathi", "Ponangani", "Palak", "Thandu", "Araikeerai"};
        }
        if(position==4){
            state = new String[]{"Maravalli", "Karunai", "Urulai", "Sakaravalli", "Panang kilangu", "Seppan kilangu"};
        }
        if(position==5){
            state = new String[]{"Soya", "Butter beans", "Mochai", "Peas", "Channa", "Kollu"};
        }

        ArrayAdapter<String> adt = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, state);
        items.setAdapter(adt);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
