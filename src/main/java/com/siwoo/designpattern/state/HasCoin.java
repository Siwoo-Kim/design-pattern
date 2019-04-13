package com.siwoo.designpattern.state;

import java.util.Random;

public class HasCoin implements State {
    Random randomWinner = new Random(System.currentTimeMillis());
    private transient final GumballMachine machine;

    public HasCoin(GumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Insert only one coin.");
    }

    @Override
    public void ejectCoin() {
        System.out.println("Eject the coin.");
        machine.setState(machine.getNoCoin());
    }

    @Override
    public void turnCrank() {
        System.out.println("Taking out the gumball. Please wait.");
        int winner = randomWinner.nextInt(10);
        if ((winner == 0) && (machine.getNumberOfBalls() > 1)) {
            machine.setState(machine.winnerState);
        } else {
            machine.setState(machine.getSold());
        }
    }

    @Override
    public void dispense() {
        System.out.println("System error.");
    }

    @Override
    public void refill(int amount) {
        System.out.println("Cannot refill when machine is running.");
    }
}
