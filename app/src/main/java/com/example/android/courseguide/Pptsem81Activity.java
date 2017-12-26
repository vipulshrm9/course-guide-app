package com.example.android.courseguide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Pptsem81Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pptsem81);
    }

    public void onsub(View view){
        Intent i = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.cse.unr.edu/~dascalus/SE2011_01.ppt"));
        startActivity(i);
    }

    public void ondown(View view){
        Intent i = new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://davarpanahjazi.iut.ac.ir/sites/davarpanahjazi.iut.ac.ir/files/u125/reuse.ppt"));
        startActivity(i);
    }
}
