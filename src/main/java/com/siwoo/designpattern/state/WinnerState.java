package com.siwoo.designpattern.state;

public class WinnerState implements State {

    private transient final GumballMachine machine;

    public WinnerState(GumballMachine machine) {
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
        System.out.println("Congratulation! You get free gumball.");
        machine.releaseBall();
        if (machine.getNumberOfBalls() == 0)
            machine.setState(machine.soldOutState);
        else {
            machine.releaseBall();
            if (machine.getNumberOfBalls() > 0)
                machine.setState(machine.noCoinState);
            else {
                System.out.println("Oops, out of gumballs!");
                machine.setState(machine.getSoldOut());
            }
        }
    }

    @Override
    public void refill(int amount) {
        System.out.println("Cannot refill when machine is running.");
    }
}
