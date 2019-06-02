package com.example.dell.e_news;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class News extends AppCompatActivity {
    View v;
    WebView wb;
    String url;//="http://www.prothom-alo.com";

    News()
    {

    }
    News(String s)
    {
        this.url=s;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        wb= (WebView) v.findViewById(R.id.webview1);
        wb.setWebViewClient(new WebViewClient());
        WebSettings webSettings=wb.getSettings();
        webSettings.setJavaScriptEnabled(true);


        wb.loadUrl(url);




        }
    }
