package com.example.trainaing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Button b=findViewById(R.id.red);
        Button b1=findViewById(R.id.blue);
        Button b12=findViewById(R.id.bt1);
        Button b13=findViewById(R.id.bt2);
        Button b14=findViewById(R.id.bt3);
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent t4=new Intent(MainActivity.this,Table2.class);
                startActivity(t4);
            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent t3=new Intent(MainActivity.this,Shap2.class);
                startActivity(t3);
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent t2=new Intent(MainActivity.this,Calcoulatr.class);
                startActivity(t2);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent t1=new Intent(MainActivity.this,Samaya.class);
                startActivity(t1);
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent t=new Intent(MainActivity.this,Table.class);
                startActivity(t);
            }
        });


    }
}
