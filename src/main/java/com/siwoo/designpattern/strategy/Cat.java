package com.siwoo.designpattern.strategy;

public class Cat implements Animal {

    @Override
    public void makeSound() {
        meow();
    }

    private void meow() {
        System.out.println("meow");
    }
}
