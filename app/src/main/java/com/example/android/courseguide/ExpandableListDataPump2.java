package com.example.android.courseguide;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by shubham on 29/11/2017.
 */

public class ExpandableListDataPump2 {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> advanceSoftwareEnginnering = new ArrayList<String>();
        advanceSoftwareEnginnering.add("ADVANCE SOFTWARE ENGINEERING LECTURES");
        advanceSoftwareEnginnering.add("ADVANCE SOFTWARE ENGINEERING E-BOOKS");
        advanceSoftwareEnginnering.add("ADVANCE SOFTWARE ENGINEERING PRESENTATIONS");


        List<String> objectOriented = new ArrayList<String>();
        objectOriented.add("LECTURES");
        objectOriented.add("E-BOOKS");
        objectOriented.add("PRESENTATIONS");

        List<String> openSource = new ArrayList<String>();
        openSource.add("LECTURES");
        openSource.add("E-BOOKS");
        openSource.add("PRESENTATIONS");

        List<String> softwareArchitecture = new ArrayList<String>();
        softwareArchitecture.add("LECTURES");
        softwareArchitecture.add("E-BOOKS");
        softwareArchitecture.add("PRESENTATIONS");

        expandableListDetail.put("ADVANCE SOFTWARE ENGINEERINGsem5", advanceSoftwareEnginnering);
        expandableListDetail.put("OBJECT-ORIENTED SOFTWARE ENGINEERING", objectOriented);
        expandableListDetail.put("OPEN SOURCE SOFTWARE SYSTEM", openSource);
        expandableListDetail.put("SOFTWARE ARCHITECTURE AND DESIGN", softwareArchitecture);

        return expandableListDetail;

    }
}
