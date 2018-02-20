package com.example.burno.android_programming_homework_week8;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class week8_homework extends AppCompatActivity {

    public ArrayList<String> info = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week8_homework);
    }


    /** Called when the user taps the Send button */
    public void collectNameData(View view) {
        Intent intent = new Intent(this, nameActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        intent.putExtra("name", message);
        startActivity(intent);
    }
}