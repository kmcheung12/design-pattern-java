package com.kmcheung.designpattern.strategy;
public class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("Quack quack");
    }
}
