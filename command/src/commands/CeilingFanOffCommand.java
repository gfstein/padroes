package commands;

import model.CeilingFan;

public class CeilingFanOffCommand extends CeilingFanCommand {

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        super(ceilingFan);
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.off();
        System.out.println(ceilingFan.getLocation() + " ceiling fan is " + ceilingFan.getSpeed());
    }
}
