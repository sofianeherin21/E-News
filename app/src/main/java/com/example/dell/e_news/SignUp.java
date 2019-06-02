package com.example.dell.e_news;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {

    EditText e1,e2,e3,e4,e5,e6,e7;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        e1= (EditText) findViewById(R.id.nameET);
        e2= (EditText) findViewById(R.id.email);
        e3= (EditText) findViewById(R.id.locationET);
        e4= (EditText) findViewById(R.id.bdayShowET);
        e5= (EditText) findViewById(R.id.occupationET);
        e6= (EditText) findViewById(R.id.passET);
        e7= (EditText) findViewById(R.id.confirmET);





        btn = (Button) findViewById(R.id.signBtn);

        final MyDBFunctions mf = new MyDBFunctions(getApplicationContext());

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = e1.getText().toString();
                String email = e2.getText().toString();
                String location1 = e3.getText().toString();
                String bday1 = e4.getText().toString();
                String occ = e5.getText().toString();
                String pass = e6.getText().toString();
                String pass2=e7.getText().toString();

                if (!pass.equals(pass2)) {
                    Toast t = Toast.makeText(SignUp.this, "Password don't match!!", Toast.LENGTH_SHORT);
                    t.show();
                }
                else {

                    DataTemp dt = new DataTemp(name, email, location1, bday1, occ, pass);

                    mf.addingDataToTable(dt);

                    Toast.makeText(getApplicationContext(), "Data added successfully!", Toast.LENGTH_LONG).show();

                    // start_activity ob=new start_activity(name);
                    Profile ob=new Profile(name);
                    //ob.setName();
                    Intent i = new Intent(SignUp.this, Logged_in.class);
                    startActivity(i);
                }



            }
        });

    }
}
