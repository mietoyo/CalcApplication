package jp.techacademy.toyo.mie.calcapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.style.EasyEditSpan;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.button1);
          button1.setOnClickListener(this);

        Button button2 = (Button) findViewById(R.id.button2);
          button2.setOnClickListener(this);

        Button button3 = (Button) findViewById(R.id.button3);
          button3.setOnClickListener(this);

        Button button4 = (Button) findViewById(R.id.button4);
          button4.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
          Intent intent = new Intent(this, SecondActivity.class);

             EditText editText1 = (EditText) findViewById(R.id.editText1);
             String text1 = editText1.getText().toString();


        EditText editText2 = (EditText) findViewById(R.id.editText2);
        String text2 = editText2.getText().toString();


            double value1 = 0.0;
            double value2 = 0.0;


        try{
              value1 = Double.parseDouble(text1);
              value2 = Double.parseDouble(text2);
        } catch (Exception e){
              value1 = 0.0;
              value2 = 0.0;
           }

   double sum = 0.0;

        if (v.getId() == R.id.button1){
            sum = value1 + value2;

        } else if (v.getId()== R.id.button2){
            sum =  value1 - value2;

        }else if (v.getId()== R.id.button3){
            sum = value1 * value2;

        }else if (v.getId()==R.id.button4){
            sum = value1 / value2;
        }


        intent.putExtra("VALUE", sum);


        startActivity(intent);
    }
    }




