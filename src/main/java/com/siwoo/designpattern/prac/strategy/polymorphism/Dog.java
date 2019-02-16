package com.siwoo.designpattern.prac.strategy.polymorphism;

public class Dog implements Animal {
    @Override
    public void sound() {
        bark();
    }

    private void bark() {
        System.out.println("bark");
    }
}
