package com.example.android.music;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class AlbumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);

        Button viewSongsButton = (Button) findViewById(R.id.viewSongs1);
        viewSongsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewSongIntent = new Intent(AlbumActivity.this, SongActivity.class);
                startActivity(viewSongIntent);

            }
        });


        Button backButton = (Button) findViewById(R.id.back_button);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BackButtonIntent = new Intent(AlbumActivity.this, MainActivity.class);
                startActivity(BackButtonIntent);

            }
        });
    }
}
