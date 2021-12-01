package com.nareshgediya.noveltyzone;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;

public class SplashActivity extends AppCompatActivity {

    ImageView imageView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main2);


        textView = findViewById(R.id.textView1);
        imageView = findViewById(R.id.imageView1);

        Animation animation = AnimationUtils.loadAnimation(this, R.anim.anim);
        Animation animation2 = AnimationUtils.loadAnimation(this, R.anim.anim2);
        imageView.setAnimation(animation);
        textView.setAnimation(animation2);

        imageView.animate().translationY(250).setDuration(2000).start();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, 4000);


    }
}