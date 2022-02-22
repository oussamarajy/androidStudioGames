package com.example.ball;

import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;

public class Start extends AppCompatActivity {
Button btnRobot;
Button btnFriend;
Button Quitter;
MediaPlayer md;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        md = MediaPlayer.create(this, R.raw.start);
       // md.start();
        btnRobot = (Button) findViewById(R.id.btnRobot);
        btnRobot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dd = new Intent(Start.this, Rebot.class);
                startActivity(dd);
                //md.stop();

            }
        });
        btnFriend = (Button) findViewById(R.id.btnFriend);
        btnFriend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dd2 = new Intent(Start.this, MainActivity.class);
                startActivity(dd2);
               // md.stop();


            }
        });

        Quitter = (Button) findViewById(R.id.Quitter);
        Quitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });
    }
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {

           // md.stop();
            finish();
            return true;
        }
        return false;
    }

}