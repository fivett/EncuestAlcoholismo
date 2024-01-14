package com.example.parafcf;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Bundle;

public class Probando extends AppCompatActivity {

    CardView cvF;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_probando);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        cvF=(CardView)findViewById(R.id.cardFondo);

        cvF.setCardBackgroundColor(0xFF2ECC71);


    }
}