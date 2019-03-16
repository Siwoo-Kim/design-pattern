package com.siwoo.designpattern.factory;

import com.siwoo.designpattern.factory.pizza.*;

public abstract class PizzaStore {

    SimplePizzaFactory factory;

//    public PizzaStore(SimplePizzaFactory factory) {
//        this.factory = factory;
//    }

    Pizza order(String type) {
        //Pizza pizza = factory.factoryMethod(type);
        Pizza pizza = factoryMethod(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    //factory method
    protected abstract Pizza factoryMethod(String type);

    public static void main(String[] args) {
        PizzaStore store = new NYPizzaStore();
        System.out.println(store.factoryMethod("cheese").getClass());
        store = new ChicagoPizzaStore();
        System.out.println(store.factoryMethod("cheese").getClass());
    }
}
