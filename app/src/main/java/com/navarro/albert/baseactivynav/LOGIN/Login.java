package com.navarro.albert.baseactivynav.LOGIN;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.navarro.albert.baseactivynav.R;
import com.navarro.albert.baseactivynav.LOGIN.SIGNUP;
import com.navarro.albert.baseactivynav.activities.SUPERCALCULATOR;
import com.navarro.albert.baseactivynav.database.MyDataBaseHelper;


public class Login extends AppCompatActivity implements View.OnClickListener {
    Button login, signup;
    EditText username, password;
     MyDataBaseHelper helper;
    boolean silent;
    String PREFS_NAME = "Loggedin";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        login = (Button) findViewById(R.id.login);
        login.setOnClickListener(this);
        signup = (Button) findViewById(R.id.signup);
        signup.setOnClickListener(this);
        username = (EditText) findViewById(R.id.us);
        password = (EditText) findViewById(R.id.pass);
        helper = MyDataBaseHelper.getInstance(this);
        SharedPreferences settings = getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        silent = settings.getBoolean("logged", false);
    }


    @Override
    public void onClick(View view) {
            switch (view.getId()) {
                case R.id.signup:
                    Intent i = new Intent(this, SIGNUP.class);
                    startActivity(i);
                    break;
                case R.id.login:
                    String a = username.getText().toString();
                    String b = password.getText().toString();
                    String c = helper.queryRow(a);
                    if (!c.equals("Not found")) {
                        if (c.equals(b)) {
                            Toast.makeText(getApplicationContext(), "WELCOME " + a, Toast.LENGTH_LONG).show();
                            Intent correct = new Intent(this, SUPERCALCULATOR.class);
                            startActivity(correct);
                            SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);

                            SharedPreferences.Editor editor = settings.edit();

                            editor.putBoolean("logged", true);

                            editor.apply();
                        } else {
                            Toast.makeText(getApplicationContext(), "WRONG PASSWORD", Toast.LENGTH_LONG).show();
                        }
                    } else {
                        Toast.makeText(getApplicationContext(), "Username " + a + " Does not exist", Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(this, INCORRECT.class);
                        startActivity(intent);
                    }

                    break;}
    }

}



