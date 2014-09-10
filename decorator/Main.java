package com.kmcheung.designpattern.decorator;
public class Main {
    public static void main(String[] args) {
        Beverage b = new Espresso();
        System.out.println(b.getDescription() + " $"+b.cost());

        Beverage b2 = new Espresso();
        b2 = new Mocha(b2);
        b2 = new Mocha(b2);
        b2 = new Whip(b2);
        System.out.println(b2.getDescription() + " $"+b2.cost());

        Beverage b3 = new HouseBlend();
        b3 = new Soy(b3);
        b3 = new Mocha(b3);
        b3 = new Whip(b3);
        System.out.println(b3.getDescription() + " $"+b3.cost());
    }
}
