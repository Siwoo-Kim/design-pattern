package com.siwoo.designpattern.strategy.weapon;

public class SwordBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("sword");
    }
}
