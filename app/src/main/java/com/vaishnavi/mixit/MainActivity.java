package com.vaishnavi.mixit;

import android.content.Intent;
import android.provider.Telephony;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button sms,music,third,fourth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sms=(Button)findViewById(R.id.button);
        music=(Button)findViewById(R.id.button2);
        third=(Button)findViewById(R.id.button3);
        fourth=(Button)findViewById(R.id.button4);
        sms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(), SmsActivity.class);
                startActivity(i);
            }
        });
        music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(), MusicActivity.class);
                startActivity(i);
            }
        });
        third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Use commented code to jump to new activity",Toast.LENGTH_LONG).show();
                /*Intent i=new Intent(getApplicationContext(), SmsActivity.class);
                startActivity(i);*/
            }
        });
        fourth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Use commented code to jump to new activity",Toast.LENGTH_LONG).show();

                /*Intent i=new Intent(getApplicationContext(), SmsActivity.class);
                startActivity(i);*/
            }
        });
    }

}
