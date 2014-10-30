package com.ataulm.vubox;

class TvShow implements Show {

    private final Id id;
    private final String title;
    private final String posterUrl;

    TvShow(Id id, String title, String posterUrl) {
        this.id = id;
        this.title = title;
        this.posterUrl = posterUrl;
    }

    @Override
    public Id getId() {
        return id;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getPosterUrl() {
        return posterUrl;
    }

}
