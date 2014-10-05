package com.kmcheung.designpattern.command;

public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    int commandSlots = 7;
    public RemoteControl() {
        onCommands = new Command[commandSlots];
        offCommands = new Command[commandSlots];
        
        Command nullCommand = new NullCommand();
        for (int i=0; i<commandSlots; i++) {
            onCommands[i] = nullCommand;
            offCommands[i] = nullCommand;
        }
        undoCommand = nullCommand;
    }
    
    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonPushed(int slot) {
        onCommands[slot].execute();
    }
    
    public void offButtonPushed(int slot) {
        offCommands[slot].execute();
    }
    
    public void undoButtonPushed() {
        undoCommand.undo();
    }
    
    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n----- Remote Control -----\n");
        for (int i=0; i< onCommands.length; i++) {
            stringBuff.append("[slot " + i + "] " +
                onCommands[i].getClass().getName() +
                "\t" + offCommands[i].getClass().getName() + "\n");
        }
        return stringBuff.toString();
    }
}
