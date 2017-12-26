package com.example.android.courseguide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Ebooksem73Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ebooksem73);
    }
    public void onsub(View view){
        Intent i = new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://zempirians.com/ebooks/The_Art_of_Human_Hacking.pdf"));
        startActivity(i);
    }

    public void ondown(View view){
        Intent i = new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.ineer.org/Events/ICEER2004/Proceedings/papers/0395.pdf"));
        startActivity(i);
    }
}
