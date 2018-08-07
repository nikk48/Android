package com.example.android.musico;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.android.musico.R.id.songs;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView s=(TextView)findViewById(R.id.songs);
        s.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent sIntent=new Intent(MainActivity.this,SActivity.class);
                startActivity(sIntent);
            }
        });

        TextView artist=(TextView)findViewById(R.id.artists);
        artist.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent artistIntent=new Intent(MainActivity.this,Artist.class);
                startActivity(artistIntent);
            }
        });

        TextView search=(TextView)findViewById(R.id.search);
        search.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent searchIntent=new Intent(MainActivity.this,Artist.class);
                startActivity(searchIntent);
            }
        });

        TextView buy=(TextView)findViewById(R.id.buy);
        buy.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent buyIntent=new Intent(MainActivity.this,Buy.class);
                startActivity(buyIntent);
            }
        });

    }
}