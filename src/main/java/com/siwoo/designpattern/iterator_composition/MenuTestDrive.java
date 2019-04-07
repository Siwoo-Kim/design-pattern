package com.siwoo.designpattern.iterator_composition;

public class MenuTestDrive {

    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new MenuComposite("Pancake house");
        MenuComponent dinerMenu = new MenuComposite("Diner house");
        MenuComponent cafeMenu = new MenuComposite("Cafe Menu");

        MenuComponent allMenu = new MenuComposite("All menu");
        allMenu.add(pancakeHouseMenu);
        allMenu.add(dinerMenu);

        allMenu.add(cafeMenu);

        dinerMenu.add(new MenuItem("Pasta", true, 32.2));
        dinerMenu.add(new MenuItem("Apple pie", true, 12.2));

        Waitress waitress = new Waitress(allMenu);
        waitress.printMenu();
    }
}
