package jp.techacademy.toyo.mie.calcapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import static android.R.attr.value;

public class SecondActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();

         double value = intent.getDoubleExtra("VALUE",0.0);


        TextView textView = (TextView) findViewById(R.id.textView1);
        textView.setText(String.valueOf(value));
    }
}