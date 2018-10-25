import commands.*;
import model.*;

import java.util.ArrayList;
import java.util.Collection;

import static model.RemoteControl.Slot;

public class RemoteLoader {

    public static void main(String[] args) {
//        controlV1();
//        controlV2();
        controlV3();
    }

    private static void controlV3(){
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

        Collection<Command> partyOn = new ArrayList<>();
        partyOn.add(lightOnCommand);
        partyOn.add(garageDoorOpenCommand);
        partyOn.add(stereoOnCommand);

        Collection<Command> partyOff = new ArrayList<>();
        partyOff.add(lightOffCommand);
        partyOff.add(garageDoorCloseCommand);
        partyOff.add(stereoOffCommand);

        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        control.setCommand(Slot.slot1, partyOnMacro, partyOffMacro);

        System.out.println(control);
        System.out.println("--- Pusing Macro On ---");
        control.onButtonWasPushed(Slot.slot1);
        System.out.println("\n--- Pusing Macro Off ---");
        control.offButtonWasPushed(Slot.slot1);
        System.out.println("\n--- Pusing Macro Undo ---");
        control.undoCommandWasPushed();

    }

    private static void controlV1(){
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

    private static void controlV2(){
        RemoteControl control = new RemoteControl();

        CeilingFan ceilingFan = new CeilingFan("Living Room");

        CeilingFanCommand fanMediumCommand = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanCommand fanHighCommand = new CeilingFanHighCommand(ceilingFan);
        CeilingFanCommand fanOffCommand = new CeilingFanOffCommand(ceilingFan);

        control.setCommand(Slot.slot1, fanMediumCommand, fanOffCommand);
        control.setCommand(Slot.slot2, fanHighCommand, fanOffCommand);

        control.onButtonWasPushed(Slot.slot1);
        control.offButtonWasPushed(Slot.slot1);
        System.out.println(control);
        control.undoCommandWasPushed();

        control.onButtonWasPushed(Slot.slot2);
        System.out.println(control);
        control.undoCommandWasPushed();
    }

}
