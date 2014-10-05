package com.kmcheung.designpattern.command;

public class BoomboxMediumCommand implements Command {
    Boombox boombox;
    int prevPower;
    
    public BoomboxMediumCommand(Boombox boombox) {
        this.boombox = boombox;
    }
    
    public void execute() {
        prevPower = boombox.getPower();
        boombox.medium();
    }
    
    public void undo() {
        if (prevPower == Boombox.HIGH) {
            boombox.high();
        } else if (prevPower == Boombox.MEDIUM) {
            boombox.medium();
        } else if (prevPower == Boombox.LOW) {
            boombox.low();
        } else if (prevPower == Boombox.OFF) {
            boombox.off();
        }
    }
}
