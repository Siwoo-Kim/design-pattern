package com.siwoo.designpattern.decorator.berverage;


//데코레이터 클래스는 타겟 클래스의 수퍼 클래스와 같은 클래스를 확장해야 한다.
//데코레이터 클래스는 런타임시 타겟 클래스를 확장하고 추가 기능을 부여한다.
//데코레이터 클래스는 타겟 클래스의 레퍼런스를 가진다.
public class Whip extends CondimentDecorator{
    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return 0.10D + beverage.cost();
    }
}
