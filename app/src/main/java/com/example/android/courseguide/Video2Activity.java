package com.example.android.courseguide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Video2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video2);
    }

    public void onplay(View view){
        String videoId = "UG70-z4l_wQ";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube://" + videoId));
        startActivity(intent);
    }

    public void onsubmit(View view){
        Intent intent = new Intent(Video2Activity.this, Home2Activity.class);
        startActivity(intent);
    }
}
