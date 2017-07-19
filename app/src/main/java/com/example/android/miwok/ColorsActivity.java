package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("blue", "син"));
        words.add(new Word("red", "червен"));
        words.add(new Word("gray", "сив"));
        words.add(new Word("black", "син"));
        words.add(new Word("white", "бюл"));
        words.add(new Word("yellow", "жълт"));
        words.add(new Word("purple", "пурпурен"));
        words.add(new Word("green", "зелен"));
        words.add(new Word("brown", "кафяв"));
        words.add(new Word("orange", "оранжев"));

        WordAdapter itemsAdapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        assert listView != null;
        listView.setAdapter(itemsAdapter);
    }
}
