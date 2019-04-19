package com.siwoo.designpattern.compound.bpm;

import com.siwoo.designpattern.compound.bpm.controller.BeatController;
import com.siwoo.designpattern.compound.bpm.controller.Controller;
import com.siwoo.designpattern.compound.bpm.model.Beat;
import com.siwoo.designpattern.compound.bpm.model.BeatModel;

/**
 * Created by sm123tt@gmail.com on 2019-04-19
 * Project : design-pattern
 * Github : http://github.com/Siwoo-Kim
 */

public class Main {

    public static void main(String[] args) {
        Beat beat = new BeatModel();
        Controller controller = new BeatController(beat);
    }
}
