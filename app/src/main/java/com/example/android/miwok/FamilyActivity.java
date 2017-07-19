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
        words.add(new Word("father", "баща"));
        words.add(new Word("mother", "майка"));
        words.add(new Word("brother", "брат"));
        words.add(new Word("sister", "сестра"));
        words.add(new Word("son", "син"));
        words.add(new Word("daughter", "дъщеря"));
        words.add(new Word("brother-in-law", "зет"));
        words.add(new Word("sister-in-law", "снаха"));
        words.add(new Word("grand-father", "дядо"));
        words.add(new Word("grand-mother", "баба"));

        WordAdapter itemsAdapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        assert listView != null;
        listView.setAdapter(itemsAdapter);
    }
}
