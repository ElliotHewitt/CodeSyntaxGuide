//Created by Jake Munns
package teamprojectgroup3.codesyntaxguide;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class NAMESPACES extends ActionBarActivity {

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
        csharp.add("using x;");

        List<String> cplusplus = new ArrayList<String>();
        cplusplus.add("using namespace x;");

        List<String> python = new ArrayList<String>();
        python.add("import x;");

        List<String> java = new ArrayList<String>();
        java.add("import x;");

        List<String> Perl = new ArrayList<String>();
        Perl.add("use x;");

        List<String> php = new ArrayList<String>();
        php.add("<?php\nuse x;\n?>");

        listDataChild.put(listDataHeader.get(0), csharp);
        listDataChild.put(listDataHeader.get(1), cplusplus);
        listDataChild.put(listDataHeader.get(2), python);
        listDataChild.put(listDataHeader.get(3), java);
        listDataChild.put(listDataHeader.get(4), Perl);
        listDataChild.put(listDataHeader.get(5), php);
    }
}
