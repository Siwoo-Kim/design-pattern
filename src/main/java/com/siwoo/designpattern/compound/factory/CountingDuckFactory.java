package com.siwoo.designpattern.compound.factory;

import com.siwoo.designpattern.compound.decorator.QuackCounter;
import com.siwoo.designpattern.compound.model.DuckCall;
import com.siwoo.designpattern.compound.model.MallardDuck;
import com.siwoo.designpattern.compound.model.RedheadDuck;
import com.siwoo.designpattern.compound.model.RubberDuck;
import com.siwoo.designpattern.compound.strategy.Quackable;

public class CountingDuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCounter(new RedheadDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }
}
