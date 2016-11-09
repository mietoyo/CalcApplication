package jp.techacademy.toyo.mie.calcapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener((View.OnClickListener) this);

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener((View.OnClickListener) this);

        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener((View.OnClickListener) this);

        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener((View.OnClickListener) this);

    }



    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, SecondActivity.class);

        TextView editText1 = (TextView) findViewById(R.id.editText1);
        String text1 = editText1.getText().toString();


        intent.putExtra("VALUE1", "");
        intent.putExtra("VALUE2", "");
        intent.putExtra("VALUE3", "");
        startActivity(intent);
    }
    }




