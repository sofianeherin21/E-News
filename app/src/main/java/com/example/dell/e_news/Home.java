package com.example.dell.e_news;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class Home extends Fragment {

    View v;
    WebView wb;
    String url="http://www.prothom-alo.com";
    Intent i;
    int num;
    public Home() {
        // Required empty public constructor
    }



    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        v=inflater.inflate(R.layout.fragment_home, container, false);
        wb= (WebView) v.findViewById(R.id.webview1);
        wb.setWebViewClient(new WebViewClient());
        WebSettings webSettings=wb.getSettings();
        webSettings.setJavaScriptEnabled(true);


        wb.loadUrl(getUrl());
        // Inflate the layout for this fragment
        return v;
    }


}
