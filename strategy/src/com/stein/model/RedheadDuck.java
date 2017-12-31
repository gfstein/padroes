package com.stein.model;

import com.stein.comportamentos.FlyWithWings;
import com.stein.comportamentos.Quack;

/**
 * Created by Stein on 03/06/2017.
 */
public class RedheadDuck extends Duck {

    public RedheadDuck() {
        setFly(new FlyWithWings());
        setQuack(new Quack());
    }

    @Override
    public String display() {
        return "Pato CABEÇA VERMELHA";
    }
}
