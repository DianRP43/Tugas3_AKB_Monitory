package com.example.tugas3pretest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
//10118043 DIAN ROSA PRATAMA 2 MEI 2021
public class HomeUser extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_user);

        //GET THE
        Intent intent = getIntent();
        String message = intent.getStringExtra(BioData.EXTRA_MESSAGE);

        // CAPTURE
        TextView textView = findViewById(R.id.baris12);
                textView.setText(message);

        TextView textView2 = findViewById(R.id.baris22);
        textView2.setText(message);
    }
}