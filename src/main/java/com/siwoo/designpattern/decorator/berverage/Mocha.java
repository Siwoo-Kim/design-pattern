package com.siwoo.designpattern.decorator.berverage;

//데코레이터 클래스는 타겟 클래스와 같은 수퍼 클래스를 확장해야 한다.
//데코레이터 클래스는 런타임에 특정 클래스를 상속하고, 추가 기능을 부여한다.
//데코레이터 클래스는 타겟 클래스에 대한 레퍼런스를 가지고 있다.
public class Mocha extends CondimentDecorator {
    private Beverage target;

    public Mocha(Beverage beverage) {
        this.target = beverage;
    }

    @Override
    public String getDescription() {
        return target.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return 0.20d + target.cost();
    }
}
