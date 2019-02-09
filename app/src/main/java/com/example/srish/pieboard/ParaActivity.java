package com.example.srish.pieboard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ParaActivity extends AppCompatActivity {
    public static final int VR_REQUEST = 1;
    public static final int IR_REQUEST = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_para);
    }

    public void OSr(View view) {
        Intent intent=new Intent(this,showResultActivity.class);
        startActivity(intent);
    }

    public void Ovr(View view) {
        Intent intent=new Intent(this,VRActivity.class);
        startActivityForResult(intent,VR_REQUEST);
    }

    public void Oir(View view) {
        Intent intent=new Intent(this,IRActivity.class);
        startActivityForResult(intent,IR_REQUEST);
    }
}
