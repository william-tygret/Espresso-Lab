package com.example.espressotestlab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button mButtonAdd;
    Button mButtonView;
    TextView mBallance;
    EditText mEditText;
    Button mButtonSubtract;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBallance = (TextView)findViewById(R.id.textView);
        mEditText = (EditText)findViewById(R.id.editText);

        mButtonAdd = (Button)findViewById(R.id.button1);
        mButtonView = (Button)findViewById(R.id.button2);
        mButtonSubtract = (Button)findViewById(R.id.buttonSubtract);

        mButtonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String ballanceToAdd = mEditText.getText().toString();
               float number = Float.parseFloat(ballanceToAdd);
                String currentBallance = mBallance.getText().toString();
                float number2 = Float.parseFloat(currentBallance);
                float newBal = number + number2;
                String newBalance = Float.toString(newBal);
                mBallance.setText("$"+newBalance);
            }
        });

        mButtonSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ballanceToAdd = mEditText.getText().toString();
                float number = Float.parseFloat(ballanceToAdd);
                String currentBallance = mBallance.getText().toString();
                float number2 = Float.parseFloat(currentBallance);
                float newBal = number - number2;
                String newBalance = Float.toString(newBal);
                mBallance.setText("$"+newBalance);
            }
        });

        mButtonView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,DetailsActivity.class);
                startActivity(intent);
            }
        });

    }
}
