package com.example.firsteypipi;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.GlideDrawableImageViewTarget;

public class splash_activity extends AppCompatActivity {

    ImageView splashActivity;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_activity);

        getWindow().setStatusBarColor(getResources().getColor(R.color.colorBlue));

        splashActivity = findViewById(R.id.splash_animation);
        GlideDrawableImageViewTarget imageViewTarget = new GlideDrawableImageViewTarget(splashActivity);
        Glide.with(this).load(R.raw.micro_soccer_splash_animation).into(imageViewTarget);

        new CountDownTimer(3000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {

            }

            @Override
            public void onFinish() {
                Intent intent = new Intent(splash_activity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }.start();

    }
}