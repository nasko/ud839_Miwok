package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("father", "баща", R.drawable.family_father));
        words.add(new Word("mother", "майка", R.drawable.family_mother));
        words.add(new Word("brother", "брат", R.drawable.family_younger_brother));
        words.add(new Word("sister", "сестра", R.drawable.family_younger_sister));
        words.add(new Word("son", "син", R.drawable.family_son));
        words.add(new Word("daughter", "дъщеря", R.drawable.family_daughter));
        words.add(new Word("brother-in-law", "зет", R.drawable.family_older_brother));
        words.add(new Word("sister-in-law", "снаха", R.drawable.family_older_sister));
        words.add(new Word("grandfather", "дядо", R.drawable.family_grandfather));
        words.add(new Word("grandmother", "баба", R.drawable.family_grandmother));

        WordAdapter itemsAdapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        assert listView != null;
        listView.setAdapter(itemsAdapter);
    }
}
