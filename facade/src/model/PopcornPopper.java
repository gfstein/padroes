package model;

public class PopcornPopper {
    public void on() {
        System.out.println(this.getClass().getSimpleName() + " on");
    }

    public void pop() {
        System.out.println(this.getClass().getSimpleName() + " popping popcorn!");
    }

    public void off() {
        System.out.println(this.getClass().getSimpleName() + " off");
    }
}
