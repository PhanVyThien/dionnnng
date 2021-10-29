package com.example.app_08;

import android.*;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ImageView extends AppCompatActivity {
    int i=0;
    int[] R_image={
            R.drawable.ty1,
            R.drawable.suu,
            R.drawable.dan,
            R.drawable.meo,
            R.drawable.thin,
            R.drawable.ty5,
            R.drawable.ngo,
            R.drawable.mui,
            R.drawable.than,
            R.drawable.dau,
            R.drawable.tuat,
            R.drawable.hoi
    };
    String[] image_name={
            "Tý",
            "Sửu",
            "Dần",
            "Mẹo",
            "Thìn",
            "Tỵ",
            "Ngọ",
            "Mùi",
            "Thân",
            "Dậu",
            "Tuất",
            "Hợi"
    };

    TextView tv1,tv2;
    View v,iv;
    int flag=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.imageview);
        tv1=(TextView) findViewById(R.id.tv);
        tv2=(TextView) findViewById(R.id.tv2);
        iv=(View) findViewById(R.id.img);
        iv.setBackgroundResource(R_image[i]);
        tv2.setText(image_name[i]);
        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                flag=1;
                long delay=5000;
                long period=1000;
                CountDownTimer cc= new CountDownTimer(delay,period){
                    @Override
                    public void onTick(long milisUntilFinished){
                        if (flag==1){
                            i=(i+1)%12;
                            v.setBackgroundResource(R_image[i]);
                            tv2.setText(image_name[i]);
                            tv1.setText("Đang thực hiện tự động thay đổi ảnh");
                        }
                    }
                    @Override
                    public void onFinish(){
                        tv1.setText("Click vào hình để xem tiếp");
                    }
                };
                cc.start();
            }

        });
    }
}
