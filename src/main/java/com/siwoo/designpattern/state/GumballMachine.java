package com.siwoo.designpattern.state;


import com.siwoo.designpattern.proxy.remote.GumballMachineRemote;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote {

    private final String location;
    private State currentState;
    State noCoinState;
    State hasCoinState;
    State soldOutState;
    State soldState;
    State winnerState;
    int numOfGumballs = 0;

    public GumballMachine(String location, int numberOfGumball) throws RemoteException {
        super();
        this.location = location;
        noCoinState = new NoCoin(this);
        hasCoinState = new HasCoin(this);
        soldState = new Sold(this);
        soldOutState = new SoldOut(this);
        winnerState = new WinnerState(this);
        numOfGumballs = numberOfGumball;
        if (numOfGumballs > 0)
            currentState = noCoinState;
    }

    void setState(State state) {
        this.currentState = state;
    }

    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot.");
        if (numOfGumballs != 0)
            numOfGumballs--;
    }

    int getNumberOfBalls() {
        return numOfGumballs;
    }

    State getSoldOut() {
        return soldOutState;
    }

    State getHasCoin() {
        return hasCoinState;
    }

    State getNoCoin() {
        return noCoinState;
    }

    State getSold() {
        return soldState;
    }

    public void insertCoin() {
        currentState.insertCoin();
    }

    public void ejectCoin() {
        currentState.ejectCoin();
    }

    public void turnCrank() {
        currentState.turnCrank();
        currentState.dispense();
    }

    public void refill(int amount) {
        currentState.refill(amount);
    }

    public State getCurrentState() {
        return currentState;
    }

    public int getNumOfGumballs() {
        return numOfGumballs;
    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "GumballMachineRemote{" +
                "state=" + currentState +
                ", numOfGumballs=" + numOfGumballs +
                '}';
    }
}
