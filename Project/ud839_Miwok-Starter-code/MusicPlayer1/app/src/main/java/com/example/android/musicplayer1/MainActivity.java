package com.example.android.musicplayer1;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mediaPlayer=MediaPlayer.create(this,R.raw.androidtrailer);

        Button playButton=(Button)findViewById(R.id.play_button);
        playButton.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                mediaPlayer.start();
                mediaPlayer.setOnCompletionListener(new MediaPlayer().setOnCompletionListener() {
                     public void onCompletion(MediaPlayer med){
                        Toast.makeText(MainActivity.this,"I'm done",Toast.LENGTH_SHORT).show();


                    }


            }

            })
        });

        Button pauseButton=(Button)findViewById(R.id.pause_button);
        pauseButton.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                mediaPlayer.stop();
                Toast.makeText(MainActivity.this,"Pause",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
