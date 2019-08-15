package com.example.waheguru.login;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Scroller;
import android.widget.TextView;
import android.widget.Toolbar;

import org.w3c.dom.Text;

public class FinalActivity extends AppCompatActivity {

    private Button back;
    private Button Edit;
    private TextView display;
    private Toolbar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

        display= (TextView) findViewById(R.id.Tv);


    String[] books = Booklist.getBook();

     for(String book : books){
        display.append(book+"\n\n\n");
    }
        Toolbar toolbar = (Toolbar) findViewById(R.id.my_awesome_toolbar);
        setSupportActionBar(toolbar);

}}