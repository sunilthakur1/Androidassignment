package com.example.androidassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Calculator extends AppCompatActivity implements View.OnClickListener {
    Button button1,button2,button3,button4,button5,
            button6,button7,button8,button9,button_0,
            button_add,button_sub,button_multi,button_div,button_clr,button_eq;
    EditText text;
    String display_num = "";
    int num1, num2;
    int result;
    boolean add, sub, multi, div;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        button_0 = findViewById(R.id.btn_0);
        button1 = findViewById(R.id.btn_1);
        button2 = findViewById(R.id.btn_2);
        button3 = findViewById(R.id.btn_3);
        button4 = findViewById(R.id.btn_4);
        button5 = findViewById(R.id.btn_5);
        button6 = findViewById(R.id.btn_6);
        button7 = findViewById(R.id.btn_7);
        button8 = findViewById(R.id.btn_8);
        button9 = findViewById(R.id.btn_9);
        button_add = findViewById(R.id.btn_add);
        button_sub = findViewById(R.id.btn_sub);
        button_multi = findViewById(R.id.btn_multi);
        button_div = findViewById(R.id.btn_divide);
        button_clr = findViewById(R.id.btn_clear);
        button_eq = findViewById(R.id.btn_eq);
        text = findViewById(R.id.text);

        button_0.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        button_clr.setOnClickListener(this);
        button_add.setOnClickListener(this);
        button_sub.setOnClickListener(this);
        button_multi.setOnClickListener(this);
        button_div.setOnClickListener(this);
        button_eq.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.btn_0:
                display_num += 0;
                text.setText(display_num);
                break;
            case R.id.btn_1:
                display_num += 1;
                text.setText(display_num);
                break;
            case R.id.btn_2:
                display_num += 2;
                text.setText(display_num);
                break;
            case R.id.btn_3:
                display_num += 3;
                text.setText(display_num);
                break;
            case R.id.btn_4:
                display_num += 4;
                text.setText(display_num);
                break;
            case R.id.btn_5:
                display_num += 5;
                text.setText(display_num);
                break;
            case R.id.btn_6:
                display_num += 6;
                text.setText(display_num);
                break;
            case R.id.btn_7:
                display_num += 7;
                text.setText(display_num);
                break;
            case R.id.btn_8:
                display_num += 8;
                text.setText(display_num);
                break;
            case R.id.btn_9:
                display_num += 9;
                text.setText(display_num);
                break;
            case R.id.btn_clear:
                display_num = "";
                text.setText(display_num);
                break;
            case R.id.btn_add:
                if (text == null) {
                    text.setText("");
                } else {
                    num1 = Integer.parseInt(display_num + "");
                    add = true;
                    display_num = "";
                    text.setText(display_num);
                }
                break;
            case R.id.btn_sub:
                if (text == null) {
                    text.setText("");
                } else {
                    num1 = Integer.parseInt(display_num + "");
                    sub = true;
                    display_num = "";
                    text.setText(display_num);
                }
                break;
            case R.id.btn_multi:
                if (text == null) {
                    text.setText("");
                } else {
                    num1 = Integer.parseInt(display_num + "");
                    multi = true;
                    display_num = "";
                    text.setText(display_num);
                }
                break;
            case R.id.btn_divide:
                if (text == null) {
                    text.setText("");
                } else {
                    num1 = Integer.parseInt(display_num + "");
                    div = true;
                    display_num = "";
                    text.setText(display_num);
                }
                break;
            case R.id.btn_eq:
                num2 = Integer.parseInt(display_num + "");
                calculation(num1, num2);
                break;

        }
    }


    private void calculation(int val1, int val2)
    {
        if(add == true){
            result = val1 + val2;
            text.setText(result + "");
            add = false;
        }else if(sub == true){
            result = val1 - val2;
            text.setText(result + "");
            sub = false;
        }else if(div == true){
            result = val1 / val2;
            text.setText(result + "");
            div = false;
        }else if(multi == true){
            result = val1 * val2;
            text.setText(result + "");
            multi = false;
        }
        display_num = result + "";
        num1 = Integer.parseInt(display_num + "");
    }
}
