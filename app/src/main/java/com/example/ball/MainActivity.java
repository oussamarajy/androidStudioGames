package com.example.ball;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowMetrics;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

import pl.droidsonroids.gif.GifImageView;

public class MainActivity extends AppCompatActivity {
TextView tt;
Button btn1;
Button btn2;
Button restart;
ImageView ball1;
ImageView ball2;
ImageView route;
ImageView dice;
ImageView cele;
MediaPlayer mp2;
MediaPlayer mp;
MediaPlayer mp3;
GifImageView img;
ConstraintLayout ll;
TextView kl;
ImageView go;
TextView txtpoint1;
TextView txtpoint2;
TextView txtpoint3;
int count = 0;



int a;
int b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tt = (TextView) findViewById(R.id.txt);
        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        restart = (Button) findViewById(R.id.restart);
        ball1 = (ImageView)findViewById(R.id.ball1);
        ball2 = (ImageView)findViewById(R.id.ball2);
       // route = (ImageView) findViewById(R.id.route);
        dice = (ImageView) findViewById(R.id.dice);
        cele = (ImageView)findViewById(R.id.cele);
        kl = findViewById(R.id.txtTest);
        txtpoint1 = findViewById(R.id.txtpoint1);
        txtpoint2 = findViewById(R.id.txtpoint2);
        txtpoint3 = findViewById(R.id.txtpoint3);
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ll = findViewById(R.id.lay);
        img = findViewById(R.id.dice3);
        img.setImageResource(R.drawable.dicetest);
        img.setVisibility(View.INVISIBLE);
        ball1.setImageResource(R.drawable.ball1);
        ball2.setImageResource(R.drawable.ball2);
        go = findViewById(R.id.go);
        go.setImageResource(R.drawable.go);
        Display display = getWindowManager().getDefaultDisplay();
        int width = display.getWidth();
        int height = display.getHeight();
        int direc = height*6/10;
        txtpoint3.setText(">="+direc+" You Win");
        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int ran2 = new Random().nextInt(2 - 1 + 1) + 1;
                if(ran2==1){
                    btn1.setVisibility(View.VISIBLE);
                    kl.setText("Go 1 first");
                    kl.setVisibility(View.VISIBLE);
                    kl.animate().alpha(0f).setDuration(5000);
                    go.animate().alpha(0).setDuration(5000);


                }
                else if(ran2==2){
                    btn2.setVisibility(View.VISIBLE);
                    kl.setText("Go 2 first");
                    kl.setVisibility(View.VISIBLE);
                    kl.animate().alpha(0f).setDuration(5000);
                    go.animate().alpha(0).setDuration(5000);
                }
            }
        });
       // route.setImageResource(R.drawable.route);
        /*
        DisplayMetrics dmetrics = new DisplayMetrics();
        int widthPixels=dmetrics.widthPixels;
        int heightPixels=dmetrics.heightPixels;
        ViewTreeObserver viewTreeObserver = ll.getViewTreeObserver();
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                ll.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                route = (ImageView)findViewById(R.id.route);
                ImageView imgg = (ImageView) findViewById(R.id.imageView4);
                int width  = ll.getMeasuredWidth();
                int height = ll.getMeasuredHeight();
                Bitmap b =  ((BitmapDrawable) route.getDrawable()).getBitmap();
                int w = b.getWidth();
                int h = b.getDensity();
                Bitmap d =  ((BitmapDrawable) imgg.getDrawable()).getBitmap();
                int x = d.getWidth();
                int y = d.getDensity();
                Display display = getWindowManager().getDefaultDisplay();
                imgg.getLayoutParams().height  = display.getHeight()/2;


                Toast.makeText(getApplicationContext(),width+"/"+height+"/"+h+"/"+y,Toast.LENGTH_SHORT).show();
                kl.animate().translationY(-(500)).setDuration(3000);
            }
        });
*/
       mp = MediaPlayer.create(this, R.raw.son);
       mp2 = MediaPlayer.create(this, R.raw.applau);
        mp3 = MediaPlayer.create(this, R.raw.move);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn1.setVisibility(View.INVISIBLE);
                img.setVisibility(View.VISIBLE);
                dice.setVisibility(View.INVISIBLE);
                tt.setVisibility(View.INVISIBLE);
                int ran = new Random().nextInt(6 - 1 + 1) + 1;
                tt.setText(String.valueOf(ran));

                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        //tt.setVisibility(View.VISIBLE);
                        if(ran==1){
                            mp.start();

                            img.setVisibility(View.INVISIBLE);
                            dice.setImageResource(R.drawable.d1);
                            dice.setVisibility(View.VISIBLE);

                        }
                        else if(ran==2){
                            mp.start();
                            img.setVisibility(View.INVISIBLE);
                            dice.setImageResource(R.drawable.d2);
                            dice.setVisibility(View.VISIBLE);
                        }
                        else if(ran==3){
                            mp.start();
                            img.setVisibility(View.INVISIBLE);
                            dice.setImageResource(R.drawable.d3);
                            dice.setVisibility(View.VISIBLE);
                        }
                        else if(ran==4){
                            mp.start();
                            img.setVisibility(View.INVISIBLE);
                            dice.setImageResource(R.drawable.d4);
                            dice.setVisibility(View.VISIBLE);
                        }
                        else if(ran==5){
                            mp.start();
                            img.setVisibility(View.INVISIBLE);
                            dice.setImageResource(R.drawable.d5);
                            dice.setVisibility(View.VISIBLE);
                        }
                        else if(ran==6){
                            mp.start();
                            img.setVisibility(View.INVISIBLE);
                            dice.setImageResource(R.drawable.d6);
                            dice.setVisibility(View.VISIBLE);
                        }
                        Handler handler2 = new Handler();
                        handler2.postDelayed(new Runnable() {
                            @Override
                            public void run() {

                                int number1 = Integer.parseInt(tt.getText().toString());



                                    a = a + ((number1*25)*-1);
                                    mp3.start();
                                    ball1.animate().translationY(a).setDuration(1000);
                                    int pos = (a * -1)/6;
                                    txtpoint1.setText(String.valueOf(-a));




                                if((a*-1)>= direc) {
                                   mp2.start();
                                   btn1.setVisibility(View.INVISIBLE);
                                    cele.setVisibility(View.VISIBLE);
                                    restart.setVisibility(View.VISIBLE);
                                    dice.setVisibility(View.INVISIBLE);
                                }
                                else {
                                    btn1.setVisibility(View.INVISIBLE);
                                    btn2.setVisibility(View.VISIBLE);
                                }
                            }
                        },1000);
                    }
                },2500);


            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn2.setVisibility(View.INVISIBLE);
                img.setVisibility(View.VISIBLE);
                dice.setVisibility(View.INVISIBLE);
                tt.setVisibility(View.INVISIBLE);
                int ran = new Random().nextInt(6 - 1 + 1) + 1;
                tt.setText(String.valueOf(ran));

                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        //tt.setVisibility(View.VISIBLE);
                        if(ran==1){
                            mp.start();
                            img.setVisibility(View.INVISIBLE);
                            dice.setImageResource(R.drawable.d1);
                            dice.setVisibility(View.VISIBLE);

                        }
                        else if(ran==2){
                            mp.start();
                            img.setVisibility(View.INVISIBLE);
                            dice.setImageResource(R.drawable.d2);
                            dice.setVisibility(View.VISIBLE);
                        }
                        else if(ran==3){
                            mp.start();
                            img.setVisibility(View.INVISIBLE);
                            dice.setImageResource(R.drawable.d3);
                            dice.setVisibility(View.VISIBLE);
                        }
                        else if(ran==4){
                            mp.start();
                            img.setVisibility(View.INVISIBLE);
                            dice.setImageResource(R.drawable.d4);
                            dice.setVisibility(View.VISIBLE);
                        }
                        else if(ran==5){
                            mp.start();
                            img.setVisibility(View.INVISIBLE);
                            dice.setImageResource(R.drawable.d5);
                            dice.setVisibility(View.VISIBLE);
                        }
                        else if(ran==6){
                            mp.start();
                            img.setVisibility(View.INVISIBLE);
                            dice.setImageResource(R.drawable.d6);
                            dice.setVisibility(View.VISIBLE);
                        }
                        Handler handler2 = new Handler();
                        handler2.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                int number = Integer.parseInt(tt.getText().toString());
                                b = b + ((number*25)*-1);
                                mp3.start();
                                ball2.animate().translationY(b).setDuration(1000);
                                int pos = (b * -1)/6;
                                txtpoint2.setText(String.valueOf(-b));
                                if((b*-1)>= direc) {
                                    mp2.start();
                                    btn2.setVisibility(View.INVISIBLE);
                                    cele.setVisibility(View.VISIBLE);
                                    restart.setVisibility(View.VISIBLE);
                                    dice.setVisibility(View.INVISIBLE);
                                }
                                else {
                                    btn2.setVisibility(View.INVISIBLE);
                                    btn1.setVisibility(View.VISIBLE);
                                }
                            }
                        },1000);
                    }
                },2500);


            }
        });

        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ball1.animate().translationY(0);
                ball2.animate().translationY(0);
                cele.setVisibility(View.INVISIBLE);
                restart.setVisibility(View.INVISIBLE);
                btn1.setVisibility(View.INVISIBLE);
                kl.animate().alpha(1f).setDuration(5000);
                go.animate().alpha(1f).setDuration(5000);
                txtpoint1.setText("0");
                txtpoint2.setText("0");
                kl.setText("");
                a = 0;
                b = 0;
                dice.setVisibility(View.INVISIBLE);
            }
        });

    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            mp2.stop();
            mp3.stop();
            mp.stop();
            Intent ik = new Intent(MainActivity.this, Start.class);
            startActivity(ik);
            finish();
            return true;
        }
        return false;
    }
}