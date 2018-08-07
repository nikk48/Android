package com.example.android.music;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import static com.example.android.music.R.id.search;
import static com.example.android.music.R.id.songs;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView songs=(TextView)findViewById(R.id.songs);
        songs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent songsIntent=new Intent(MainActivity.this,SongsActivity.class);
                startActivity(songsIntent);
            }

        });






        TextView search = (TextView) findViewById(R.id.search);

        search.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent searchIntent = new Intent(MainActivity.this, SearchActivity.class);
                startActivity(searchIntent);
            }
        });

        TextView share = (TextView) findViewById(R.id.share);

        share.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent shareIntent = new Intent(MainActivity.this, ShareActivity.class);
                startActivity(shareIntent);
            }
        });

        TextView artists = (TextView) findViewById(R.id.artists);

        artists.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent artistsIntent = new Intent(MainActivity.this, ArtistsActivity.class);
                startActivity(artistsIntent);
            }
        });

        TextView buy = (TextView) findViewById(R.id.buy);

        buy.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent buyIntent = new Intent(MainActivity.this, BuyActivity.class);
                startActivity(buyIntent);
            }
        });


    }
}
