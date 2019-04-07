package com.siwoo.designpattern.adapter.iterator;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * Adapter
 * @param <E>
 */
public class EnumerationIterator<E> implements Iterator<E> {
    private Enumeration<E> enumeration;

    public EnumerationIterator(Enumeration<E> enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public E next() {
        return enumeration.nextElement();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
