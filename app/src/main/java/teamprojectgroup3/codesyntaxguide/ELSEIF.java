//Created by Elliot Hewitt
package teamprojectgroup3.codesyntaxguide;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ELSEIF extends ActionBarActivity {

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

        // etting list adapter
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
        csharp.add("if(condition 1)\n{\n\t'statement 1';\n}\nelse if('condition 2')\n{\n\t'statement 2';\n}\nelse\n{\n\t'statement 3';\n}");

        List<String> cplusplus = new ArrayList<String>();
        cplusplus.add("if('condition 1')\n{\n\t'statement 1';\n}\nelse if('condition 2')\n{\n\t'statement 2';\n}\nelse\n{\n\t'statement 3';\n}");

        List<String> python = new ArrayList<String>();
        python.add("if 'condition 1':\n\t 'statement 1' \nelif 'condition 2':\n\t 'statement 2'\nelse:\n\t 'statement 3'");

        List<String> java = new ArrayList<String>();
        java.add("if('condition 1'){\n\t'statement 1';\n}else if('condition 2'){\n\t'statement 2';\n}else{\n\t'statement 3';\n}");

        List<String> Perl = new ArrayList<String>();
        Perl.add(" if ($something) {\n" +
                "        do_something();\n" +
                "    } elsif ($another_something) {\n" +
                "        do_another_thing();\n" +
                "    } else {\n" +
                "        do_something_else();\n" +
                "    }");

        listDataChild.put(listDataHeader.get(0), csharp); // Header, Child data
        listDataChild.put(listDataHeader.get(1), cplusplus);
        listDataChild.put(listDataHeader.get(2), python);
        listDataChild.put(listDataHeader.get(3), java);
        listDataChild.put(listDataHeader.get(4), Perl);
    }
}
