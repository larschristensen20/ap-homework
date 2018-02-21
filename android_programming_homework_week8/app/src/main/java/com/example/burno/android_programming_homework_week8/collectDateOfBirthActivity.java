package com.example.burno.android_programming_homework_week8;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;

public class collectDateOfBirthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_of_birth);
    }

    public void collectData(View view) {
        Intent received = getIntent();
        Intent intent = new Intent(this, summaryActivity.class);
        DatePicker datePicker = (DatePicker) findViewById(R.id.datePicker);
        intent.putExtra("dateofbirth", datePicker.getDayOfMonth() + "/" + (datePicker.getMonth()+1) + "/" + datePicker.getYear());
        intent.putExtra("address", received.getStringExtra("address"));
        intent.putExtra("name", received.getStringExtra("name"));
        startActivity(intent);
    }

}
