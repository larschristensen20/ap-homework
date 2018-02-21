package com.example.burno.android_programming_homework_week8;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class summaryActivity extends AppCompatActivity {

    private  ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);
        printSummary();
       imageView = (ImageView) findViewById(R.id.picture1);
    }

    public void printSummary() {
        Intent received = getIntent();
        ((TextView) findViewById(R.id.textView4)).setText("Name :" + received.getStringExtra("name") +
                "\n" + "Address: " + received.getStringExtra("address") +
                "\n" + "dateofbirth: " + received.getStringExtra("dateofbirth"));
    }

    public void showPicture(View view) {
        imageView.setImageResource(R.drawable.new_data_flow_diagram);
    }
}
