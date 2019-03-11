package com.example.tictactoe;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    //yang menang 123, 147, 159, 456, 789, 258, 368, 357
    //merah jalan duluan lalu kuning
    String grid [][] = {{null,null,null}, {null,null,null}, {null,null,null}};




    int putaran = 0;
    boolean juara = false;

    public void click(View view){
        if(juara == false){
            String yangDiPencet = String.valueOf(view.getTag());
            ImageView pocketCoin = (ImageView) view;
            String barisYangDiPencet = yangDiPencet.substring(0,1);
            String kolomYangDiPencet = yangDiPencet.substring(yangDiPencet.length()-1);




//Jika belum diwarnain
            if(grid[Integer.parseInt(barisYangDiPencet)][Integer.parseInt(kolomYangDiPencet)]== null){
                if(putaran % 2 == 0){

                    pocketCoin.setImageResource(R.drawable.red);
                    putaran = putaran +1;

                    grid[Integer.parseInt(barisYangDiPencet)][Integer.parseInt(kolomYangDiPencet)] = "red";
                    checkMenang();
                }
                else{
                    pocketCoin.setImageResource(R.drawable.yellow);
                    putaran = putaran+1;
                    grid[Integer.parseInt(barisYangDiPencet)][Integer.parseInt(kolomYangDiPencet)] = "yellow";
                    checkMenang();
                }

            }

            Log.d("Baris Yang di pencet", String.valueOf(barisYangDiPencet));
            Log.d("Kolom Yang di pencet", String.valueOf(kolomYangDiPencet));
            System.out.println(Arrays.deepToString(grid));



        }

    }

    public void checkMenang(){

        TextView winner = (TextView) findViewById(R.id.winnerTextView);
        //check menang merah
        if((grid[0][0] == "red") && (grid[0][1]=="red") && (grid[0][2]== "red") ){
            Log.d("Winner", "Red is the winner");
            winner.setText("Merah Menang");
            juara = true;


        }
        if((grid[0][0] == "red") && (grid[1][0]=="red") && (grid[2][0]== "red") ){
            Log.d("Winner", "Red is the winner");
            winner.setText("Merah Menang");
            juara = true;
        }
        if((grid[0][0] == "red") && (grid[1][1]=="red") && (grid[2][2]== "red") ){
            Log.d("Winner", "Red is the winner");
            winner.setText("Merah Menang");
            juara = true;
        }
        if((grid[1][0] == "red") && (grid[2][0]=="red") && (grid[3][0]== "red") ){
            Log.d("Winner", "Red is the winner");
            winner.setText("Merah Menang");
            juara = true;
        }
        if((grid[2][0] == "red") && (grid[2][1]=="red") && (grid[2][2]== "red") ){
            Log.d("Winner", "Red is the winner");
            winner.setText("Merah Menang");
            juara = true;
        }
        if((grid[0][1] == "red") && (grid[1][1]=="red") && (grid[2][1]== "red") ){
            Log.d("Winner", "Red is the winner");
            winner.setText("Merah Menang");
            juara = true;
        }
        if((grid[0][2] == "red") && (grid[1][2]=="red") && (grid[2][2]== "red") ){
            Log.d("Winner", "Red is the winner");
            winner.setText("Merah Menang");
            juara = true;
        }
        if((grid[0][2] == "red") && (grid[1][1]=="red") && (grid[2][0]== "red") ){
            Log.d("Winner", "Red is the winner");
            winner.setText("Merah Menang");
            juara = true;
        }
        //check menang kuning
        if((grid[0][0] == "yellow") && (grid[0][1]=="yellow") && (grid[0][2]== "yellow") ){
            Log.d("Winner", "yellow is the winner");
            winner.setText("Kuning Menang");
            juara = true;
        }
        if((grid[0][0] == "yellow") && (grid[1][0]=="yellow") && (grid[2][0]== "yellow") ){
            Log.d("Winner", "yellow is the winner");
            winner.setText("Kuning Menang");
            juara = true;
        }
        if((grid[0][0] == "yellow") && (grid[1][1]=="yellow") && (grid[2][2]== "yellow") ){
            Log.d("Winner", "yellow is the winner");
            winner.setText("Kuning Menang");
            juara = true;
        }
        if((grid[1][0] == "yellow") && (grid[2][0]=="yellow") && (grid[3][0]== "yellow") ){
            Log.d("Winner", "yellow is the winner");
            winner.setText("Kuning Menang");
            juara = true;
        }
        if((grid[2][0] == "yellow") && (grid[2][1]=="yellow") && (grid[2][2]== "yellow") ){
            Log.d("Winner", "yellow is the winner");
            winner.setText("Kuning Menang");
            juara = true;
        }
        if((grid[0][1] == "yellow") && (grid[1][1]=="yellow") && (grid[2][1]== "yellow") ){
            Log.d("Winner", "yellow is the winner");
            winner.setText("Kuning Menang");
            juara = true;
        }
        if((grid[0][2] == "yellow") && (grid[1][2]=="yellow") && (grid[2][2]== "yellow") ){
            Log.d("Winner", "yellow is the winner");
            winner.setText("Kuning Menang");
            juara = true;
        }
        if((grid[0][2] == "yellow") && (grid[1][1]=="yellow") && (grid[2][0]== "yellow") ){
            Log.d("Winner", "yellow is the winner");
            winner.setText("Kuning Menang");
            juara = true;
        }
        if(putaran == 9){
            Log.d("seri", "SERI");
            winner.setText("Seri");
        }
    }

    public void replay(View view){
        putaran = 0;
        //set grid jadi null
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                grid[i][j] = null;
            }
        }
        //set Warna jadi biasa kembali
        ImageView grid00 = (ImageView) findViewById(R.id.gridImageView00);
        grid00.setImageResource(android.R.color.transparent);

        ImageView grid01 = (ImageView) findViewById(R.id.gridImageView01);
        grid01.setImageResource(android.R.color.transparent);

        ImageView grid02 = (ImageView) findViewById(R.id.gridImageView02);
        grid02.setImageResource(android.R.color.transparent);

        ImageView grid10 = (ImageView) findViewById(R.id.gridImageView10);
        grid10.setImageResource(android.R.color.transparent);

        ImageView grid11 = (ImageView) findViewById(R.id.gridImageView11);
        grid11.setImageResource(android.R.color.transparent);

        ImageView grid12 = (ImageView) findViewById(R.id.gridImageView12);
        grid12.setImageResource(android.R.color.transparent);

        ImageView grid20 = (ImageView) findViewById(R.id.gridImageView20);
        grid20.setImageResource(android.R.color.transparent);

        ImageView grid21 = (ImageView) findViewById(R.id.gridImageView21);
        grid21.setImageResource(android.R.color.transparent);

        ImageView grid22 = (ImageView) findViewById(R.id.gridImageView22);
        grid22.setImageResource(android.R.color.transparent);

        TextView menangTextView = (TextView) findViewById(R.id.winnerTextView);
        menangTextView.setText("");

        juara = false;

    }


}
