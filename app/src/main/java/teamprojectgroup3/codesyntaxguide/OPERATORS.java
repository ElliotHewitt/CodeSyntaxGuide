//Created by Emma Fearn
package teamprojectgroup3.codesyntaxguide;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class OPERATORS extends ActionBarActivity {

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

        // adding data to the headers
        List<String> csharp = new ArrayList<String>();
        csharp.add("= - Using a single equals assigns a value\n" +
                "== - Using two equals in succession tests values for equality\n" +
                "!= - Tests values for inequality\n" +
                "* - Multiplication\n" +
                "/ - Division\n" +
                "% - The modulus returns the remainder of a division\n" +
                "+ - Addition\n" +
                "- - Subtraction\n" +
                "& - Logical AND\n" +
                "^ - Logical XOR\n" +
                "| - Logical OR\n" +
                "&& - Conditional AND\n" +
                "|| - Conditional OR\n" +
                "! - Conditional NOT\n" +
                "++ - Increment variable by 1\n" +
                "–– - Decrement variable by 1\n" +
                "+= - Increment variable by n\n" +
                "*= - Multiply variable by n\n" +
                "-= - Subtract n from a variable\n" +
                "> - Greater than\n" +
                "< - Less than\n" +
                ">= - Greater than or equal to\n" +
                "<= - Less than or equal to");

        List<String> cplusplus = new ArrayList<String>();
        cplusplus.add("+ - Addition\n" +
                "- - Subtraction\n" +
                "* - Multiplication\n" +
                "/ - Division\n" +
                "% - The modulus returns the remainder of a division\n" +
                "++ - Increment variable by 1\n" +
                "–– - Decrement variable by 1\n" +
                "== - Using two equals in succession tests values for equality\n" +
                "!= - Tests values for inequality\n" +
                "> - Greater than\n" +
                "< - Less than\n" +
                ">= - Greater than or equal to\n" +
                ">= - Less than or equal to\n" +
                "&& - Conditional AND\n" +
                "|| - Conditional OR\n" +
                "! - Conditional NOT\n" +
                "& - Binary AND Operator copies a bit to the result if it exists in both operands\n" +
                "^ - Binary XOR Operator copies the bit if it is set in one operand but not both\n" +
                "| - Binary AND Operator copies a bit to the result if it exists in both operands\n" +
                "~ - Binary Ones Complement Operator is unary and has the effect of \\'flipping\\' bits\n" +
                "<< - Binary Left Shift Operator. The left operands value is moved left by the number of bits specified by the right operand\n" +
                ">> - Binary Right Shift Operator. The left operands value is moved right by the number of bits specified by the right operand\n" +
                "= - Using a single equals assigns a value\n" +
                "+= - Increment variable by n\n" +
                "*= - Multiply variable by n\n" +
                "-= - Subtract n from a variable\n" +
                "/= - Divides n with a variable\n" +
                "<<= - Left shift AND\n" +
                ">>= - Right shift AND\n" +
                "&= - Bitwise AND\n" +
                "^= = Bitwise exclusive OR\n" +
                "|= = Bitwise inclusive OR");

        List<String> python = new ArrayList<String>();
        python.add("+ - Addition\n" +
                "- - Subtraction\n" +
                "* - Multiplication\n" +
                "/ - Division\n" +
                "** - Exponent - Performs exponential (power) calculation on operators\n" +
                "// - Floor Division - The division of operands where the result is the quotient in which the digits after the decimal point are removed\n" +
                "== - Using two equals in succession tests values for equality\n" +
                "!= - Tests values for inequality\n" +
                "<> - Checks if the value of two operands are equal or not, if values are not equal then condition becomes true\n" +
                ">= - Greater than or equal to\n" +
                "<= - Less than or equal to\n" +
                "> - Greater than\n" +
                "< - Less than\n" +
                "= - Using a single equals assigns a value\n" +
                "+= - Increment variable by n\n" +
                "*= - Multiply variable by n\n" +
                "-= - Subtract n from a variable\n" +
                "/= - Divides n with a variable\n" +
                "%= - Takes the modulus using two operands and assign the result to left operand\n" +
                "**= - Performs exponential (power) calculation on operators and assign value to the left operand\n" +
                "//= - Performs floor division on operators and assign value to the left operand\n" +
                "& - Binary AND Operator copies a bit to the result if it exists in both operands\n" +
                "| - Binary OR Operator copies a bit if it exists in either operand\n" +
                "^ - Binary XOR Operator copies the bit if it is set in one operand but not both\n" +
                "~ - Binary Ones Complement Operator is unary and has the effect of \\'flipping\\' bits\n" +
                "<< - Binary Left Shift Operator. The left operands value is moved left by the number of bits specified by the right operand\n" +
                ">> - Binary Right Shift Operator. The left operands value is moved right by the number of bits specified by the right operand\n" +
                "and - Logical AND\n" +
                "or - Logical OR\n" +
                "not - Logical NOT\n" +
                "in - Evaluates to true if it finds a variable in the specified sequence and false otherwise\n" +
                "not in - Evaluates to true if it does not finds a variable in the specified sequence and false otherwise\n" +
                "is - Evaluates to true if the variables on either side of the operator point to the same object and false otherwise\n" +
                "in not - Evaluates to false if the variables on either side of the operator point to the same object and true otherwise");

        List<String> java = new ArrayList<String>();
        java.add("+ - Addition\n" +
                "- - Subtraction\n" +
                "* - Multiplication\n" +
                "/ - Division\n" +
                "% - The modulus returns the remainder of a division\n" +
                "++ - Increment variable by 1\n" +
                "–– - Decrement variable by 1\n" +
                "== - Using two equals in succession tests values for equality\n" +
                "!= - Tests values for inequality\n" +
                "> - Greater than\n" +
                "< - Less than\n" +
                ">= - Greater than or equal to\n" +
                "<= - Less than or equal to\n" +
                "& - Binary AND Operator copies a bit to the result if it exists in both operands\n" +
                "| - Binary OR Operator copies a bit if it exists in either operand\n" +
                "^ - Binary XOR Operator copies the bit if it is set in one operand but not both\n" +
                "~ - Binary Ones Complement Operator is unary and has the effect of \\'flipping\\' bits\n" +
                "<< - Binary Left Shift Operator. The left operands value is moved left by the number of bits specified by the right operand\n" +
                ">> - Binary Right Shift Operator. The left operands value is moved right by the number of bits specified by the right operand\n" +
                ">>> - Shift right zero fill operator. The left operands value is moved right by the number of bits specified by the right operand and shifted values are filled up with zeros\n" +
                "&& - Logical AND operator. If both the operands are non-zero, then the condition becomes true\n" +
                "|| - Logical OR operator. If any of the two operands are non-zero, then the condition becomes true\n" +
                "! - Logical NOT Operator. Use to reverses the logical state of its operand. If a condition is true then Logical NOT operator will be false\n" +
                "= - Using a single equals assigns a value\n" +
                "+= - Increment variable by n\n" +
                "*= - Multiply variable by n\n" +
                "-= - Subtract n from a variable\n" +
                "/= - Divides n with a variable\n" +
                "%= - Takes the modulus using two operands and assign the result to left operand\n" +
                "<<= - Left shift AND\n" +
                ">>= - Right shift AND\n" +
                "&= - Bitwise AND\n" +
                "^= = Bitwise exclusive OR\n" +
                "|= = Bitwise inclusive OR\\n");

        List<String> Perl = new ArrayList<String>();
        Perl.add("+ - Addition\n" +
                "- - Subtraction\n" +
                "* - Multiplication\n" +
                "/ - Division\n" +
                "** - Exponent - Performs exponential (power) calculation on operators\n" +
                "% - The modulus returns the remainder of a division\n" +
                "== - Using two equals in succession tests values for equality\n" +
                "!= - Tests values for inequality\n" +
                "<=> - Checks if the value of two operands are equal or not, and returns -1, 0, or 1 depending on whether the left argument is numerically less than, equal to, or greater than the right argument\n" +
                ">= - Greater than or equal to\n" +
                "<= - Less than or equal to\n" +
                "> - Greater than\n" +
                "< - Less than\n" +
                "= - Using a single equals assigns a value\n" +
                "+= - Increment variable by n\n" +
                "*= - Multiply variable by n\n" +
                "-= - Subtract n from a variable\n" +
                "/= - Divides n with a variable\n" +
                "%= - Takes the modulus using two operands and assign the result to left operand\n" +
                "**= - Performs exponential (power) calculation on operators and assign value to the left operand\n" +
                "& - Binary AND Operator copies a bit to the result if it exists in both operands\n" +
                "| - Binary OR Operator copies a bit if it exists in either operand\n" +
                "^ - Binary XOR Operator copies the bit if it is set in one operand but not both\n" +
                "~ - Binary Ones Complement Operator is unary and has the effect of \\'flipping\\' bits\n" +
                "<< - Binary Left Shift Operator. The left operands value is moved left by the number of bits specified by the right operand\n" +
                ">> - Binary Right Shift Operator. The left operands value is moved right by the number of bits specified by the right operand\n" +
                "and - Logical AND\n" +
                "or - Logical OR\n" +
                "not - Logical NOT\n" +
                "lt - Returns true if the left argument is stringwise less than the right argument\n" +
                "gt - Returns true if the left argument is stringwise greater than the right argument\n" +
                "le - Returns true if the left argument is stringwise less than or equal to the right argument\n" +
                "ge - Returns true if the left argument is stringwise greater than or equal to the right argument\n" +
                "eq - Returns true if the left argument is stringwise equal to the right argument\n" +
                "ne - Returns true if the left argument is stringwise not equal to the right argument\n" +
                "cmp - Returns -1, 0, or 1 depending on whether the left argument is stringwise less than, equal to, or greater than the right argument\n" +
                "q{} - Encloses a string with-in single quotes\n" +
                "qq{} - Encloses a string with-in double quotes\n" +
                "qx{} - Encloses a string with-in invert quotes\n" +
                ". - Binary operator dot (.) concatenates two strings\n" +
                "x - The repetition operator x returns a string consisting of the left operand repeated the number of times specified by the right operand\n" +
                ".. - The range operator .. returns a list of values counting (up by ones) from the left value to the right value\n" +
                "++ - Increment variable by 1\n" +
                "–– - Decrement variable by 1\n" +
                "-> - The arrow operator is mostly used in dereferencing a method or variable from an object or a class name");

        listDataChild.put(listDataHeader.get(0), csharp);
        listDataChild.put(listDataHeader.get(1), cplusplus);
        listDataChild.put(listDataHeader.get(2), python);
        listDataChild.put(listDataHeader.get(3), java);
        listDataChild.put(listDataHeader.get(4), Perl);
    }
}
