package com.example.shs.farmer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Former_Registration extends AppCompatActivity {

    TextView forreg,foname,cnfo,fopass,foloc,fophn;
    EditText forname,forpass,cnff,forloc,forphn;
    Button reg;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_former__registration);
        forreg = (TextView)findViewById(R.id.textView_FormerRegPage);
        cnfo = (TextView)findViewById(R.id.textView_cnffar);
        foname = (TextView)findViewById(R.id.textView3_FormerName);
        fopass = (TextView)findViewById(R.id.textView4_FormerPassword);
        foloc = (TextView)findViewById(R.id.textView5_FormerLocation);
        fophn = (TextView)findViewById(R.id.textView6_PNO);
        cnff = (EditText)findViewById(R.id.editText_cnffar);
        forname = (EditText)findViewById(R.id.editText2_FormerName);
        forpass = (EditText)findViewById(R.id.editText3_FormerPassword);
        forloc = (EditText)findViewById(R.id.editText4_FormerLocation);
        forphn = (EditText)findViewById(R.id.editText5_FormerPno);
        reg = (Button)findViewById(R.id.button_FormerReg);
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = forname.getText().toString();
                String city = forloc.getText().toString();
                String phno = forphn.getText().toString();
                String pass = forpass.getText().toString();
                String cpass = cnff.getText().toString();
                if(pass.equals(cpass)){
                    JSONArray arr = new JSONArray();
                    Farmer user = new Farmer();
                    user.setName(name);
                    user.setCity(city);
                    user.setPhno(phno);
                    Gson g = new Gson();
                    String s = g.toJson(user);
                    arr.add(s);
                    arr.add(pass);
                    String json = arr.toString();
                    Dbconnection db = new Dbconnection();
                    String userid = db.insertFarmerdb(json);
                    Toast.makeText(getApplicationContext(),userid,Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(),"Password Doesnt Match",Toast.LENGTH_SHORT).show();
                    forpass.setText("");
                    cnff.setText("");
                }

               // Intent wow = new Intent(Former_Registration.this,MainActivity.class);
                //startActivity(wow);
            }
        });
    }
}
