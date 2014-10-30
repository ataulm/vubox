package com.ataulm.vubox;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.ColorRes;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MyLibraryActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_library);

        RecyclerView myLibrary = (RecyclerView) findViewById(R.id.mylib);
        myLibrary.setLayoutManager(new LinearLayoutManager(this));
        myLibrary.setAdapter(new MyLibraryAdapter(getResources()));
    }

    private static class MyLibraryAdapter extends RecyclerView.Adapter<ShowViewHolder> {

        private static final int MOCK_COUNT = 100;

        private final Resources resources;

        private MyLibraryAdapter(Resources resources) {
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

    private static class ShowViewHolder extends RecyclerView.ViewHolder {

        private final View itemView;

        public ShowViewHolder(View itemView) {
            super(itemView);
            this.itemView = itemView;
        }

        public void setColor(@ColorRes int color) {
            itemView.setBackgroundColor(color);
        }

    }

}
