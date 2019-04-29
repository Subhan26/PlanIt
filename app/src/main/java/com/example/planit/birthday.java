package com.example.planit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class birthday extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_birthday);

        getLayoutInflater().inflate(R.layout.activity_birthday,frameLayout);
    }
}
