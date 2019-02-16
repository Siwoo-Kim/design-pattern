package com.siwoo.designpattern.prac.strategy.duck;

//상속과 다중 인터페이스 구현은 코드의 중복성을 높인다.
//하위 클래스가 Quackable 을 구현하면서 중복된 코드가 생김
public interface Quackable {
    void quack();
}
