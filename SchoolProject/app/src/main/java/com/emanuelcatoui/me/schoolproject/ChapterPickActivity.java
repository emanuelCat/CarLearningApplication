package com.emanuelcatoui.me.schoolproject;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ChapterPickActivity extends AppCompatActivity
{
    //Checked For Readibility
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapterpick);
    }

    public void openSubjectList(View view)
    {
        int buttonId = view.getId();
        Resources res = getResources();
        switch(buttonId)
        {
            case R.id.chapter_one_button:
            {
                Intent i = new Intent(this, SubjectListActivity.class);
                i.putExtra("SUBJECTS", res.getStringArray(R.array.chapter_one_subjects));
                startActivity(i);
                break;
            }

            case R.id.chapter_two_button:
            {
                Intent i = new Intent(this, SubjectListActivity.class);
                i.putExtra("SUBJECTS", res.getStringArray(R.array.chapter_two_subjects));
                startActivity(i);
                break;
            }

            case R.id.chapter_three_button:
            {
                Intent i = new Intent(this, SubjectListActivity.class);
                i.putExtra("SUBJECTS", res.getStringArray(R.array.chapter_three_subjects));
                startActivity(i);
                break;
            }

            case R.id.chapter_four_button:
            {
                Intent i = new Intent(this, SubjectListActivity.class);
                i.putExtra("SUBJECTS", res.getStringArray(R.array.chapter_four_subjects));
                startActivity(i);
                break;
            }

        }
    }

}
