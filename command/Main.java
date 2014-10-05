package com.kmcheung.designpattern.command;

public class Main {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();
        Boombox boombox = new Boombox("Dining room");
        
        BoomboxHighCommand boomboxHigh = new BoomboxHighCommand(boombox);
        BoomboxMediumCommand boomboxMedium = new BoomboxMediumCommand(boombox);
        BoomboxLowCommand boomboxLow = new BoomboxLowCommand(boombox);
        BoomboxOffCommand boomboxOff = new BoomboxOffCommand(boombox);
        
        remote.setCommand(0, boomboxHigh, boomboxOff);
        remote.setCommand(1, boomboxMedium, boomboxOff);
        remote.setCommand(2, boomboxLow, boomboxOff);
        
        remote.onButtonPushed(0);
        remote.offButtonPushed(0);
        System.out.println(remote);
        remote.undoButtonPushed();

        remote.onButtonPushed(0);
        System.out.println(remote);
        remote.undoButtonPushed();
    }
}
