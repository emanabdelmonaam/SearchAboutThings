package com.example.android.playgame2;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ViewFlipper;

/**
 * Created by user on 11/17/2015.
 */
public class Activ_41 extends Activity {
    private Handler H = new Handler();
    Runnable r;
    private ViewFlipper viewFlipper;
    private float lastX;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fourtyoneyyy);
        viewFlipper = (ViewFlipper) findViewById(R.id.view_flipper);

        final Animation sun_risetwo = AnimationUtils.loadAnimation(this, R.anim.sun_risetwo);
        Button sun_risetwo1_41 = (Button) findViewById(R.id.button_41);
        sun_risetwo1_41.startAnimation(sun_risetwo);

         Button sun_risetwo4_41 = (Button) findViewById(R.id.button4_41);
        sun_risetwo4_41.startAnimation(sun_risetwo);

        Button sun_risetwo5_41 = (Button) findViewById(R.id.button5_41);
        sun_risetwo5_41.startAnimation(sun_risetwo);

        Button sun_risetwo6_41 = (Button) findViewById(R.id.button6_41);
        sun_risetwo6_41.startAnimation(sun_risetwo);

        Button sun_risetwo7_41 = (Button) findViewById(R.id.button7_41);
        sun_risetwo7_41.startAnimation(sun_risetwo);

        Button sun_risetwo8_41 = (Button) findViewById(R.id.button8_41);
        sun_risetwo8_41.startAnimation(sun_risetwo);

        final Animation animScale = AnimationUtils.loadAnimation(this, R.anim.anim_scale);
        Button btnScale = (Button) findViewById(R.id.but3_2_39);
        final MediaPlayer mp1 = MediaPlayer.create(this, R.raw.soundwinir);
        btnScale.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                arg0.startAnimation(animScale);
                mp1.start();

                H.removeCallbacks(r);
                int SPLASH_TIME_OUT = 1000;
                r = new Runnable() {
                    @Override
                    public void run() {

                        Intent i = new Intent(Activ_41.this, Activ_42.class);
                        startActivity(i);
                        finish();
                    }

                };

                H.postDelayed(r, SPLASH_TIME_OUT);
            }
        });
    }

    public void go_sot_salaty15(View view){

        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.whatiiwant);
        mediaPlayer.setVolume(100, 100);

        mediaPlayer.start();
    }

    public void goo_activyy_039 (View view){

        Intent intent;
        intent=new Intent(this,Activ_39.class);

        startActivity(intent);

    }

    // Method to handle touch event like left to right swap and right to left swap
    public boolean onTouchEvent(MotionEvent touchevent)
    {
        switch (touchevent.getAction())
        {
            // when user first touches the screen to swap
            case MotionEvent.ACTION_DOWN:
            {
                lastX = touchevent.getX();
                break;
            }
            case MotionEvent.ACTION_UP:
            {
                float currentX = touchevent.getX();

                // if left to right swipe on screen
                if (lastX < currentX)
                {
                    // If no more View/Child to flip
                    if (viewFlipper.getDisplayedChild() == 0)
                        break;

                    // set the required Animation type to ViewFlipper
                    // The Next screen will come in form Left and current Screen will go OUT from Right
                    viewFlipper.setInAnimation(this, R.anim.in_from_left);
                    viewFlipper.setOutAnimation(this, R.anim.out_to_right);
                    // Show the next Screen
                    viewFlipper.showNext();
                }

                // if right to left swipe on screen
                if (lastX > currentX)
                {
                    if (viewFlipper.getDisplayedChild() == 1)
                        break;
                    // set the required Animation type to ViewFlipper
                    // The Next screen will come in form Right and current Screen will go OUT from Left
                    viewFlipper.setInAnimation(this, R.anim.in_from_right);
                    viewFlipper.setOutAnimation(this, R.anim.out_to_left);
                    // Show The Previous Screen
                    viewFlipper.showPrevious();
                }
                break;
            }
        }
        return false;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Destroy timer
        //delete H;
    }
    @Override
    protected void onPause() {
        super.onPause();
        //      delete H;
    }
    @Override
    protected void onStop() {
        super.onStop();
        //    delete H;

    }
}