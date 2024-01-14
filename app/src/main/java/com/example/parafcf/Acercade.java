package com.example.parafcf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Acercade extends AppCompatActivity {
WebView p;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acercade);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        p = (WebView) findViewById(R.id.w);
        p.loadUrl("file:///android_asset/programador.html");
        WebSettings webSettings3 = p.getSettings();
        webSettings3.setJavaScriptEnabled(true);
        webSettings3.setBuiltInZoomControls(true);
        webSettings3.setDisplayZoomControls(false);
        webSettings3.setLoadsImagesAutomatically(true);

    }
}