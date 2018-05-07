package com.example.abrahamyann.frenchie;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Good Morning","Bonjour"));
        words.add(new Word("Good Evening","Bonsoir"));
        words.add(new Word("What's your name","Comment tu t'appelles?"));
        words.add(new Word("My name is..","Mon nom est.."));
        words.add(new Word("How old are you!?","Quel age as tu!?"));
        words.add(new Word("Where do you live!?","Ou habites-tu!?"));
        words.add(new Word("what's your school name","Quel est le nom de ton ecole!?"));
        words.add(new Word("what's your favorite food","Quel est ta nourriture prefere(e)!?"));
        words.add(new Word("Where are you going","Ou vas tu!?"));
        words.add(new Word("I play basketball","Je joue au basketball"));



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
