package com.stein.model;

import com.stein.interfaces.Flyable;
import com.stein.interfaces.Quackable;

/**
 * Created by Stein on 03/06/2017.
 */
public abstract class Duck {

    private Flyable fly;
    private Quackable quack;

    private String swim() {
        return "Swim";
    }

    public abstract String display();

    private String performFly() {
        return fly.fly();
    }

    private String performQuack() {
        return quack.quack();
    }

    @Override
    public String toString() {
        return display() + ", " + swim() + ", " + performFly() + ", " + performQuack();
    }

    public Flyable getFly() {
        return fly;
    }

    public void setFly(Flyable fly) {
        this.fly = fly;
    }

    public Quackable getQuack() {
        return quack;
    }

    public void setQuack(Quackable quack) {
        this.quack = quack;
    }
}
