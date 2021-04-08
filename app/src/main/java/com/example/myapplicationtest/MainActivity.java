package com.example.myapplicationtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

import pl.droidsonroids.gif.GifImageView;

public class MainActivity extends AppCompatActivity {
      private Button button;
      private GifImageView gifImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button = findViewById(R.id.button);
        gifImageView = findViewById(R.id.giff);
        gifImageView.setVisibility(View.INVISIBLE);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                gifImageView.setVisibility(View.VISIBLE);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        gifImageView.setVisibility(View.INVISIBLE);
                        finish();
                    }
                }, 500);

            }
        });
    }
}