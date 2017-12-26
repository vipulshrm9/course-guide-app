package com.example.android.courseguide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Videosem81Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videosem81);
    }

    public void onplay(View view){
        String videoId = "JcP_S6MtxLg";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube://" + videoId));
        startActivity(intent);
    }

    public void onsubmit(View view){
        Intent intent = new Intent(Videosem81Activity.this, Home2Activity.class);
        startActivity(intent);
    }
}
