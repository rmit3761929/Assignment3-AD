package com.example.assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UserDetails extends AppCompatActivity {
    String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_details);
        Button Backbutton = (Button) findViewById(R.id.BackButton);
        Backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserDetails.this,User.class);
                intent.putExtra( name,3);
            }
        });
        Button Editbutton = (Button) findViewById(R.id.BackButton);
        Editbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserDetails.this,EditUser.class);
                intent.putExtra( name,3);
            }
        });

    }
}