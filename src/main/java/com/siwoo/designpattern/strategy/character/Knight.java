package com.siwoo.designpattern.strategy.character;

import com.siwoo.designpattern.strategy.weapon.AxeBehavior;

public class Knight extends Character {

    public Knight() {
        setWeapon(new AxeBehavior());
    }
}
