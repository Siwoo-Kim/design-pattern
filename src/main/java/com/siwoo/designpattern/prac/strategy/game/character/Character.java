package com.siwoo.designpattern.prac.strategy.game.character;

import com.siwoo.designpattern.prac.strategy.game.weapon.Weapon;

public abstract class Character {
    //A family of algorithms
    private Weapon weapon;

    public void fight() {
        weapon.perform();
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
