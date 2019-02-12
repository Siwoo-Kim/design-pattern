package com.siwoo.designpattern.strategy.weapon;


public class AxeBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("Axe");
    }

}
