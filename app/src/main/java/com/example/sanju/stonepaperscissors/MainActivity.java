package com.example.sanju.stonepaperscissors;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {
      Button rock,paper,scissor;
      TextView re,start;
      TextView points;
    int score=0;
    int computerscore=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rock=findViewById(R.id.r);
        paper=findViewById(R.id.p);
        scissor=findViewById(R.id.s);
        start=(TextView) findViewById(R.id.text1);
        start.setText("Make a Move");
        rock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start=(TextView) findViewById(R.id.text1);
                start.setText("");
                 Random random=new Random();
                String personPlay; //User's play -- "R", "P", or "S"
                String computerPlay = ""; //Computer's play -- "R", "P", or "S"
                int computerInt; //Randomly generated number used to determine
                //computer's play
                //Generate computer's play (0,1,2)
                computerInt = random.nextInt(3)+1;

                //Translate computer's randomly generated play to
                //string using if //statements

                if (computerInt == 1)
                    computerPlay = "R";
                else if (computerInt == 2)
                    computerPlay = "P";
                else if (computerInt == 3)
                    computerPlay = "S";

                //Make player's play uppercase for ease of comparison
                personPlay = "R";
                //See who won. Use nested ifs

                if (personPlay.equals(computerPlay))
                {
                    ImageView outp = (ImageView) findViewById(R.id.pcicon );
                    outp.setImageDrawable(getResources().getDrawable(R.drawable.computer));
                    ImageView outp3 = (ImageView) findViewById(R.id.usericon );
                    outp3.setImageDrawable(getResources().getDrawable(R.drawable.user2));
                    points=(TextView) findViewById(R.id.score);
                     points.setText("PC score:  "+Integer.toString(computerscore)+"    "+"Your score:  "+Integer.toString(score)+" ");
                    ImageView outp1 = (ImageView) findViewById(R.id.pic1 );
                    outp1.setImageDrawable(getResources().getDrawable(R.drawable.stone));
                    ImageView outp2 = (ImageView) findViewById(R.id.pic2 );
                    outp2.setImageDrawable(getResources().getDrawable(R.drawable.stone));
                    re=(TextView) findViewById(R.id.result);
                    re.setText("It's a tie");}
                else if (computerPlay.equals("S")){
                    ImageView outp = (ImageView) findViewById(R.id.pcicon );
                    outp.setImageDrawable(getResources().getDrawable(R.drawable.computer));
                    ImageView outp3 = (ImageView) findViewById(R.id.usericon );
                    outp3.setImageDrawable(getResources().getDrawable(R.drawable.user2));
                    score++;
                    points=(TextView) findViewById(R.id.score);
                    points.setText("PC score:  "+Integer.toString(computerscore)+"    "+"Your score:  "+Integer.toString(score)+" ");                    ImageView outp1 = (ImageView) findViewById(R.id.pic1);
                    outp1.setImageDrawable(getResources().getDrawable(R.drawable.scissor));
                    ImageView outp2 = (ImageView) findViewById(R.id.pic2);
                    outp2.setImageDrawable(getResources().getDrawable(R.drawable.stone));
                    re=(TextView) findViewById(R.id.result);
                        re.setText("You win");}
                    else if (computerPlay.equals("P")){
                    computerscore++;
                    ImageView outp = (ImageView) findViewById(R.id.pcicon );
                    outp.setImageDrawable(getResources().getDrawable(R.drawable.computer));
                    ImageView outp3 = (ImageView) findViewById(R.id.usericon );
                    outp3.setImageDrawable(getResources().getDrawable(R.drawable.user2));
                    points=(TextView) findViewById(R.id.score);
                    points.setText("PC score:  "+Integer.toString(computerscore)+"    "+"Your score:  "+Integer.toString(score)+" ");                    ImageView outp1 = (ImageView) findViewById(R.id.pic1);
                    outp1.setImageDrawable(getResources().getDrawable(R.drawable.paper));
                    ImageView outp2 = (ImageView) findViewById(R.id.pic2);
                    outp2.setImageDrawable(getResources().getDrawable(R.drawable.stone));
                    re=(TextView) findViewById(R.id.result);
                    re.setText("You lose");}
            }
        });
        paper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start=(TextView) findViewById(R.id.text1);
                start.setText("");
                Random random=new Random();
                String personPlay; //User's play -- "R", "P", or "S"
                String computerPlay = ""; //Computer's play -- "R", "P", or "S"
                int computerInt; //Randomly generated number used to determine
                //computer's play
                //Generate computer's play (0,1,2)
                computerInt = random.nextInt(3)+1;
                if (computerInt == 1)
                    computerPlay = "R";
                else if (computerInt == 2)
                    computerPlay = "P";
                else if (computerInt == 3)
                    computerPlay = "S";

                //Make player's play uppercase for ease of comparison
                personPlay = "P";
                //See who won. Use nested ifs

                if (personPlay.equals(computerPlay)){
                    ImageView outp = (ImageView) findViewById(R.id.pcicon );
                    outp.setImageDrawable(getResources().getDrawable(R.drawable.computer));
                    ImageView outp3 = (ImageView) findViewById(R.id.usericon );
                    outp3.setImageDrawable(getResources().getDrawable(R.drawable.user2));
                    points=(TextView) findViewById(R.id.score);
                    points.setText("PC score:  "+Integer.toString(computerscore)+"    "+"Your score:  "+Integer.toString(score)+" ");                    ImageView outp1 = (ImageView) findViewById(R.id.pic1 );
                    outp1.setImageDrawable(getResources().getDrawable(R.drawable.paper));
                    ImageView outp2 = (ImageView) findViewById(R.id.pic2 );
                    outp2.setImageDrawable(getResources().getDrawable(R.drawable.paper));
                    re=(TextView) findViewById(R.id.result);
                    re.setText("It's a tie");}
                else if (computerPlay.equals("S")){
                    computerscore++;
                    ImageView outp = (ImageView) findViewById(R.id.pcicon );
                    outp.setImageDrawable(getResources().getDrawable(R.drawable.computer));
                    ImageView outp3 = (ImageView) findViewById(R.id.usericon );
                    outp3.setImageDrawable(getResources().getDrawable(R.drawable.user2));
                    points=(TextView) findViewById(R.id.score);
                    points.setText("PC score:  "+Integer.toString(computerscore)+"    "+"Your score:  "+Integer.toString(score)+" ");                    ImageView outp1 = (ImageView) findViewById(R.id.pic1);
                    outp1.setImageDrawable(getResources().getDrawable(R.drawable.scissor));
                    ImageView outp2 = (ImageView) findViewById(R.id.pic2);
                    outp2.setImageDrawable(getResources().getDrawable(R.drawable.paper));
                    re=(TextView) findViewById(R.id.result);
                    re.setText("You lose");}
                else if (computerPlay.equals("R")){
                    ImageView outp = (ImageView) findViewById(R.id.pcicon );
                    outp.setImageDrawable(getResources().getDrawable(R.drawable.computer));
                    ImageView outp3 = (ImageView) findViewById(R.id.usericon );
                    outp3.setImageDrawable(getResources().getDrawable(R.drawable.user2));
                    score++;
                    points=(TextView) findViewById(R.id.score);
                    points.setText("PC score:  "+Integer.toString(computerscore)+"    "+"Your score:  "+Integer.toString(score)+" ");                    ImageView outp1 = (ImageView) findViewById(R.id.pic1);
                    outp1.setImageDrawable(getResources().getDrawable(R.drawable.stone));
                    ImageView outp2 = (ImageView) findViewById(R.id.pic2);
                    outp2.setImageDrawable(getResources().getDrawable(R.drawable.paper));
                    re=(TextView) findViewById(R.id.result);
                    re.setText("You win");}
            }
        });
        scissor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start=(TextView) findViewById(R.id.text1);
                start.setText("");
                Random random=new Random();
                String personPlay; //User's play -- "R", "P", or "S"
                String computerPlay = ""; //Computer's play -- "R", "P", or "S"
                int computerInt; //Randomly generated number used to determine
                //computer's play
                //Generate computer's play (0,1,2)
                computerInt = random.nextInt(3)+1;
                if (computerInt == 1)


                //Translate computer's randomly generated play to
                //string using if //statements
                computerPlay = "R";
                else if (computerInt == 2)
                    computerPlay = "P";
                else if (computerInt == 3)
                    computerPlay = "S";

                //Make player's play uppercase for ease of comparison
                personPlay = "S";
                //See who won. Use nested ifs

                if (personPlay.equals(computerPlay)){
                    ImageView outp = (ImageView) findViewById(R.id.pcicon );
                    outp.setImageDrawable(getResources().getDrawable(R.drawable.computer));
                    ImageView outp3 = (ImageView) findViewById(R.id.usericon );
                    outp3.setImageDrawable(getResources().getDrawable(R.drawable.user2));
                    points=(TextView) findViewById(R.id.score);
                    points.setText("PC score:  "+Integer.toString(computerscore)+"    "+"Your score:  "+Integer.toString(score)+" ");                    ImageView outp1 = (ImageView) findViewById(R.id.pic1 );
                    outp1.setImageDrawable(getResources().getDrawable(R.drawable.scissor));
                    ImageView outp2 = (ImageView) findViewById(R.id.pic2 );
                    outp2.setImageDrawable(getResources().getDrawable(R.drawable.scissor));
                    re=(TextView) findViewById(R.id.result);
                    re.setText("It's a tie");}
                else if (computerPlay.equals("P")){
                    ImageView outp = (ImageView) findViewById(R.id.pcicon );
                    outp.setImageDrawable(getResources().getDrawable(R.drawable.computer));
                    ImageView outp3 = (ImageView) findViewById(R.id.usericon );
                    outp3.setImageDrawable(getResources().getDrawable(R.drawable.user2));
                    score++;
                    points=(TextView) findViewById(R.id.score);
                    points.setText("PC score:  "+Integer.toString(computerscore)+"    "+"Your score:  "+Integer.toString(score)+" ");                    ImageView outp1 = (ImageView) findViewById(R.id.pic1);
                    outp1.setImageDrawable(getResources().getDrawable(R.drawable.paper));
                    ImageView outp2 = (ImageView) findViewById(R.id.pic2);
                    outp2.setImageDrawable(getResources().getDrawable(R.drawable.scissor));
                    re=(TextView) findViewById(R.id.result);
                    re.setText("You win");}
                else if (computerPlay.equals("R")){
                    computerscore++;
                    ImageView outp = (ImageView) findViewById(R.id.pcicon );
                    outp.setImageDrawable(getResources().getDrawable(R.drawable.computer));
                    ImageView outp3 = (ImageView) findViewById(R.id.usericon );
                    outp3.setImageDrawable(getResources().getDrawable(R.drawable.user2));
                    points=(TextView) findViewById(R.id.score);
                    points.setText("PC score:  "+Integer.toString(computerscore)+"    "+"Your score:  "+Integer.toString(score)+" ");                    ImageView outp1 = (ImageView) findViewById(R.id.pic1);
                    outp1.setImageDrawable(getResources().getDrawable(R.drawable.stone));
                    ImageView outp2 = (ImageView) findViewById(R.id.pic2);
                    outp2.setImageDrawable(getResources().getDrawable(R.drawable.scissor));
                    re=(TextView) findViewById(R.id.result);
                    re.setText("You lose");}
            }
        });
    }
}
