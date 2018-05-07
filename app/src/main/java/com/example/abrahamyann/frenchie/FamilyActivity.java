package com.example.abrahamyann.frenchie;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Dad","Papa",R.drawable.family_father));
        words.add(new Word("Mom","Maman",R.drawable.family_mother));
        words.add(new Word("Elder brother","Grand-frere",R.drawable.family_older_brother));
        words.add(new Word("Elder sister","Grande-soeur",R.drawable.family_older_sister));
        words.add(new Word("Little brother","Petit-frere",R.drawable.family_younger_brother));
        words.add(new Word("Little sister","Petite-soeur",R.drawable.family_older_sister));
        words.add(new Word("Grandfather","Grand-pere",R.drawable.family_grandfather));
        words.add(new Word("GrandMother","Grand-mere",R.drawable.family_grandmother));
        words.add(new Word("Son","Fils",R.drawable.family_son));
        words.add(new Word("Daughter","Fille",R.drawable.family_daughter));


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter wordAdapter = new WordAdapter(this,words,R.color.category_family);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml file

        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(wordAdapter);
    }
}
