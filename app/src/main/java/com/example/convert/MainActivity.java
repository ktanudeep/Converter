package com.example.convert;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText edit;
    EditText edittxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Converter");

        button=findViewById(R.id.btn);
        edit=findViewById(R.id.edttxt);
        edittxt=findViewById(R.id.answer);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    double multiplier = 39.37;
                    double result = 0.0;
                    double metervalue = Double.parseDouble(edit.getText().toString());
                    result = metervalue * multiplier;
                    edittxt.setText(Double.toString(result));
            }
        });
    }
}

