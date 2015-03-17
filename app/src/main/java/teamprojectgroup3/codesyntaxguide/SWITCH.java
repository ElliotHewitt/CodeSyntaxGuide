package teamprojectgroup3.codesyntaxguide;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import android.widget.ExpandableListView;


public class SWITCH extends ActionBarActivity {

    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elseif);

        // get the listview
        expListView = (ExpandableListView) findViewById(R.id.lvExp);

        // preparing list data
        prepareListData();

        listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild);

        // setting list adapter
        expListView.setAdapter(listAdapter);
    }

    /*
     * Preparing the list data
     */
    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        // Adding child data
        listDataHeader.add("C#");
        listDataHeader.add("C++");
        listDataHeader.add("Python");
        listDataHeader.add("Java");

        // Adding child data
        List<String> csharp = new ArrayList<String>();
        csharp.add("switch(expression){\n\tcase expression:\n\t\tstatements(s);\n\t\tbreak; *this is optional*\n\tcase expression:\n\t\tstatement(s);\n\t\tbreak; *this is optional*\n}");

        List<String> cplusplus = new ArrayList<String>();
        cplusplus.add("switch(expression)\n{\n\tcase a:\n\t\tstatements1;\n\t\tbreak;\n\tcase b:\n\t\tstatements2;\n\t\tbreak;\n}");

        List<String> python = new ArrayList<String>();
        python.add("Python has no definitive switch-case statement. A simple substitute for this is using a string of if-else blocks, with each condition being what would have been the matching case.");

        List<String> java = new ArrayList<String>();
        java.add("switch(expression){\n\tcase expression:\n\t\tstatements(s);\n\t\tbreak; *this is optional*\n\tcase expression:\n\t\tstatement(s);\n\t\tbreak; *this is optional*\n}");

        listDataChild.put(listDataHeader.get(0), csharp); // Header, Child data
        listDataChild.put(listDataHeader.get(1), cplusplus);
        listDataChild.put(listDataHeader.get(2), python);
        listDataChild.put(listDataHeader.get(3), java);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_switch, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
