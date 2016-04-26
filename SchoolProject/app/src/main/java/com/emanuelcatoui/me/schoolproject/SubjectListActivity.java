package com.emanuelcatoui.me.schoolproject;

import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class SubjectListActivity extends ListActivity
{
    ListView mTheListView;
    SubjectListAdapter mTheListAdapter;
    String [] subjects;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject_list);

        Intent i = getIntent();
        subjects = i.getStringArrayExtra("SUBJECTS");

        mTheListView = getListView();
        mTheListAdapter = new SubjectListAdapter(getApplicationContext(), subjects);
        mTheListView.setAdapter(mTheListAdapter);

        mTheListView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                TextView listCurrentText = (TextView) view.findViewById(R.id.list_text_view);
                Subject currentSubject = getCurrentSubject(listCurrentText.getText().toString());
                Intent intent = new Intent(SubjectListActivity.this, SubjectLearnActivity.class);
                intent.putExtra("CURRENT_SUBJECT", currentSubject);
                startActivity(intent);
            }
        });

    }

    private Subject getCurrentSubject(String identifier) // Get a subject by subject name
    {
        Resources res = getResources();
        switch(identifier)
        {
            case "תנאים לקבלת רישיון":
                return new Subject(R.drawable.image_one, res.getStringArray(R.array.chapter_one_row_one), identifier);

            case "חובות הנוהג ובעל הרכב":
                return new Subject(R.drawable.image_one, res.getStringArray(R.array.chapter_one_row_two), identifier);

            case "נהג חדש ומלווה":
                return new Subject(R.drawable.image_one, res.getStringArray(R.array.chapter_one_row_three), identifier);

            case "תאונות דרכים":
                return new Subject(R.drawable.image_one, res.getStringArray(R.array.chapter_one_row_four), identifier);

            case "שומרי החוק ופסילת רישיון":
                return new Subject(R.drawable.image_one, res.getStringArray(R.array.chapter_one_row_five), identifier);

            case "שיטת הניקוד":
                return new Subject(R.drawable.image_one, res.getStringArray(R.array.chapter_one_row_six), identifier);

            case "מבוא לתמרורים":
                return new Subject(R.drawable.image_one, res.getStringArray(R.array.chapter_one_row_seven), identifier);

            case "הדרך וחלקיה - הגדרות":
                return new Subject(R.drawable.image_one, res.getStringArray(R.array.chapter_one_row_eight), identifier);

            case "נתיב תחבורה ציבורית":
                return new Subject(R.drawable.image_one, res.getStringArray(R.array.chapter_one_row_nine), identifier);

            case "כלי רכב - הגדרות":
                return new Subject(R.drawable.image_one, res.getStringArray(R.array.chapter_one_row_ten), identifier);

            case "גורר וגרור":
                return new Subject(R.drawable.image_one, res.getStringArray(R.array.chapter_one_row_eleven), identifier);

            case "אלכוהול סמים ותרופות":
                return new Subject(R.drawable.image_one, res.getStringArray(R.array.chapter_one_row_twelve), identifier);

            case "אחריות הנהג על הנוסעים":
                return new Subject(R.drawable.image_one, res.getStringArray(R.array.chapter_one_row_thirteen), identifier);

            case "מערכות השליטה ברכב":
                return new Subject(R.drawable.image_one, res.getStringArray(R.array.chapter_one_row_fourteen), identifier);

            case "עזרי בטיחות ומערכות הבקרה":
                return new Subject(R.drawable.image_one, res.getStringArray(R.array.chapter_one_row_fifteen), identifier);

            case "הסעת ילדים ברכב":
                return new Subject(R.drawable.image_one, res.getStringArray(R.array.chapter_one_row_sixteen), identifier);

            case "הכנה לנסיעה ברכב":
                return new Subject(R.drawable.image_one, res.getStringArray(R.array.chapter_two_row_one), identifier);

            case "הילוכים-ידני ואוטומטי":
                return new Subject(R.drawable.image_one, res.getStringArray(R.array.chapter_two_row_two), identifier);

            case "נסיעה לאחור":
                return new Subject(R.drawable.image_one, res.getStringArray(R.array.chapter_two_row_three), identifier);

            case "החלפת נתיבים ונהיגה בימין":
                return new Subject(R.drawable.image_one, res.getStringArray(R.array.chapter_two_row_four), identifier);

            case "חנייה ועצירה":
                return new Subject(R.drawable.image_one, res.getStringArray(R.array.chapter_two_row_five), identifier);

            case "התקרבות לצומת, מיקום וחצייה":
                return new Subject(R.drawable.image_one, res.getStringArray(R.array.chapter_two_row_six), identifier);

            case "פניות-ימינה ושמאלה":
                return new Subject(R.drawable.image_one, res.getStringArray(R.array.chapter_two_row_seven), identifier);

            case "פניות פרסה":
                return new Subject(R.drawable.image_one, res.getStringArray(R.array.chapter_two_row_eight), identifier);

            case "מהירות הנסיעה וחובת האטה":
                return new Subject(R.drawable.image_one, res.getStringArray(R.array.chapter_two_row_nine), identifier);

            case "שמירת רווח":
                return new Subject(R.drawable.image_one, res.getStringArray(R.array.chapter_two_row_ten), identifier);

            case "עקיפה נכונה":
                return new Subject(R.drawable.image_one, res.getStringArray(R.array.chapter_two_row_eleven), identifier);

            case "זכויות קדימה שלא בצומת":
                return new Subject(R.drawable.image_one, res.getStringArray(R.array.chapter_two_row_twelve), identifier);

            case "זכויות קדימה בצומת שאינו מתומרר":
                return new Subject(R.drawable.image_one, res.getStringArray(R.array.chapter_two_row_thirteen), identifier);

            case "זכויות קדימה בצומת מתומרר":
                return new Subject(R.drawable.image_one, res.getStringArray(R.array.chapter_two_row_fourteen), identifier);

            case "זכויות קדימה בצומת מרומזר":
                return new Subject(R.drawable.image_one, res.getStringArray(R.array.chapter_two_row_fifteen), identifier);

            case "הולכי רגל ורוכבי אופניים":
                return new Subject(R.drawable.image_one, res.getStringArray(R.array.chapter_two_row_sixteen), identifier);

            case "שולי הדרך":
                return new Subject(R.drawable.image_one, res.getStringArray(R.array.chapter_two_row_seventeen), identifier);

            case "כללי נהיגה במורד":
                return new Subject(R.drawable.image_one, res.getStringArray(R.array.chapter_three_row_one), identifier);

            case "כללי נהיגה בעקומה":
                return new Subject(R.drawable.image_one, res.getStringArray(R.array.chapter_three_row_two), identifier);

           case "גורמי החלקה":
                return new Subject(R.drawable.image_one, res.getStringArray(R.array.chapter_three_row_three), identifier);

            case "נהיגה בזמן תאורה":
                return new Subject(R.drawable.image_one, res.getStringArray(R.array.chapter_three_row_four), identifier);

            case "נהיגה בקרבת רכב ביטחון":
                return new Subject(R.drawable.image_one, res.getStringArray(R.array.chapter_three_row_five), identifier);

            case "מפגש מסילת ברזל":
                return new Subject(R.drawable.image_one, res.getStringArray(R.array.chapter_three_row_six), identifier);

            case "נהיגה באזור עבודות בכביש":
                return new Subject(R.drawable.image_one, res.getStringArray(R.array.chapter_three_row_seven), identifier);


        }
        return null;
    }


}
