package com.example.abrahamyann.frenchie;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Red","rouge",R.drawable.color_red));
        words.add(new Word("mustard Yellow","jaune moutarde",R.drawable.color_mustard_yellow));
        words.add(new Word("dusty yellow","jaune pale",R.drawable.color_dusty_yellow));
        words.add(new Word("green","vert",R.drawable.color_green));
        words.add(new Word("brown","marron",R.drawable.color_brown));
        words.add(new Word("gray","gris",R.drawable.color_gray));
        words.add(new Word("black","noir",R.drawable.color_black));
        words.add(new Word("white","blanc",R.drawable.color_white));



        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter wordAdapter = new WordAdapter(this,words,R.color.category_color);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml file

        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(wordAdapter);
    }
}
