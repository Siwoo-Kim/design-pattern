package com.siwoo.designpattern.iterator_composition;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CafeMenu implements Menu {
    Map<String, MenuItem> items = new HashMap<>();

    public CafeMenu() {
        addItem("Fries", true, 3.99);
        addItem("Soup", true, 3.99);
        addItem("burrito", true, 3.99);
    }

    private void addItem(String name, boolean vegetarian, double price) {
        MenuItem item = new MenuItem(name, vegetarian, price);
        items.put(name, item);
    }


    @Override
    public Iterator<MenuItem> iterator() {
        return items.values().iterator();
    }
}
