package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {
    private MediaPlayer mMediaPlayer;
    private MediaPlayer.OnCompletionListener mCompletionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mp) {
            releaseMediaPlayer();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("how are you?", "как си?", R.raw.phrase_how_are_you_feeling));
        words.add(new Word("look after", "грижа се", R.raw.phrase_are_you_coming));
        words.add(new Word("give up", "предавам се", R.raw.phrase_come_here));
        words.add(new Word("how are you?", "как си?", R.raw.phrase_im_coming));
        words.add(new Word("look after", "грижа се", R.raw.phrase_im_feeling_good));
        words.add(new Word("give up", "предавам се", R.raw.phrase_lets_go));
        words.add(new Word("how are you?", "как си?", R.raw.phrase_my_name_is));
        words.add(new Word("look after", "грижа се", R.raw.phrase_what_is_your_name));
        words.add(new Word("give up", "предавам се", R.raw.phrase_where_are_you_going));
        words.add(new Word("how are you?", "как си?", R.raw.phrase_my_name_is));
        words.add(new Word("look after", "грижа се", R.raw.phrase_are_you_coming));
        words.add(new Word("give up", "предавам се", R.raw.phrase_where_are_you_going));

        WordAdapter itemsAdapter = new WordAdapter(this, words, R.color.category_phrases);

        ListView listView = (ListView) findViewById(R.id.list);

        assert listView != null;
        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int audio = words.get(position).getmAudioResourceId();
                releaseMediaPlayer();

                mMediaPlayer = MediaPlayer.create(PhrasesActivity.this, audio);
                mMediaPlayer.start();

                mMediaPlayer.setOnCompletionListener(mCompletionListener);
            }
        });
    }

    /**
     * Clean up the media player by releasing its resources.
     */
    private void releaseMediaPlayer() {
        // If the media player is not null, then it may be currently playing a sound.
        if (mMediaPlayer != null) {
            // Regardless of the current state of the media player, release its resources
            // because we no longer need it.
            mMediaPlayer.release();

            // Set the media player back to null. For our code, we've decided that
            // setting the media player to null is an easy way to tell that the media player
            // is not configured to play an audio file at the moment.
            mMediaPlayer = null;
        }
    }
}
