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

public class ComputerActivity extends AppCompatActivity {

    ExpandableListView expandableListView;
    ExpandableListAdapter expandableListAdapter;
    List<String> expandableListTitle;
    HashMap<String, List<String>> expandableListDetail;

    ExpandableListView expandableListView1;
    ExpandableListAdapter expandableListAdapter1;
    List<String> expandableListTitle1;
    HashMap<String, List<String>> expandableListDetail1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer);

        expandableListView = (ExpandableListView) findViewById(R.id.expandableListView);
        expandableListDetail = ExpandableListDataPump.getData();
        expandableListTitle = new ArrayList<String>(expandableListDetail.keySet());
        expandableListAdapter = new CustomExpandableListAdapter(this, expandableListTitle, expandableListDetail);
        expandableListView.setAdapter(expandableListAdapter);
        expandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {

            @Override
            public void onGroupExpand(int groupPosition) {
                Toast.makeText(getApplicationContext(),
                        expandableListTitle.get(groupPosition) + " List Expanded.",
                        Toast.LENGTH_SHORT).show();
            }
        });

        expandableListView.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {

            @Override
            public void onGroupCollapse(int groupPosition) {
                Toast.makeText(getApplicationContext(),
                        expandableListTitle.get(groupPosition) + " List Collapsed.",
                        Toast.LENGTH_SHORT).show();

            }
        });

        expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {
                final String selected = (String) expandableListAdapter.getChild(
                        groupPosition, childPosition);


                switch (selected){
                    case "WIRELESS LECTURES":
                        Intent myIntent = new Intent(ComputerActivity.this, Video1Activity.class);
                        startActivity(myIntent);
                        break;
                    case "WIRELESS E-BOOKS":
                        Intent myIntent1 = new Intent(ComputerActivity.this, EbookActivity.class);
                        startActivity(myIntent1);
                        break;
                    case "WIRELESS PRESENTATIONS":
                        Intent myIntent2 = new Intent(ComputerActivity.this, PptActivity.class);
                        startActivity(myIntent2);
                        break;
                    case "FORMAL LECTURES":
                        Intent myIntent3 = new Intent(ComputerActivity.this, Video2Activity.class);
                        startActivity(myIntent3);
                        break;
                    case "FORMAL E-BOOKS":
                        Intent myIntent4 = new Intent(ComputerActivity.this, Ebook1Activity.class);
                        startActivity(myIntent4);
                        break;
                    case "FORMAL PRESENTATIONS":
                        Intent myIntent5 = new Intent(ComputerActivity.this, Ppt1Activity.class);
                        break;
                    case "COMPILER DESIGN LECTURES":
                        Intent myIntent6 = new Intent(ComputerActivity.this, Videosem71Activity.class);
                        startActivity(myIntent6);
                        break;
                    case "COMPILER DESIGN E-BOOKS":
                        Intent myIntent7 = new Intent(ComputerActivity.this, Ebooksem71Activity.class);
                        startActivity(myIntent7);
                        break;
                    case "COMPILER DESIGN PRESENTATIONS":
                        Intent myIntent8 = new Intent(ComputerActivity.this, Pptsem71Activity.class);
                        startActivity(myIntent8);
                        break;
                    case "OBJECT-ORIENTED ANALYSIS LECTURES":
                        Intent myIntent9 = new Intent(ComputerActivity.this, Videosem72Activity.class);
                        startActivity(myIntent9);
                        break;
                    case "OBJECT-ORIENTED ANALYSIS E-BOOKS":
                        Intent myIntent10 = new Intent(ComputerActivity.this, Ebooksem72Activity.class);
                        startActivity(myIntent10);
                        break;
                    case "OBJECT-ORIENTED ANALYSIS PRESENTATIONS":
                        Intent myIntent11 = new Intent(ComputerActivity.this, Pptsem72Activity.class);
                        startActivity(myIntent11);
                        break;
                    case "SOCIAL ASPECTS OF ENGINEERING LECTURES":
                        Intent myIntent12 = new Intent(ComputerActivity.this, Videosem73Activity.class);
                        startActivity(myIntent12);
                        break;
                    case "SOCIAL ASPECTS OF ENGINEERING E-BOOKS":
                        Intent myIntent13 = new Intent(ComputerActivity.this, Ebooksem73Activity.class);
                        startActivity(myIntent13);
                        break;
                    case "SOCIAL ASPECTS OF ENGINEERING PRESENTATIONS":
                        Intent myIntent14 = new Intent(ComputerActivity.this, Ppt73Activity.class);
                        startActivity(myIntent14);
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

        expandableListView1 = (ExpandableListView) findViewById(R.id.expandableListView1);
        expandableListDetail1 = ExpandableListDataPump1.getData();
        expandableListTitle1 = new ArrayList<String>(expandableListDetail1.keySet());
        expandableListAdapter1 = new CustomExpandableListAdapter(this, expandableListTitle1, expandableListDetail1);
        expandableListView1.setAdapter(expandableListAdapter1);
        expandableListView1.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {

            @Override
            public void onGroupExpand(int groupPosition) {
                Toast.makeText(getApplicationContext(),
                        expandableListTitle1.get(groupPosition) + " List Expanded.",
                        Toast.LENGTH_SHORT).show();
            }
        });

        expandableListView1.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {

            @Override
            public void onGroupCollapse(int groupPosition) {
                Toast.makeText(getApplicationContext(),
                        expandableListTitle1.get(groupPosition) + " List Collapsed.",
                        Toast.LENGTH_SHORT).show();

            }
        });

        expandableListView1.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {
                final String selected = (String) expandableListAdapter1.getChild(
                        groupPosition, childPosition);
                switch (selected){
                    case "ADVANCE SOFTWARE ENGINEERING LECTURES":
                        Intent myIntent = new Intent(ComputerActivity.this, Videosem81Activity.class);
                        startActivity(myIntent);
                        break;
                    case "ADVANCE SOFTWARE ENGINEERING E-BOOKS":
                        Intent myIntent1 = new Intent(ComputerActivity.this, Ebooksem81Activity.class);
                        startActivity(myIntent1);
                        break;
                    case "ADVANCE SOFTWARE ENGINEERING PRESENTATIONS":
                        Intent myIntent2 = new Intent(ComputerActivity.this, Pptsem81Activity.class);
                        startActivity(myIntent2);
                        break;
                    case "OBJECT ORIENTED SOFTWARE ENGINEERING LECTURES":
                        Intent myIntent3 = new Intent(ComputerActivity.this, Videosem82Activity.class);
                        startActivity(myIntent3);
                        break;
                    case "OBJECT ORIENTED SOFTWARE ENGINEERING E-BOOKS":
                        Intent myIntent4 = new Intent(ComputerActivity.this, EbookSem82Activity.class);
                        startActivity(myIntent4);
                        break;
                    case "OBJECT ORIENTED SOFTWARE ENGINEERING PRESENTATIONS":
                        Intent myIntent5 = new Intent(ComputerActivity.this, Pptsem82Activity.class);
                        startActivity(myIntent5);
                        break;
                    case "OPEN SOURCE SOFTWARE SYSTEM LECTURES":
                        Intent myIntent6 = new Intent(ComputerActivity.this, Videosem83Activity.class);
                        startActivity(myIntent6);
                        break;
                    case "OPEN SOURCE SOFTWARE SYSTEM E-BOOKS":
                        Intent myIntent7 = new Intent(ComputerActivity.this, EbookSem83Activity.class);
                        startActivity(myIntent7);
                        break;
                    case "OPEN SOURCE SOFTWARE SYSTEM PRESENTATIONS":
                        Intent myIntent8 = new Intent(ComputerActivity.this, Pptsem83Activity.class);
                        startActivity(myIntent8);
                        break;
                    case "SOFTWARE ARCHITECTURE AND DESIGN LECTURES":
                        Intent myIntent9 = new Intent(ComputerActivity.this, Videosem84Activity.class);
                        startActivity(myIntent9);
                        break;
                    case "SOFTWARE ARCHITECTURE AND DESIGN E-BOOKS":
                        Intent myIntent10 = new Intent(ComputerActivity.this, EbookSem84Activity.class);
                        startActivity(myIntent10);
                        break;
                    case "SOFTWARE ARCHITECTURE AND DESIGN PRESENTATIONS":
                        Intent myIntent11 = new Intent(ComputerActivity.this, Pptsem84Activity.class);
                        startActivity(myIntent11);
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
