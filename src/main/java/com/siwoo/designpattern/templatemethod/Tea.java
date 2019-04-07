package com.siwoo.designpattern.templatemethod;

public class Tea extends CaffeineBeverage{

    void addCondiments() {
        System.out.println("Add lemon.");
    }

    void brew() {
        System.out.println("Steep tea bag.");
    }
}
