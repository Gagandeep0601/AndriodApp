package com.bignerdranch.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button)findViewById(R.id.button);         //access button
        TextView poundValue = (TextView)findViewById(R.id.poundValue);  //access textView where can show value in pound
        EditText kgValue = (EditText)findViewById(R.id.KgValue); //access editView where we enter value in KG
          // set a click Listener on button
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "clicked", Toast.LENGTH_SHORT).show();
                String KgInString = kgValue.getText().toString(); //get entered kg value in string
                int kg = Integer.parseInt(KgInString); // convert kg value from string to integer
                double pound = 2.205 * kg; // convert kg to pound
                poundValue.setText("Value in Pound is: - " +pound); // set pound value in textView

            }
        });
    }
}