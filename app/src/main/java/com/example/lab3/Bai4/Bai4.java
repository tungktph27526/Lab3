package com.example.lab3.Bai4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import com.example.lab3.R;

public class Bai4 extends AppCompatActivity implements View.OnClickListener {
    public static final String SERVER_NAME3 = "http://192.168.100.18:80/kieuthanhtung_ph27526/giaiphuongtrinh_POST.php";
    private EditText edA;
    private EditText edB;
    private EditText edC;
    private Button btnSend;
    private Button btnBack;
    private TextView tvResult;
    String strA, strB, strC;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai4);

        edA = (EditText) findViewById(R.id.ed_a);
        edB = (EditText) findViewById(R.id.ed_b);
        edC = (EditText) findViewById(R.id.ed_c);
        btnSend = (Button) findViewById(R.id.btn_send);
        btnBack = (Button) findViewById(R.id.btn_back);
        tvResult = (TextView) findViewById(R.id.tv_result);
        btnSend.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_send) {
            strA = edA.getText().toString();
            strB = edB.getText().toString();
            strC = edC.getText().toString();
            BackgroundTask_POST_Un4 backgroundTask_post_un4 = new BackgroundTask_POST_Un4(Bai4.this, tvResult, strA, strB, strC);
            backgroundTask_post_un4.execute();
        }
    }
}