package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4,nxt;
    EditText n1,n2;
    TextView rs;

    int num1,num2;
    float result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=findViewById(R.id.plus);
        b2=findViewById(R.id.min);
        b3=findViewById(R.id.multi);
        b4=findViewById(R.id.div);

        rs=findViewById(R.id.result);
        n1=findViewById(R.id.num01);
        n2=findViewById(R.id.num02);

        nxt=findViewById(R.id.btnnext);


        nxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent cal = new Intent(MainActivity.this,SimpleCalculatore.class);
                startActivity(cal);
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num1=Integer.parseInt(n1.getText() .toString());
                num2=Integer.parseInt(n2.getText() .toString());

                result=num1+num2;

                rs.setText(String.valueOf(result));
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num1=Integer.parseInt(n1.getText() .toString());
                num2=Integer.parseInt(n2.getText() .toString());

                result=num1-num2;

                rs.setText(String.valueOf(result));
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num1=Integer.parseInt(n1.getText() .toString());
                num2=Integer.parseInt(n2.getText() .toString());

                result=num1*num2;

                rs.setText(String.valueOf(result));
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num1=Integer.parseInt(n1.getText() .toString());
                num2=Integer.parseInt(n2.getText() .toString());

                result=num1/num2;

                rs.setText(String.valueOf(result));
            }
        });
    }
}
