package com.siwoo.designpattern.prac.decorator.beverage.decorator;

import com.siwoo.designpattern.prac.decorator.beverage.Beverage;

public abstract class Condiment extends Beverage {

    public abstract void setBeverage(Beverage beverage);
    public abstract String getDescription();
}
