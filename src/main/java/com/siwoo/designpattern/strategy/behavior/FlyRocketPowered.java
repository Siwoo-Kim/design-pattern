package com.siwoo.designpattern.strategy.behavior;

//변하는 부분을 분리한다.
//인터페이스에 맞춰 프로그래밍한다.
public class FlyRocketPowered implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Rocket fly");
    }
}
