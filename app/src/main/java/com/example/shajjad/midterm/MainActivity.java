package com.example.shajjad.midterm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editTextBDT;
    TextView textViewDollar;
    float input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextBDT = (EditText) findViewById(R.id.editTextBdt);
        textViewDollar= (TextView) findViewById(R.id.textViewDollar);



    }

    public void conert(View view) {
        input = Float.parseFloat(editTextBDT.getText().toString());
        float output = (input/80);
        textViewDollar.setText(Float.toString(output));
    }
}
