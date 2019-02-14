package com.siwoo.designpattern.decorator.berverage;

//데코레이터 클래스는 타겟 클래스의 수퍼 클래스를 확장해야 한다.
public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
