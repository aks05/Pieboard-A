package com.example.srish.pieboard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Instrnc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instrnc);
    }
    public void gotit(View view)
    {
        Intent intent=new Intent(this,SelectActivity.class);
        startActivity(intent);
    }
}