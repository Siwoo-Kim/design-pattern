package com.siwoo.designpattern.templatemethod;

public class Coffee extends CaffeineBeverage {

    void brew() {
        System.out.println("Brew Coffee grinds.");
    }

    void addCondiments() {
        System.out.println("Add sugar and milk.");
    }

}
