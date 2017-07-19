package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import static android.R.attr.resource;

public class WordAdapter extends ArrayAdapter<Word> {

    // View lookup cache
    private static class ViewHolder {
        TextView miwokView;
        TextView defaultView;
    }

    public WordAdapter(@NonNull Context context, @NonNull List<Word> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder viewHolder; // view lookup cache stored in tag

        // Get the data item for this position
        Word word = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());


            convertView = inflater.inflate(R.layout.list_item, parent, false);
            viewHolder.miwokView = (TextView) convertView.findViewById(R.id.miwok_text_view);
            viewHolder.defaultView = (TextView) convertView.findViewById(R.id.default_text_view);

            // Cache the viewHolder object inside the fresh view
            convertView.setTag(viewHolder);

        } else {
            // View is being recycled, retrieve the viewHolder object from tag
            viewHolder = (ViewHolder) convertView.getTag();
        }

        // Populate the data from the data object via the viewHolder object
        // into the template view.
        assert word != null;
        viewHolder.miwokView.setText(word.getMiwokTranslation());
        viewHolder.defaultView.setText(word.getDefaultTranslation());

        // Return the completed view to render on screen
        return convertView;
    }
}
