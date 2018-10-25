package model;

public class CeilingFan {

    private String location;
    private Speed speed;

    public CeilingFan(String location) {
        this.location = location;
        this.speed = Speed.OFF;
    }

    public void high(){
        speed = Speed.HIGH;
    }

    public void medium(){
        speed = Speed.MEDIUM;
    }

    public void low(){
        speed = Speed.LOW;
    }

    public void off(){
        speed = Speed.OFF;
    }

    public Speed getSpeed() {
        return speed;
    }

    public String getLocation() {
        return location;
    }

    public enum Speed {
        OFF, LOW, MEDIUM, HIGH
    }

}
