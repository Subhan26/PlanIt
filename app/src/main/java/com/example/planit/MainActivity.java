package com.example.planit;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

        private ImageView imageView;
        //private ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //getSupportActionBar().hide();
        imageView = findViewById(R.id.image_view);
//        progressBar = findViewById(R.id.progress);
//        progressBar.setVisibility(View.VISIBLE);

//        new Handler(). postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                progressBar.setVisibility(View.GONE);
//            }
//        },6000);

        Animation myanim = AnimationUtils.loadAnimation(this,R.anim.mytransition);
        imageView.startAnimation(myanim);
        final Intent i = new Intent(this,Login.class);
        Thread timer = new Thread(){
            public void run(){

                try {
                    sleep(2000);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                finally {
                        startActivity(i);
                        finish();
                        }
            }
        };
        timer.start();

    }
}
