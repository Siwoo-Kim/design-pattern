package com.siwoo.designpattern.prac;

import com.siwoo.designpattern.prac.decorator.CommentDecorator;
import com.siwoo.designpattern.prac.decorator.Component;
import com.siwoo.designpattern.prac.decorator.HtmlComponent;
import com.siwoo.designpattern.prac.decorator.beverage.Beverage;
import com.siwoo.designpattern.prac.decorator.beverage.HouseBlend;
import com.siwoo.designpattern.prac.decorator.beverage.decorator.Mocha;
import com.siwoo.designpattern.prac.decorator.beverage.decorator.Soy;
import com.siwoo.designpattern.prac.decorator.beverage.decorator.Whip;

public class Main {

    public static void main(String[] args) {
        Beverage beverage = new Whip(new HouseBlend());
        beverage.setSize(Beverage.SIZE.VENTI);
        System.out.println(beverage.cost());
        System.out.println(beverage.getDescription());
        beverage = new Mocha(beverage);
        System.out.println(beverage.cost());
        System.out.println(beverage.getDescription());
        beverage = new Mocha(beverage);
        System.out.println(beverage.cost());
        System.out.println(beverage.getDescription());
        beverage = new Soy(beverage);
        System.out.println(beverage.cost());
        System.out.println(beverage.getDescription());

//        System.out.println(beverage.cost());
//        beverage.setMilk(true);
//        beverage.setMocha(true);
//        System.out.println(beverage.cost());

        Component component = new CommentDecorator(new HtmlComponent());
        System.out.println(component.getName());
    }
}
