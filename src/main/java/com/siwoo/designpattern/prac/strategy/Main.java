package com.siwoo.designpattern.prac.strategy;

import com.siwoo.designpattern.prac.strategy.duck.duckinstance.*;
import com.siwoo.designpattern.prac.strategy.duck.strategy.FlyWithRocket;
import com.siwoo.designpattern.prac.strategy.duck.strategy.Quack;
import com.siwoo.designpattern.prac.strategy.game.character.Character;
import com.siwoo.designpattern.prac.strategy.game.character.Knight;
import com.siwoo.designpattern.prac.strategy.game.character.Queen;
import com.siwoo.designpattern.prac.strategy.polymorphism.Animal;
import com.siwoo.designpattern.prac.strategy.polymorphism.Cat;
import com.siwoo.designpattern.prac.strategy.polymorphism.Dog;

public class Main {

    public static void main(String[] args) {
//        Animal animal = new Dog();
//        animal.sound();
//        animal = getAnimal("cat");
//        animal.sound();

        DuckContext duck = new MallardDuck();
        duck.quack();
        duck.fly();
        duck = new RedheadDuck();
        duck.quack();
        duck.fly();
        duck = new RubberDuck();
        duck.quack();
        duck.fly();
        duck.setFlyStrategy(new FlyWithRocket());
        duck.fly();

        CallDuck callDuck = new CallDuck();
        callDuck.setQuackStrategy(new Quack());
        callDuck.call();

        Character character = new Knight();
        character.fight();
        character = new Queen();
        character.fight();
    }

    private static Animal getAnimal(String type) {
        if (type.equals("cat"))
            return new Cat();
        else
            return new Dog();
    }
}
