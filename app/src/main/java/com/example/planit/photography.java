package com.example.planit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class photography extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_photography);

        getLayoutInflater().inflate(R.layout.activity_photography,frameLayout);
    }
}
