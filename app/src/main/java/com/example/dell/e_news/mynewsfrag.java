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
public class mynewsfrag extends Fragment {

    View v;
    WebView wb;
    Intent i;
    int num;
    public mynewsfrag() {
        // Required empty public constructor
    }


    String url1="http://www.prothom-alo.com";


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        v=inflater.inflate(R.layout.fragment_mynewsfrag, container, false);
        wb= (WebView) v.findViewById(R.id.webview2);
        wb.setWebViewClient(new WebViewClient());
        WebSettings webSettings=wb.getSettings();
        webSettings.setJavaScriptEnabled(true);

        wb.loadUrl(url1);
        // Inflate the layout for this fragment
        return v;
    }

}
