package commands;

import model.CeilingFan;

public abstract class CeilingFanCommand implements Command {

    protected CeilingFan ceilingFan;
    protected CeilingFan.Speed prevSpeed;

    public CeilingFanCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        //Sobrescrever no filho
    }

    @Override
    public void undo() {
        //não existe setSpeed
        switch (prevSpeed){
            case HIGH:
                ceilingFan.high();
                break;
            case MEDIUM:
                ceilingFan.medium();
                break;
            case LOW:
                ceilingFan.low();
                break;
            case OFF:
                ceilingFan.off();
                break;
        }

        System.out.println(ceilingFan.getLocation() + " ceiling fan is on " + ceilingFan.getSpeed());
    }
}
