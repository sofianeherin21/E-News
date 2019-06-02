package com.example.dell.e_news;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class MyNews extends Fragment {

    View v;
    Button b;
    Intent i;

    public MyNews() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        v = inflater.inflate(R.layout.fragment_my_news, container, false);

        b = (Button) v.findViewById(R.id.my_site_button);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getActivity(), "Clicked on button", Toast.LENGTH_LONG).show();
                i= new Intent(getActivity().getApplicationContext(),Login.class);
                startActivity(i);
            }
        });

        return v;
    }

}
