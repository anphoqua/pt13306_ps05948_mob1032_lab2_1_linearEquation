package com.example.anphoqua.phuongtrinhbacnhat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editText_number_a, editText_number_b;
    Button btn_solve;
    TextView textView_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText_number_a = findViewById(R.id.edt_number_a);
        editText_number_b = findViewById(R.id.edt_number_b);
        btn_solve = findViewById(R.id.btn_solve);
        textView_result = findViewById(R.id.textview_result);

        float a = Float.parseFloat(editText_number_a.getText().toString().trim());
        float b = Float.parseFloat(editText_number_b.getText().toString().trim());

        timNghiem(a,b);

    }

    public void timNghiem (float a, float b){
        if (a != 0) {
            textView_result.setText(getString(R.string.textview_pt1n,(-b/a)));
        } else {
            if (b!=0) textView_result.setText(getString(R.string.textview_ptvn));
            else textView_result.setText(getString(R.string.textview_ptvsn));
        }
    }
}
