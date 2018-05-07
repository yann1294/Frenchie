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
        words.add(new Word("Dad","Papa"));
        words.add(new Word("Mom","Maman"));
        words.add(new Word("Elder brother","Grand-frere"));
        words.add(new Word("Elder sister","Grande-soeur"));
        words.add(new Word("Little brother","Petit-frere"));
        words.add(new Word("Little sister","Petite-soeur"));
        words.add(new Word("Grandfather","Grand-pere"));
        words.add(new Word("GrandMother","Grand-mere"));
        words.add(new Word("Uncle","Oncle"));
        words.add(new Word("Aunt","Tante"));


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter wordAdapter = new WordAdapter(this,words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml file

        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(wordAdapter);
    }
}
