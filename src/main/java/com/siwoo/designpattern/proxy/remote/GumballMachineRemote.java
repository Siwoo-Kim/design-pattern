package com.siwoo.designpattern.proxy.remote;

import com.siwoo.designpattern.state.State;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface GumballMachineRemote extends Remote {
    int getNumOfGumballs() throws RemoteException;
    String getLocation() throws RemoteException;
    State getCurrentState() throws RemoteException;
}

