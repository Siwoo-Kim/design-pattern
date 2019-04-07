package com.siwoo.designpattern.iterator_composition;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class MenuComposite extends MenuComponent {
    List<MenuComponent> components = new ArrayList<>();
    private String name;

    public MenuComposite(String name) {
        this.name = name;
    }

    @Override
    public void add(MenuComponent component) {
        components.add(component);
    }

    @Override
    public void remove(MenuComponent component) {
        components.remove(component);
    }

    @Override
    public MenuComponent getChild(int i) {
        return components.get(i);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public Iterator iterator() {
        return new CompositeIterator(components.iterator());
    }

    public class CompositeIterator implements Iterator {
        private Stack stack = new Stack();

        public CompositeIterator(Iterator iterator) {
            stack.push(iterator);
        }

        @Override
        public Object next() {
            if (hasNext()) {
                Iterator itr = (Iterator) stack.peek();
                MenuComponent component = (MenuComponent) itr.next();
                if (component instanceof MenuComposite) {
                    stack.push(((MenuComposite) component).iterator());
                }
                return component;
            } else {
                return null;
            }
        }

        @Override
        public boolean hasNext() {
            if (stack.isEmpty()) {
                return false;
            } else {
                Iterator itr = (Iterator) stack.peek();
                if (!itr.hasNext()) {
                    stack.pop();
                    return hasNext();
                } else {
                    return true;
                }
            }
        }
    }

    @Override
    public void print() {
        System.out.println(name);
        System.out.println("==============================");
        Iterator iterator = components.iterator();
        while (iterator.hasNext()) {
            MenuComponent component = (MenuComponent) iterator.next();
            component.print();
        }
    }
}
