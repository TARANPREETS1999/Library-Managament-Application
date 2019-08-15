package com.example.waheguru.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.zip.CheckedOutputStream;

public class MainActivity extends AppCompatActivity {

    private EditText Name;
    private EditText Password;
    private Button Login;
    private int Counter = 5;
    DatabaseHelper myDb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myDb = new DatabaseHelper(this);

        Name=(EditText)findViewById(R.id.txt1);
        Password=(EditText)findViewById(R.id.pass);
        Login=(Button)findViewById(R.id.btn1);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                check(Name.getText().toString(),Password.getText().toString());
            }
        });

    }

    private void check(String userName,String userPassword){
        if((userName.equals("Admin"))&&(userPassword.equals("12345"))){
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);
        }else{
            Counter--;

            if(Counter==0){
                Login.setEnabled(false);
            }
        }
    }
}
