package com.example.suitmedia2;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AdapterPager extends PagerAdapter {

    private List<Event> mEvents;
    private LayoutInflater layoutInflater;
    private Context context;

    @BindView(R.id.item_desc_event)
    TextView mTextView;

    @BindView(R.id.iv_image_event)
    ImageView mImageView;

    @BindView(R.id.card_view_event)
    CardView mCardView;

    public AdapterPager(List<Event> event, Context context) {
        this.mEvents = event;
        this.context = context;
    }

    @Override
    public int getCount() {
        return mEvents.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, final int position) {
        layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.item_event_horizontal, container, false);
        ButterKnife.bind(this, view);
        final Event event = mEvents.get(position);
        Glide.with(context)
                .load(event.getImage())
                .apply(new RequestOptions().override(55, 55))
                .into(mImageView);
       mTextView.setText(event.getNama());

        mCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Kamu memilih " + event.getNama() , Toast.LENGTH_SHORT).show();
            }
        });

        container.addView(view, 0);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View)object);
    }
}
