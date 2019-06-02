package com.example.dell.e_news;

import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentTwo extends android.support.v4.app.Fragment {

    View v;
    WebView wb;
    String url="http://grecenter.org";
    Intent i;
    int num;
    public FragmentTwo() {
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
        // Inflate the layout for this fragment
       View v =inflater.inflate(R.layout.fragment_fragment_two, container, false);

        wb= (WebView) v.findViewById(R.id.webview1);
        wb.setWebViewClient(new WebViewClient());
        WebSettings webSettings=wb.getSettings();
        webSettings.setJavaScriptEnabled(true);


        wb.loadUrl(getUrl());
        // Inflate the layout for this fragment
        return v;
    }

}
