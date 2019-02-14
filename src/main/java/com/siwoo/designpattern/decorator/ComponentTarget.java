package com.siwoo.designpattern.decorator;

//Target 클래스
public class ComponentTarget implements Component {

    @Override
    public void methodA() {
        System.out.println("a");
    }

    @Override
    public void methodB() {
        System.out.println("b");
    }
}
