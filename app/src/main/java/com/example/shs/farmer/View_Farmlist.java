package com.example.shs.farmer;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import com.google.gson.Gson;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class View_Farmlist extends AppCompatActivity {

    TableLayout tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view__farmlist);
        tv=(TableLayout)findViewById(R.id.tablefarm);
        tv.removeAllViewsInLayout();
        JSONObject obj = new JSONObject();
        Bundle b = getIntent().getExtras();
        String catid = (String) b.get("catid");
        String catitem = (String) b.get("item");
        obj.put("id",catid);
        String json = obj.toString();
        Dbconnection db = new Dbconnection();
        String res = db.fetchFarmdb(json);
        Log.e("Response",res);
        TableRow tr1=new TableRow(View_Farmlist.this);

        tr1.setLayoutParams(new TableRow.LayoutParams(
                TableRow.LayoutParams.FILL_PARENT,
                TableRow.LayoutParams.WRAP_CONTENT));
        TextView b6=new TextView(View_Farmlist.this);
        b6.setText("Farmer Name");
        b6.setTextColor(Color.BLUE);
        b6.setTextSize(25);
        tr1.addView(b6);

        TextView b19=new TextView(View_Farmlist.this);
        b19.setPadding(10, 0, 0, 0);
        b19.setTextSize(25);
        b19.setText("Quantity");
        b19.setTextColor(Color.BLUE);
        tr1.addView(b19);

        TextView b29=new TextView(View_Farmlist.this);
        b29.setPadding(10, 0, 0, 0);
        b29.setText("Cost/kg");
        b29.setTextColor(Color.BLUE);
        b29.setTextSize(25);
        tr1.addView(b29);


        TextView b31=new TextView(View_Farmlist.this);
        b31.setPadding(10, 0, 0, 0);
        b31.setText("Phone No");
        b31.setTextColor(Color.BLUE);
        b31.setTextSize(25);
        tr1.addView(b31);


        tv.addView(tr1);


        final View vline = new View(View_Farmlist.this);
        vline.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.FILL_PARENT, 2));
        vline.setBackgroundColor(Color.BLUE);

        tv.addView(vline);

        JSONParser parser = new JSONParser();
        try {
            JSONArray arr =(JSONArray)parser.parse(res);
            if(arr!=null){
                for(int i=0;i<arr.size();i++){
                    UserDisplay item = new Gson().fromJson(arr.get(i).toString(),UserDisplay.class);
                    String g = item.getItem();
                    Log.e("Item",g);
                    if(g.equals(catitem)) {
                        TableRow tr = new TableRow(View_Farmlist.this);

                        tr.setLayoutParams(new TableRow.LayoutParams(
                                TableRow.LayoutParams.FILL_PARENT,
                                TableRow.LayoutParams.WRAP_CONTENT));

                        TextView bi = new TextView(View_Farmlist.this);
                        bi.setText(item.getFarname());
                        bi.setTextColor(Color.RED);
                        bi.setTextSize(25);
                        tr.addView(bi);


                        TextView b1 = new TextView(View_Farmlist.this);
                        b1.setPadding(10, 0, 0, 0);
                        b1.setTextSize(25);
                        b1.setText(item.getQuantity());
                        b1.setTextColor(Color.RED);
                        tr.addView(b1);

                        TextView b2 = new TextView(View_Farmlist.this);
                        b2.setPadding(10, 0, 0, 0);
                        b2.setText(item.getPrice());
                        b2.setTextColor(Color.RED);
                        b2.setTextSize(25);
                        tr.addView(b2);

                        TextView b5 = new TextView(View_Farmlist.this);
                        b5.setPadding(10, 0, 0, 0);
                        b5.setText(item.getPhno());
                        b5.setTextColor(Color.RED);
                        b5.setTextSize(25);
                        tr.addView(b5);

                        tv.addView(tr);


                        final View vline1 = new View(View_Farmlist.this);
                        vline1.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.FILL_PARENT, 1));
                        vline1.setBackgroundColor(Color.WHITE);
                        tv.addView(vline1);
                    }
                }
            }

        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
