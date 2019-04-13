package com.siwoo.designpattern.proxy.clinet;

import com.siwoo.designpattern.proxy.GumballMachine;
import com.siwoo.designpattern.proxy.GumballMonitor;
import com.siwoo.designpattern.proxy.remote.GumballMachineRemote;
import com.siwoo.designpattern.proxy.remote.MyRemote;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * Created by sm123tt@gmail.com on 2019-04-13
 * Project : design-pattern
 * Github : http://github.com/Siwoo-Kim
 */

public class MyClient {

    public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException {
        new MyClient().go();
    }

    private void go() throws RemoteException, NotBoundException, MalformedURLException {
        Registry registry = LocateRegistry.getRegistry();
        MyRemote service = (MyRemote) registry.lookup("remoteHello");
        String s = service.sayHello();
        System.out.println(s);

        GumballMachineRemote machine = (GumballMachineRemote) registry.lookup("gumballMachine");
        GumballMonitor monitor = new GumballMonitor(machine);
        monitor.report();
    }
}
