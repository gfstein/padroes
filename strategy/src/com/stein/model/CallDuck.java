package com.stein.model;

import com.stein.interfaces.Quackable;

/**
 * Created by Stein on 04/06/2017.
 */
public class CallDuck {

    private Quackable quackable;

    public CallDuck(Quackable quackable) {
        this.quackable = quackable;
    }

    public Quackable getQuackable() {
        return quackable;
    }

    public void setQuackable(Quackable quackable) {
        this.quackable = quackable;
    }
}
