package com.siwoo.designpattern.proxy.remote;

import com.siwoo.designpattern.state.GumballMachine;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by sm123tt@gmail.com on 2019-04-13
 * Project : design-pattern
 * Github : http://github.com/Siwoo-Kim
 */

public class RemoteMain {

    public static void main(String[] args) throws Exception {
        args = getArgs();

        int count = Integer.parseInt(args[1]);
        GumballMachine machine = new GumballMachine(args[0], count);

        MyRemoteImpl server = new MyRemoteImpl();
        Registry registry = LocateRegistry.createRegistry(1099);
        registry.rebind("remoteHello", server);
        registry.rebind("gumballMachine", machine);

    }

    private static String[] getArgs() {
        return new String[]{"Seattle", "100"};
    }
}
