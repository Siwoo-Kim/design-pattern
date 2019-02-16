package com.siwoo.designpattern.prac.strategy.duck.duckinstance;

import com.siwoo.designpattern.prac.strategy.duck.strategy.QuackStrategy;

public class CallDuck {
    private QuackStrategy quackStrategy;

    public void call() {
        quackStrategy.perform();
    }

    public void setQuackStrategy(QuackStrategy quackStrategy) {
        this.quackStrategy = quackStrategy;
    }
}
