package com.siwoo.designpattern.decorator.berverage;

//추상 클래스
//데코레이터는 타겟 클래스와 같은 수퍼 클래스를 상속, 확장하여야 한다.
public abstract class Beverage {
    String description = "no description";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
