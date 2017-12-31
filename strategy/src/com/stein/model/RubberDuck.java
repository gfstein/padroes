package com.stein.model;

import com.stein.comportamentos.FlyNoWay;
import com.stein.comportamentos.Squeack;

/**
 * Created by Stein on 04/06/2017.
 */
public class RubberDuck extends Duck {

    public RubberDuck() {
        setFly(new FlyNoWay());
        setQuack(new Squeack());
    }

    @Override
    public String display() {
        return "Pato de BORRACHA";
    }

}
