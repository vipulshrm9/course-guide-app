package com.example.android.courseguide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class EbookSem82Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ebook_sem82);
    }
    public void onsub(View view){
        Intent i = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://books4cse.files.wordpress.com/2014/01/schach-s-object-oriented-software-engineering-7ed-mgh-2007.pdf"));
        startActivity(i);
    }

    public void ondown(View view){
        Intent i = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://worayoot.files.wordpress.com/2012/10/object-oriented-and-classical-software-engineering-8th-edition.pdf"));
        startActivity(i);
    }
}
