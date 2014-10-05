package com.kmcheung.designpattern.command;

public class BoomboxLowCommand implements Command {
    Boombox boombox;
    int prevPower;
    
    public BoomboxLowCommand(Boombox boombox) {
        this.boombox = boombox;
    }
    
    public void execute() {
        prevPower = boombox.getPower();
        boombox.low();
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
