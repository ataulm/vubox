package com.ataulm.vubox;

import android.support.annotation.ColorRes;
import android.support.v7.widget.RecyclerView;
import android.view.View;

class ShowViewHolder extends RecyclerView.ViewHolder {

    private final View itemView;

    public ShowViewHolder(View itemView) {
        super(itemView);
        this.itemView = itemView;
    }

    public void setColor(@ColorRes int color) {
        itemView.setBackgroundColor(color);
    }

}
