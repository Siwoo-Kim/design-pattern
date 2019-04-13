package com.siwoo.designpattern.state;


public class SoldOut implements State {
    private transient GumballMachine machine;

    public SoldOut(GumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Gumballs are Sold out.");
    }

    @Override
    public void ejectCoin() {
        System.out.println("You didn't insert coin.");
    }

    @Override
    public void turnCrank() {
        System.out.println("Sold out.");
    }

    @Override
    public void dispense() {
        System.out.println("Sold out.");
    }

    @Override
    public void refill(int amount) {
        System.out.println("Refill gumballs.");
        machine.numOfGumballs += amount;
        machine.setState(machine.noCoinState);
    }
}
