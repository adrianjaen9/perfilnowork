package com.navarro.albert.baseactivynav.activities;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.navarro.albert.baseactivynav.BaseActivity;
import com.navarro.albert.baseactivynav.R;

public class Activity2 extends BaseActivity {
    Drawable one, two, three, four, one1, two1, three1, four1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        setTitle("Activity2");
        setItemChecked();
    }

    @Override
    protected int whatIsMyId() {
        return R.id.activity2;
    }
}
