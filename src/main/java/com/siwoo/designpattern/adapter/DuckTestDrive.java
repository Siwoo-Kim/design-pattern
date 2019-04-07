package com.siwoo.designpattern.adapter;

import com.siwoo.designpattern.adapter.duck.Duck;
import com.siwoo.designpattern.adapter.duck.MallardDuck;
import com.siwoo.designpattern.adapter.duck.TurkeyAdapter;
import com.siwoo.designpattern.adapter.turkey.Turkey;
import com.siwoo.designpattern.adapter.turkey.WildTurkey;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Stack;
import java.util.Vector;

public class DuckTestDrive {

    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        Turkey turkey = new WildTurkey();
        Duck adapter = new TurkeyAdapter(turkey);

        turkey.gobble();
        turkey.fly();

        testDuck(duck);
        testDuck(adapter);
    }

    private static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }

}
