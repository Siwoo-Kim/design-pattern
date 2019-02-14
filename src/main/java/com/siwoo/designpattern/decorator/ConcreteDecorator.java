package com.siwoo.designpattern.decorator;

//각 테코레이터 안에는 Component (타겟) 의 레퍼런스 변수를 가지고 있다.
public class ConcreteDecorator implements ComponentDecorator {
    private Component target;

    public ConcreteDecorator(Component target) {
        this.target = target;
    }

    @Override
    public void methodA() {
        System.out.println("==========");
        target.methodA();
        System.out.println("==========");
    }

    @Override
    public void methodB() {
        System.out.println("==========");
        target.methodB();
        System.out.println("==========");
    }
}
