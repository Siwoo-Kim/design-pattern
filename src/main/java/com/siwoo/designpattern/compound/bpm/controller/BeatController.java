package com.siwoo.designpattern.compound.bpm.controller;

import com.siwoo.designpattern.compound.bpm.model.Beat;
import com.siwoo.designpattern.compound.bpm.view.DJView;

public class BeatController implements Controller {
    Beat beat;
    DJView view;

    public BeatController(Beat beat) {
        this.beat = beat;
        this.view = new DJView(this, beat);
        view.createView();
        view.createControls();
        view.disableStartMenuItem();
        view.enableStartMenuItem();
        beat.init();
    }

    @Override
    public void start() {
        beat.on();
        view.disableStartMenuItem();
        view.enableStopMenuItem();
    }

    @Override
    public void stop() {
        beat.off();
        view.enableStartMenuItem();
        view.disableStopMenuItem();
    }

    @Override
    public void increaseBPM() {
        int bpm = beat.getBPM();
        beat.setBPM(bpm + 1);
    }

    @Override
    public void decreaseBPM() {
        int bpm = beat.getBPM();
        beat.setBPM(bpm - 1);
    }

    @Override
    public void setBPM(int bpm) {
        beat.setBPM(bpm);
    }
}
