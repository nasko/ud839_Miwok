package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    private MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("dusty yellow", "мръсно-жълт", R.drawable.color_dusty_yellow, R.raw.color_dusty_yellow));
        words.add(new Word("red", "червен", R.drawable.color_red, R.raw.color_red));
        words.add(new Word("gray", "сив", R.drawable.color_gray, R.raw.color_gray));
        words.add(new Word("black", "черен", R.drawable.color_black, R.raw.color_black));
        words.add(new Word("white", "бюл", R.drawable.color_white, R.raw.color_white));
        words.add(new Word("yellow", "жълт", R.drawable.color_mustard_yellow, R.raw.color_mustard_yellow));
        words.add(new Word("green", "зелен", R.drawable.color_green, R.raw.color_green));
        words.add(new Word("brown", "кафяв", R.drawable.color_brown, R.raw.color_brown));

        WordAdapter itemsAdapter = new WordAdapter(this, words, R.color.category_colors);

        ListView listView = (ListView) findViewById(R.id.list);

        assert listView != null;
        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int audio = words.get(position).getmAudioResourceId();
                mMediaPlayer = MediaPlayer.create(ColorsActivity.this, audio);
                mMediaPlayer.start();
            }
        });
    }
}
