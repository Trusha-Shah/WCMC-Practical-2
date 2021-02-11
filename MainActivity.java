package com.example.trushasaddition;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et1, et2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = findViewById(R.id.editTextNumber);
        et2 = findViewById(R.id.editTextNumber2);
    }

    public void onClick(View view){
        if(et1.length() == 0 || et2.length() == 0){
            Toast.makeText(getApplicationContext(), "Enter the numbers...", Toast.LENGTH_LONG).show();
        }
        else {
            int sum = Integer.parseInt(et1.getText().toString()) + Integer.parseInt(et2.getText().toString());
            Toast.makeText(getApplicationContext(),"Sum: " + sum, Toast.LENGTH_LONG).show();
        }
    }

}