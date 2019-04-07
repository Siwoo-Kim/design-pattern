package com.siwoo.designpattern.iterator_composition;

import java.util.ArrayList;
import java.util.List;

public class PancakeHouseMenu implements Menu {
    private List<MenuItem> items;

    public PancakeHouseMenu() {
        items = new ArrayList<>();
        addItem("K&B Pancake", true, 2.99);
        addItem("Regular Pancake", true, 2.99);
        addItem("Blueberry Pancake", true, 2.99);
    }

    private void addItem(String name, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, vegetarian, price);
        items.add(menuItem);
    }

//    public List getMenuItems() {
//        return items;
//    }

    public java.util.Iterator<MenuItem> iterator() {
//        return new MenuIterator();
        return items.iterator();
    }

    private class MenuIterator implements Iterator<MenuItem> {
        private int pos = 0;

        @Override
        public boolean hasNext() {
            return pos < items.size() && items.get(pos) != null;
        }

        @Override
        public MenuItem next() {
            return items.get(pos++);
        }
    }
}
