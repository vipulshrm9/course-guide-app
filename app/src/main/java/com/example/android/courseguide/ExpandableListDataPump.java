package com.example.android.courseguide;

/**
 * Created by shubham on 14/11/2017.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpandableListDataPump {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> formalmethods = new ArrayList<String>();
        formalmethods.add("FORMAL LECTURES");
        formalmethods.add("FORMAL E-BOOKS");
        formalmethods.add("FORMAL PRESENTATIONS");

        List<String> objectorientedanalysis = new ArrayList<String>();
        objectorientedanalysis.add("OBJECT-ORIENTED ANALYSIS LECTURES");
        objectorientedanalysis.add("OBJECT-ORIENTED ANALYSIS E-BOOKS");
        objectorientedanalysis.add("OBJECT-ORIENTED ANALYSIS PRESENTATIONS");

        List<String> CompilerDesign = new ArrayList<String>();
        CompilerDesign.add("COMPILER DESIGN LECTURES");
        CompilerDesign.add("COMPILER DESIGN E-BOOKS");
        CompilerDesign.add("COMPILER DESIGN PRESENTATIONS");

        List<String> socialAspects = new ArrayList<String>();
        socialAspects.add("SOCIAL ASPECTS OF ENGINEERING LECTURES");
        socialAspects.add("SOCIAL ASPECTS OF ENGINEERING E-BOOKS");
        socialAspects.add("SOCIAL ASPECTS OF ENGINEERING PRESENTATIONS");

        List<String> wirelessTechnologies = new ArrayList<String>();
        wirelessTechnologies.add("WIRELESS LECTURES");
        wirelessTechnologies.add("WIRELESS E-BOOKS");
        wirelessTechnologies.add("WIRELESS PRESENTATIONS");

        expandableListDetail.put("FORMAL METHODS ", formalmethods);
        expandableListDetail.put("OBJECT-ORIENTED ANALYSIS", objectorientedanalysis);
        expandableListDetail.put("COMPILER DESIGN", CompilerDesign);
        expandableListDetail.put("SOCIAL ASPECTS OF ENGINEERING", socialAspects);
        expandableListDetail.put("WIRELESS TECHNOLOGIES", wirelessTechnologies);

        return expandableListDetail;

    }
}