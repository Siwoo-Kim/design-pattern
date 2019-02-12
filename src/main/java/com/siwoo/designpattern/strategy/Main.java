package com.siwoo.designpattern.strategy;

import com.siwoo.designpattern.strategy.behavior.FlyRocketPowered;
import com.siwoo.designpattern.strategy.character.Character;
import com.siwoo.designpattern.strategy.character.King;
import com.siwoo.designpattern.strategy.character.Knight;
import com.siwoo.designpattern.strategy.duck.Duck;
import com.siwoo.designpattern.strategy.duck.MallardDuck;
import com.siwoo.designpattern.strategy.duck.RubberDuck;
import com.siwoo.designpattern.strategy.weapon.SwordBehavior;

public class Main {

    //원칙1: 변하는 부분과 변하지 않는 부분을 분리한다.
        // 변하는 부분은 인터페이스로 분리하며, 그 인터페이스를 구현한 클래스에 위임한다.
        // -> 동적 (runtime) 으로, 다양성이 확장된다. (변하는 부분을 setter 로 할당받는다.)
    //원칙2: 인터페이스에 맞춰서 프로그래밍한다.
    public static void main(String[] args) {
//        Animal animal = new Dog();
//        animal.makeSound();
//        animal = new Cat();
//        animal.makeSound();

        Duck duck = new MallardDuck();
        duck.fly();
        duck.quack();

        duck = new RubberDuck();
        duck.fly();
        duck.quack();
        //변하는 부분을 추출하면 런타임까지 다양성이 확장된다.
        duck.setFlyBehavior(new FlyRocketPowered());
        duck.fly();

        Character character = new King();
        character.fight();
        character = new Knight();
        character.fight();
        character.setWeapon(new SwordBehavior());
        character.fight();

    }
}
