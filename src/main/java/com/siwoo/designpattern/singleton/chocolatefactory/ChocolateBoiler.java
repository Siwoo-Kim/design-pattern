package com.siwoo.designpattern.singleton.chocolatefactory;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;
    private static volatile ChocolateBoiler instance;

    public static ChocolateBoiler getInstance() {
        if (instance == null) {
            synchronized (ChocolateBoiler.class) {
                if (instance == null)
                    instance = new ChocolateBoiler();
            }
        }
        return instance;
    }


    public static void main(String[] args) {
        Runnable r1 = () -> {
            ChocolateBoiler instance = ChocolateBoiler.getInstance();
            System.out.println("hash 1: " + instance.hashCode());
        };

        Runnable r2 = () -> {
            ChocolateBoiler instance = ChocolateBoiler.getInstance();
            System.out.println("hash 2: " + instance.hashCode());
        };

        for (int i = 0; i < 10; i++) {
            //hash 1: 448899632
            //hash 2: 7952345
            //hash 1: 448899632
            //hash 2: 448899632
            //hash 1: 448899632
            //hash 2: 448899632
            new Thread(r1).start();
            new Thread(r2).start();
        }
    }

    private ChocolateBoiler() {
        this.empty = true;
        this.boiled = false;
    }

    public void fill() {
        if (empty) {
            empty = false;
            boiled = false;
        }
    }

    public void drain() {
        if (!empty && boiled) {
            empty = true;
        }
    }

    private void boil() {
        if (!empty && !boiled) {
            boiled = true;
        }
    }

}
