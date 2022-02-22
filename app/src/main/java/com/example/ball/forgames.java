package com.example.ball;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class forgames extends AppCompatActivity {
ImageView btngame1, btngame2, btngame3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgames);
        btngame1 = findViewById(R.id.btngame1);
        btngame2 = findViewById(R.id.btngame3);
        btngame3 = findViewById(R.id.btngame2);
        btngame1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent game1 = new Intent(forgames.this, Start.class);
                startActivity(game1);
                //finish();
            }
        });
        btngame2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent game2 = new Intent(forgames.this, game3.class);
                startActivity(game2);
               // finish();
            }
        });
        btngame3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent game3 = new Intent(forgames.this, game2.class);
                startActivity(game3);
               // finish();

            }
        });
    }
}