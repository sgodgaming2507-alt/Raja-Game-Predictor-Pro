package com.example.rajapredictor;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = findViewById(R.id.webview);
        WebSettings webSettings = webView.getSettings();
        
        // Game ke liye JavaScript aur DOM storage zaroori hai
        webSettings.setJavaScriptEnabled(true);
        webSettings.setDomStorageEnabled(true);
        
        webView.setWebViewClient(new WebViewClient());

        // Yahan apni live website ya GitHub Pages ka link daal dein
        webView.loadUrl("https://sgodgaming2507-alt.github.io/Raja-Game-Predictor-Pro/");
    }

    // Agar user phone ka back button dabaye, toh app band hone ki jagah back page par jaye
    @Override
    public void onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
