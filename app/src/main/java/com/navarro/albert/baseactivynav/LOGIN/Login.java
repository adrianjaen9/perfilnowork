package com.navarro.albert.baseactivynav.LOGIN;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.navarro.albert.baseactivynav.R;
import com.navarro.albert.baseactivynav.activities.SUPERCALCULATOR;
import com.navarro.albert.baseactivynav.database.MyDataBaseHelper;


public class Login extends AppCompatActivity implements View.OnClickListener {
    Button login, signup;
    EditText username, passsword;
     MyDataBaseHelper helper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        login = (Button) findViewById(R.id.login);
        login.setOnClickListener(this);
        signup = (Button) findViewById(R.id.signup);
        signup.setOnClickListener(this);
        username = (EditText) findViewById(R.id.us);
        passsword = (EditText) findViewById(R.id.pass);
        helper = MyDataBaseHelper.getInstance(this);

    }

    @Override
    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.signup:
                Intent i = new Intent(this,SIGNUP.class);
                startActivity(i);
            case R.id.login:
                if (username.getText().toString().equals("adrianjaen") && passsword.getText().toString().equals("adrianjaen")) {
                    Intent intent = new Intent(this, SUPERCALCULATOR.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), "WELCOME ADRIAN", Toast.LENGTH_LONG).show();
                }else Toast.makeText(getApplicationContext(), "ERROR, ADE STUDENT DETECTED", Toast.LENGTH_LONG).show();



        }

    }
}


