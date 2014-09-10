package com.kmcheung.designpattern.strategy;
public class Main {
    public static void main(String args[]) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();
    }
}
