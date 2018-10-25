package model;

import commands.Command;
import commands.NoCommand;

import java.util.ArrayList;

public class RemoteControl {

    private ArrayList<Command> onCommands = new ArrayList<>();
    private ArrayList<Command> offCommands = new ArrayList<>();
    private Command undoCommand;

    public RemoteControl() {
        init();
    }

    private void init(){
        NoCommand noCommand = new NoCommand();
        for (int i=0; i<Slot.values().length; i++){
            onCommands.add(i, noCommand);
            offCommands.add(i, noCommand);
        }
        undoCommand = noCommand;
    }

    public void setCommand(Slot slot, Command onComand, Command offCommand){
        onCommands.set(slot.ordinal(), onComand);
        offCommands.set(slot.ordinal(), offCommand);
    }

    public void onButtonWasPushed(Slot slot) {
        onCommands.get(slot.ordinal()).execute();
        undoCommand = onCommands.get(slot.ordinal());
    }

    public void offButtonWasPushed(Slot slot){
        offCommands.get(slot.ordinal()).execute();
        undoCommand = offCommands.get(slot.ordinal());
    }

    public void undoCommandWasPushed(){
        undoCommand.undo();
        System.out.println("\n");
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("\n----- Remote Control ------\n");
        for (int i = 0; i < onCommands.size(); i++) {
            builder.append("[slot ").append(i).append(" ").append(onCommands.get(i).getClass().getSimpleName())
                    .append("   ").append(offCommands.get(i).getClass().getSimpleName()).append("\n");
        }
        builder.append("[undo] ").append(undoCommand.getClass().getSimpleName()).append("\n");

        return builder.toString();
    }

    public enum Slot {
        slot1, slot2, slot3, slot4, slot5, slot6, slot7
    }

}
