package com.example.app_08;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button move=(Button) findViewById(R.id.button1);
        move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent open=new Intent(MainActivity.this,Form_Control_Activity.class);
                startActivity(open);
            }
        });
        final Button move2=(Button) findViewById(R.id.button2);
        move2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent open=new Intent(MainActivity.this,Adapter.class);
                startActivity(open);
            }
        });
        final Button move3=(Button) findViewById(R.id.button4);
        move3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent open=new Intent(MainActivity.this,ImageView.class);
                startActivity(open);
            }
        });
    }
}