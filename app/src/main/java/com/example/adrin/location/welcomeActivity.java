package com.example.adrin.location;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.VideoView;

public class welcomeActivity extends AppCompatActivity {

    private VideoView myVideo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Remove title bar
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

//Remove notification bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

//set content view AFTER ABOVE sequence (to avoid crash)
        this.setContentView(R.layout.activity_welcome);
        setContentView(R.layout.activity_welcome);

        myVideo = (VideoView) findViewById(R.id.videoView);

        Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.intromovie);
        myVideo.setVideoURI(uri);
        myVideo.start();

        myVideo.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                mediaPlayer.setLooping(true);
            }
        });

        final Button botonStart = (Button) findViewById(R.id.startButton);

        botonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent reg = new Intent(welcomeActivity.this, selectWhere.class);
                startActivity(reg);
            }
        });

    }
}
