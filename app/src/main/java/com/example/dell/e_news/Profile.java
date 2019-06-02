package com.example.dell.e_news;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Profile extends AppCompatActivity {

    TextView tv1,tv2,tv3,tv4;
    String name;
    Profile(){

    }
    Profile(String name)
    {
        this.name=name;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        tv1= (TextView) findViewById(R.id.textView3);


        MyDBFunctions mf = new MyDBFunctions(getApplicationContext());
        String[] data= mf.my_data();
        tv1.setText(data[0]);
    }
}
