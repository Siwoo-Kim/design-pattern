package com.siwoo.designpattern.prac.strategy.game.weapon;

public class Sword implements Weapon {
    @Override
    public void perform() {
        System.out.println("sword");
    }
}
