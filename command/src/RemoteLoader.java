import commands.*;
import model.GarageDoor;
import model.Light;
import model.RemoteControl;
import model.Stereo;

import static model.RemoteControl.Slot;

public class RemoteLoader {

    public static void main(String[] args) {
        RemoteControl control = new RemoteControl();

        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();
        Stereo stereo = new Stereo();

        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageDoorCloseCommand = new GarageDoorCloseCommand(garageDoor);
        StereoOnWithCDCommand stereoOnCommand = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

        control.setCommand(Slot.slot1, lightOnCommand, lightOffCommand);
        control.setCommand(Slot.slot2, garageDoorOpenCommand, garageDoorCloseCommand);
        control.setCommand(Slot.slot3, stereoOnCommand, stereoOffCommand);

        System.out.println(control);

        control.onButtonWasPushed(Slot.slot1);
        control.offButtonWasPushed(Slot.slot1);
        System.out.println(control);
        control.undoCommandWasPushed();

        control.onButtonWasPushed(Slot.slot2);
        control.offButtonWasPushed(Slot.slot2);
        System.out.println(control);
        control.undoCommandWasPushed();

        control.onButtonWasPushed(Slot.slot3);
        control.offButtonWasPushed(Slot.slot3);
        System.out.println(control);
        control.undoCommandWasPushed();

    }

}
