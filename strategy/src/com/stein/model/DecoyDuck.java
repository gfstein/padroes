package com.stein.model;

import com.stein.comportamentos.FlyNoWay;
import com.stein.comportamentos.MuteQuack;

/**
 * Created by Stein on 04/06/2017.
 */
public class DecoyDuck extends Duck {

    public DecoyDuck() {
        setQuack(new MuteQuack());
        setFly(new FlyNoWay());
    }

    @Override
    public String display() {
        return "Pato de MADEIRA!!!";
    }

}
