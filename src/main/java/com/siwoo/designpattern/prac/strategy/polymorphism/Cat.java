package com.siwoo.designpattern.prac.strategy.polymorphism;

public class Cat implements Animal {
    @Override
    public void sound() {
        meow();
    }

    private void meow() {
        System.out.println("meow");
    }
}
