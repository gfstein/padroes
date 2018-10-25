package commands;

import java.util.Collection;

public class MacroCommand implements Command {

    private Collection<Command> commands;

    public MacroCommand(Collection<Command> commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        commands.forEach(Command::execute);
    }

    @Override
    public void undo() {
        commands.forEach(Command::undo);
    }
}
