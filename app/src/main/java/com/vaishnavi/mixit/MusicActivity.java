package com.vaishnavi.mixit;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MusicActivity extends AppCompatActivity {

    MediaPlayer m;
    Boolean select=false;

    Uri uri;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);

    }
    public void play(View v)
    {
        if (select)
        {
            m.start();
        }
        else
            Toast.makeText(this,"No song selected",Toast.LENGTH_SHORT).show();

    }
    public void select(View v)
    {
        if (select)
        {
            m.release();
        }
        Intent it=new Intent(Intent.ACTION_GET_CONTENT);
        it.setType("audio/*");
        startActivityForResult(it,1);
    }
    public void pause(View v)
    {
        if (select)
        {
            m.pause();
        }
        else
            Toast.makeText(this,"No song selected",Toast.LENGTH_SHORT).show();

    }
    public void exit(View v)
    {
        finish();

    }
    public void stop(View v)
    {
        if (select)
        {
            m.stop();
            select=false;
        }
        else
            Toast.makeText(this,"No song selected",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode==RESULT_OK)
        {
            uri=data.getData();
            m=MediaPlayer.create(MusicActivity.this,uri);
            select=true;
            Toast.makeText(getApplicationContext(),"SONG Selected",Toast.LENGTH_LONG).show();
        }

    }
}
