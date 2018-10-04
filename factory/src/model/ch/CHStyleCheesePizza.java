package model.ch;

import model.Pizza;

public class CHStyleCheesePizza extends Pizza {

    @Override
    public void prepare() {

    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
