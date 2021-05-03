package com.example.tugas3pretest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
//10118043 DIAN ROSA PRATAMA 2 MEI 2021
public class BioData extends AppCompatActivity {
public static final String EXTRA_MESSAGE = "com.example.tugas3pretest.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bio_data);
    }
    public void pindahuser(View view){
        Intent intent = new Intent(this, HomeUser.class);
        EditText editText = (EditText) findViewById(R.id.etnama);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
                startActivity(intent);
    }
}