package com.siwoo.designpattern.compound;

import com.siwoo.designpattern.compound.adapter.GooseAdapter;
import com.siwoo.designpattern.compound.composite.Flock;
import com.siwoo.designpattern.compound.decorator.QuackCounter;
import com.siwoo.designpattern.compound.factory.AbstractDuckFactory;
import com.siwoo.designpattern.compound.factory.CountingDuckFactory;
import com.siwoo.designpattern.compound.model.*;
import com.siwoo.designpattern.compound.observable.Quackologist;
import com.siwoo.designpattern.compound.strategy.Quackable;
import com.siwoo.designpattern.prac.strategy.duck.strategy.Quack;

public class DuckSimulator {

    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        simulator.simulate(duckFactory);
    }

    private void simulate(AbstractDuckFactory duckFactory) {
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());

        Flock flockOfDucks = new Flock();
        flockOfDucks.add(mallardDuck);
        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseDuck);

        Flock flockOfMallards = new Flock();
        Quackable mallardOne = duckFactory.createMallardDuck();
        Quackable mallardTwo = duckFactory.createMallardDuck();
        Quackable mallardThree = duckFactory.createMallardDuck();
        Quackable mallardFour = duckFactory.createMallardDuck();
        flockOfMallards.add(mallardOne);
        flockOfMallards.add(mallardTwo);
        flockOfMallards.add(mallardThree);
        flockOfMallards.add(mallardFour);
        //Composite has composite and leaf
        flockOfDucks.add(flockOfMallards);

        System.out.println("\nWhole Flock Simulator");
        Quackologist quackologist = new Quackologist();
        flockOfDucks.registerObserver(quackologist);
        duckSimulate(flockOfDucks);
        System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times.");

        System.out.println("\nMallard Flock Simulator");
        duckSimulate(flockOfMallards);
        System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times.");
    }

    private void duckSimulate(Quackable duck) {
        duck.quack();
    }

}
