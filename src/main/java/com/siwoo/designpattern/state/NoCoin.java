package com.siwoo.designpattern.state;

/**
 * Created by sm123tt@gmail.com on 2019-04-13
 * Project : design-pattern
 * Github : http://github.com/Siwoo-Kim
 */

public class NoCoin implements State {
    private transient final GumballMachine machine;

    public NoCoin(GumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("You insert the coin.");
        machine.setState(machine.getHasCoin());
    }

    @Override
    public void ejectCoin() {
        System.out.println("Please insert the coin.");
    }

    @Override
    public void turnCrank() {
        System.out.println("Insert the coin.");
    }

    @Override
    public void dispense() {
        System.out.println("Insert the coin.");
    }

    @Override
    public void refill(int amount) {
        System.out.println("Cannot refill when machine is running.");
    }
}
