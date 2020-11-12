package com.example.firsteypipi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        register = findViewById(R.id.register);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent OpenRegister = new Intent(MainActivity.this, com.example.firsteypipi.register.class);
//                startActivity(OpenRegister);



                startActivity(new Intent(MainActivity.this, com.example.firsteypipi.register.class));
            }
        });
    }
}