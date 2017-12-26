package com.example.android.courseguide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Ebooksem81Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ebooksem81);
    }
    public void onsub(View view){
        Intent i = new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www0.cs.ucl.ac.uk/staff/ucacwxe/lectures/3C05-04-05/Introduction.pdf"));
        startActivity(i);
    }

    public void ondown(View view){
        Intent i = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://ebe47aaf-a-62cb3a1a-s-sites.googlegroups.com/site/manishsharma78/home/advanced-software-engineering/0273710133_pp01v2.ppt?attachauth=ANoY7coKvVlPfKdgo4mjLmLbNNzlbjHo_ae9GaiSlYG9sgs5K_xxtMxCMkSzGLe0Vr4LHWbY6rHI3Otvyg2Y-ckaESdF0EiU7dPmbfSr7v-xQAZ1_dQfLSsqTp6A30yQeg2ezd16lBXeykrXdneSQz-gO-3hHOoSP0WTPXU-QAOmunxr1QAj1AxS5nP0vQ0lo-QrLqwjrdnkiNXa7F3rTuvqVu6U-l9-1DZaTJJ6a2PecfSAicUw3H3FVF7rTNTJEc-VmUZnnLIRDyofgW2FZwfER53zzw-Jbw%3D%3D&attredirects=0&d=1"));
        startActivity(i);
    }
}
