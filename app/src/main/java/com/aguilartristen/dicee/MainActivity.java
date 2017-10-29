package com.aguilartristen.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton;
        rollButton = (Button)findViewById(R.id.rollButton);

        final ImageView leftDice = (ImageView) findViewById(R.id.image_leftDice); //Casting
        final ImageView rightDice = (ImageView) findViewById(R.id.image_rightDice);

        final int[] diceArray = { //Added final so that the diceArray can't change
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
        };

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Dicee","Clicked"); //Print to Logcat

                Random randomNumberGenerator = new Random();
                int number = randomNumberGenerator.nextInt(6);

                Random randomNumberGenerator2 = new Random();
                int number2 = randomNumberGenerator2.nextInt(6);

                Log.d("Dicee","The random number is " + number);
                Log.d("Dicee","The random number 2 is " + number2);

                leftDice.setImageResource(diceArray[number]);
                rightDice.setImageResource(diceArray[number2]); //To save space, I got have just rest the value of variable number on line 49.
            }
        });
    }
}
