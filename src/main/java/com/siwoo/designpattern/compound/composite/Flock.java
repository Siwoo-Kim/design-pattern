package com.siwoo.designpattern.compound.composite;

import com.siwoo.designpattern.compound.observable.Observer;
import com.siwoo.designpattern.compound.strategy.Quackable;
import com.siwoo.designpattern.prac.strategy.duck.strategy.Quack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Flock implements Quackable {
    List<Quackable> quackers = new ArrayList<>();

    public void add(Quackable quacker) {
        quackers.add(quacker);
    }

    @Override
    public void quack() {
        Iterator itr = quackers.iterator();
        while (itr.hasNext()) {
            Quackable quacker = (Quackable) itr.next();
            quacker.quack();
            quacker.notifyObservers();
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        for (Quackable quacker: quackers) {
            quacker.registerObserver(observer);
        }
    }


    @Override
    public void notifyObservers() {

    }
}
