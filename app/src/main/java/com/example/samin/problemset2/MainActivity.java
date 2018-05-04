package com.example.samin.problemset2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int pointA = 0;
    int pointB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // PASTE CODE YOU WANT TO TEST HERE

    }


    //Displays the given score for Team A
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    //Add three points for three pointers
    public void threePointsA(View view){
        pointA += 3;
        displayForTeamA(pointA);
    }
    //Add two points for a regular basket
    public void twoPointsA(View view){
        pointA += 2;
        displayForTeamA(pointA);
    }
    //Add one for a free throw
    public void freeThrowA(View view){
        pointA++;
        displayForTeamA(pointA);
    }

    ///Tram B
    //Displays the given score for Team A
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    //Add three points for three pointers
    public void threePointsB(View view){
        pointB += 3;
        displayForTeamB(pointB);
    }
    //Add two points for a regular basket
    public void twoPointsB(View view){
        pointB += 2;
        displayForTeamB(pointB);
    }
    //Add one for a free throw
    public void freeThrowB(View view){
        pointB++;
        displayForTeamB(pointB);
    }

    // Reset
    public void resetScore(View v) {
        pointA = 0;
        pointB = 0;
        displayForTeamA(pointA);
        displayForTeamB(pointB);
    }
}