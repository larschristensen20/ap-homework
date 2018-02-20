package com.example.burno.android_programming_homework_week8;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class nameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);
    }

    public void collectAddressData(View view) {
        Intent received = getIntent();
        Intent intent = new Intent(this, addressActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText2);
        String message = editText.getText().toString();
        intent.putExtra("address", message);
        intent.putExtra("name", received.getStringExtra("name"));
        startActivity(intent);
    }
}
