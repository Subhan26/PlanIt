package com.example.planit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class catering extends BaseActivity {

        CardView cardView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_catering);

        getLayoutInflater().inflate(R.layout.activity_catering,frameLayout);
        cardView1 = findViewById(R.id.desi_food_list);

        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(catering.this,Desi_food_caterring.class));
            }
        });

    }
}
