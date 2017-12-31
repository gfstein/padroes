package com.stein.comportamentos;

import com.stein.interfaces.Quackable;

/**
 * Created by Stein on 04/06/2017.
 */
public class Quack implements Quackable {
    @Override
    public String quack() {
        return "Quack";
    }
}
