package com.example.android.music;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class PlaylistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);

        Button artistbutton = (Button) findViewById(R.id.artist1);
        artistbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(PlaylistActivity.this, ArtistActivity.class);
                startActivity(i);
            }
        });

        Button albumButton = (Button) findViewById(R.id.album1);
        albumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(PlaylistActivity.this, AlbumActivity.class);
                startActivity(i);
            }
        });

        Button artistbutton2 = (Button) findViewById(R.id.artist2);
        artistbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(PlaylistActivity.this, ArtistActivity.class);
                startActivity(i);
            }
        });

        Button albumButton2 = (Button) findViewById(R.id.album2);
        albumButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(PlaylistActivity.this, AlbumActivity.class);
                startActivity(i);
            }
        });

        Button backButton = (Button) findViewById(R.id.back_button);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BackButtonIntent = new Intent(PlaylistActivity.this, MainActivity.class);
                startActivity(BackButtonIntent);

            }
        });


    }
}
