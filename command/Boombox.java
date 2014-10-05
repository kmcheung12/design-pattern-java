package com.kmcheung.designpattern.command;

public class Boombox {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    String location;
    int speed;
    
    public Boombox(String location) {
        this.location = location;
        speed = OFF;
    }
    
    public void high() {
        speed = HIGH;
    }
    
    public void medium() {
        speed = MEDIUM;
    }
    
    public void low() {
        speed = LOW;
    }
    
    public void off() {
        speed = OFF;
    }

    public int getPower() {
        return speed;
    }
}

