package com.example.digitalscoreboardapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int homeTeamCounter = 0;
    private int guestTeamCounter = 0;

    Button homeButtonScore;
    Button guestButtonScore;
    Button resetScore;
    TextView homeScore;
    TextView guestScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        homeButtonScore = findViewById(R.id.homeButtonScore);
        homeButtonScore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                homeScore = findViewById(R.id.homeScore);
                homeTeamCounter++;
                homeScore.setText(String.valueOf(homeTeamCounter));
            }
        });

        guestButtonScore = findViewById(R.id.guestButtonScore);
        guestButtonScore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                guestScore = findViewById(R.id.guestScore);
                guestTeamCounter++;
                guestScore.setText(String.valueOf(guestTeamCounter));
            }
        });

        resetScore = findViewById(R.id.resetScore);
        resetScore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                homeScore = findViewById(R.id.homeScore);
                guestScore = findViewById(R.id.guestScore);
                homeTeamCounter = 0;
                guestTeamCounter = 0;
                homeScore.setText(String.valueOf(homeTeamCounter));
                guestScore.setText(String.valueOf(guestTeamCounter));
            }
        });

    }
}