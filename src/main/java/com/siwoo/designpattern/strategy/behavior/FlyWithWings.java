package com.siwoo.designpattern.strategy.behavior;


public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("fly");
    }

}
