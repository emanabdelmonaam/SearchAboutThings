package com.example.android.playgame2;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

/**
 * Created by user on 11/17/2015.z
 */
public class Activ_33 extends Activity {
    private Handler H = new Handler();
    Runnable r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thertythreeye);




        final Animation animScale = AnimationUtils.loadAnimation(this, R.anim.anim_scalein);
        Button btnScale = (Button) findViewById(R.id.next34);

        final MediaPlayer mp1 = MediaPlayer.create(this, R.raw.dooroopen);

        btnScale.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                arg0.startAnimation(animScale);  mp1.start();

                H.removeCallbacks(r);
                int SPLASH_TIME_OUT = 2000;
                r = new Runnable() {
                    @Override
                    public void run() {

                        Intent i = new Intent(Activ_33.this, Activ_34.class);
                        startActivity(i);
                        finish();
                    }

                };

                H.postDelayed(r, SPLASH_TIME_OUT);
            }
        });
    }
    public void go_audio2_001(View view){

        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.gotothepartment);
        mediaPlayer.setVolume(100, 100);
        mediaPlayer.start();
    }

}