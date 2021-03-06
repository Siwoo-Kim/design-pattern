package com.siwoo.designpattern.factory;

import com.siwoo.designpattern.factory.pizza.*;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza factoryMethod(String type) {
        Pizza pizza = null;
        //객체 생성부분을 캡슐화 한다.
        if (type.equals("cheese"))
            pizza = new NYCheesePizza();
        else if (type.equals("pepperoni"))
            pizza = new NYPepperoniPizza();
        else if (type.equals("clam"))
            pizza = new NYClamPizza();
        return pizza;
    }
}
