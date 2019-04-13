package com.siwoo.designpattern.state;


public class Sold implements State {
    private transient final GumballMachine machine;

    public Sold(GumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Wait for the coming gumball.");
    }

    @Override
    public void ejectCoin() {
        System.out.println("You already got your gumball.");
    }

    @Override
    public void turnCrank() {
        System.out.println("Please turn the crank only once.");
    }

    @Override
    public void dispense() {
        machine.releaseBall();
        if (machine.getNumberOfBalls() > 0)
            machine.setState(machine.getNoCoin());
        else {
            System.out.println("Oops, out of gumballs!");
            machine.setState(machine.getSoldOut());
        }
    }

    @Override
    public void refill(int amount) {
        System.out.println("Cannot refill when machine is running.");
    }
}
