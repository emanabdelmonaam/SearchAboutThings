package com.example.android.playgame2;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

/**
 * Created by user on 11/17/2015.
 */
public class Break_50 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.break50);

        final MediaPlayer mp2 = MediaPlayer.create(this, R.raw.coinjdrop);

        mp2.start();
    }

    public void goo_app_001(View view)

    {

        Intent intent;
        intent=new Intent(this,Activ_31.class);

        startActivity(intent);

    }

    public void clickExit(View v){
        finish();

    }

}