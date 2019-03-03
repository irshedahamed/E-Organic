package com.example.shs.farmer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import org.json.simple.JSONObject;


public class
MainActivity extends AppCompatActivity {

    TextView title,welcome,farmer,user,newreg;
    EditText usid,usps;
    Button farmerc,userc,sign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        title = (TextView)findViewById(R.id.textView_Title);
        welcome = (TextView)findViewById(R.id.textView_Welcome);
        farmer = (TextView)findViewById(R.id.textView_Former);
        user = (TextView)findViewById(R.id.textView_User);
        newreg = (TextView)findViewById(R.id.textView_newreg);
        usid = (EditText) findViewById(R.id.editText_enusid);
        usps = (EditText) findViewById(R.id.editText2_enups);
        farmerc = (Button)findViewById(R.id.button_FormerClick);
        userc = (Button)findViewById(R.id.button_UserClick);
        sign = (Button)findViewById(R.id.sign);

        farmerc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this,Former_Registration.class);
                startActivity(in);
            }
        });

        userc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent en = new Intent(MainActivity.this,User_Registration.class);
                startActivity(en);
            }
        });

        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                JSONObject obj = new JSONObject();
                String id = usid.getText().toString();
                String password = usps.getText().toString();
                obj.put("id",id);
                obj.put("password",password);
                String json = obj.toString();

                Dbconnection con = new Dbconnection();
                String type = con.checkLogin(json);
                if(("user").equals(type)){
                    Intent ko = new Intent(MainActivity.this,User_category.class);
                     ko.putExtra("id",id);
                    startActivity(ko);
                }
                else if(("farmer").equals(type)){
                    Intent kop = new Intent(MainActivity.this,Former_InsertItem.class);
                    kop.putExtra("id",id);
                    startActivity(kop);
                }
                else{
                    Toast.makeText(getApplicationContext(),"Invalid Login",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
