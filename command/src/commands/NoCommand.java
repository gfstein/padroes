package commands;

public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Nops!");
    }

    @Override
    public void undo() {

    }
}
