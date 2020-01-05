package com.vaishnavi.mixit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.gsm.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SmsActivity extends AppCompatActivity {

    EditText e1,e2;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms);
        b=(Button)findViewById(R.id.button1);
        e1=(EditText)findViewById(R.id.editText1);
        e2=(EditText)findViewById(R.id.editText2);

    }
    public void Send(View w)
    {
        String m= e2.getText().toString();
        String n= e1.getText().toString();

        SmsManager sms= SmsManager.getDefault();
        sms.sendTextMessage(n, null, m, null, null);
        Toast.makeText(getApplicationContext(),"Message Send to :"+n,Toast.LENGTH_LONG).show();
    }
}
