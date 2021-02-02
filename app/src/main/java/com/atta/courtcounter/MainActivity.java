package com.atta.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    int team1Score = 0, team2Score =0;

    TextView team1ScoreTv, team2ScoreTv;

    Button add3Team1, add2Team1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        team1ScoreTv = findViewById(R.id.team1_score);
        add3Team1 = findViewById(R.id.add3_team1);
        add3Team1.setOnClickListener(this);

        add2Team1 = findViewById(R.id.add2_team1);
        add2Team1.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        if (view == add3Team1) {
            team1Score += 3;
            team1ScoreTv.setText(String.valueOf(team1Score));
        }else if (view == add2Team1){
            team1Score += 2;
            team1ScoreTv.setText(String.valueOf(team1Score));
        }
    }
}