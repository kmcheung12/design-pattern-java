package com.kmcheung.designpattern.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        s.printSomeShit();
    }
}
