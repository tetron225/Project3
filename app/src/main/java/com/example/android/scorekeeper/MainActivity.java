package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    int keepingScoreA=0;
    int cumulativeScoreA=0;

    int keepingScoreB=0;
    int cumulativeScoreB=0;

    int strikeScoreA1=0;
    int strikeScoreA2=0;
    int strikeScoreA3=0;

    int strikeScoreB1=0;
    int strikeScoreB2=0;
    int strikeScoreB3=0;

    int tempNumA=0;
    int spareCalcA=0;

    int tempNumB=0;
    int spareCalcB=0;

    int iframeCounter = 1;
    int iframeCounterB = 1;

    String markThingsA="-";
    String markThingsA2="-";
    String markThingsA3="-";

    String markThingsB="-";
    String markThingsB2="-";
    String markThingsB3="-";

    boolean spareCheckA = false;
    boolean spareCheck2A = false;
    boolean spareNumA = false;

    boolean spareCheckB = false;
    boolean spareCheck2B = false;
    boolean spareNumB = false;

    boolean markA = false;
    boolean markA2 = false;
    boolean markA3 = false;

    boolean markB = false;
    boolean markB2 = false;
    boolean markB3 = false;

    boolean SSA = false;
    boolean SSA2 = false;
    boolean SSA3 = false;

    boolean SSB = false;
    boolean SSB2 = false;
    boolean SSB3 = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onePointA(View v)
    {
        if(!markA2) {
            if(spareCheckA)
            {
                spareNumA = true;
            }
            markThingsA2 = "1";
            displayMarkA2(markThingsA2);
            markA2 = true;
            keepingScoreA = keepingScoreA + 1;
            spareCalcA = 1;
            tempNumA = 1;
        }
        else if(!markA3) {
            markThingsA3 = "1";
            displayMarkA3(markThingsA3);
            markA3 = true;
            keepingScoreA = keepingScoreA + 1;
        }
        else
        {
            Toast.makeText(this, "There is no space to add or the character doesn't exist", Toast.LENGTH_SHORT).show();
        }

    }

    public void twoPointA(View v)
    {
        if(!markA2) {
            if(spareCheckA)
            {
                spareNumA = true;
            }
            markThingsA2 = "2";
            displayMarkA2(markThingsA2);
            markA2 = true;
            keepingScoreA = keepingScoreA + 2;
            spareCalcA = 2;
            tempNumA = 2;
        }
        else if(!markA3) {
            markThingsA3 = "2";
            displayMarkA3(markThingsA3);
            markA3 = true;
            keepingScoreA = keepingScoreA + 2;
        }
        else
        {
            Toast.makeText(this, "There is no space to add or the character doesn't exist", Toast.LENGTH_SHORT).show();
        }
    }

    public void threePointA(View v)
    {
        if(!markA2) {
            if(spareCheckA)
            {
                spareNumA = true;
            }
            markThingsA2 = "3";
            displayMarkA2(markThingsA2);
            markA2 = true;
            keepingScoreA = keepingScoreA + 3;
            spareCalcA = 3;
            tempNumA = 3;
        }
        else if(!markA3) {
            markThingsA3 = "3";
            displayMarkA3(markThingsA3);
            markA3 = true;
            keepingScoreA = keepingScoreA + 3;
        }
        else
        {
            Toast.makeText(this, "There is no space to add or the character doesn't exist", Toast.LENGTH_SHORT).show();
        }
    }

    /*
    Displays 4 points on the frame
    Uses an if/else statement to check if theres a mark on the second frame.
    Spare calculation is used if the third frame is a spare.
    */
    public void fourPointA(View v)
    {
        if(!markA2) {
            if(spareCheckA)
            {
                spareNumA = true;
            }
            markThingsA2 = "4";
            displayMarkA2(markThingsA2);
            markA2 = true;
            keepingScoreA = keepingScoreA + 4;
            spareCalcA = 4;
            tempNumA = 4;
        }
        else if(!markA3) {
            markThingsA3 = "4";
            displayMarkA3(markThingsA3);
            markA3 = true;
            keepingScoreA = keepingScoreA + 4;
        }
        else
        {
            Toast.makeText(this, "There is no space to add or the character doesn't exist", Toast.LENGTH_SHORT).show();
        }
    }

    //Displays 5 points on the frame
    public void fivePointA(View v)
    {
        if(!markA2) {
            if(spareCheckA)
            {
                spareNumA = true;
            }
            markThingsA2 = "5";
            displayMarkA2(markThingsA2);
            markA2 = true;
            keepingScoreA = keepingScoreA + 5;
            spareCalcA = 5;
            tempNumA = 5;

        }
        else if(!markA3) {
            markThingsA3 = "5";
            displayMarkA3(markThingsA3);
            markA3 = true;
            keepingScoreA = keepingScoreA + 5;
        }
        else
        {
            Toast.makeText(this, "There is no space to add or the character doesn't exist", Toast.LENGTH_SHORT).show();
        }
    }

    //Displays 6 points on the frame
    public void sixPointA(View v)
    {
        if(!markA2) {
            if(spareCheckA)
            {
                spareNumA = true;
            }
            markThingsA2 = "6";
            displayMarkA2(markThingsA2);
            markA2 = true;
            keepingScoreA = keepingScoreA + 6;
            spareCalcA = 6;
            tempNumA = 6;
        }
        else if(!markA3) {
            markThingsA3 = "6";
            displayMarkA3(markThingsA3);
            markA3 = true;
            keepingScoreA = keepingScoreA + 6;
        }
        else
        {
            Toast.makeText(this, "There is no space to add or the character doesn't exist", Toast.LENGTH_SHORT).show();
        }
    }

    //Displays 7 points on the frame
    public void sevenPointA(View v)
    {
        if(!markA2) {
            if(spareCheckA)
            {
                spareNumA = true;
            }
            markThingsA2 = "7";
            displayMarkA2(markThingsA2);
            markA2 = true;
            keepingScoreA = keepingScoreA + 7;
            spareCalcA = 7;
            tempNumA = 7;
        }
        else if(!markA3) {
            markThingsA3 = "7";
            displayMarkA3(markThingsA3);
            markA3 = true;
            keepingScoreA = keepingScoreA + 7;
        }
        else
        {
            Toast.makeText(this, "There is no space to add or the character doesn't exist", Toast.LENGTH_SHORT).show();
        }
    }

    //Displays 8 points on the frame
    public void eightPointA(View v)
    {
        if(!markA2) {
            if(spareCheckA)
            {
                spareNumA = true;
            }
            markThingsA2 = "8";
            displayMarkA2(markThingsA2);
            markA2 = true;
            keepingScoreA = keepingScoreA + 7;
            spareCalcA = 8;
            tempNumA = 8;
        }
        else if(!markA3) {
            markThingsA3 = "8";
            displayMarkA3(markThingsA3);
            markA3 = true;
            keepingScoreA = keepingScoreA + 8;
        }
        else
        {
            Toast.makeText(this, "There is no space to add or you cannot add another strike on this frame", Toast.LENGTH_SHORT).show();
        }

    }
    //Displays 9 points on the frame
    public void ninePointA(View v)
    {
        if(!markA2) {
            if(spareCheckA)
            {
                spareNumA = true;
            }
            markThingsA2 = "9";
            displayMarkA2(markThingsA2);
            markA2 = true;
            keepingScoreA = keepingScoreA + 9;
            spareCalcA = 9;
            tempNumA = 9;
        }
        else if(!markA3) {
            markThingsA3 = "9";
            displayMarkA3(markThingsA3);
            markA3 = true;
            keepingScoreA = keepingScoreA + 9;
        }
        else
        {
            Toast.makeText(this, "There is no space to add or the character doesn't exist", Toast.LENGTH_SHORT).show();
        }
    }

    public void resetA(View v)
    {
        displayMarkA2("-");
        displayMarkA3("-");
        markA2 = false;
        markA3 = false;
        keepingScoreA = 0;
    }
    public void onePointB(View v)
    {
        if(!markB2) {
            if(spareCheckB)
            {
                spareNumB = true;
            }
            markThingsB2 = "1";
            displayMarkB2(markThingsB2);
            markB2 = true;
            keepingScoreB = keepingScoreB + 1;
            spareCalcB = 1;
            tempNumB = 1;
        }
        else if(!markB3) {
            markThingsB3 = "1";
            displayMarkB3(markThingsB3);
            markB3 = true;
            keepingScoreB = keepingScoreB + 1;
        }
        else
        {
            Toast.makeText(this, "There is no space to add or the character doesn't exist", Toast.LENGTH_SHORT).show();
        }
    }

    public void twoPointB(View v)
    {
        if(!markB2) {
            if(spareCheckB)
            {
                spareNumB = true;
            }
            markThingsB2 = "2";
            displayMarkB2(markThingsB2);
            markB2 = true;
            keepingScoreB = keepingScoreB + 2;
            spareCalcB = 2;
            tempNumB = 2;
        }
        else if(!markB3) {
            markThingsB3 = "2";
            displayMarkB3(markThingsB3);
            markB3 = true;
            keepingScoreB = keepingScoreB + 2;
        }
        else
        {
            Toast.makeText(this, "There is no space to add or the character doesn't exist", Toast.LENGTH_SHORT).show();
        }
    }

    public void threePointB(View v)
    {
        if(!markB2) {
            if(spareCheckB)
            {
                spareNumB = true;
            }
            markThingsB2 = "3";
            displayMarkB2(markThingsB2);
            markB2 = true;
            keepingScoreB = keepingScoreB + 3;
            spareCalcB = 3;
            tempNumB = 3;
        }
        else if(!markB3) {
            markThingsB3 = "3";
            displayMarkB3(markThingsB3);
            markB3 = true;
            keepingScoreB = keepingScoreB + 3;
        }
        else
        {
            Toast.makeText(this, "There is no space to add or the character doesn't exist", Toast.LENGTH_SHORT).show();
        }
    }

    public void fourPointB(View v)
    {
        if(!markB2) {
            if(spareCheckB)
            {
                spareNumB = true;
            }
            markThingsB2 = "4";
            displayMarkB2(markThingsB2);
            markB2 = true;
            keepingScoreB = keepingScoreB + 4;
            spareCalcB = 4;
            tempNumB = 4;
        }
        else if(!markB3) {
            markThingsB3 = "4";
            displayMarkB3(markThingsB3);
            markB3 = true;
            keepingScoreB = keepingScoreB + 4;
        }
        else
        {
            Toast.makeText(this, "There is no space to add or the character doesn't exist", Toast.LENGTH_SHORT).show();
        }
    }

    public void fivePointB(View v)
    {
        if(!markB2) {
            if(spareCheckB)
            {
                spareNumB = true;
            }
            markThingsB2 = "5";
            displayMarkB2(markThingsB2);
            markB2 = true;
            keepingScoreB = keepingScoreB + 5;
            spareCalcB = 5;
            tempNumB = 5;
        }
        else if(!markB3) {
            markThingsB3 = "5";
            displayMarkB3(markThingsB3);
            markB3 = true;
            keepingScoreB = keepingScoreB + 5;
        }
        else
        {
            Toast.makeText(this, "There is no space to add or the character doesn't exist", Toast.LENGTH_SHORT).show();
        }
    }

    public void sixPointB(View v)
    {
        if(!markB2) {
            if(spareCheckB)
            {
                spareNumB = true;
            }
            markThingsB2 = "6";
            displayMarkB2(markThingsB2);
            markB2 = true;
            keepingScoreB = keepingScoreB + 6;
            spareCalcB = 6;
            tempNumB = 6;
        }
        else if(!markB3) {
            markThingsB3 = "6";
            displayMarkB3(markThingsB3);
            markB3 = true;
            keepingScoreB = keepingScoreB + 6;
        }
        else
        {
            Toast.makeText(this, "There is no space to add or the character doesn't exist", Toast.LENGTH_SHORT).show();
        }
    }

    public void sevenPointB(View v)
    {
        if(!markB2) {
            if(spareCheckB)
            {
                spareNumB = true;
            }
            markThingsB2 = "7";
            displayMarkB2(markThingsB2);
            markB2 = true;
            keepingScoreB = keepingScoreB + 7;
            spareCalcB = 7;
            tempNumB = 7;
        }
        else if(!markB3) {
            markThingsB3 = "7";
            displayMarkB3(markThingsB3);
            markB3 = true;
            keepingScoreB = keepingScoreB + 7;
        }
        else
        {
            Toast.makeText(this, "There is no space to add or the character doesn't exist", Toast.LENGTH_SHORT).show();
        }
    }

    public void eightPointB(View v)
    {
        if(!markB2) {
            if(spareCheckB)
            {
                spareNumB = true;
            }
            markThingsB2 = "8";
            displayMarkB2(markThingsB2);
            markB2 = true;
            keepingScoreB = keepingScoreB + 8;
            spareCalcB = 8;
            tempNumB = 8;
        }
        else if(!markB3) {
            markThingsB3 = "8";
            displayMarkB3(markThingsB3);
            markB3 = true;
            keepingScoreB = keepingScoreB + 8;
        }
        else
        {
            Toast.makeText(this, "There is no space to add or the character doesn't exist", Toast.LENGTH_SHORT).show();
        }
    }

    public void ninePointB(View v)
    {
        if(!markB2) {
            if(spareCheckB)
            {
                spareNumB = true;
            }
            markThingsB2 = "9";
            displayMarkB2(markThingsB2);
            markB2 = true;
            keepingScoreB = keepingScoreB + 9;
            spareCalcB = 9;
            tempNumB = 9;
        }
        else if(!markB3) {
            markThingsB3 = "9";
            displayMarkB3(markThingsB3);
            markB3 = true;
            keepingScoreB = keepingScoreB + 9;
        }
        else
        {
            Toast.makeText(this, "There is no space to add or the character doesn't exist", Toast.LENGTH_SHORT).show();
        }
    }

    public void resetB(View v)
    {
        displayMarkB2("-");
        displayMarkB3("-");
        markB2 = false;
        markB3 = false;
        keepingScoreB = 0;
    }

    /*
        Shows the strike mark if the player received a strike
        Strikes are always on the first frame. Never on the second frame
        Also checks to see if theres more than 1 strike because of how a strike scoring works
        X = cumulatively adds the next 2 scores together.
        strikeScoreA1, A2, A3 holds the previous strikes.
        ex: X, X, 8|1, 3|3
        X = 10
        Scoring would be:
        (X)    10 + 10 + 8
        (X)    10 + 8 + 1
        (8|1)  8 + 1
        (3|3)  3 + 3

    */
    public void strikeMarkA(View v) {
        if(!markA2) {
            if(!SSA) {
                markThingsA2 = "X";
                displayMarkA2(markThingsA2);
                markA2 = true;
                markA3 = true;
                strikeScoreA1 = 10;
                SSA = true;
                Log.v("Error:", "strikescoreA1 = 10");
            } else if(!SSA2) {
                markThingsA2 = "X";
                displayMarkA2(markThingsA2);
                markA2 = true;
                markA3 = true;
                strikeScoreA2 = 10;
                SSA2 = true;
                Log.v("Error:", "strikescoreA2 = 10");
            } else if(!SSA3) {
                markThingsA2 = "X";
                displayMarkA2(markThingsA2);
                markA2 = true;
                markA3 = true;
                strikeScoreA3 = 10;
                SSA3 = true;
                Log.v("Error:", "strikescoreA2 = 30");
            } else {
                Toast.makeText(this, "There was an error", Toast.LENGTH_SHORT).show();
            }
        }
        else {
            Log.v("Error:", "some weird errors");
            Toast.makeText(this, "There is no space to add or the character doesn't exist", Toast.LENGTH_SHORT).show();
        }

    }

    public void strikeMarkB(View v) {
        if(!markB2) {
            if(!SSB) {
                markThingsB2 = "X";
                displayMarkB2(markThingsB2);
                markB2 = true;
                markB3 = true;
                strikeScoreB1 = 10;
                SSB = true;
            } else if(!SSB2) {
                markThingsB2 = "X";
                displayMarkB2(markThingsB2);
                markB2 = true;
                markB3 = true;
                strikeScoreB2 = 10;
                SSB2 = true;
            } else if(!SSB3) {
                markThingsB2 = "X";
                displayMarkB2(markThingsB2);
                markB2 = true;
                markB3 = true;
                strikeScoreB3 = 10;
                SSB3 = true;
            } else {
                Toast.makeText(this, "There was an error", Toast.LENGTH_SHORT).show();
            }
        }
        else {
            Toast.makeText(this, "There is no space to add or the character doesn't exist", Toast.LENGTH_SHORT).show();
        }

    }


    public void spareMarkA(View v)
    {
        if(!markA3) {
            markThingsA3 = "/";
            displayMarkA3(markThingsA3);
            markA3 = true;
            if(spareCheckA)
            {
                spareCheck2A = true;
            }
            spareCheckA = true;
        }
        else {
            Toast.makeText(this, "There is no space to add or the character doesn't exist", Toast.LENGTH_SHORT);
        }
    }


    public void spareMarkB(View v)
    {
        if(!markB3) {
            markThingsB3 = "/";
            displayMarkB3(markThingsB3);
            markB3 = true;
            if(spareCheckB)
            {
                spareCheck2B = true;
            }
            spareCheckB = true;
        }
        else {
            Toast.makeText(this, "There is no space to add or the character doesn't exist", Toast.LENGTH_SHORT);
        }
    }

    /*
        Calculates the total points of a bowling game.
        -------------------------------------------------------
        It deals with if there were 1,2 or 3 strikes to calculate accordingly
        If it was the first time a player made a strike, it will not calculate until it has the next 3 frames filled with numbers
        Strikes can only be listed on the second frame
        Example:
        X, X, 8|1, 3|3
        X = 10
        Scoring would be:
        (X)    10 + 10 + 8
        (X)    10 + 8 + 1
        (8|1)  8 + 1
        (3|3)  3 + 3

        Strikes will only be placed in the second frame or else error meesage happens using Toast
        -------------------------------------------------------
        If it has a spare, it calculates accordingly.
        Spare Calculation will be 10 + the next score from the next frame.
        Example:
        8|/  =  (8+2) + 5
        5|/  =  (5+5) + 9
        9|0  =  9 + 0

        Spare symbols can only be on the third frame or else error message happens using Toast
        --------------------------------------------------------
        Otherwise it will calculate the cumulative score of the bowling game
        ________________________________________________________
        For certain strikes and spares, the cumulative score will not be shown until the next frame is calculated
        but it will still be included into the cumulative score

     */
    public void enterCalcA(View v)
    {
        if(strikeScoreA3 > 0) {
            cumulativeScoreA = cumulativeScoreA + strikeScoreA1 + strikeScoreA2 + strikeScoreA3;
            displayForTeamA(cumulativeScoreA);
            strikeScoreA1 = strikeScoreA2;
            strikeScoreA2 = strikeScoreA3;
            strikeScoreA3 = 0;
            SSA = SSA2;
            SSA2 = SSA3;
            SSA3 = false;
            markA2 = false;
            markA3 = false;
            displayMarkA2("-");
            displayMarkA3("-");
            keepingScoreA = 0;
            Log.v("Error maybe","this should add 30 points ");
        } else if(strikeScoreA2 > 0) {
            if(iframeCounter == 2)
            {
                displayMarkA2("-");
                displayMarkA3("-");
                markA2 = false;
                markA3 = false;
                Log.v("Error maybe","quits right away ");
                keepingScoreA = 0;
                iframeCounter += 1;
                return;
            }
            cumulativeScoreA = cumulativeScoreA + strikeScoreA1 + strikeScoreA2 + tempNumA;
            displayForTeamA(cumulativeScoreA);
            tempNumA = 0;
            strikeScoreA1 = strikeScoreA2;
            strikeScoreA2 = 0;
            SSA = SSA2;
            SSA = false;
            markA2 = false;
            markA3 = false;
            displayMarkA2("-");
            displayMarkA3("-");
            keepingScoreA = 0;
            Log.v("Error maybe","this should add 20 points ");
            iframeCounter -= 1;
        }else if(strikeScoreA1 > 0) {
            if(iframeCounter == 1)
            {
                displayMarkA2("-");
                displayMarkA3("-");
                markA2 = false;
                markA3 = false;
                Log.v("Error maybe","quits right away ");
                keepingScoreA = 0;
                iframeCounter += 1;
                return;
            }
            cumulativeScoreA = cumulativeScoreA + strikeScoreA1 + keepingScoreA;
            displayForTeamA(cumulativeScoreA);
            Log.v("Error maybe","this should add 10 points ");
            strikeScoreA1 = 0;
            SSA = false;
            markA2 = false;
            markA3 = false;
            displayMarkA2("-");
            displayMarkA3("-");
            keepingScoreA = 0;
            iframeCounter -= 1;
        } else if(spareCheckA){
            if(!spareNumA)
            {
                displayMarkA2("-");
                displayMarkA3("-");
                keepingScoreA = 0;
                markA2 = false;
                markA3 = false;
                return;
            }

            if(spareCheck2A) {
                cumulativeScoreA = cumulativeScoreA + spareCalcA + 10;
                displayForTeamA(cumulativeScoreA);
                spareCheckA = spareCheck2A;
                spareCheck2A = false;
                keepingScoreA = 0;
                displayMarkA2("-");
                displayMarkA3("-");
                markA2 = false;
                markA3 = false;
            }
            else {
                cumulativeScoreA = cumulativeScoreA + spareCalcA + 10;
                displayForTeamA(cumulativeScoreA);
                spareCheckA = false;
                spareNumA = false;
                keepingScoreA = 0;
                displayMarkA2("-");
                displayMarkA3("-");
                markA2 = false;
                markA3 = false;
            }

        } else {
            cumulativeScoreA = cumulativeScoreA + keepingScoreA;
            displayForTeamA(cumulativeScoreA);
            keepingScoreA = 0;
            displayMarkA2("-");
            displayMarkA3("-");
            markA2 = false;
            markA3 = false;
        }
    }

    /*
    Calculation for Team B
     */
    public void enterCalcB(View v)
    {
        if(strikeScoreB3 > 0) {
            cumulativeScoreB = cumulativeScoreB + strikeScoreB1 + strikeScoreB2 + strikeScoreB3;
            displayForTeamB(cumulativeScoreB);
            strikeScoreB1 = strikeScoreB2;
            strikeScoreB2 = strikeScoreB3;
            strikeScoreB3 = 0;
            SSB = SSB2;
            SSB2 = SSB3;
            SSB3 = false;
            markB2 = false;
            markB3 = false;
            displayMarkB2("-");
            displayMarkB3("-");
            keepingScoreB = 0;
        } else if(strikeScoreB2 > 0) {
            if(iframeCounterB == 2)
            {
                displayMarkB2("-");
                displayMarkB3("-");
                markB2 = false;
                markB3 = false;
                keepingScoreB = 0;
                iframeCounterB += 1;
                return;
            }
            cumulativeScoreB = cumulativeScoreB + strikeScoreB1 + strikeScoreB2 + tempNumB;
            displayForTeamB(cumulativeScoreB);
            tempNumB = 0;
            strikeScoreB1 = strikeScoreB2;
            strikeScoreB2 = 0;
            SSB = SSB2;
            SSB = false;
            markB2 = false;
            markB3 = false;
            displayMarkB2("-");
            displayMarkB3("-");
            keepingScoreB = 0;
            iframeCounterB -= 1;
        }else if(strikeScoreB1 > 0) {
            if(iframeCounterB == 1)
            {
                displayMarkB2("-");
                displayMarkB3("-");
                markB2 = false;
                markB3 = false;
                keepingScoreB = 0;
                iframeCounterB += 1;
                return;
            }
            cumulativeScoreB = cumulativeScoreB + strikeScoreB1 + keepingScoreB;
            displayForTeamB(cumulativeScoreB);
            Log.v("Error maybe","this should add 10 points ");
            strikeScoreB1 = 0;
            SSB = false;
            markB2 = false;
            markB3 = false;
            displayMarkB2("-");
            displayMarkB3("-");
            keepingScoreB = 0;
            iframeCounterB -= 1;
        } else if(spareCheckB){
            if(!spareNumB)
            {
                displayMarkB2("-");
                displayMarkB3("-");
                keepingScoreB = 0;
                markB2 = false;
                markB3 = false;
                return;
            }

            if(spareCheck2B) {
                cumulativeScoreB = cumulativeScoreB + spareCalcB + 10;
                displayForTeamB(cumulativeScoreB);
                spareCheckB = spareCheck2B;
                spareCheck2B = false;
                keepingScoreB = 0;
                displayMarkB2("-");
                displayMarkB3("-");
                markB2 = false;
                markB3 = false;
            }
            else {
                cumulativeScoreB = cumulativeScoreB + spareCalcB + 10;
                displayForTeamB(cumulativeScoreB);
                spareCheckB = false;
                spareNumB = false;
                keepingScoreB = 0;
                displayMarkB2("-");
                displayMarkB3("-");
                markB2 = false;
                markB3 = false;
            }

        } else {
            cumulativeScoreB = cumulativeScoreB + keepingScoreB;
            displayForTeamB(cumulativeScoreB);
            keepingScoreB = 0;
            displayMarkB2("-");
            displayMarkB3("-");
            markB2 = false;
            markB3 = false;
        }
    }


    public void resetThis(View v)
    {
        keepingScoreA = keepingScoreA - keepingScoreA;
        keepingScoreB = keepingScoreB - keepingScoreB;

        cumulativeScoreA = 0;
        cumulativeScoreB = 0;

        markThingsA = "-";
        markThingsB = "-";

        displayForTeamA(keepingScoreA);
        displayForTeamB(keepingScoreB);
        displayMarkA2(markThingsA);
        displayMarkA3(markThingsB);

        markA2 = false;
        markA3 = false;
        markB2 = false;
        markB3 = false;

    }

    public void displayForTeamA(int score)
    {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score)
    {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayMarkA(String s)
    {
        TextView markView = findViewById(R.id.markUpA);
        markView.setText(s);
    }

    public void displayMarkA2(String s)
    {
        TextView markView2 = findViewById(R.id.markUpA2);
        markView2.setText(s);
    }

    public void displayMarkA3(String s)
    {
        TextView markView3 = findViewById(R.id.markUpA3);
        markView3.setText(s);
    }

    public void displayMarkB(String s)
    {
        TextView markView = findViewById(R.id.markUpB);
        markView.setText(s);
    }
    public void displayMarkB2(String s)
    {
        TextView markView = findViewById(R.id.markUpB2);
        markView.setText(s);
    }
    public void displayMarkB3(String s)
    {
        TextView markView = findViewById(R.id.markUpB3);
        markView.setText(s);
    }


}
