package com.ataulm.vubox;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

public class MyLibraryActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_library);

        RecyclerView myLibrary = (RecyclerView) findViewById(R.id.mylib);
        myLibrary.setLayoutManager(new LinearLayoutManager(this));
        myLibrary.setAdapter(new MyLibraryAdapter());
    }

}
