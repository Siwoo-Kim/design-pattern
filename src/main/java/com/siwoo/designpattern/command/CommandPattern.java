package com.siwoo.designpattern.command;

import com.siwoo.designpattern.RemoteControl;

public class CommandPattern {

    public static void main(String[] args) {
//        //Invoker 클래스
//        SimpleRemoteControl control = new SimpleRemoteControl();
//        //Receiver 실제 Function 을 가진 객체,
//        Light light = new Light();
//        //요구 사항을 캡슐화한 객체
//        Command command = new LightOnCommand(light);
//
//        control.setCommand(command);
//        control.buttonWasPressed();
//
//        GarageDoor door = new GarageDoor();
//        command = new GarageDoorOpenCommand(door);
//        control.setCommand(command);
//        control.buttonWasPressed();

        RemoteControl control = new RemoteControl();
        Light room = new Light();
        Light kitchen = new Light();
        GarageDoor door = new GarageDoor();
        Stereo stereo = new Stereo();

        Command roomRightOn = new LightOnCommand(room);
        Command roomRightOff = new LightOffCommand(room);
        Command kitchenRightOn = new LightOnCommand(kitchen);
        Command kitchenRightOff = new LightOffCommand(kitchen);
        StereoOnWithCDCommand stereoSetOn = new StereoOnWithCDCommand(stereo);
        StereoOffWithCDCommand stereoSetOff = new StereoOffWithCDCommand(stereo);

        control.setCommand(0, roomRightOn, roomRightOff);
        control.setCommand(1, kitchenRightOn, kitchenRightOff);
        control.setCommand(2, stereoSetOn, stereoSetOff);

        System.out.println(control);

        control.onButtonWasPushed(0);
        control.offButtonWasPushed(0);
        control.undoButtonWasPushed();
//        control.onButtonWasPushed(1);
//        control.offButtonWasPushed(1);
//        control.onButtonWasPushed(2);
//        control.offButtonWasPushed(2);
//        control.undoButtonWasPushed();
    }
}
