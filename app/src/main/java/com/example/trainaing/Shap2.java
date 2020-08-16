package com.example.trainaing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Shap2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shap2);
        Button b12=findViewById(R.id.red1);
        Button b13=findViewById(R.id.blue1);
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent t3=new Intent(Shap2.this,Samaya1.class);
                startActivity(t3);
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent t4=new Intent(Shap2.this,Game.class);
                startActivity(t4);
            }
        });
    }
}
