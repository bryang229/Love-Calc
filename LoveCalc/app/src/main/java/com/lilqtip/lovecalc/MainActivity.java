package com.lilqtip.lovecalc;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //this is the herat image
        final ImageView heart = (ImageView) findViewById(R.id.heart);
        //array for possible replies to the percent
        final String[] opinionsArray = new String[] {
                "You two are already married",
                "You two are meant to be",
                "You two seem good for each other",
                "You guys seem coo",
                "Uhhhh clap cheeks and dip, not good",
                "Who's going to break the news ?",
                "DIPP"
        };
        //fucntion responisble for making the button work and finding a random %
        final Button findOutBtn = (Button) findViewById(R.id.findOutBtn);
        findOutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView opinions = (TextView) findViewById(R.id.opinions);
                EditText herText = (EditText) findViewById(R.id.herText);
                EditText himText = (EditText) findViewById(R.id.himText);

                Random opinionsNum = new Random();
                int number = opinionsNum.nextInt(101);
                TextView percent = (TextView) findViewById(R.id.percent);
                percent.setText(number + "%");

                    if (number > 95) {
                        opinions.setText(opinionsArray[1]);
                        heart.setImageResource(R.drawable.heart);

                    } else if (number > 80) {
                        opinions.setText(opinionsArray[2]);
                        heart.setImageResource(R.drawable.heart);

                    } else if (number > 60) {
                        opinions.setText(opinionsArray[3]);
                        heart.setImageResource(R.drawable.heart);

                    } else if (number > 40) {
                        opinions.setText(opinionsArray[4]);
                        heart.setImageResource(R.drawable.broken_heart);
                    } else if (number > 20) {
                        opinions.setText(opinionsArray[5]);
                        heart.setImageResource(R.drawable.broken_heart);
                    } else if (number > 0) {
                        opinions.setText(opinionsArray[6]);
                        heart.setImageResource(R.drawable.broken_heart);

                    }
                    herText.setText("");
                    himText.setText("");
                }

        });


    }
}