package com.example.sanju.stonepaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent in=getIntent();
        int st1=in.getIntExtra("PC",-1);
        int st2=in.getIntExtra("USER",-1);
        TextView t1,t;
        t1=(TextView) findViewById(R.id.test);
        t1.setText("PC score:  "+st1+"    "+"Your score:  "+st2+" ");
        if(st1>st2){
            ImageView outp = (ImageView) findViewById(R.id.pic);
            outp.setImageDrawable(getResources().getDrawable(R.drawable.down));
            t=(TextView) findViewById(R.id.result);
            t.setText("You loose\nTry again");
        }else{
            ImageView outp = (ImageView) findViewById(R.id.pic);
            outp.setImageDrawable(getResources().getDrawable(R.drawable.up));
            t=(TextView) findViewById(R.id.result);
            t.setText("                 You win\nCONGRATULATIONS");
        }

    }
    public void start(View view){
        Intent i = new Intent(Main2Activity.this, MainActivity.class);
        startActivity(i);
    }
}
