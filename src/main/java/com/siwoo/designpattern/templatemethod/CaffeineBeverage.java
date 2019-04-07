package com.siwoo.designpattern.templatemethod;

public abstract class CaffeineBeverage {

    //template method
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (wantCondiments()) { //hook
            addCondiments();
        }
    }

    protected boolean wantCondiments() {
        return true;
    }

    abstract void brew();

    abstract void addCondiments();

    private void boilWater() {
        System.out.println("Boil Water.");
    }

    private void pourInCup() {
        System.out.println("Pour in cup.");
    }

}
