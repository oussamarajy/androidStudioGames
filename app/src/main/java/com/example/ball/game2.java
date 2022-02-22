package com.example.ball;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class game2 extends AppCompatActivity {
Button btnx1, btnx2, btnx3, btnx4, btnx5, btnx6, btnx7, btnx8, btnx9, btnrestart;
int a,b,c,d,e,f,g,h,i;
int resX, resO;
TextView txtX, txtO, turn;
int x = 0;
int count = 0;
MediaPlayer win, check;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game2);
        btnx1 = findViewById(R.id.btnx1);
        btnx2 = findViewById(R.id.btnx2);
        btnx3 = findViewById(R.id.btnx3);
        btnx4 = findViewById(R.id.btnx4);
        btnx5 = findViewById(R.id.btnx5);
        btnx6 = findViewById(R.id.btnx6);
        btnx7 = findViewById(R.id.btnx7);
        btnx8 = findViewById(R.id.btnx8);
        btnx9 = findViewById(R.id.btnx9);
        btnrestart = findViewById(R.id.btnrestart);
        win = MediaPlayer.create(this, R.raw.win);
        check = MediaPlayer.create(this, R.raw.check);
        txtO = findViewById(R.id.txtO);
        txtX = findViewById(R.id.txtX);
        turn = findViewById(R.id.turn);

        String list[] = {"X", "O"};

        int ran = (int)Math.round(Math.random());
        x = ran;
        if(x == 0){
            turn.setText("X First");


        }
        else{
            turn.setText("O First");

        }
        btnx1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check.start();
                if(x == 0){

                    btnx1.setText("X");

                    x = 1;
                }
                else{
                    btnx1.setText("O");
                    x = 0;
                }
                btnx1.setEnabled(false);
                count += 1;
                a = count;
                checker();
                turn.animate().alpha(0).setDuration(2000);
            }
        });
        btnx2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check.start();
                if(x == 0){
                    btnx2.setText("X");
                    x = 1;
                }
                else{
                    btnx2.setText("O");
                    x = 0;
                }
                btnx2.setEnabled(false);
                count += 1;
                b = count;
                checker();
                turn.animate().alpha(0).setDuration(2000);
            }
        });
        btnx3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check.start();
                if(x == 0){
                    btnx3.setText("X");
                    x = 1;
                }
                else{
                    btnx3.setText("O");
                    x = 0;
                }
                btnx3.setEnabled(false);
                count += 1;
                c = count;
                checker();
                turn.animate().alpha(0).setDuration(2000);
            }
        });
        btnx4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check.start();
                if(x == 0){
                    btnx4.setText("X");
                    x = 1;
                }
                else{
                    btnx4.setText("O");
                    x = 0;
                }
                btnx4.setEnabled(false);
                count += 1;
                d = count;
                checker();
                turn.animate().alpha(0).setDuration(2000);
            }
        });
        btnx5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check.start();
                if(x == 0){
                    btnx5.setText("X");
                    x = 1;
                }
                else{
                    btnx5.setText("O");
                    x = 0;
                }
                btnx5.setEnabled(false);
                count += 1;
                e = count;
                checker();
                turn.animate().alpha(0).setDuration(2000);
            }
        });
        btnx6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check.start();
                if(x == 0){
                    btnx6.setText("X");
                    x = 1;
                }
                else{
                    btnx6.setText("O");
                    x = 0;
                }
                btnx6.setEnabled(false);
                count += 1;
                f = count;
                checker();
                turn.animate().alpha(0).setDuration(2000);
            }
        });
        btnx7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check.start();
                if(x == 0){
                    btnx7.setText("X");
                    x = 1;
                }
                else{
                    btnx7.setText("O");
                    x = 0;
                }
                btnx7.setEnabled(false);
                count += 1;
                g = count;
                checker();
                turn.animate().alpha(0).setDuration(2000);
            }
        });
        btnx8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check.start();
                if(x == 0){
                    btnx8.setText("X");
                    x = 1;
                }
                else{
                    btnx8.setText("O");
                    x = 0;
                }
                btnx8.setEnabled(false);
                count += 1;
                h = count;
                checker();
                turn.animate().alpha(0).setDuration(2000);
            }
        });
        btnx9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check.start();
                if(x == 0){
                    btnx9.setText("X");
                    x = 1;
                }
                else{
                    btnx9.setText("O");
                    x = 0;
                }
                btnx9.setEnabled(false);
                count += 1;
                i = count;
                checker();
                turn.animate().alpha(0).setDuration(2000);
            }
        });
        btnrestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                count= 0;
                x = 0;
                a = 0;
                b = 0;
                c = 0;
                d = 0;
                e = 0;
                f = 0;
                g = 0;
                h = 0;
                i = 0;
                btnx1.setBackgroundResource(R.drawable.border_e);
                btnx2.setBackgroundResource(R.drawable.border_e);
                btnx3.setBackgroundResource(R.drawable.border_e);
                btnx4.setBackgroundResource(R.drawable.border_e);
                btnx5.setBackgroundResource(R.drawable.border_e);
                btnx6.setBackgroundResource(R.drawable.border_e);
                btnx7.setBackgroundResource(R.drawable.border_e);
                btnx8.setBackgroundResource(R.drawable.border_e);
                btnx9.setBackgroundResource(R.drawable.border_e);
                btnx1.setText("");
                btnx2.setText("");
                btnx3.setText("");
                btnx4.setText("");
                btnx5.setText("");
                btnx6.setText("");
                btnx7.setText("");
                btnx8.setText("");
                btnx9.setText("");
                btnx1.setEnabled(true);
                btnx2.setEnabled(true);
                btnx3.setEnabled(true);
                btnx4.setEnabled(true);
                btnx5.setEnabled(true);
                btnx6.setEnabled(true);
                btnx7.setEnabled(true);
                btnx8.setEnabled(true);
                btnx9.setEnabled(true);
                int ran = (int)Math.round(Math.random());
                x = ran;
                if(x == 0){
                    turn.setText("X First");
                    turn.animate().alpha(1).setDuration(1000);


                }
                else{
                    turn.setText("O First");
                    turn.animate().alpha(1).setDuration(1000);

                }


            }
        });




    }

    public void checker(){
        if(a!=0 && b!=0 && c!=0) {
            if ((a % 2 == 0 && b % 2 == 0 && c % 2 == 0) || (a % 2 != 0 && b % 2 != 0 && c % 2 != 0)) {
                win.start();
                btnx1.setBackgroundResource(R.color.green);
                btnx2.setBackgroundResource(R.color.green);
                btnx3.setBackgroundResource(R.color.green);
                disableall();
                if(btnx1.getText().toString().equals("X")){
                    Toast.makeText(getApplicationContext(), "X is Win", Toast.LENGTH_SHORT).show();
                    resX += 1;
                    txtX.setText(Integer.toString(resX));
                }
                else{
                    Toast.makeText(getApplicationContext(), "O is Win", Toast.LENGTH_SHORT).show();
                    resO += 1;
                    txtO.setText(Integer.toString(resO));
                }
            }
        }
        if(d!=0 && e!=0 && f!=0) {
            if ((d % 2 == 0 && e % 2 == 0 && f % 2 == 0) || (d % 2 != 0 && e % 2 != 0 && f % 2 != 0)) {
                win.start();
                btnx4.setBackgroundResource(R.color.green);
                btnx5.setBackgroundResource(R.color.green);
                btnx6.setBackgroundResource(R.color.green);
                disableall();
                if(btnx4.getText().toString().equals("X")){
                    Toast.makeText(getApplicationContext(), "X is Win", Toast.LENGTH_SHORT).show();
                    resX += 1;
                    txtX.setText(Integer.toString(resX));
                }
                else{
                    Toast.makeText(getApplicationContext(), "O is Win", Toast.LENGTH_SHORT).show();
                    resO += 1;
                    txtO.setText(Integer.toString(resO));
                }
            }
        }
        if(g!=0 && h!=0 && i!=0) {
            if ((g % 2 == 0 && h % 2 == 0 && i % 2 == 0) || (g % 2 != 0 && h % 2 != 0 && i % 2 != 0)) {
                win.start();
                btnx7.setBackgroundResource(R.color.green);
                btnx8.setBackgroundResource(R.color.green);
                btnx9.setBackgroundResource(R.color.green);
                disableall();
                if(btnx7.getText().toString().equals("X")){
                    Toast.makeText(getApplicationContext(), "X is Win", Toast.LENGTH_SHORT).show();
                    resX += 1;
                    txtX.setText(Integer.toString(resX));
                }
                else{
                    Toast.makeText(getApplicationContext(), "O is Win", Toast.LENGTH_SHORT).show();
                    resO += 1;
                    txtO.setText(Integer.toString(resO));
                }
            }
        }
        if(a!=0 && d!=0 && g!=0) {
            if ((a % 2 == 0 && d % 2 == 0 && g % 2 == 0) || (a % 2 != 0 && d % 2 != 0 && g % 2 != 0)) {
                win.start();
                btnx1.setBackgroundResource(R.color.green);
                btnx4.setBackgroundResource(R.color.green);
                btnx7.setBackgroundResource(R.color.green);
                disableall();
                if(btnx1.getText().toString().equals("X")){
                    Toast.makeText(getApplicationContext(), "X is Win", Toast.LENGTH_SHORT).show();
                    resX += 1;
                    txtX.setText(Integer.toString(resX));
                }
                else{
                    Toast.makeText(getApplicationContext(), "O is Win", Toast.LENGTH_SHORT).show();
                    resO += 1;
                    txtO.setText(Integer.toString(resO));
                }
            }
        }
        if(b!=0 && e!=0 && h!=0) {
            if ((b % 2 == 0 && e % 2 == 0 && h % 2 == 0) || (b % 2 != 0 && e % 2 != 0 && h % 2 != 0)) {
                win.start();
                btnx2.setBackgroundResource(R.color.green);
                btnx5.setBackgroundResource(R.color.green);
                btnx8.setBackgroundResource(R.color.green);
                disableall();
                if(btnx2.getText().toString().equals("X")){
                    Toast.makeText(getApplicationContext(), "X is Win", Toast.LENGTH_SHORT).show();
                    resX += 1;
                    txtX.setText(Integer.toString(resX));

                }
                else{
                    Toast.makeText(getApplicationContext(), "O is Win", Toast.LENGTH_SHORT).show();
                    resO += 1;
                    txtO.setText(Integer.toString(resO));
                }
            }
        }
        if(c!=0 && f!=0 && i!=0) {
            if ((c % 2 == 0 && f % 2 == 0 && i % 2 == 0) || (c % 2 != 0 && f % 2 != 0 && i % 2 != 0)) {
                win.start();
                btnx3.setBackgroundResource(R.color.green);
                btnx6.setBackgroundResource(R.color.green);
                btnx9.setBackgroundResource(R.color.green);
                disableall();
                if(btnx3.getText().toString().equals("X")){
                    Toast.makeText(getApplicationContext(), "X is Win", Toast.LENGTH_SHORT).show();
                    resX += 1;
                    txtX.setText(Integer.toString(resX));
                }
                else{
                    Toast.makeText(getApplicationContext(), "O is Win", Toast.LENGTH_SHORT).show();
                    resO += 1;
                    txtO.setText(Integer.toString(resO));
                }
            }
        }
        if(a!=0 && e!=0 && i!=0) {
            if ((a % 2 == 0 && e % 2 == 0 && i % 2 == 0) || (a % 2 != 0 && e % 2 != 0 && i % 2 != 0)) {
                win.start();
                btnx1.setBackgroundResource(R.color.green);
                btnx5.setBackgroundResource(R.color.green);
                btnx9.setBackgroundResource(R.color.green);
                disableall();
                if(btnx1.getText().toString().equals("X")){
                    Toast.makeText(getApplicationContext(), "X is Win", Toast.LENGTH_SHORT).show();
                    resX += 1;
                    txtX.setText(Integer.toString(resX));
                }
                else{
                    Toast.makeText(getApplicationContext(), "O is Win", Toast.LENGTH_SHORT).show();
                    resO += 1;
                    txtO.setText(Integer.toString(resO));
                }
            }
        }
        if(c!=0 && e!=0 && g!=0) {
            if ((c % 2 == 0 && e % 2 == 0 && g % 2 == 0) || (c % 2 != 0 && e % 2 != 0 && g % 2 != 0)) {
                win.start();
                btnx3.setBackgroundResource(R.color.green);
                btnx5.setBackgroundResource(R.color.green);
                btnx7.setBackgroundResource(R.color.green);
                disableall();
                if(btnx3.getText().toString().equals("X")){
                    Toast.makeText(getApplicationContext(), "X is Win", Toast.LENGTH_SHORT).show();
                    resX += 1;
                    txtX.setText(Integer.toString(resX));
                }
                else{
                    Toast.makeText(getApplicationContext(), "O is Win", Toast.LENGTH_SHORT).show();
                    resO += 1;
                    txtO.setText(Integer.toString(resO));
                }
            }
        }

    }
    public void disableall(){
        btnx1.setEnabled(false);
        btnx2.setEnabled(false);
        btnx3.setEnabled(false);
        btnx4.setEnabled(false);
        btnx5.setEnabled(false);
        btnx6.setEnabled(false);
        btnx7.setEnabled(false);
        btnx8.setEnabled(false);
        btnx9.setEnabled(false);
    }
}