package com.example.tempconv;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView t1;
    EditText e1;
    double x;
    Button b1; RadioButton r1,r2,r3,r4,r5,r6;

    @SuppressLint({"MissingInflatedId", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.button);
        r1=findViewById(R.id.r1);
        r2=findViewById(R.id.r2);
        r3=findViewById(R.id.r3);
        r4=findViewById(R.id.r4);
        r5=findViewById(R.id.r5);
        r6=findViewById(R.id.r6);

          e1=findViewById(R.id.editText);
          t1=findViewById(R.id.t1);
          b1.setOnClickListener(v -> {
              if(e1.getText().toString().isEmpty())
              {
                  t1.setText("Please enter value");
              }
              else
              {
                  x=Double.parseDouble(e1.getText().toString());
                  if(r1.isChecked())
                  {
                      double y= ((x-32)*5)/9;
                      t1.setText(String.valueOf(y));
                  }
                  if(r2.isChecked())
                  {

                    double y1=(((x-32)*5)/9)+273.15;
                      t1.setText(String.valueOf(y1));
                  }

              if(r3.isChecked())
              {
                  double y=((9/5.0)*x)+32;
                          t1.setText(String.valueOf(y));
              }
              if(r4.isChecked())
              {
                  double y=((9/5.0)*x)+32;
                       t1.setText(String.valueOf(y+273.15));
              }
             if (r5.isChecked())
              {
                  double y=(x-273.15)*(9/5.0)+32;
                          t1.setText(String.valueOf(y));
              }
                  if (r6.isChecked())
                  {
                      double y= (x-273.15);
                              t1.setText(String.valueOf(y));
                  }
              }
          });
    }
}