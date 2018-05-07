package com.example.abrahamyann.frenchie;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Numbers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("One","Un",R.drawable.number_one));
        words.add(new Word("Two","Deux",R.drawable.number_two));
        words.add(new Word("Three","Trois",R.drawable.number_three));
        words.add(new Word("Four","Quatres",R.drawable.number_four));
        words.add(new Word("Five","Cinq",R.drawable.number_five));
        words.add(new Word("Six","Six",R.drawable.number_six));
        words.add(new Word("Seven","Sept",R.drawable.number_seven));
        words.add(new Word("Eight","Huit",R.drawable.number_eight));
        words.add(new Word("Nine","Neuf",R.drawable.number_nine));
        words.add(new Word("Ten","Dix",R.drawable.number_ten));
        /*
        words.add(new Word("Eleven","Onze"));
        words.add(new Word("Twelve","Douze"));
        words.add(new Word("Thirteen","Treize"));
        words.add(new Word("Fourteen","Quatorze"));
        words.add(new Word("Fifthteen","Quinze"));
        words.add(new Word("Sixteen","Seize"));
        words.add(new Word("Seventeen","Dix-Sept"));
        words.add(new Word("Eightteen","Dix-Huit"));
        words.add(new Word("Nineteen","Dix-Neuf"));
        words.add(new Word("Twenty","vingt"));
        */


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter wordAdapter = new WordAdapter(this,words,R.color.category_numbers);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml file

        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(wordAdapter);

    }
}
