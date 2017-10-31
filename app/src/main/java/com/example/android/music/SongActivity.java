package com.example.android.music;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class SongActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song);

        Button firstSongArtist = (Button) findViewById(R.id.artist1);
        firstSongArtist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SongActivity.this, ArtistActivity.class);
                startActivity(i);
            }
        });

        Button firstSongAlbum = (Button) findViewById(R.id.album1);
        firstSongAlbum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SongActivity.this, AlbumActivity.class);
                startActivity(i);
            }
        });

        Button secondSongArtist = (Button) findViewById(R.id.artist2);
        secondSongArtist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SongActivity.this, ArtistActivity.class);
                startActivity(i);
            }
        });

        Button secondSongAlbum = (Button) findViewById(R.id.album2);
        secondSongAlbum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SongActivity.this, AlbumActivity.class);
                startActivity(i);
            }
        });

        Button backButton = (Button) findViewById(R.id.back_button);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BackButtonIntent = new Intent(SongActivity.this, MainActivity.class);
                startActivity(BackButtonIntent);

            }
        });


    }
}
