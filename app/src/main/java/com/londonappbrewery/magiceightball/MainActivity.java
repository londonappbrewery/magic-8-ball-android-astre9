package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button btnAsk;
    ImageView ivBall;
    int nr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final int []ballArray={R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5};

        btnAsk=findViewById(R.id.btnAsk);
        btnAsk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ivBall=findViewById(R.id.image_eigthBall);
                Random rng=new Random();
                nr=rng.nextInt(5);
                ivBall.setImageResource(ballArray[nr]);
            }
        });
    }
}
