package com.example.android.courseguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ThirdYearActivity extends AppCompatActivity {

    ExpandableListView expandableListView2;
    ExpandableListAdapter expandableListAdapter2;
    List<String> expandableListTitle2;
    HashMap<String, List<String>> expandableListDetail2;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_year);


        expandableListView2 = (ExpandableListView) findViewById(R.id.expandableListView2);
        expandableListDetail2 = ExpandableListDataPump.getData();
        expandableListTitle2 = new ArrayList<String>(expandableListDetail2.keySet());
        expandableListAdapter2 = new CustomExpandableListAdapter(this, expandableListTitle2, expandableListDetail2);
        expandableListView2.setAdapter(expandableListAdapter2);
        expandableListView2.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {

            @Override
            public void onGroupExpand(int groupPosition) {
                Toast.makeText(getApplicationContext(),
                        expandableListTitle2.get(groupPosition) + " List Expanded.",
                        Toast.LENGTH_SHORT).show();
            }
        });

        expandableListView2.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {

            @Override
            public void onGroupCollapse(int groupPosition) {
                Toast.makeText(getApplicationContext(),
                        expandableListTitle2.get(groupPosition) + " List Collapsed.",
                        Toast.LENGTH_SHORT).show();

            }
        });

        expandableListView2.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {
                final String selected = (String) expandableListAdapter2.getChild(
                        groupPosition, childPosition);


                switch (selected){
                    case "ADVANCE SOFTWARE ENGINEERING LECTURES":
                        Intent myIntent = new Intent(ThirdYearActivity.this, Video1Activity.class);
                        startActivity(myIntent);
                        break;
                    case "ADVANCE SOFTWARE ENGINEERING E-BOOKS":
                        Intent myIntent1 = new Intent(ThirdYearActivity.this, EbookActivity.class);
                        startActivity(myIntent1);
                        break;
                    case "ADVANCE SOFTWARE ENGINEERING PRESENTATIONS":
                        Intent myIntent2 = new Intent(ThirdYearActivity.this, PptActivity.class);
                        startActivity(myIntent2);
                        break;

                }
                // if (groupPosition==1 && childPosition == 1) {
                //     Toast.makeText(getApplicationContext(), "Lectures vnvnv clicked",
                //             Toast.LENGTH_SHORT).show();
                // }
                // Toast.makeText(
                //         getApplicationContext(),
                //         expandableListTitle.get(groupPosition)
                //                 + " -> "
                //                 + expandableListDetail.get(
                //                 expandableListTitle.get(groupPosition)).get(
                //                 childPosition), Toast.LENGTH_SHORT
                // ).show();
                // return false;
                return false;
            }
        });

    }
    
    
}
