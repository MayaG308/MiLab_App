package com.example.himym;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button Cast = (Button)findViewById(R.id.button1);
        Cast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cast = new Intent(v.getContext(), Cast.class);
                startActivity(cast);
            }
        });
        Button Phrases = (Button)findViewById(R.id.button2);
        Phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jokes = new Intent(v.getContext(), Phrases.class);
                startActivity(jokes);
            }
        });
    }
}