package com.siwoo.designpattern.strategy.duck;

import com.siwoo.designpattern.strategy.behavior.FlyBehavior;
import com.siwoo.designpattern.strategy.behavior.QuackBehavior;

//인터페이스에 맞춰 프로그래밍한다.
public abstract class Duck {

    //변하는 부분과 변하지 않는 부분을 분리한다.
        //변하는 부분은 인터페이스로 분리. - 변하는 부분은 다른 클래스에 위임한다.
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void quack() {
        quackBehavior.quack();
    }

    public void fly() {
        flyBehavior.fly();
    }

    public void swim() {
        System.out.println("swim");
    }

    public void display() {
        System.out.println("AbstractDuck");
    }
}
