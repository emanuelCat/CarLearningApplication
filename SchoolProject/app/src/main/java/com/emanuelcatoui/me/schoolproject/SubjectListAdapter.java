package com.emanuelcatoui.me.schoolproject;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Me on 17/03/2016.
 */
public class SubjectListAdapter extends ArrayAdapter<String>
{
    private Context mContext;

    public SubjectListAdapter (Context context, String[] values)
    {
        super(context, R.layout.row_list_layout ,values);
        mContext = context;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        LayoutInflater theInflater = LayoutInflater.from(getContext());

        View theView = theInflater.inflate(R.layout.row_list_layout, parent, false);

        Button listButton = (Button) theView.findViewById(R.id.list_button);
        listButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent (mContext, SubjectTestActivity.class);
                i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                mContext.startActivity(i);
            }
        });

        TextView theTextView = (TextView) theView.findViewById(R.id.list_text_view);
        theTextView.setText(getItem(position));

        return theView;
    }


}
