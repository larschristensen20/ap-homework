package com.example.burno.android_programming_homework_week8;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class summaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);
        printSummary();
    }

    private void printSummary(){
        Intent received = getIntent();
        ((TextView) findViewById(R.id.textView4)).setText("Name :" + received.getStringExtra("name")+
                "\n"+"Address: " + received.getStringExtra("address") +
                "\n"+"dateofbirth: "+received.getStringExtra("dateofbirth") );
    }

}
