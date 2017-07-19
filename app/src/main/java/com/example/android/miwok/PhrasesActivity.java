package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("how are you?", "как си?"));
        words.add(new Word("look after", "грижа се"));
        words.add(new Word("give up", "предавам се"));
        words.add(new Word("how are you?", "как си?"));
        words.add(new Word("look after", "грижа се"));
        words.add(new Word("give up", "предавам се"));
        words.add(new Word("how are you?", "как си?"));
        words.add(new Word("look after", "грижа се"));
        words.add(new Word("give up", "предавам се"));
        words.add(new Word("how are you?", "как си?"));
        words.add(new Word("look after", "грижа се"));
        words.add(new Word("give up", "предавам се"));

        WordAdapter itemsAdapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        assert listView != null;
        listView.setAdapter(itemsAdapter);
    }
}
