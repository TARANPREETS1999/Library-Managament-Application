package com.example.waheguru.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.HashSet;

public class SecondActivity extends AppCompatActivity {

    private EditText stId;
    private Button search;
    private TextView status;
    private Button logOut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        stId=(EditText)findViewById(R.id.inputId);
        search=(Button)findViewById(R.id.search);
        status=(TextView)findViewById(R.id.tvInfo);
        logOut=(Button)findViewById(R.id.Logbtn);

        status.setVisibility(View.INVISIBLE);
        logOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(intent);

            }
        });
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Search(stId.getText().toString());
             }
        });

    }

    public void Search(String identity){
         if(identity.equals(("01"))){
            Intent intent = new Intent(SecondActivity.this,FinalActivity.class);
            startActivity(intent);
            status.setVisibility(View.INVISIBLE);
        }
        else{
             status.setVisibility(View.VISIBLE);
         }


    }
}
