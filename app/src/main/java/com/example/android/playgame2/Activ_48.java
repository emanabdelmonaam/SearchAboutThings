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

import static com.example.android.playgame2.R.anim.sun_risetwo;

/**
 * Created by user on 11/17/2015.
 */
public class Activ_48 extends Activity {
    private Handler H = new Handler();
    Runnable r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fourtyeightyr);

        final Animation sun_risetwo = AnimationUtils.loadAnimation(this, R.anim.sun_risetwo);
        Button sun_risetwo1_46 = (Button) findViewById(R.id.musy46);
        sun_risetwo1_46.startAnimation(sun_risetwo);

        final Animation animScale = AnimationUtils.loadAnimation(this, R.anim.anim_scalein);
        Button btnScale = (Button) findViewById(R.id.next49);

        final MediaPlayer mp1 = MediaPlayer.create(this, R.raw.dooroopen);

        btnScale.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                arg0.startAnimation(animScale);
                mp1.start();

                H.removeCallbacks(r);
                int SPLASH_TIME_OUT = 2000;
                r = new Runnable() {
                    @Override
                    public void run() {

                        Intent i = new Intent(Activ_48.this, Activ_49.class);
                        startActivity(i);
                        finish();
                    }

                };

                H.postDelayed(r, SPLASH_TIME_OUT);
            }
        });}


    public void go_audio2_001(View view)
    {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.gotothepartment);
        mediaPlayer.setVolume(100, 100);
        mediaPlayer.start();
    }

}