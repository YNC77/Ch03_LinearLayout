package com.example.ync.ch03_linearlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //宣告UI元件的變數
    EditText firstName, lastName, phoneNo, password;
    TextView txv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //初始化變數
        firstName = (EditText) findViewById(R.id.inputFirstName);
        lastName = (EditText) findViewById(R.id.inputLastName);
        phoneNo = (EditText) findViewById(R.id.inputPhone);
        password = (EditText) findViewById(R.id.inputPasswordNo);
        txv = (TextView) findViewById(R.id.txv);

    }

    public void onclick (View v) {
        txv.setText(firstName.getText()+" "+lastName.getText()+"'\nphone no. is "+phoneNo.getText()+
                "\nPassword is "+password.getText());

    }

}
