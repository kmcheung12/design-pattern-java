package com.kmcheung.designpattern.factory;

public class Main {
    public static void main (String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ordered a " +pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Ordered a " +pizza.getName() + "\n");
    }
}
