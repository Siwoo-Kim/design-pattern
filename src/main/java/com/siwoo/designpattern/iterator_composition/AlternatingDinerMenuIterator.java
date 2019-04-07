package com.siwoo.designpattern.iterator_composition;

import java.util.Calendar;
import java.util.Iterator;

public class AlternatingDinerMenuIterator implements Iterator<MenuItem> {
    private MenuItem[] items;
    private int pos;

    public AlternatingDinerMenuIterator(MenuItem[] items) {
        this.items = items;
        Calendar now = Calendar.getInstance();
        pos = now.DAY_OF_WEEK % 2;
    }

    @Override
    public boolean hasNext() {
        return pos < items.length && items[pos] != null;
    }

    @Override
    public MenuItem next() {
        MenuItem item = items[pos];
        pos += 2;
        return item;
    }
}
