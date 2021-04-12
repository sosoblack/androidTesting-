package com.example.myapplicationtest;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

import pl.droidsonroids.gif.GifImageView;

public class MainActivity extends AppCompatActivity {
      private Button button;
      private GifImageView gifImageView;
      private VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button = findViewById(R.id.button);
        gifImageView = findViewById(R.id.giff);
        videoView = findViewById(R.id.videoView);
        gifImageView.setVisibility(View.INVISIBLE);

        String path = "android.resource://com.example.myapplicationtest/"+R.raw.vid;
        Uri uri = Uri.parse(path);
        videoView.setVideoURI(uri);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                gifImageView.setVisibility(View.VISIBLE);

               // new Handler().postDelayed(new Runnable() {
               //     @Override
                   // public void run() {
                        gifImageView.setVisibility(View.INVISIBLE);
                        videoView.start();
                       // finish();

                 //   }
                //}, 2000);
               // videoView.seekTo(000);

            }
        });
    }
}