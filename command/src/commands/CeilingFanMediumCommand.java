package commands;

import model.CeilingFan;

public class CeilingFanMediumCommand extends CeilingFanCommand {

    public CeilingFanMediumCommand(CeilingFan ceilingFan) {
        super(ceilingFan);
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.medium();
        System.out.println(ceilingFan.getLocation() + " ceiling fan is on " + ceilingFan.getSpeed());
    }
}
