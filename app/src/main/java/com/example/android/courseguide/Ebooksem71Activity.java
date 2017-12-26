package com.example.android.courseguide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Ebooksem71Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ebooksem71);
    }
    public void onsub(View view){
        Intent i = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.tutorialspoint.com/compiler_design/compiler_design_tutorial.pdf"));
        startActivity(i);
    }

    public void ondown(View view){
        Intent i = new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.diku.dk/~torbenm/Basics/basics_lulu2.pdf"));
        startActivity(i);
    }
}
