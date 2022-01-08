package com.example.assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class EditUser extends AppCompatActivity {
String name;
String editname;
String phonenumber;
String editphonenumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_user);
        Button Backbutton = (Button) findViewById(R.id.BackButton);
        Backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EditUser.this,User.class);
                intent.putExtra( name,3);
            }
        });
        Button Savebutton = (Button) findViewById(R.id.Savebutton);
        Savebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EditUser.this,User.class);
                intent.putExtra( name,3);
            }
        });
    }
}