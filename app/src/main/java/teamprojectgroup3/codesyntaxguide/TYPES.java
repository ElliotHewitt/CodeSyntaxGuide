//Created by Elliot Hewitt
package teamprojectgroup3.codesyntaxguide;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class TYPES extends ActionBarActivity {

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

        //adding data to the headers
        List<String> csharp = new ArrayList<String>();
        csharp.add("char - A single byte of data representing a character\n" +
                "int - 32 bit integer\n" +
                "float - 4 byte floating point number\n" +
                "double - 8 byte floating point number\n" +
                "bool - binary true/false value\n" +
                "void - null value");

        List<String> cplusplus = new ArrayList<String>();
        cplusplus.add("char - A single byte of data representing a character\n" +
                "int - 32 bit integer\n" +
                "float - 4 byte floating point number\n" +
                "double - 8 byte floating point number\n" +
                "bool - A binary true/false value\n" +
                "void - A null value");

        List<String> python = new ArrayList<String>();
        python.add("Python doesn't require you to define variable types");

        List<String> java = new ArrayList<String>();
        java.add("char - A single byte of data representing a character\n" +
                "int - 32 bit integer\n" +
                "float - 4 byte floating point number\n" +
                "double - 8 byte floating point number\n" +
                "bool - binary true/false value\n" +
                "void - null value");

        List<String> Perl = new ArrayList<String>();
        Perl.add("Perl is loosely typed language and there is no need to specify a type for your data while using in your program." +
                 "The Perl interpreter will choose the type based on the context of the data itself.");

        listDataChild.put(listDataHeader.get(0), csharp);
        listDataChild.put(listDataHeader.get(1), cplusplus);
        listDataChild.put(listDataHeader.get(2), python);
        listDataChild.put(listDataHeader.get(3), java);
        listDataChild.put(listDataHeader.get(4), Perl);
    }
}
