package com.emanuelcatoui.me.schoolproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity
{
    //Checked For Readibilty
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startLearn(View view)
    {
        Intent i = new Intent(this, ChapterPickActivity.class);
        startActivity(i);
    }
}
