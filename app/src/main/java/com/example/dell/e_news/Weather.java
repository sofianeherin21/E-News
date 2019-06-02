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


/**
 * A simple {@link Fragment} subclass.
 */
public class Weather extends Fragment {

    View v;
    WebView wb;
    Intent i;

    String url1="https://weather.com/weather/today/l/BGXX0003:1:BG";
    String url2="https://weather.com";


    public Weather() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v=inflater.inflate(R.layout.fragment_weather, container, false);
        wb= (WebView) v.findViewById(R.id.weather_view);
        wb.setWebViewClient(new WebViewClient());
        WebSettings webSettings=wb.getSettings();
        webSettings.setJavaScriptEnabled(true);

        wb.loadUrl(url2);
        // Inflate the layout for this fragment
        return v;
    }

}
