//Created by Emma Fearn
package teamprojectgroup3.codesyntaxguide;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class FOREACH extends ActionBarActivity {

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
        csharp.add("using System;\n" +
                " \n" +
                "namespace foreach\n" +
                "{\n" +
                "  class Foreach\n" +
                "   {\n" +
                "     static void Main(string[] args)\n" +
                "      {\n" +
                "        string[] arr = new string[5];\n" +
                " \n" +
                "        arr[0] = \"James\";\n" +
                "        arr[1] = \"Emma\";\n" +
                "        arr[2] = \"Dave\";\n" +
                "        arr[3] = \"Elliot\";\n" +
                "        arr[4] = \"Jake\";\n" +
                " \n" +
                "        foreach (string name in arr)\n" +
                "         {\n" +
                "           Console.WriteLine(\"Hello \" + name);\n" +
                "         }\n" +
                "        Console.ReadLine();\n" +
                "      }\n" +
                "   }\n" +
                "}");

        List<String> cplusplus = new ArrayList<String>();
        cplusplus.add("using namespace System;\n" +
                "\n" +
                "int main(){\n" +
                "  array<int>^ arr = gcnew array<int>{0,1,2,5,7,8,11};\n" +
                "  int even=0, odd=0;\n" +
                "\n" +
                "  for each (int i in arr) {\n" +
                "    if (i%2 == 0)  \n" +
                "      even++;      \n" +
                "    else \n" +
                "      odd++;         \n" +
                "  }\n" +
                "\n" +
                "  Console::WriteLine(\"Found {0} Odd Numbers, and {1} Even Numbers.\",\n" +
                "    odd, even);\n" +
                "}");

        List<String> python = new ArrayList<String>();
        python.add("for val in array:\n" +
                "    print(val)");

        List<String> java = new ArrayList<String>();
        java.add("for (type item: iterableCollection) {\n" +
                "    // Do something to item\n" +
                "}");

        List<String> Perl = new ArrayList<String>();
        Perl.add("foreach var (list) {\n" +
                "...\n" +
                "}");

        listDataChild.put(listDataHeader.get(0), csharp);
        listDataChild.put(listDataHeader.get(1), cplusplus);
        listDataChild.put(listDataHeader.get(2), python);
        listDataChild.put(listDataHeader.get(3), java);
        listDataChild.put(listDataHeader.get(4), Perl);
    }
}