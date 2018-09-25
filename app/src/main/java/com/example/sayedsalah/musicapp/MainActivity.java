package com.example.sayedsalah.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button songbtn, librarybtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        songbtn = (Button) findViewById(R.id.songbtn);
        songbtn.setOnClickListener(this);
        librarybtn = (Button) findViewById(R.id.librarybtn);
        librarybtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.songbtn:
                Intent intent1 = new Intent(getBaseContext(), SongActivity.class);
                startActivity(intent1);
                break;
            case R.id.librarybtn:
                Intent intent2 = new Intent(getBaseContext(), MusicLibrary.class);
                startActivity(intent2);
                break;

        }
    }
}
