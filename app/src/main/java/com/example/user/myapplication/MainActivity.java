package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText input1;
    EditText input2;
    Button btn;
    TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input1 = (EditText) findViewById(R.id.input);
        input2 = (EditText) findViewById(R.id.input2);
        output = (TextView) findViewById(R.id.output);
        btn = (Button) findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = input1.getText().toString();
                String s2 = input2.getText().toString();
                int x = Integer.parseInt(s);
                int x2 = Integer.parseInt(s2);
                output.setText(String.valueOf(x + x2));
            }
        });

    }

}
