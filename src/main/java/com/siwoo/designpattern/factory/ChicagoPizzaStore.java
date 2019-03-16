package com.siwoo.designpattern.factory;

import com.siwoo.designpattern.factory.pizza.*;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    protected Pizza factoryMethod(String type) {
        Pizza pizza = null;
        //객체 생성부분을 캡슐화 한다.
        if (type.equals("cheese"))
            pizza = new ChicagoCheesePizza();
        else if (type.equals("pepperoni"))
            pizza = new ChicagoPepperoniPizza();
        else if (type.equals("clam"))
            pizza = new ChicagoClamPizza();
        return pizza;
    }
}
