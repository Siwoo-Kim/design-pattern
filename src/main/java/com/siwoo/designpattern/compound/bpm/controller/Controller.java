package com.siwoo.designpattern.compound.bpm.controller;

public interface Controller {
    void start();
    void stop();
    void increaseBPM();
    void decreaseBPM();
    void setBPM(int bpm);
}
