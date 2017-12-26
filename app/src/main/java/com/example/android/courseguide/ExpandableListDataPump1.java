package com.example.android.courseguide;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by shubham on 26/11/2017.
 */

public class ExpandableListDataPump1 {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> advanceSoftwareEnginnering = new ArrayList<String>();
        advanceSoftwareEnginnering.add("ADVANCE SOFTWARE ENGINEERING LECTURES");
        advanceSoftwareEnginnering.add("ADVANCE SOFTWARE ENGINEERING E-BOOKS");
        advanceSoftwareEnginnering.add("ADVANCE SOFTWARE ENGINEERING PRESENTATIONS");


        List<String> objectOriented = new ArrayList<String>();
        objectOriented.add("OBJECT ORIENTED SOFTWARE ENGINEERING LECTURES");
        objectOriented.add("OBJECT ORIENTED SOFTWARE ENGINEERING E-BOOKS");
        objectOriented.add("OBJECT ORIENTED SOFTWARE ENGINEERING PRESENTATIONS");

        List<String> openSource = new ArrayList<String>();
        openSource.add("OPEN SOURCE SOFTWARE SYSTEM LECTURES");
        openSource.add("OPEN SOURCE SOFTWARE SYSTEM E-BOOKS");
        openSource.add("OPEN SOURCE SOFTWARE SYSTEM PRESENTATIONS");

        List<String> softwareArchitecture = new ArrayList<String>();
        softwareArchitecture.add("SOFTWARE ARCHITECTURE AND DESIGN LECTURES");
        softwareArchitecture.add("SOFTWARE ARCHITECTURE AND DESIGN E-BOOKS");
        softwareArchitecture.add("SOFTWARE ARCHITECTURE AND DESIGN PRESENTATIONS");

        expandableListDetail.put("ADVANCE SOFTWARE ENGINEERING", advanceSoftwareEnginnering);
        expandableListDetail.put("OBJECT-ORIENTED SOFTWARE ENGINEERING", objectOriented);
        expandableListDetail.put("OPEN SOURCE SOFTWARE SYSTEM", openSource);
        expandableListDetail.put("SOFTWARE ARCHITECTURE AND DESIGN", softwareArchitecture);

        return expandableListDetail;

    }
}
