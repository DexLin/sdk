package com.dexlin.testsdk;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.dexlin.mylibrary.TestLibrary;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnlogin;
    private Button btnPay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnlogin=(Button)findViewById(R.id.btn_login);
        btnPay=(Button)findViewById(R.id.btn_pay);
        btnlogin.setOnClickListener(this);
        btnPay.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_login:
                TestLibrary testLibrary=new TestLibrary();
                testLibrary.test(MainActivity.this);

                break;
            case R.id.btn_pay:


                break;

        }

    }
}
