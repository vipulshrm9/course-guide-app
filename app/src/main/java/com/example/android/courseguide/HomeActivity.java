package com.example.android.courseguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class HomeActivity extends AppCompatActivity implements OnItemSelectedListener {

    private Button button5,button7;
    private FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        final String[] csyears = { "Select", "Second Year", "Third Year", "Fourth Year", "Fifth Year"  };
        final String[] ecyears = { "Select", "Second Year", "Third Year", "Fourth Year", "Fifth Year"  };

        final Spinner spin = (Spinner) findViewById(R.id.spinner3);
        spin.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                // your code here
                if(position == 0){
                    //Toast.makeText(getApplicationContext(),"First EC",Toast.LENGTH_SHORT).show();
                }

                if(position == 1){
                    Toast.makeText(getApplicationContext(),"Second EC",Toast.LENGTH_SHORT).show();
                }

                if(position == 2){
                    Toast.makeText(getApplicationContext(),"Third EC",Toast.LENGTH_SHORT).show();
                }

                if(position == 3){
                    Toast.makeText(getApplicationContext(),"Fourth EC",Toast.LENGTH_SHORT).show();
                    Intent myIntent = new Intent(HomeActivity.this, ElectronicsActivity.class);
                    startActivity(myIntent);
                }

                if(position == 4){
                    Toast.makeText(getApplicationContext(),"Fifth EC",Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }

        });

        final Spinner spin1 = (Spinner) findViewById(R.id.spinner4);
        spin1.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                // your code here
                if(position == 0){
                    //Toast.makeText(getApplicationContext(),"First CS",Toast.LENGTH_SHORT).show();
                }

                if(position == 1){
                    Toast.makeText(getApplicationContext(),"Second CS",Toast.LENGTH_SHORT).show();
                }

                if(position == 2){
                   // Toast.makeText(getApplicationContext(),"Third CS",Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(HomeActivity.this,ThirdYearActivity.class));
                }

                if(position == 3){
                    Toast.makeText(getApplicationContext(),"Fourth CS",Toast.LENGTH_SHORT).show();
                    Intent myIntent = new Intent(HomeActivity.this, ComputerActivity.class);
                    startActivity(myIntent);
                }
                if(position == 4){
                    Toast.makeText(getApplicationContext(),"Fifth CS",Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }

        });


        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item,csyears);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Setting the ArrayAdapter data on the Spinner
        spin.setAdapter(aa);
        //  String[] bankNames={"BOI","SBI","HDFC","PNB","OBC"};
      //  Spinner mySpinner = (Spinner)findViewById(spinner);
        ArrayAdapter aa1 = new ArrayAdapter(this,android.R.layout.simple_spinner_item,ecyears);
        aa1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Setting the ArrayAdapter data on the Spinner
        spin1.setAdapter(aa1);
       // List<String> list = new ArrayList<String>();
       // list.add("Android");
       // list.add("Java");
       // list.add("Spinner Data");
       // list.add("Spinner Adapter");
       // list.add("Spinner Example");
       //
       // ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>
       //         (this, android.R.layout.simple_spinner_item,list);
       //
       // dataAdapter.setDropDownViewResource
       //         (android.R.layout.simple_spinner_dropdown_item);
       //
       // mySpinner.setAdapter(dataAdapter);
       //
       // mySpinner.setOnItemSelectedListener(new OnItemSelectedListener()
       // {
       //     public void onItemSelected(AdapterView<?> mySpinner, View view, int position, long id)
       //     {
       //         String selectedItem = mySpinner.getItemAtPosition(position).toString();
       //
       //         if(selectedItem.equals("Java")){
       //
       //             Toast.makeText(getApplicationContext(),"Hello Javatpoint",Toast.LENGTH_SHORT);
       //         }
       //     }
       //     public void onNothingSelected(AdapterView<?> parent)
       //     {
       //
       //     }
       // });
    }

    public void onsub(View view){
        Intent intent = new Intent(HomeActivity.this, Home2Activity.class);
        startActivity(intent);
    }


    public void logout(View view){
        button5 = (Button)findViewById(R.id.button5);


// this listener will be called when there is change in firebase user session
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}

 //}

