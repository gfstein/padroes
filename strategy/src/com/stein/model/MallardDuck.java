package com.stein.model;

import com.stein.comportamentos.FlyWithWings;
import com.stein.comportamentos.Quack;

/**
 * Created by Stein on 03/06/2017.
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        setFly(new FlyWithWings());
        setQuack(new Quack());
    }

    @Override
    public String display() {
        return "Pato BRAVO!!!";
    }
}
