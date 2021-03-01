package com.example.helloconstraint;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btn_toast;
    private Button btn_count;
    private Button btn_zero;
    private TextView counter;
    private int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_toast=findViewById(R.id.btntst);
        btn_count=findViewById(R.id.btncnt);
        btn_zero=findViewById(R.id.btnzero);
        counter=findViewById(R.id.txtview);
        btn_toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Hello Toast!",Toast.LENGTH_LONG).show();
            }
        });
        btn_count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count=count+1;
                counter.setText(""+count);
                btn_zero.setBackgroundColor(btn_zero.getContext().getResources().getColor(R.color.my_light_blue, null));
                if(count%2==0){
                    //btn_count.setBackgroundColor(getResources().getColor(R.color.my_yellow, null));
                    btn_count.setBackgroundColor(btn_count.getContext().getResources().getColor(R.color.my_green, null));
                }
                else {
                    btn_count.setBackgroundColor(btn_count.getContext().getResources().getColor(R.color.my_red, null));
                }

            }

        });
        btn_zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count=0;
                counter.setText(""+count);
                btn_zero.setBackgroundColor(btn_zero.getContext().getResources().getColor(R.color.my_grey, null));
                btn_count.setBackgroundColor(btn_count.getContext().getResources().getColor(R.color.design_default_color_primary_variant, null));
            }
        });
    }

}