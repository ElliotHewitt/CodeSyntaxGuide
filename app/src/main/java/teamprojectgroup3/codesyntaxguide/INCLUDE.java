package teamprojectgroup3.codesyntaxguide;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class INCLUDE extends ActionBarActivity {

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

        //adding header
        listDataHeader.add("Include");

        //adding data to the header
        List<String> include = new ArrayList<String>();
        include.add("\nThe main purpose behind the include directive is that it allows libraries of code to be developed which help to ensure that everyone uses the same version" +
                    " of a data layout definition or procedural code throughout a program. For example in C/C++ we use: #include <stdio.h> This includes the content of the standard header" +
                    " 'stdio.h'. Within PHP the include directive causes another PHP file to be included and evaluated. Modern languages such as Java and C# do not use forward declarations, instead" +
                    " identifiers are recognised automatically from source files and read directly form dynamic library symbols, meaning header files are not needed.");

        listDataChild.put(listDataHeader.get(0), include);
    }
}
