package com.siwoo.designpattern.command;

public class Stereo {

    private int volume;

    public void on() {
        System.out.println("Stereo on.");
    }

    public void off() {
        System.out.println("Stereo OFF.");
    }

    public void setCD() {
        System.out.println("Set CD in.");
    }


    public void outCD() {
        System.out.println("Set CD out.");
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Set volume = " + volume);
    }
}
