package com.example.android.playgame2;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainActivity extends Activity {

    Button btnScale;
    private Handler H = new Handler();
    Runnable r;

    private  static int SPLASH_TIME_OUT= 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Animation animScale = AnimationUtils.loadAnimation(this, R.anim.anim_scale);
        Button btnScale = (Button) findViewById(R.id.buttonplayad);
        final Animation animScale1 = AnimationUtils.loadAnimation(this, R.anim.anim_scale);

        btnScale.setOnClickListener(new View.OnClickListener() {

                                        public void onClick(View arg0) {

                                            arg0.startAnimation(animScale);
                                            H.removeCallbacks(r);
                                            int SPLASH_TIME_OUT = 1000;
                                            r = new Runnable() {
                                                @Override
                                                public void run() {
                                                    Intent i = new Intent(MainActivity.this, Activ_31.class);
                                                    startActivity(i);
                                                    finish();
                                                }

                                            };
                                            H.postDelayed(r, SPLASH_TIME_OUT);
                                        }

                                    }

        );
    }

    public void clickExit(View v){
        finish();

    }

    @Override

    public void onBackPressed(){

        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setMessage("هل تريد الخروج؟");
        builder.setCancelable(true);

        builder.setPositiveButton("نعم", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {
                finish();

            }
        });
        builder.setNegativeButton("لا", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {
                dialog.cancel();
            }
        });
        AlertDialog alert =builder.create();
        alert.show();
    }

}