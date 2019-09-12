package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mBtnTextView;
    private Button mBtnButton;
    private Button mBtnEditText;
    private Button mBtnRadioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnTextView = findViewById(R.id.btn_textview);
        mBtnButton = findViewById(R.id.btn_button);
        mBtnEditText = findViewById(R.id.btn_edittext);
        mBtnRadioButton = findViewById(R.id.btn_radiobutton);
        setListeners();
    }

    private void setListeners(){
        OnClick onClick = new OnClick();
        mBtnTextView.setOnClickListener(onClick);
        mBtnButton.setOnClickListener(onClick);
        mBtnEditText.setOnClickListener(onClick);
        mBtnRadioButton.setOnClickListener(onClick);
    }

    private class OnClick implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            Intent intent = null;
            switch (view.getId()){
                case R.id.btn_textview:
                    //跳转到TextView演示页面
                    intent = new Intent(MainActivity.this,TextViewActivity.class);
                    break;
                case R.id.btn_button:
                    //跳转到Button演示页面
                    intent = new Intent(MainActivity.this,ButtonActivity.class);
                    break;
                case R.id.btn_edittext:
                    //跳转到EditText演示页面
                    intent = new Intent(MainActivity.this,EditTextActivity.class);
                    break;
                case R.id.btn_radiobutton:
                    //跳转到RadioButton演示页面
                    intent = new Intent(MainActivity.this,RadioButtonActivity.class);
                    break;
            }
            startActivity(intent);
        }
    }


}
