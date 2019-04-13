package com.siwoo.designpattern.iterator_composition;

public class MenuItem extends MenuComponent {
    String name;
    boolean vegetarian;
    double price;

    public MenuItem(String name, boolean vegetarian, double price) {
        this.name = name;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "name='" + name + '\'' +
                ", vegetarian=" + vegetarian +
                ", price=" + price +
                '}';
    }

    @Override
    public void print() {
        System.out.println(toString());
    }

    public Iterator iterator() {
        return new NullIterator();
    }


    private class NullIterator implements Iterator {
        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public Object next() {
            return null;
        }
    }
}
