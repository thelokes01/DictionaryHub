package com.example.dictionaryhub.ViewHolders;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dictionaryhub.R;


public class DefinitionViewHolder extends RecyclerView.ViewHolder {
    public TextView textView_definitions, textView_example;
    public DefinitionViewHolder(@NonNull View itemView) {
        super(itemView);
        textView_definitions = itemView.findViewById(R.id.textView_definition);
        textView_example = itemView.findViewById(R.id.textView_example);
//        textView_synonyms = itemView.findViewById(R.id.textView_synonyms);
//        textView_antonyms = itemView.findViewById(R.id.textView_antonyms);
    }

}
