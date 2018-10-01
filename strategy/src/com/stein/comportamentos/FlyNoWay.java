package com.stein.comportamentos;

import com.stein.interfaces.Flyable;

/**
 * Created by Stein on 04/06/2017.
 */
public class FlyNoWay implements Flyable {
    @Override
    public String fly() {
        return "Não Voa";
    }
}
