package com.ataulm.vubox;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MyLibraryActivity extends Activity {

    private static final int COLUMN_COUNT = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_library);
        RecyclerView myLibrary = (RecyclerView) findViewById(R.id.mylib);
        myLibrary.setLayoutManager(new GridLayoutManager(this, COLUMN_COUNT));
        myLibrary.setAdapter(new MyLibraryAdapter(getResources()));
    }

    private static class MyLibraryLayoutManager extends RecyclerView.LayoutManager {

        @Override
        public RecyclerView.LayoutParams generateDefaultLayoutParams() {
            int wrapContent = RecyclerView.LayoutParams.WRAP_CONTENT;
            return new RecyclerView.LayoutParams(wrapContent, wrapContent);
        }

    }

}
