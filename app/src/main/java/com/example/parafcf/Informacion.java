package com.example.parafcf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Informacion extends AppCompatActivity {
    WebView p;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        p = (WebView) findViewById(R.id.i);
        p.loadUrl("file:///android_asset/info.html");
        WebSettings webSettings3 = p.getSettings();
        webSettings3.setJavaScriptEnabled(true);
        webSettings3.setBuiltInZoomControls(true);
        webSettings3.setDisplayZoomControls(false);
        webSettings3.setLoadsImagesAutomatically(true);
    }
}