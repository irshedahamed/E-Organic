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

public class User_Registration extends AppCompatActivity {

    TextView usereg,usename,cnus,usepass,useloc,usephn;
    EditText usname,uspass,cnuss,usloc,usphn;
    Button usreg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user__registration);
        usereg = (TextView)findViewById(R.id.textView_usregfrm);
        cnus = (TextView)findViewById(R.id.textView_cfus);
        usename = (TextView)findViewById(R.id.textView3_usnamee);
        usepass = (TextView)findViewById(R.id.textView4_uspase);
        useloc = (TextView)findViewById(R.id.textView5_city);
        usephn = (TextView)findViewById(R.id.textView6_usphn);
        cnuss = (EditText)findViewById(R.id.editText2_cnus);
        usname = (EditText)findViewById(R.id.editText5_usnamee);
        uspass = (EditText)findViewById(R.id.editText3_uspassee);
        usloc = (EditText)findViewById(R.id.editText_cittt);
        usphn = (EditText)findViewById(R.id.editText_usphnn);
        usreg = (Button)findViewById(R.id.button_usreg);
        usreg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = usname.getText().toString();
                String city = usloc.getText().toString();
                String phno = usphn.getText().toString();
                String pass = uspass.getText().toString();
                String cpass = cnuss.getText().toString();
                if(pass.equals(cpass)){
                    JSONArray arr = new JSONArray();
                    User user = new User();
                    user.setName(name);
                    user.setCity(city);
                    user.setPhno(phno);
                    Gson g = new Gson();
                    String s = g.toJson(user);
                    arr.add(s);
                    arr.add(pass);
                    String json = arr.toString();
                    Dbconnection db = new Dbconnection();
                    String userid = db.insertUserdb(json);
                    Toast.makeText(getApplicationContext(),userid,Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(),"Password Doesnt Match",Toast.LENGTH_SHORT).show();
                    cnuss.setText("");
                    uspass.setText("");
                }
               //  Intent use = new Intent(User_Registration.this,MainActivity.class);
               // startActivity(use);
            }
        });

    }
}
