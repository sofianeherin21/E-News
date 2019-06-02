package com.example.dell.e_news;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    Button b1,b2;
    EditText a,b;
    MyDBFunctions user = new MyDBFunctions(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        a= (EditText)findViewById(R.id.editText);
        b = (EditText)findViewById(R.id.editText2);

        b2=(Button) findViewById(R.id.buttonLOG);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                login();
            }
        });

        b1= (Button) findViewById(R.id.signupbtn);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i1= new Intent(Login.this,SignUp.class);
                startActivity(i1);
            }
        });
    }

    public void login(){

        String st = a.getText().toString();
        String stpass = b.getText().toString();
        String password = user.searchPassword(st);


        if(stpass.equals(password)){
            /*Toast temp = Toast.makeText(Login.this,password,Toast.LENGTH_SHORT);
            temp.show();*/

            Toast.makeText(getApplicationContext(),"Pass matched!!!",Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(Login.this,Logged_in.class);
            //intent.putExtra("Sofia",st);
            startActivity(intent);
        } else{
            Toast temp = Toast.makeText(Login.this,"Username and Password don't match!!",Toast.LENGTH_SHORT);
            temp.show();}
    }
}
