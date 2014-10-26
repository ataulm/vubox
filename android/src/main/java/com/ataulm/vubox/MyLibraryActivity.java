package com.ataulm.vubox;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

public class MyLibraryActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_library);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.trending_shows_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        TrendingShowsAdapter adapter = TrendingShowsAdapter.newInstance();
        recyclerView.setAdapter(adapter);

        adapter.onUpdate(getTrendingShows());
    }

    private List<Show> getTrendingShows() {
        return new ShowsProvider().fetchTrendingShows();
    }

}
