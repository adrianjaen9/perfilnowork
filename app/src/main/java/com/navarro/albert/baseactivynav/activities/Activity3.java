package com.navarro.albert.baseactivynav.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.navarro.albert.baseactivynav.BaseActivity;
import com.navarro.albert.baseactivynav.R;

public class Activity3 extends BaseActivity implements View.OnClickListener {

    Button igual, num0 ,num1, num2, num3, num4, num5, num6, num7, num8 ,num9, sum, rest, mult, div, ac, ans, mod, dec;
    private TextView result;
    Boolean suma = false;
    Boolean resta = false;
    Boolean multi = false;
    Boolean divi = false;
    Boolean modul = false;
    Boolean decimal = false;
    Double numero1, numero2;
    private double resultat;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        result = (TextView) findViewById(R.id.result) ;
        num0 = (Button) findViewById(R.id.num0);
        num0.setOnClickListener(this);
        num1 = (Button) findViewById(R.id.num1);
        num1.setOnClickListener(this);
        num2 = (Button) findViewById(R.id.num2);
        num2.setOnClickListener(this);
        num3 = (Button) findViewById(R.id.num3);
        num3.setOnClickListener(this);
        num4 = (Button) findViewById(R.id.num4);
        num4.setOnClickListener(this);
        num5 = (Button) findViewById(R.id.num5);
        num5.setOnClickListener(this);
        num6 = (Button) findViewById(R.id.num6);
        num6.setOnClickListener(this);
        num7 = (Button) findViewById(R.id.num7);
        num7.setOnClickListener(this);
        num8 = (Button) findViewById(R.id.num8);
        num8.setOnClickListener(this);
        num9 = (Button) findViewById(R.id.num9);
        num9.setOnClickListener(this);
        sum = (Button) findViewById(R.id.sum);
        sum.setOnClickListener(this);
        rest = (Button) findViewById(R.id.rest);
        rest.setOnClickListener(this);
        mult = (Button) findViewById(R.id.multiplicar);
        mult.setOnClickListener(this);
        div = (Button) findViewById(R.id.dividir);
        div.setOnClickListener(this);
        ac = (Button) findViewById(R.id.ac);
        ac.setOnClickListener(this);
        ans = (Button) findViewById(R.id.ans);
        ans.setOnClickListener(this);
        dec = (Button) findViewById(R.id.dec);
        dec.setOnClickListener(this);
        mod = (Button) findViewById(R.id.mod);
        mod.setOnClickListener(this);
        igual = (Button) findViewById(R.id.igual);
        igual.setOnClickListener(this);
        setTitle("Activity3");
        setItemChecked();

    }


    @Override
    public void onClick(View v) {
        result = (TextView)findViewById(R.id.result);
        String a =result.getText().toString();
        switch (v.getId()){
            case R.id.num0:
                result.setText(a+"0");
                break;
            case R.id.num1:
                result.setText(a+"1");
                break;
            case R.id.num2:
                result.setText(a+"2");
                break;
            case R.id.num3:
                result.setText(a+"3");
                break;
            case R.id.num4:
                result.setText(a+"4");
                break;
            case R.id.num5:
                result.setText(a+"5");
                break;
            case R.id.num6:
                result.setText(a+"6");
                break;
            case R.id.num7:
                result.setText(a+"7");
                break;
            case R.id.num8:
                result.setText(a+"8");
                break;
            case R.id.num9:
                result.setText(a+"9");
                break;
            case R.id.sum:
                suma = true;
                numero1 = Double.parseDouble(a);
                result.setText("");
                break;
            case R.id.mod:
                modul = true;
                numero1 = Double.parseDouble(a);
                result.setText("");
                break;
            case R.id.dec:
                if (decimal == false) {
                    result.setText(a + ".");
                    decimal = true;
                }
                else{return;}
                break;
            case R.id.rest:
                resta = true;
                numero1 = Double.parseDouble(a);
                result.setText("");
                break;
            case R.id.multiplicar:
                multi = true;
                numero1 = Double.parseDouble(a);
                result.setText("");
                break;
            case R.id.dividir:
                divi = true;
                numero1 = Double.parseDouble(a);
                result.setText("");
                break;
            case R.id.ac:
                numero1 = 0.0;
                numero2 = 0.0;
                suma = false;
                resta = false;
                multi = false;
                divi = false;
                decimal = false;
                modul = false;
                resultat = 0.0;
                result.setText("0.0");
                break;
            case R.id.igual:
                Log.v("HOLA","hemos entrado en el igual");
                numero2 = Double.parseDouble(a);
                if ( suma == true){
                    resultat = numero1 + numero2;
                    result.setText(String.valueOf(resultat));
                }else if ( resta == true){
                    resultat = numero1 - numero2;
                    result.setText(String.valueOf(resultat));
                }else if ( multi == true){
                    resultat = numero1 * numero2;
                    result.setText(String.valueOf(resultat));
                }else if ( divi == true){
                    resultat = numero1 / numero2;
                    result.setText(String.valueOf(resultat));
                }else if ( modul == true){
                    resultat = numero1 % numero2;
                    result.setText(String.valueOf(resultat));
                }
                suma = false;
                resta = false;
                multi = false;
                divi = false;
                decimal = false;
                modul = false;

                break;
            case R.id.ans:
                numero1 = resultat;
                result.setText(String.valueOf(resultat));
                break;

        }
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        resultat = savedInstanceState.getDouble("resultado");
        result.setText(String.valueOf(resultat));
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putDouble("resultado",resultat);

    }

    @Override
    protected int whatIsMyId() {
        return R.id.activity3;
    }
}
