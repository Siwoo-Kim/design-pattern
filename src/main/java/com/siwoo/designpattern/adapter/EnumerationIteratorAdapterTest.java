package com.siwoo.designpattern.adapter;

import com.siwoo.designpattern.adapter.iterator.IteratorEnumeration;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

public class EnumerationIteratorAdapterTest {
    private static List<String> stringList = new ArrayList<>();

    static  {
        stringList.add("TEST1");
        stringList.add("TEST2");
    }

    public static void main(String[] args) {
        testAdaptorForEnumerationAndIterator();
    }

    public static void testAdaptorForEnumerationAndIterator() {
        Iterator<String> iterator = stringList.iterator();
        Enumeration<String> enumeration = new IteratorEnumeration<>(iterator);
        testEnumeration(enumeration);
    }

    private static void testEnumeration(Enumeration<String> enumeration) {
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}
