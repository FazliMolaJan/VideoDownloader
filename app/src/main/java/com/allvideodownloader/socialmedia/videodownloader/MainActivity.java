package com.allvideodownloader.socialmedia.videodownloader;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void proceed(View view) {
        Intent i = new Intent(MainActivity.this, Content.class);
        startActivity(i);
    }

}
