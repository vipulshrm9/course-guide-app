package com.example.android.courseguide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class EbookSem84Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ebook_sem84);
    }
    public void onsub(View view){
        Intent i = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.tutorialspoint.com/software_architecture_design/software_architecture_design_tutorial.pdf"));
        startActivity(i);
    }

    public void ondown(View view){
        Intent i = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://ece.uwaterloo.ca/~se464/06ST/lecture/01_introduction.pdf"));
        startActivity(i);
    }
}
