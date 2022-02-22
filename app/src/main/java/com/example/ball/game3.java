package com.example.ball;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.Display;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class game3 extends AppCompatActivity {
ImageView rock, paper, scissor, imgrobot, imgvous;
String check;
String res;
int countvous, countrobot;
TextView txtvous, txtrobot, rest;
MediaPlayer kaborwin2, kaborlose2;

    int ran;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game3);
        rock = findViewById(R.id.rock);
        paper = findViewById(R.id.paper);
        scissor = findViewById(R.id.scissor);
        imgrobot = findViewById(R.id.imgrobot);
        imgvous = findViewById(R.id.imgvous);
        imgvous.setVisibility(View.INVISIBLE);
        imgrobot.setVisibility(View.INVISIBLE);
        rest = findViewById(R.id.rest);
kaborlose2 = MediaPlayer.create(this, R.raw.win2);
kaborwin2 = MediaPlayer.create(this, R.raw.kaborwin2);
        txtrobot = findViewById(R.id.txtrobot);
        txtvous = findViewById(R.id.txtvous);

        rock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                check = "rock";
                robotChoix();
                imgvous.setVisibility(View.VISIBLE);
                imgvous.setImageResource(R.drawable.rock);
                checker();
                rock.setVisibility(View.INVISIBLE);
                paper.setVisibility(View.INVISIBLE);
                scissor.setVisibility(View.INVISIBLE);
                if(countrobot==3){
                    kaborwin2.start();
                    rest.setVisibility(View.VISIBLE);
                    rest.setText("خسرتي أولدي");
                    txtrobot.setText("0");
                    txtvous.setText("0");
                    countrobot = 0;
                    countvous = 0;
                }
                else if(countvous==3){
                    kaborlose2.start();
                    rest.setVisibility(View.VISIBLE);
                    rest.setText("ربحتي");
                    txtrobot.setText("0");
                    txtvous.setText("0");
                    countrobot = 0;
                    countvous = 0;
                }
                Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        imgrobot.setVisibility(View.INVISIBLE);
                        imgvous.setVisibility(View.INVISIBLE);
                        rock.setVisibility(View.VISIBLE);
                        paper.setVisibility(View.VISIBLE);
                        scissor.setVisibility(View.VISIBLE);
                        rest.setVisibility(View.INVISIBLE);


                    }
                },2000);

            }
        });
        paper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                check = "paper";
                robotChoix();
                imgvous.setVisibility(View.VISIBLE);
                imgvous.setImageResource(R.drawable.paper);

                checker();
                rock.setVisibility(View.INVISIBLE);
                paper.setVisibility(View.INVISIBLE);
                scissor.setVisibility(View.INVISIBLE);
                if(countrobot==3){
                    kaborwin2.start();
                    rest.setVisibility(View.VISIBLE);
                    rest.setText("خسرتي أولدي");
                    txtrobot.setText("0");
                    txtvous.setText("0");
                    countrobot = 0;
                    countvous = 0;
                }
                else if(countvous==3){
                    kaborlose2.start();
                    rest.setVisibility(View.VISIBLE);
                    rest.setText("ربحتي");
                    txtrobot.setText("0");
                    txtvous.setText("0");
                    countrobot = 0;
                    countvous = 0;
                }
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        imgrobot.setVisibility(View.INVISIBLE);
                        imgvous.setVisibility(View.INVISIBLE);
                        rock.setVisibility(View.VISIBLE);
                        paper.setVisibility(View.VISIBLE);
                        scissor.setVisibility(View.VISIBLE);
                        rest.setVisibility(View.INVISIBLE);


                    }
                },2000);

            }
        });
        scissor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                check = "scissor";
                robotChoix();
                imgvous.setVisibility(View.VISIBLE);
                imgvous.setImageResource(R.drawable.scissor);
                checker();
                rock.setVisibility(View.INVISIBLE);
                paper.setVisibility(View.INVISIBLE);
                scissor.setVisibility(View.INVISIBLE);
                if(countrobot==3){
                    kaborwin2.start();
                    rest.setVisibility(View.VISIBLE);
                    rest.setText("خسرتي أولدي");
                    txtrobot.setText("0");
                    txtvous.setText("0");
                    countrobot = 0;
                    countvous = 0;
                }
                else if(countvous==3){
                    kaborlose2.start();
                    rest.setVisibility(View.VISIBLE);
                    rest.setText("ربحتي");
                    txtrobot.setText("0");
                    txtvous.setText("0");
                    countrobot = 0;
                    countvous = 0;
                }
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        imgrobot.setVisibility(View.INVISIBLE);
                        imgvous.setVisibility(View.INVISIBLE);
                        rock.setVisibility(View.VISIBLE);
                        paper.setVisibility(View.VISIBLE);
                        scissor.setVisibility(View.VISIBLE);
                        rest.setVisibility(View.INVISIBLE);


                    }
                },2000);

            }
        });
    }
    public void robotChoix(){

        ran = new Random().nextInt(3 - 1 + 1) + 1;
        if(ran == 1){
            imgrobot.setVisibility(View.VISIBLE);
            imgrobot.setImageResource(R.drawable.rock);


        }
        else if(ran == 2){
            imgrobot.setVisibility(View.VISIBLE);
            imgrobot.setImageResource(R.drawable.paper);
        }
        else if(ran==3){
            imgrobot.setVisibility(View.VISIBLE);
            imgrobot.setImageResource(R.drawable.scissor);
        }
    }

    public void checker(){

        if(ran == 1 && check.equals("rock")){
           res = "ta3adol";
        }
        else if(ran == 2 && check.equals("paper")){
            res = "ta3adol";
        }
       else if(ran == 3 && check.equals("scissor")){
            res = "ta3adol";
        }
        else if(ran == 1 && check.equals("paper")){
            res = "rb7tih";
            countvous += 1;
            txtvous.setText(Integer.toString(countvous));
        }
        else if(ran == 1 && check.equals("scissor")){
            res = "rb7tk";
            countrobot += 1;
            txtrobot.setText(Integer.toString(countrobot));
        }
        else if(ran == 2 && check.equals("rock")){
            res = "rb7k";
            countrobot += 1;
            txtrobot.setText(Integer.toString(countrobot));
        }
        else if(ran == 2 && check.equals("scissor")){
            res = "rb7tih";
            countvous += 1;
            txtvous.setText(Integer.toString(countvous));
        }
        else  if(ran == 3 && check.equals("rock")){
            res = "rb7tih";
            countvous += 1;
            txtvous.setText(Integer.toString(countvous));
        }
        else if(ran == 3 && check.equals("paper")){
            res = "rb7k";
            countrobot += 1;
            txtrobot.setText(Integer.toString(countrobot));
        }
        Toast.makeText(getApplicationContext(), res, Toast.LENGTH_SHORT).show();
    }

}