package com.siwoo.designpattern.factory.pizza;

//객체 생성 부분을 캡슐화한 클래스.
public class SimplePizzaFactory {

    public Pizza factoryMethod(String type) {
        Pizza pizza = null;
        //객체 생성부분을 캡슐화 한다.
        if (type.equals("cheese"))
            pizza = new CheesePizza();
        else if (type.equals("pepperoni"))
            pizza = new PepperoniPizza();
        else if (type.equals("clam"))
            pizza = new ClamPizza();
        return pizza;
    }
}
