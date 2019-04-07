package com.siwoo.designpattern.iterator_composition;

public class Waitress {
    MenuComponent menus;

    public Waitress(MenuComponent menus) {
        this.menus = menus;
    }

    public void printMenu() {
        menus.print();
    }
//    Menu pancakeHouseMenu;
//    Menu dinerMenu;
//    Menu cafeMenu;
//
//    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu, Menu cafeMenu) {
//        this.pancakeHouseMenu = pancakeHouseMenu;
//        this.dinerMenu = dinerMenu;
//        this.cafeMenu = cafeMenu;
//    }
//
//    public void printMenu() {
//        java.util.Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.iterator();
//        java.util.Iterator<MenuItem> dinerIterator = dinerMenu.iterator();
//        java.util.Iterator<MenuItem> cafeIterator = cafeMenu.iterator();
//        System.out.println("Breakfast menu.");
//        printMenu(pancakeIterator);
//        System.out.println("Lunch menu.");
//        printMenu(dinerIterator);
//        System.out.println("Cafe menu.");
//        printMenu(cafeIterator);
//    }
//
//    private void printMenu(java.util.Iterator<MenuItem> itemIterator) {
//        while (itemIterator.hasNext()) {
//            System.out.println(itemIterator.next());
//        }
//    }
}
