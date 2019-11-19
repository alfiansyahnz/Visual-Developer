package com.example.suitmedia2;


import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class EventAdapter extends RecyclerView.Adapter<EventAdapter.EventViewHolder> {

    private ArrayList<Event> isievent;

    public EventAdapter(ArrayList<Event> isi) {
        this.isievent = isi;
    }

    @NonNull
    @Override

    public EventViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_event, viewGroup, false);
        return new EventViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EventAdapter.EventViewHolder holder, int i) {
        final Event event = isievent.get(i);
        Glide.with(holder.itemView.getContext())
                .load(event.getImage())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.mImageView);
        holder.mTextViewName.setText(event.getNama());
        holder.mTextViewDate.setText(event.getTanggal());
        holder.mTextViewDesc.setText(event.getDesc());
    }

    @Override
    public int getItemCount() {
        if (isievent != null) {
            return isievent.size();
        } else {
            return 0;
        }
    }

    public class EventViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.item_image)
        ImageView mImageView;

        @BindView(R.id.item_title)
        TextView mTextViewName;

        @BindView(R.id.item_date)
        TextView mTextViewDate;

        @BindView(R.id.item_desc)
        TextView mTextViewDesc;

        public EventViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
