package commands;

import model.CeilingFan;

public class CeilingFanHighCommand extends CeilingFanCommand {

    public CeilingFanHighCommand(CeilingFan ceilingFan) {
        super(ceilingFan);
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.high();
        System.out.println(ceilingFan.getLocation() + " ceiling fan is on " + ceilingFan.getSpeed());
    }
}
