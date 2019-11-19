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

public class EventAdapterTaskMapView extends RecyclerView.Adapter<EventAdapterTaskMapView.EventTaskViewHolder> {

    private ArrayList<Event> mEventArrayList;

    public EventAdapterTaskMapView(ArrayList<Event> isi) {
        this.mEventArrayList = isi;
    }

    @NonNull
    @Override

    public EventTaskViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_event_horizontal, viewGroup, false);
        return new EventTaskViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EventAdapterTaskMapView.EventTaskViewHolder holder, int i) {
        final Event event = mEventArrayList.get(i);
        Glide.with(holder.itemView.getContext())
                .load(event.getImage())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.mImageView);
        holder.mTextViewName.setText(event.getNama());
    }

    @Override
    public int getItemCount() {
        if (mEventArrayList != null) {
            return mEventArrayList.size();
        } else {
            return 0;
        }
    }

    public class EventTaskViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.iv_image_event)
        ImageView mImageView;

        @BindView(R.id.item_desc_event)
        TextView mTextViewName;

        public EventTaskViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
