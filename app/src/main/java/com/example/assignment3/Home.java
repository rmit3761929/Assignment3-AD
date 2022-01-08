package com.example.assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Home extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_book);

        ImageButton sort = (ImageButton) findViewById(R.id.Primarybtn);
        sort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //add sorting function
            }
        });

        ImageButton primarybks = (ImageButton) findViewById(R.id.Primarybtn);
        primarybks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Home.this,Books.class);
                intent.putExtra("s",1);
            }
        });
        ImageButton upperprimarybks = (ImageButton) findViewById(R.id.Upperprimarybtn);
        upperprimarybks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Home.this,Books.class);
                intent.putExtra("s",1);
            }
        });
        ImageButton highschoolbks = (ImageButton) findViewById(R.id.Highschoolbtn);
        highschoolbks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Home.this,Books.class);
                intent.putExtra("s",1);
            }
        });
        ImageButton highersecondarybks = (ImageButton) findViewById(R.id.Highersecondarybtn);
        highersecondarybks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Home.this,Books.class);
                intent.putExtra("s",1);
            }
        });
    }
}