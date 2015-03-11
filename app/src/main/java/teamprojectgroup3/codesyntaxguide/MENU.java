package teamprojectgroup3.codesyntaxguide;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MENU extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        //Declare Buttons
        Button button = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);
        Button button5 = (Button) findViewById(R.id.button5);
        Button button6 = (Button) findViewById(R.id.button6);
        Button button7 = (Button) findViewById(R.id.button7);
        Button button8 = (Button) findViewById(R.id.button8);
        Button button9 = (Button) findViewById(R.id.button9);
        Button button10 = (Button) findViewById(R.id.button10);
        Button button11 = (Button) findViewById(R.id.button11);
        Button button12 = (Button) findViewById(R.id.button12);
        Button button13 = (Button) findViewById(R.id.button13);
        Button button14 = (Button) findViewById(R.id.button14);

        //On click of a buttons listener
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.button1:
                        Intent intent = new Intent(MENU.this, IF.class);
                        startActivity(intent);
                        break;
                    case R.id.button2:
                        Intent intent2 = new Intent(MENU.this, ELSEIF.class);
                        startActivity(intent2);
                        break;
                    case R.id.button3:
                        Intent intent3 = new Intent(MENU.this, WHILE.class);
                        startActivity(intent3);
                        break;
                    case R.id.button4:
                        Intent intent4 = new Intent(MENU.this, DOWHILE.class);
                        startActivity(intent4);
                        break;
                    case R.id.button5:
                        Intent intent5 = new Intent(MENU.this, SWITCH.class);
                        startActivity(intent5);
                        break;
                    case R.id.button6:
                        Intent intent6 = new Intent(MENU.this, TYPES.class);
                        startActivity(intent6);
                        break;
                    case R.id.button7:
                        Intent intent7 = new Intent(MENU.this, PRINTING.class);
                        startActivity(intent7);
                        break;
                    case R.id.button8:
                        Intent intent8 = new Intent(MENU.this, OPERATORS.class);
                        startActivity(intent8);
                        break;
                    case R.id.button9:
                        Intent intent9 = new Intent(MENU.this, CLASSES.class);
                        startActivity(intent9);
                        break;
                    case R.id.button10:
                        Intent intent10 = new Intent(MENU.this, NAMESPACES.class);
                        startActivity(intent10);
                        break;
                    case R.id.button11:
                        Intent intent11 = new Intent(MENU.this, INCLUDE.class);
                        startActivity(intent11);
                        break;
                    case R.id.button12:
                        Intent intent12 = new Intent(MENU.this, POINTERS.class);
                        startActivity(intent12);
                        break;
                }
            }
        };
        //Set the listener
        button.setOnClickListener(listener);
        button2.setOnClickListener(listener);
        button3.setOnClickListener(listener);
        button4.setOnClickListener(listener);
        button5.setOnClickListener(listener);
        button6.setOnClickListener(listener);
        button7.setOnClickListener(listener);
        button8.setOnClickListener(listener);
        button9.setOnClickListener(listener);
        button10.setOnClickListener(listener);
        button11.setOnClickListener(listener);
        button12.setOnClickListener(listener);
        button13.setOnClickListener(listener);
        button14.setOnClickListener(listener);
    }
}

