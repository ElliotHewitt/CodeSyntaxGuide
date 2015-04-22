//Created by Emma Fearn
package teamprojectgroup3.codesyntaxguide;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class SWITCH extends ActionBarActivity {

    //drop down box
    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elseif);

        //get the listview
        expListView = (ExpandableListView) findViewById(R.id.lvExp);

        //preparing list data
        prepareListData();

        listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild);

        //setting list adapter
        expListView.setAdapter(listAdapter);
    }

    //preparing the data for the expandable list
    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        //adding headers
        listDataHeader.add("C#");
        listDataHeader.add("C++");
        listDataHeader.add("Python");
        listDataHeader.add("Java");
        listDataHeader.add("Perl");
        listDataHeader.add("PHP");

        //adding data to the headers
        List<String> csharp = new ArrayList<String>();
        csharp.add("switch(expression){\n\tcase expression:\n\t\tstatements(s);\n\t\tbreak; *this is optional*\n\tcase expression:\n\t\tstatement(s);\n\t\tbreak; *this is optional*\n}");

        List<String> cplusplus = new ArrayList<String>();
        cplusplus.add("switch(expression)\n{\n\tcase a:\n\t\tstatements1;\n\t\tbreak;\n\tcase b:\n\t\tstatements2;\n\t\tbreak;\n}");

        List<String> python = new ArrayList<String>();
        python.add("Python has no definitive switch-case statement. A simple substitute for this is using a string of if-else blocks, with each condition being what would have been the matching case.");

        List<String> java = new ArrayList<String>();
        java.add("switch(expression){\n\tcase expression:\n\t\tstatements(s);\n\t\tbreak; *this is optional*\n\tcase expression:\n\t\tstatement(s);\n\t\tbreak; *this is optional*\n}");

        List<String> Perl = new ArrayList<String>();
        Perl.add("#!/usr/local/bin/perl\n" +
                "\n" +
                "use Switch;\n" +
                "\n" +
                "$var = 10;\n" +
                "@array = (10, 20, 30);\n" +
                "%hash = ('key1' => 10, 'key2' => 20);\n" +
                "\n" +
                "switch($var){\n" +
                "   case 10           { print \"number 100\\n\"; next; }\n" +
                "   case \"a\"          { print \"string a\" }\n" +
                "   case [1..10,42]   { print \"number in list\" }\n" +
                "   case (\\@array)    { print \"number in list\" }\n" +
                "   case (\\%hash)     { print \"entry in hash\" }\n" +
                "   else              { print \"previous case not true\" }\n" +
                "}");

        List<String> php = new ArrayList<String>();
        php.add("<?php\nswitch(expression){\n" +
                "\tcase expression:\n" +
                "\t\tstatements(s);\n" +
                "\t\tbreak; *this is optional*\n" +
                "\tcase expression:\n" +
                "\t\tstatement(s);\n" +
                "\t\tbreak; *this is optional*\n" +
                "}\n?>");

        listDataChild.put(listDataHeader.get(0), csharp);
        listDataChild.put(listDataHeader.get(1), cplusplus);
        listDataChild.put(listDataHeader.get(2), python);
        listDataChild.put(listDataHeader.get(3), java);
        listDataChild.put(listDataHeader.get(4), Perl);
        listDataChild.put(listDataHeader.get(5), php);
    }
}
