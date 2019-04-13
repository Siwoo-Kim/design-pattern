package com.siwoo.designpattern.proxy;

import com.siwoo.designpattern.proxy.remote.GumballMachineRemote;

import java.rmi.RemoteException;

public class GumballMonitor {
    GumballMachineRemote machine;

    public GumballMonitor(GumballMachineRemote machine) {
        this.machine = machine;
    }

    public void report() {
        try {
            System.out.println("location: " + machine.getLocation());
            System.out.println("count: " + machine.getNumOfGumballs());
            System.out.println("state: " + machine.getCurrentState());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
