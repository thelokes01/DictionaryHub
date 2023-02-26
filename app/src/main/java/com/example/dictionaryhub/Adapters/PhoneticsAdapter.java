package com.example.dictionaryhub.Adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dictionaryhub.Models.Phonetics;
import com.example.dictionaryhub.R;
import com.example.dictionaryhub.ViewHolders.MeaningViewHolder;

import java.util.List;

public class PhoneticsAdapter extends RecyclerView.Adapter<MeaningViewHolder.PhoneticViewHolder> {
    private Context context;
    private List<Phonetics> phoneticsList;
    MediaPlayer player;

    public PhoneticsAdapter(Context context, List<Phonetics> phoneticsList) {
        this.context = context;
        this.phoneticsList = phoneticsList;
    }

    @NonNull
    @Override
    public MeaningViewHolder.PhoneticViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MeaningViewHolder.PhoneticViewHolder(LayoutInflater.from(context).inflate(R.layout.phonetic_list_items, parent, false));

    }

    @Override
    public void onBindViewHolder(@NonNull MeaningViewHolder.PhoneticViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.textView_phonetic.setText(phoneticsList.get(position).getText());
        holder.imageButton_audio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player = new MediaPlayer();

                player.setAudioAttributes(new AudioAttributes.Builder()
                        .setUsage(AudioAttributes.USAGE_MEDIA)
                        .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
                        .setLegacyStreamType(AudioManager.STREAM_MUSIC)
                        .build());
                player.setAudioStreamType(AudioManager.STREAM_MUSIC);
                try {
                    player.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                        @Override
                        public void onPrepared(MediaPlayer mp) {
                            mp.start();
                        }
                    });
                    player.setDataSource(phoneticsList.get(position).getAudio());
                    player.prepareAsync();
                } catch (Exception e) {
                    e.printStackTrace(); Toast.makeText(context, "Couldn't play audio", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return phoneticsList.size();
    }
}