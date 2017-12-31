package com.stein.comportamentos;

import com.stein.interfaces.Quackable;

/**
 * Created by Stein on 04/06/2017.
 */
public class Squeack implements Quackable {
    @Override
    public String quack() {
        return "Squeak";
    }
}
