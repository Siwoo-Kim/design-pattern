package com.siwoo.designpattern.prac.strategy.game.character;

import com.siwoo.designpattern.prac.strategy.game.weapon.Sword;

public class Queen extends Character {

    public Queen() {
        setWeapon(new Sword());
    }
}
