package com.emanuelcatoui.me.schoolproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;


public class SubjectLearnActivity extends AppCompatActivity
{
    private Subject mCurrentSubject;
    private ImageView mTheImageView;
    private TextView mPageTitle;
    private EditText mTheEditText;
    private Button mNextButton, mPreviousButton;
    private int mCurrentPage = 0, mSubjectLength;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject_learn);

        Intent i = getIntent();
        mCurrentSubject = i.getParcelableExtra("CURRENT_SUBJECT");

        mSubjectLength = mCurrentSubject.getMaterialLength();

        mNextButton = (Button) findViewById(R.id.next_button);
        if(mCurrentPage == (mSubjectLength - 1))
            mNextButton.setText("סיום");

        mNextButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                mCurrentPage++;

                if(mCurrentPage == mSubjectLength)
                {
                    finish();
                }
                else
                {
                    updateTitle();
                    updateMaterial();
                    mPreviousButton.setVisibility(View.VISIBLE);
                    if(mCurrentPage == (mSubjectLength - 1))
                        mNextButton.setText("סיום");
                }

            }
        });

        mPreviousButton = (Button) findViewById(R.id.previous_button);
        mPreviousButton.setVisibility(View.INVISIBLE);

        mPreviousButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                mCurrentPage--;
                updateMaterial();
                updateTitle();
                if(mCurrentPage == 0)
                {
                    mPreviousButton.setVisibility(View.INVISIBLE);
                    mTheImageView.setVisibility(View.VISIBLE);
                }
            }
        });

        mTheImageView = (ImageView) findViewById(R.id.image_subject_learn);
        mTheImageView.setImageResource(mCurrentSubject.getImageId());

        mTheEditText = (EditText) findViewById(R.id.material_subject_learn);
        updateMaterial();

        mPageTitle = (TextView) findViewById(R.id.title_text_view);
        updateTitle();


    }

    private void updateTitle()
    {
        mPageTitle.setText(mCurrentSubject.getTitle()+ " : " +"עמוד "+ (mCurrentPage+1) + " / " + mSubjectLength );
    }

    private void updateMaterial()
    {
        mTheEditText.setText(mCurrentSubject.getMaterialAtIndex(mCurrentPage));
    }



}
