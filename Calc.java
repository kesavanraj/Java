package com.example.santhoshkumar.myfirstapp;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {
    public EditText t1,t2;
    public TextView tv;
    public Button b1,b2,b3,b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=(EditText)findViewById(R.id.editText);
        t2=(EditText)findViewById(R.id.editText2);
        tv=(EditText)findViewById(R.id.editText3);
        b1=(Button)findViewById(R.id.button);
        b1.setOnClickListener(new sample());
        b2=(Button)findViewById(R.id.button2);
        b2.setOnClickListener(new sample1());
        b3=(Button)findViewById(R.id.button3);
        b3.setOnClickListener(new sample2());
        b4=(Button)findViewById(R.id.button4);
        b4.setOnClickListener(new sample3());
    }


    private class sample implements View.OnClickListener {
        public void onClick(View v)
        {
          int n1=Integer.parseInt(t1.getText().toString());
          int n2=Integer.parseInt(t2.getText().toString());
            int res=n1/n2;
            tv.setText(String.valueOf(res));
        }
    }

    private class sample1 implements View.OnClickListener {
        public void onClick(View v)
        {
            int n3=Integer.parseInt(t1.getText().toString());
            int n4=Integer.parseInt(t2.getText().toString());
            int res1=n3*n4;
            tv.setText(String.valueOf(res1));
        }
    }

    private class sample2 implements View.OnClickListener {
        public void onClick(View v)
        {
            int n5=Integer.parseInt(t1.getText().toString());
            int n6=Integer.parseInt(t2.getText().toString());
            int res2=n5-n6;
            tv.setText(String.valueOf(res2));
        }
    }

    private class sample3 implements View.OnClickListener {
        public void onClick(View v)
        {
            int n7=Integer.parseInt(t1.getText().toString());
            int n8=Integer.parseInt(t2.getText().toString());
            int res3=n7+n8;
            tv.setText(String.valueOf(res3));
        }
    }
}
