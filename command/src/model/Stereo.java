package model;

public class Stereo {

    public void on(){
        System.out.println("Stereo On!");
    }

    public void off(){
        System.out.println("Stereo off");
    }

    public void setCD(){
        System.out.println("CD done!");
    }

    public void setVolume(Integer volume) {
        System.out.println("Volume: " + volume);
    }

}
