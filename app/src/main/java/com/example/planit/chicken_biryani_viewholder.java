package com.example.planit;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class chicken_biryani_viewholder extends RecyclerView.ViewHolder {

    TextView main_text1,main_text2;
    Button main_btn;
    View main_view;


    public chicken_biryani_viewholder(View itemView) {
        super(itemView);
        main_text1=itemView.findViewById(R.id.main_text1);
        main_text2=itemView.findViewById(R.id.main_text2);
        main_btn=itemView.findViewById(R.id.main_button);
        main_view=itemView.findViewById(R.id.main_view);
    }
}
