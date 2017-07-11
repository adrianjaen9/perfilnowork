package com.navarro.albert.baseactivynav.activities;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.example.material.joanbarroso.flipper.CoolImageFlipper;
import com.navarro.albert.baseactivynav.BaseActivity;
import com.navarro.albert.baseactivynav.R;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Activity2 extends BaseActivity implements View.OnClickListener {
    Drawable p0, p1, p2, p3, p4, p5, p6, p7;
    ImageView image1, image2, image3, image4, image5, image6, image7, image8,
    image9, image10, image11, image12, image13, image14, image15, image16;
    List< ImageView > fotos = new LinkedList<>();
    List< Drawable> drawables = new LinkedList<>();
    boolean primer = true;
    Drawable foto1, foto2;
    ImageView i1, i2;
    int aciertos, fallos = 0;


        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        setTitle("Activity2");
        setItemChecked();
        image1 = (ImageView) findViewById(R.id.i1);
            image1.setOnClickListener(this);
        image2 = (ImageView) findViewById(R.id.i2);
            image2.setOnClickListener(this);
        image3 = (ImageView) findViewById(R.id.i3);
            image3.setOnClickListener(this);
        image4 = (ImageView) findViewById(R.id.i4);
            image4.setOnClickListener(this);
        image5 = (ImageView) findViewById(R.id.i5);
            image5.setOnClickListener(this);
        image6 = (ImageView) findViewById(R.id.i6);
            image6.setOnClickListener(this);
        image7 = (ImageView) findViewById(R.id.i7);
            image7.setOnClickListener(this);
        image8 = (ImageView) findViewById(R.id.i8);
            image8.setOnClickListener(this);
        image9 = (ImageView) findViewById(R.id.i9);
            image9.setOnClickListener(this);
        image10 = (ImageView) findViewById(R.id.i10);
            image10.setOnClickListener(this);
        image11 = (ImageView) findViewById(R.id.i11);
            image11.setOnClickListener(this);
        image12 = (ImageView) findViewById(R.id.i12);
            image12.setOnClickListener(this);
        image13 = (ImageView) findViewById(R.id.i13);
            image13.setOnClickListener(this);
        image14 = (ImageView) findViewById(R.id.i14);
            image14.setOnClickListener(this);
        image15 = (ImageView) findViewById(R.id.i15);
            image15.setOnClickListener(this);
        image16 = (ImageView) findViewById(R.id.i16);
            image16.setOnClickListener(this);
            p0 = (Drawable) getResources().getDrawable(R.drawable.bb) ;
            p1 = (Drawable) getResources().getDrawable(R.drawable.g6) ;
            p2 = (Drawable) getResources().getDrawable(R.drawable.iphone) ;
            p3 = (Drawable) getResources().getDrawable(R.drawable.s8) ;
            p4 = (Drawable) getResources().getDrawable(R.drawable.sony) ;
            p5 = (Drawable) getResources().getDrawable(R.drawable.tocho) ;
            p6 = (Drawable) getResources().getDrawable(R.drawable.mobil) ;
            p7 = (Drawable) getResources().getDrawable(R.drawable.p10) ;


        fotos.add(image1);
            fotos.add(image2);
            fotos.add(image3);
            fotos.add(image4);
            fotos.add(image5);
            fotos.add(image6);
            fotos.add(image7);
            fotos.add(image8);
            fotos.add(image9);
            fotos.add(image10);
            fotos.add(image11);
            fotos.add(image12);
            fotos.add(image13);
            fotos.add(image14);
            fotos.add(image15);
            fotos.add(image16);
        Collections.shuffle(fotos);
            drawables.add(p0);
            drawables.add(p1);
            drawables.add(p2);
            drawables.add(p3);
            drawables.add(p4);
            drawables.add(p5);
            drawables.add(p6);
            drawables.add(p7);

    }

    @Override
    protected int whatIsMyId() {
        return R.id.activity2;
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.i1:
                int n = troba(fotos, image1);
                if (n > 7) n = n - 8;
                Drawable a = drawables.get(n);
                CoolImageFlipper flipper = new CoolImageFlipper(this);
                flipper.flipImage(a, image1);
                if (primer){
                    foto1 = a;
                    primer = false;
                }else{
                    foto2 = a;
                    if ( foto1 == foto2) {
                        ++aciertos;
                    }
                    else {
                        Log.v("HOLA","HOLA");
                        ++fallos;
                        Handler handler = new Handler();
                        Runnable runnable = new Runnable() {
                            @Override
                            public void run() {
                                Drawable drawable;
                                drawable = getResources().getDrawable(R.drawable.phone);
                                CoolImageFlipper flipper = new CoolImageFlipper(getApplicationContext());
                                flipper.flipImage(drawable, image1);
                                flipper.flipImage(drawable, image2);
                            }
                        };
                        handler.postDelayed(runnable, 2000);
                        primer = true;
                    }
                }

                break;
            case R.id.i2:
                n = troba(fotos, image2);
                if (n > 7) n = n - 8;
                a = drawables.get(n);
                flipper = new CoolImageFlipper(this);
                flipper.flipImage(a, image2);
                break;
            case R.id.i3:
                n = troba(fotos, image3);
                if (n > 7) n = n - 8;
                a = drawables.get(n);
                flipper = new CoolImageFlipper(this);
                flipper.flipImage(a, image3);
                break;
            case R.id.i4:
                n = troba(fotos, image4);
                if (n > 7) n = n - 8;
                a = drawables.get(n);
                flipper = new CoolImageFlipper(this);
                flipper.flipImage(a, image4);
                break;
            case R.id.i5:
                n = troba(fotos, image5);
                if (n > 7) n = n - 8;
                a = drawables.get(n);
                flipper = new CoolImageFlipper(this);
                flipper.flipImage(a, image5);
                break;
            case R.id.i6:
                n = troba(fotos, image6);
                if (n > 7) n = n - 8;
                a = drawables.get(n);
                flipper = new CoolImageFlipper(this);
                flipper.flipImage(a, image6);
                break;
            case R.id.i7:
                n = troba(fotos, image7);
                if (n > 7) n = n - 8;
                a = drawables.get(n);
                flipper = new CoolImageFlipper(this);
                flipper.flipImage(a, image7);
                break;
            case R.id.i8:
                n = troba(fotos, image8);
                if (n > 7) n = n - 8;
                a = drawables.get(n);
                flipper = new CoolImageFlipper(this);
                flipper.flipImage(a, image8);
                break;
            case R.id.i9:
                n = troba(fotos, image9);
                if (n > 7) n = n - 8;
                a = drawables.get(n);
                flipper = new CoolImageFlipper(this);
                flipper.flipImage(a, image9);
                break;
            case R.id.i10:
                n = troba(fotos, image10);
                if (n > 7) n = n - 8;
                a = drawables.get(n);
                flipper = new CoolImageFlipper(this);
                flipper.flipImage(a, image10);
                break;
            case R.id.i11:
                n = troba(fotos, image11);
                if (n > 7) n = n - 8;
                a = drawables.get(n);
                flipper = new CoolImageFlipper(this);
                flipper.flipImage(a, image11);
                break;
            case R.id.i12:
                n = troba(fotos, image12);
                if (n > 7) n = n - 8;
                a = drawables.get(n);
                flipper = new CoolImageFlipper(this);
                flipper.flipImage(a, image12);
                break;
            case R.id.i13:
                n = troba(fotos, image13);
                if (n > 7) n = n - 8;
                a = drawables.get(n);
                flipper = new CoolImageFlipper(this);
                flipper.flipImage(a, image13);
                break;
            case R.id.i14:
                n = troba(fotos, image14);
                if (n > 7) n = n - 8;
                a = drawables.get(n);
                flipper = new CoolImageFlipper(this);
                flipper.flipImage(a, image14);
                break;
            case R.id.i15:
                n = troba(fotos, image15);
                if (n > 7) n = n - 8;
                a = drawables.get(n);
                flipper = new CoolImageFlipper(this);
                flipper.flipImage(a, image15);
                break;
            case R.id.i16:
                n = troba(fotos, image16);
                if (n > 7) n = n - 8;
                a = drawables.get(n);
                flipper = new CoolImageFlipper(this);
                flipper.flipImage(a, image16);
                break;
        }
    }
    public void juga (final ImageView i1, final ImageView i2){
        Log.v("HOLA","HOLA");
        ++fallos;
        Handler handler = new Handler();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                Drawable drawable;
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    drawable = getResources().getDrawable(R.drawable.phone, null);
                }
                else drawable = getResources().getDrawable(R.drawable.phone);
                CoolImageFlipper flipper = new CoolImageFlipper(getApplicationContext());
                flipper.flipImage(drawable, i1);
                flipper.flipImage(drawable, i2);
            }
        };
        handler.postDelayed(runnable, 2000);
        primer = true;

    }
    public int troba (List<ImageView> a, ImageView b){
        for (int i = 0; i < 16; ++i){
            if (b == a.get(i)) return i;
        }
        return 0;
    }


}
