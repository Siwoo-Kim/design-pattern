package com.siwoo.designpattern.factory.pizza;

public abstract class Pizza {
    String name;

    public void prepare() {
        System.out.println("prepare");
    };

    public void bake() {
        System.out.println("bake");
    }

    public void cut() {
        System.out.println("cut");
    }

    public void box() {
        System.out.println("box");
    }
}
