package com.siwoo.designpattern.iterator_composition;

import java.util.List;
import java.util.ListIterator;

public class DinerMenu implements Menu {
    private static final int MAX_ITEMS = 6;
    private int size = 0;
    private MenuItem[] items;

    public DinerMenu() {
        items = new MenuItem[MAX_ITEMS];
        addItem("Vegetarian BLT", true, 2.99);
        addItem("Bacon", true, 2.99);
        addItem("Today's soup", true, 3.29);
    }

    private void addItem(String name, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, vegetarian, price);
        if (size >= MAX_ITEMS) {
            System.out.println("Sorry, menu is full. You cannot add more.");
        } else {
            items[size++] = menuItem;
        }
    }

//    public MenuItem[] getMenuItems() {
//        return items;
//    }
    public java.util.Iterator<MenuItem> iterator() {
        return new AlternatingDinerMenuIterator(items);
    }

    private class MenuIterator implements java.util.Iterator<MenuItem> {
        int pos = 0;

        @Override
        public boolean hasNext() {
            return pos < MAX_ITEMS && items[pos] != null;
        }

        @Override
        public MenuItem next() {
            return items[pos++];
        }

        @Override
        public void remove() {
            if (pos <= 0) {
                throw new IllegalStateException();
            } else if (items[pos - 1] != null) {
                for (int i = pos; i < MAX_ITEMS; i++) {
                    items[i] = items[i + 1];
                }
                items[items.length - 1] = null;
            }
        }
    }
}
