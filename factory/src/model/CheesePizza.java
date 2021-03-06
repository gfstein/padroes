package model;

import factory.PizzaIngredientFactory;

public class CheesePizza extends Pizza {

    private PizzaIngredientFactory factory;

    public CheesePizza(PizzaIngredientFactory factory) {
        this.factory = factory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing: " + name);
        dough = factory.createDough();
        sauce = factory.createSauce();
        cheese = factory.createCheese();
    }
}
