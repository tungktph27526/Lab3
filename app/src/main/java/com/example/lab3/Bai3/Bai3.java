package com.example.lab3.Bai3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.lab3.R;

public class Bai3 extends AppCompatActivity implements View.OnClickListener {
    public static final String SERVER_NAME2 = "http://192.168.100.18:80/kieuthanhtung_ph27526/canh_POST.php";
    private EditText edCanh;
    private Button btnSend;
    private Button btnBack;
    private TextView tvResult;
    String strCanh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai3);

        edCanh = (EditText) findViewById(R.id.ed_canh);
        btnSend = (Button) findViewById(R.id.btn_send);
        btnBack = (Button) findViewById(R.id.btn_back);
        tvResult = (TextView) findViewById(R.id.tv_result);
        btnSend.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        strCanh = edCanh.getText().toString();
        BackgroundTask_POST_Un3 backgroundTask_post_un3 = new  BackgroundTask_POST_Un3(Bai3.this, tvResult);
        backgroundTask_post_un3.execute(strCanh);
    }
}