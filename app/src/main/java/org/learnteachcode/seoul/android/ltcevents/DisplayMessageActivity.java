package org.learnteachcode.seoul.android.ltcevents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

//        // This get the message from  the intent that sent
//        // us to this activity
//        Intent originIntent = getIntent();
//        String message = originIntent.toString();

        // another way to get intent extra data
        String message;
        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if(extras == null) {
                message= null;
            } else {
                message= extras.getString("com.android.ltc.yourname");
            }
        } else {
            message= (String) savedInstanceState.getSerializable("com.android.ltc.yourname");
        }


        // Retrieve the text view from the layout
        // and set
        TextView textView = (TextView) findViewById(R.id.outputText);
        textView.setText("Hello " + message + ". Welcome to Android !!!");


    }
}
