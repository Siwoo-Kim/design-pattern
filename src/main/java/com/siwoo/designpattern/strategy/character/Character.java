package com.siwoo.designpattern.strategy.character;

import com.siwoo.designpattern.strategy.weapon.WeaponBehavior;

//인터페이스(상위타입) 에 맞춰서 프로그래밍한다.
public abstract class Character {

    //변하는 부분을 분리한다.
    //상속보다는 구성을 활용한다.
    protected WeaponBehavior weapon;

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }

    public void fight() {
        weapon.useWeapon();
    }

}
