package com.example.dictionaryhub.ViewHolders;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dictionaryhub.R;


public class MeaningViewHolder extends RecyclerView.ViewHolder {
    public TextView textView_partsOfSpeech;
    public RecyclerView recycler_definitions;
    public MeaningViewHolder(@NonNull View itemView) {
        super(itemView);
        textView_partsOfSpeech = itemView.findViewById(R.id.textView_partsOfSpeech);
        recycler_definitions = itemView.findViewById(R.id.recycler_definition);
    }

    public static class PhoneticViewHolder extends RecyclerView.ViewHolder {
        public TextView textView_phonetic;
        public ImageButton imageButton_audio;
        public PhoneticViewHolder(@NonNull View itemView) {
            super(itemView);
            textView_phonetic = itemView.findViewById(R.id.textview_phonetic);
            imageButton_audio = itemView.findViewById(R.id.imageButton_audio);
        }

    }
}
