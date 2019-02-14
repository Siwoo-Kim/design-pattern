package com.siwoo.designpattern.decorator;

import com.siwoo.designpattern.decorator.berverage.*;

public class Main {

    public static void main(String[] args) {
//        Component component = new ConcreteDecorator(new ComponentTarget());
//        component.methodA();
//        component.methodB();

        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
        beverage = new Mocha(beverage);
        beverage = new Mocha(beverage);
        beverage = new Whip(beverage);
        beverage = new SmallSizeDecorator(beverage);
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
        beverage = new HouseBlend();
        beverage = new Soy(beverage);
        beverage = new Mocha(beverage);
        beverage = new Whip(beverage);
        beverage = new GrandeSizeDecorator(beverage);
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
    }
}
