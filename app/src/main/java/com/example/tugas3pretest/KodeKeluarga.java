package com.example.tugas3pretest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
//10118043 DIAN ROSA PRATAMA 2 MEI 2021
public class KodeKeluarga extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kode_keluarga);
    }
    public void pindahbiodata (View view){
        Intent intent = new Intent(this,BioData.class);
        startActivity(intent);
    }
}