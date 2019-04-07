package com.siwoo.designpattern.templatemethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by sm123tt@gmail.com on 2019-04-06
 * Project : design-pattern
 * Github : http://github.com/Siwoo-Kim
 */

public class CoffeeWithHook extends CaffeineBeverage {

    @Override
    protected boolean wantCondiments() {
        String answer = getUserInput();
        if (answer.toLowerCase().startsWith("y"))
            return true;
        else
            return false;
    }

    private String getUserInput() {
        String answer = null;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Do you want sugar and milk in your coffee? (y/n)");
        try {
            answer = in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (answer == null)
            answer = "no";
        return answer;
    }

    void brew() {
        System.out.println("Brew Coffee grinds.");
    }

    void addCondiments() {
        System.out.println("Add sugar and milk.");
    }

}
