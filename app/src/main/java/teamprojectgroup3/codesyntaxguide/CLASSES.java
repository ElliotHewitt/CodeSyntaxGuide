package teamprojectgroup3.codesyntaxguide;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class CLASSES extends ActionBarActivity {

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

        //adding data to the headers
        List<String> csharp = new ArrayList<String>();
        csharp.add("class name_of_class\n{\n\t'content of the class'\n\t'privacy is declared at the start of each member'\n}");

        List<String> cplusplus = new ArrayList<String>();
        cplusplus.add("class name_of_class\n{\n\tprivate:\n\t\t'content only viewable from this class'\n\tprotected:\n\t\t'content only viewable from this type of class'\n\tpublic:\n\t\t'content viewable to anything accessing the class'\n} object_of_class\n");

        List<String> python = new ArrayList<String>();
        python.add("class name_of_class:\n\t'content of the class'");

        List<String> java = new ArrayList<String>();
        java.add("class name_of_class {\n\t'content of the class'\n\t'privacy is declared at the start of each member'\n}");

        listDataChild.put(listDataHeader.get(0), csharp);
        listDataChild.put(listDataHeader.get(1), cplusplus);
        listDataChild.put(listDataHeader.get(2), python);
        listDataChild.put(listDataHeader.get(3), java);
    }
}
