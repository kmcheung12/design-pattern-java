package com.kmcheung.designpattern.command;

public class NullCommand implements Command {
    public void execute() {
    //this command does nothing
    }
    public void undo() {
    //this command does nothing too
    }
}
