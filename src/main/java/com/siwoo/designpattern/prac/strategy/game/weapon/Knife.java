package com.siwoo.designpattern.prac.strategy.game.weapon;


public class Knife implements Weapon {
    @Override
    public void perform() {
        System.out.println("knife.");
    }
}
