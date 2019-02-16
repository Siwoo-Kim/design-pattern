package com.siwoo.designpattern.prac.strategy.duck.duckinstance;

public abstract class AbstractDuck {

    void swim() {
        System.out.println("swim");
    }

    abstract void display();

    //상속은 슈퍼 클래스의 변경시 하위 클래스에 영향이 끼친다.
    abstract void fly();

}
