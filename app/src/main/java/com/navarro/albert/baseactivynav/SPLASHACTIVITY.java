package com.navarro.albert.baseactivynav;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.navarro.albert.baseactivynav.LOGIN.Login;
import com.navarro.albert.baseactivynav.activities.SUPERCALCULATOR;

public class SPLASHACTIVITY extends AppCompatActivity {
    String PREFS_NAME = "Loggedin";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashactivity);
        SharedPreferences settings = getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        boolean something = settings.getBoolean("logged", false);
        if (something){
            Toast.makeText(getApplicationContext(), "WELCOME AGAIN", Toast.LENGTH_LONG).show();
            Intent correct = new Intent(this, SUPERCALCULATOR.class);
            startActivity(correct);
        }else{
            Intent correct = new Intent(this, Login.class);
            startActivity(correct);
        }
    }
}
