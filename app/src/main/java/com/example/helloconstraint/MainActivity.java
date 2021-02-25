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
    private TextView counter;
    private int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_toast=findViewById(R.id.btntst);
        btn_count=findViewById(R.id.btncnt);
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
            }
        });
    }

}