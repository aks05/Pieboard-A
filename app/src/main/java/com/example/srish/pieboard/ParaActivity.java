package com.example.srish.pieboard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ParaActivity extends AppCompatActivity {
    public static final int VR_REQUEST = 1;
    public static final int IR_REQUEST = 2;
    public static final int RE_REQUEST = 3;
    public final static String EXTRA_OPTION = "com.example.srish.pieboard.OPTION";
    TextView textView;
    Intent intentoption;
    int option;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_para);
        textView=(TextView) findViewById(R.id.textView4);
        intentoption=getIntent();
        Bundle extras=intentoption.getExtras();
        option =  extras.getInt(SelectActivity.EXTRA_OPTION);

    }

    public void OSr(View view) {
        Intent intent=new Intent(this,showResultActivity.class);
        startActivity(intent);
    }

    public void Ovr(View view) {
        Intent intent=new Intent(this,VRActivity.class);
        Bundle extras=new Bundle();
        extras.putInt(EXTRA_OPTION,option);
        intent.putExtras(extras);
        startActivityForResult(intent,VR_REQUEST);
    }
    public void Ore(View view) {
        Intent intent=new Intent(this,VRActivity.class);
        Bundle extras=new Bundle();
        extras.putInt(EXTRA_OPTION,option);
        intent.putExtras(extras);
        startActivityForResult(intent,RE_REQUEST);
    }

    public void Oir(View view) {
        Intent intent=new Intent(this,IRActivity.class);
        Bundle extras=new Bundle();
        extras.putInt(EXTRA_OPTION,option);
        intent.putExtras(extras);
        startActivityForResult(intent,IR_REQUEST);
    }
    public void ResetValues(View view)
    {
        textView.setText("You have not selected any Parameter");
    }

    public void onActivityResult(int requestCode, int resultCode,  Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == VR_REQUEST ) {
            if (resultCode == RESULT_OK) {
                if(textView.getText().equals("You have not selected any Parameter"))
                    textView.setText("Voltage:Initial Point:"+data.getStringExtra(VRActivity.EXTRA_RETURN_MESSAGE_1)
                            +data.getStringExtra(VRActivity.EXTRA_RETURN_MESSAGE_2)+" Final Point"
                            +data.getStringExtra(VRActivity.EXTRA_RETURN_MESSAGE_3)
                            +data.getStringExtra(VRActivity.EXTRA_RETURN_MESSAGE_4)+"\n");
                else
                    textView.append("Voltage:Initial Point:"+data.getStringExtra(VRActivity.EXTRA_RETURN_MESSAGE_1)
                            +data.getStringExtra(VRActivity.EXTRA_RETURN_MESSAGE_2)+" Final Point"
                            +data.getStringExtra(VRActivity.EXTRA_RETURN_MESSAGE_3)
                            +data.getStringExtra(VRActivity.EXTRA_RETURN_MESSAGE_4)+"\n");
                // process data
            }
        }
        if (requestCode == IR_REQUEST ) {
            if (resultCode == RESULT_OK) {
                if(textView.getText().equals("You have not selected any Parameter"))
                    textView.setText("Current:Initial Point:"+data.getStringExtra(IRActivity.EXTRA_RETURN_MESSAGE_1)
                            +data.getStringExtra(IRActivity.EXTRA_RETURN_MESSAGE_2)+"\n");
                else
                    textView.append("Current:Initial Point:"+data.getStringExtra(IRActivity.EXTRA_RETURN_MESSAGE_1)
                            +data.getStringExtra(VRActivity.EXTRA_RETURN_MESSAGE_2)+"\n");
                // process data
            }
        }
        if (requestCode == RE_REQUEST ) {
            if (resultCode == RESULT_OK) {
                if(textView.getText().equals("You have not selected any Parameter"))
                    textView.setText("Resistance:Initial Point:"+data.getStringExtra(VRActivity.EXTRA_RETURN_MESSAGE_1)
                            +data.getStringExtra(VRActivity.EXTRA_RETURN_MESSAGE_2)+" Final Point"
                            +data.getStringExtra(VRActivity.EXTRA_RETURN_MESSAGE_3)
                            +data.getStringExtra(VRActivity.EXTRA_RETURN_MESSAGE_4)+"\n");
                else
                    textView.append("Current:Initial Point:"+data.getStringExtra(VRActivity.EXTRA_RETURN_MESSAGE_1)
                            +data.getStringExtra(VRActivity.EXTRA_RETURN_MESSAGE_2)+" Final Point"
                            +data.getStringExtra(VRActivity.EXTRA_RETURN_MESSAGE_3)
                            +data.getStringExtra(VRActivity.EXTRA_RETURN_MESSAGE_4)+"\n");
                // process data
            }
        }
    }
}
