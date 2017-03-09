package com.cclz.myapp_170309_04;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    WebView wv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wv=(WebView)findViewById(R.id.webView);
        wv.setWebViewClient(new WebViewClient());
        wv.getSettings().setJavaScriptEnabled(true);    //  啟用 JacaScript
//        wv.loadUrl("http://www.hinet.net");
        wv.loadUrl("file:///android_asset/index.html");
    }
}
