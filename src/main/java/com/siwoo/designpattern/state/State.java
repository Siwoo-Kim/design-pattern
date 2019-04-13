package com.siwoo.designpattern.state;

import java.io.Serializable;

public interface State extends Serializable {
    void insertCoin();
    void ejectCoin();
    void turnCrank();
    void dispense();
    void refill(int amount);
}
