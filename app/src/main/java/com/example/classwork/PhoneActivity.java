package com.example.classwork;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import javax.xml.transform.Result;

public class PhoneActivity extends AppCompatActivity {
    Button send;
    EditText t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone);

        send = findViewById(R.id.send);
        t = findViewById(R.id.numberInput);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Result = t.getText().toString();
                Intent i = new Intent();
                i.putExtra("Result", Result);
                setResult(RESULT_OK, i);
                finish();

            }
        });
    }
}

//        send.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i=new Intent();
//                String result=numberInput.getText().toString();
//                i.putExtra("result",result);
//                setResult(RESULT_OK);
//                finish();
//
//
//            }
//        });
