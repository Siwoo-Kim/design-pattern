package com.siwoo.designpattern.prac.strategy.game.character;

import com.siwoo.designpattern.prac.strategy.game.weapon.Sword;

public class Knight extends Character {

    public Knight() {
        setWeapon(new Sword());
    }

}
