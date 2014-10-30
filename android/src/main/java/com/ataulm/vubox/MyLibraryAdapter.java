package com.ataulm.vubox;

import android.content.res.Resources;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

class MyLibraryAdapter extends RecyclerView.Adapter<ShowViewHolder> {

    private static final int MOCK_COUNT = 100;

    private final Resources resources;

    MyLibraryAdapter(Resources resources) {
        this.resources = resources;
    }

    @Override
    public ShowViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View view = layoutInflater.inflate(R.layout.view_my_library_item, viewGroup, false);
        return new ShowViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ShowViewHolder showViewHolder, int position) {
        if (position % 2 == 0) {
            showViewHolder.setColor(resources.getColor(android.R.color.holo_green_light));
        } else {
            showViewHolder.setColor(resources.getColor(android.R.color.holo_blue_light));
        }
    }

    @Override
    public int getItemCount() {
        return MOCK_COUNT;
    }

}
