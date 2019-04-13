package com.siwoo.designpattern.state;

import java.rmi.RemoteException;

public class GumballMachineTest {

    public static void main(String[] args) throws RemoteException {
        GumballMachine machine = new GumballMachine("Seattle", 5);

        System.out.println(machine);
        machine.insertCoin();
        machine.turnCrank();
        System.out.println(machine);

        machine.insertCoin();
        machine.ejectCoin();
        machine.turnCrank();

        System.out.println(machine);

        machine.insertCoin();
        machine.turnCrank();
        machine.insertCoin();
        machine.turnCrank();
        machine.ejectCoin();

        System.out.println(machine);

        machine.insertCoin();
        machine.insertCoin();

        machine.refill(5);
        machine.turnCrank();
        machine.insertCoin();
        machine.turnCrank();

        machine.refill(5);
        machine.insertCoin();
        machine.turnCrank();

        System.out.println(machine);
    }
}
