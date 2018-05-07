package com.example.abrahamyann.frenchie;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Abraham on 07/05/18.
 */
public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(Activity context, ArrayList<Word> words) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, words);

    }

    /**
     * @param position    position The position in the list of data that should be displayed in the
     *                    list item view.
     * @param convertView convertView The recycled view to populate.
     * @param parent      parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        // Get the {@link Word} object located at this positionin the list
        Word currentWord = getItem(position);


        //find the textview in the list_item layout with the ID frenchieTranslation.
        TextView mFrenchTranslation = (TextView) listItemView.findViewById(R.id.frenchieTextView);
        mFrenchTranslation.setText(currentWord.getFrenchTranslation());

        //find the textview in the list_item layout with the ID defaultTranslation.
        TextView mDefaultTranslation = (TextView) listItemView.findViewById(R.id.defaultTextview);
        mDefaultTranslation.setText(currentWord.getDefaultTranslation());

        // Return the whole list item layout (containing 2 TextViews)
        // so that it can be shown in the ListView
        return listItemView;


    }
}
