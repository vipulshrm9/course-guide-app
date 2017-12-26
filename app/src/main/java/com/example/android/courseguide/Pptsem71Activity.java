package com.example.android.courseguide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Pptsem71Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pptsem71);
    }
    public void onsub(View view){
        Intent i = new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.cs.nthu.edu.tw/~ychung/slides/Compiler/Chapter1.ppt"));
        startActivity(i);
    }

    public void ondown(View view){
        Intent i = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.cs.fsu.edu/~engelen/courses/COP562107/Ch1.ppt"));
        startActivity(i);
    }
}
