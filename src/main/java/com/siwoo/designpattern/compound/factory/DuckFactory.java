package com.siwoo.designpattern.compound.factory;

import com.siwoo.designpattern.compound.model.DuckCall;
import com.siwoo.designpattern.compound.model.MallardDuck;
import com.siwoo.designpattern.compound.model.RedheadDuck;
import com.siwoo.designpattern.compound.model.RubberDuck;
import com.siwoo.designpattern.compound.strategy.Quackable;

public class DuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable createRedheadDuck() {
        return new RedheadDuck();
    }

    @Override
    public Quackable createDuckCall() {
        return new DuckCall();
    }

    @Override
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }
}
