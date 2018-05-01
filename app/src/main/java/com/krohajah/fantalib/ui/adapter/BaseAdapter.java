package com.krohajah.fantalib.ui.adapter;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseAdapter<T> extends android.widget.BaseAdapter {

    protected List<T> items = new ArrayList<T>();

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public T getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    public List<T> getItems() {
        return items;
    }

    public void setItems(List<T> items) {
        if (items == null) {
            throw new IllegalStateException("items shouldn't be null");
        }
        this.items = items;
        notifyDataSetChanged();
    }
}
