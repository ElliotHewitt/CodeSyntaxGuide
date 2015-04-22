//Created by Emma Fearn
package teamprojectgroup3.codesyntaxguide;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class HELLOWORLD extends ActionBarActivity {

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
        listDataHeader.add("C#");
        listDataHeader.add("C++");
        listDataHeader.add("Python");
        listDataHeader.add("Java");
        listDataHeader.add("Perl");
        listDataHeader.add("PHP");

        //adding data to the header
        List<String> csharp = new ArrayList<String>();
        csharp.add("public class HelloWorld\n" +
                "{\n" +
                "   public static void Main()\n" +
                "   {\n" +
                "      System.Console.WriteLine(\"Hello, World!\");\n" +
                "   }\n" +
                "}");

        List<String> cplusplus = new ArrayList<String>();
        cplusplus.add("int main()\n" +
                "{\n" +
                "  std::cout << \"Hello World!\";\n" +
                "}");

        List<String> python = new ArrayList<String>();
        python.add("In python 3.x. you use\n" +
                "\n" +
                "print(\"Hello, World\")\n" +
                "\n" +
                "In Python 2.x. you use\n" +
                "\n" +
                "print \"Hello, World!\"");

        List<String> java = new ArrayList<String>();
        java.add("class HelloWorld\n" +
                "{\n" +
                "   public static void main(String args[])\n" +
                "   {\n" +
                "      System.out.println(\"Hello World\");\n" +
                "   }\n" +
                "}");

        List<String> Perl = new ArrayList<String>();
        Perl.add("#!/usr/bin/perl\n" +
                "\n" +
                "# This will print \"Hello, World\"\n" +
                "print \"Hello, world\\n\";");

        List<String> php = new ArrayList<String>();
        php.add("<?php \necho 'Hello, World!';\n?> ");

        listDataChild.put(listDataHeader.get(0), csharp);
        listDataChild.put(listDataHeader.get(1), cplusplus);
        listDataChild.put(listDataHeader.get(2), python);
        listDataChild.put(listDataHeader.get(3), java);
        listDataChild.put(listDataHeader.get(4), Perl);
        listDataChild.put(listDataHeader.get(5), php);
    }
}
