package com.siwoo.designpattern.strategy;

public class Dog implements Animal {

    @Override
    public void makeSound() {
        bark();
    }

    private void bark() {
        System.out.println("bark");
    }
}
