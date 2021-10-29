package com.example.app_08;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Form_Control_Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form_control_activity);
        final Drawable mDraw1=getResources().getDrawable(R.drawable.ic_launcher);
        final Drawable mDraw2=getResources().getDrawable(R.drawable.skateboarding_robot120);
        final Button swapButton=(Button) findViewById(R.id.button2);
        swapButton.setCompoundDrawablesWithIntrinsicBounds(mDraw2,null,null,null);
        swapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(swapButton.getText().equals("Button")){
                    swapButton.setText("skateboarder");
                    swapButton.setCompoundDrawablesWithIntrinsicBounds(mDraw2,null,null,null);
                }else{
                    swapButton.setText("Button");
                    swapButton.setCompoundDrawablesWithIntrinsicBounds(mDraw1,null,null,null);
                }
            }
        });
    }
}
