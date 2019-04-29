package com.example.planit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Toast;

public class main__Screen extends BaseActivity {

        CardView cardView1, cardView2,cardView3, cardView4, cardView5, cardView6, cardView7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_main_screen);

        getLayoutInflater().inflate(R.layout.activity_main_screen,frameLayout);
        cardView1=findViewById(R.id.catering_id);
        cardView2=findViewById(R.id.venus_id);
        cardView3=findViewById(R.id.decoration_id);
        cardView4=findViewById(R.id.vehicle_id);
        cardView5=findViewById(R.id.photography_id);
        cardView6=findViewById(R.id.dj_music_id);
        cardView7=findViewById(R.id.birthday_id);

     //   getSupportActionBar().show();
        cardView1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        //Toast.makeText(main__Screen.this, "main", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(main__Screen.this,catering.class));
        }
    });
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(main__Screen.this,venus.class));
            }
        });

        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(main__Screen.this,decoration.class));
            }
        });

        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(main__Screen.this,vehicle.class));
            }
        });

        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(main__Screen.this,photography.class));
            }
        });

        cardView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(main__Screen.this,dj_sound.class));
            }
        });

        cardView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(main__Screen.this,birthday.class));
            }
        });

    }
}
