package com.siwoo.designpattern.strategy.character;


import com.siwoo.designpattern.strategy.weapon.SwordBehavior;

public class King extends Character {

    public King() {
        setWeapon(new SwordBehavior());
    }
}
