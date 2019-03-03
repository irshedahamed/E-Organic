package com.example.shs.farmer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Former_Login extends AppCompatActivity {

    TextView forlog,forid,pass,newfor;
    EditText fid,fpass;
    Button signf,signupf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_former__login);
        forlog = (TextView)findViewById(R.id.textView_FormerLogin);
        forid = (TextView)findViewById(R.id.textView_FormerId);
        pass = (TextView)findViewById(R.id.textView_Password);
        newfor = (TextView)findViewById(R.id.textView_NewFormer);
        fid = (EditText)findViewById(R.id.editText_FoemerId);
        fpass = (EditText)findViewById(R.id.editText_FormerPassword);
        signf = (Button)findViewById(R.id.button_FormerSignin);
        signupf = (Button)findViewById(R.id.button_FormerSignup);
        signf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nxt = new Intent(Former_Login.this,Former_InsertItem.class);
                startActivity(nxt);
            }
        });

        signupf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nxt1 = new Intent(Former_Login.this,Former_Registration.class);
                startActivity(nxt1);
            }
        });

    }
}
