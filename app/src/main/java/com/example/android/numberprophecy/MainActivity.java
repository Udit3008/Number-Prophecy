package com.example.android.numberprophecy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int random_number;

    public void guess(View view) {

        EditText guessEditText = (EditText) findViewById(R.id.guessEditText);
        int guessInt = Integer.parseInt(guessEditText.getText().toString());

        if (guessInt > random_number) {
            Toast.makeText(MainActivity.this, "Hey! You got ahead, Think Lower!", Toast.LENGTH_SHORT).show();

        } else if (guessInt < random_number) {
                    Toast.makeText(MainActivity.this,"Hey! I am ahead, come closer, Think Higher!", Toast.LENGTH_SHORT).show();

        } else {
            Toast.makeText(MainActivity.this,"Wow great! You got me!", Toast.LENGTH_SHORT).show();

            Random random = new Random();
            random_number = random.nextInt(30)+1;
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random random = new Random();
        random_number = random.nextInt(30)+1;
    }
}
