package com.example.tracker;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class res_pass extends AppCompatActivity {
    Button b,r;
    EditText e,n;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_res_pass);
        b=findViewById(R.id.sub);
        e=findViewById(R.id.otp);
        n=findViewById(R.id.no);
        r=findViewById(R.id.Save);
    }
    public void back(View v)
    {
        Intent i=new Intent(res_pass.this,MainActivity.class);
        startActivity(i);
    }
    public void otp(View v) {
        String Phone = n.getText().toString().trim();
        if (Phone.isEmpty()) {
            n.setError("Required");
            n.requestFocus();

        } else if (Phone.length()!=10) {
            n.setError("Number should be 10 digits long");
            n.requestFocus();
        } else {
            b.setVisibility(View.VISIBLE);
            e.setVisibility(View.VISIBLE);
            n.setVisibility(View.INVISIBLE);
            r.setVisibility(View.INVISIBLE);
        }
    }


}