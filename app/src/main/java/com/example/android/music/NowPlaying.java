package com.example.android.music;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class NowPlaying extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        Button albumButton = (Button) findViewById(R.id.album_nowPlaying);
        albumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(NowPlaying.this, AlbumActivity.class);
                startActivity(i);
            }
        });

        Button artistButton = (Button) findViewById(R.id.artist_nowPlaying);
        albumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(NowPlaying.this, ArtistActivity.class);
                startActivity(i);
            }
        });

        Button backButton = (Button) findViewById(R.id.back_button);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BackButtonIntent = new Intent(NowPlaying.this, MainActivity.class);
                startActivity(BackButtonIntent);

            }
        });


    }
}
