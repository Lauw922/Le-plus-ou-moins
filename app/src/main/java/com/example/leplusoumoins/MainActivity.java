package com.example.leplusoumoins;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private int randNumber;


    /**
     * Le commentaire pour la JavaDoc
     */

    public void guessNumber(View view){
       // Log.i(TAG, "guessNumber : button cliked"); // affiche des infos dans le log
        EditText etnumber = findViewById(R.id.et_number);
      //  String guessNumberText = etnumber.getText().toString().trim();
      //  Log.i(TAG, "guessNumber is : " + etnumber.getText().toString().trim());

        int nbUser = Integer.parseInt(etnumber.getText().toString().trim());
        String message;

        if (nbUser > randNumber){
            message = "Moins !";
            etnumber.setText("");
        } else if (nbUser < randNumber) {
            message = "Plus !";
            etnumber.setText("");
        }  else {
            message = "You win ;)";
            generateRandomNumber();
        }

         Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

    }

    public void generateRandomNumber(){
        Random rand = new Random();
        randNumber = rand.nextInt(20) + 1;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        generateRandomNumber();

        // TODO COMMENTAIRE TEST
    }
}