package com.siwoo.designpattern.proxy;


public class GumballMachine {

    private final int count;
    private String location;

    public GumballMachine(String location, int count) {
        this.location = location;
        this.count = count;
    }

    public String getLocation() {
        return location;
    }

    public int getCount() {
        return count;
    }

    public String getState() {
        return toString();
    }
}
