package com.stein;

import com.stein.comportamentos.FlyWithWings;
import com.stein.comportamentos.Quack;
import com.stein.comportamentos.Squeack;
import com.stein.model.*;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Duck duck = new Duck() {
            @Override
            public String display() {
                return "Duck";
            }
        };

        for (int i = 0; i < 4; i++) {
            Integer pato = random.nextInt(4);

            if (pato == 0) {
                duck = new DecoyDuck();
                System.out.println(duck.getFly().fly());
                duck.setFly(new FlyWithWings());
                System.out.println(duck.getFly().fly());
            } else if (pato == 1) {
                duck = new MallardDuck();
            } else if (pato == 2) {
                duck = new RedheadDuck();
            } else if (pato == 3) {
                duck = new RubberDuck();
            }

            System.out.println(duck.toString());
        }


        CallDuck call = new CallDuck(new Quack());
        System.out.println("Chamada de pato: " + call.getQuackable().quack());
        call.setQuackable(new Squeack());
        System.out.println("Chamada de pato: " + call.getQuackable().quack());
    }
}
