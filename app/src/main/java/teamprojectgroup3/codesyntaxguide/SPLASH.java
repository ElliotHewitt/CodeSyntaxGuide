//Created by Emma Fearn
package teamprojectgroup3.codesyntaxguide;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SPLASH extends Activity {

    //display for 5 seconds
    private final int SPLASH_DISPLAY_LENGTH = 2000;

    @Override
    public void onCreate(Bundle splash) {
        super.onCreate(splash);
        setContentView(R.layout.splashscreen);

        //handler to start the menu and close this splash after a certain
        //amount of seconds
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                /* Create an Intent that will start the Menu-Activity. */
                Intent mainIntent = new Intent(SPLASH.this, MENU.class);
                SPLASH.this.startActivity(mainIntent);
                SPLASH.this.finish();
            }
        }, SPLASH_DISPLAY_LENGTH);
    }
}