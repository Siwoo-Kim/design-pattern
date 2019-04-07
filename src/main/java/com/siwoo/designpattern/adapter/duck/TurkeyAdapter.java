package com.siwoo.designpattern.adapter.duck;

import com.siwoo.designpattern.adapter.turkey.Turkey;

public class TurkeyAdapter implements Duck {
    private static final int SHORT_FLIGHT_SUPPLEMENT = 5;
    private Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < SHORT_FLIGHT_SUPPLEMENT; i++) {
            turkey.fly();
        }
    }
}
