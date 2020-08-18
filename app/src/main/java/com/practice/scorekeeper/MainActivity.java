package com.practice.scorekeeper;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    int scorA = 0;
    int scorB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void freeA(View view) {
        scorA = scorA + 1;
        displayA(scorA);
    }

    public void freeB(View view) {
        scorB = scorB + 1;
        displayB(scorB);
    }

    public void plus3A(View view) {
        scorA = scorA + 3;
        displayA(scorA);
    }

    public void plus2A(View view) {
        scorA = scorA + 2;
        displayA(scorA);
    }

    public void plus3B(View view) {
        scorB = scorB + 3;
        displayB(scorB);
    }

    public void plus2B(View view) {
        scorB = scorB + 2;
        displayB(scorB);
    }

    public void reset(View view) {
        scorA = scorB = 0;
        displayA(scorA);
        displayB(scorB);
    }

    private void displayA(int number) {
        TextView scrA = (TextView) findViewById(R.id.scoreA);
        scrA.setText("" + number);
    }

    private void displayB(int number) {
        TextView scrB = (TextView) findViewById(R.id.scoreB);
        scrB.setText("" + number);
    }

}