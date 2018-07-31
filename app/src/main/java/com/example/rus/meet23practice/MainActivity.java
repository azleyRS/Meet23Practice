package com.example.rus.meet23practice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_view_scroll);

        CustomViewGroup customViewGroup = findViewById(R.id.custom_viewgroup);
        for (int i = 0; i<40 ; i++){
            View view = getLayoutInflater().inflate(R.layout.custom_item, null, false);
            TextView textView = view.findViewById(R.id.textview);
            textView.setText(String.valueOf(i));
            customViewGroup.addView(view);
        }
    }
}
