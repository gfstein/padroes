package store;

import model.Pizza;

public abstract class PizzaStore {

    public Pizza orderPizza(Pizza.Type type) {
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(Pizza.Type type);

    public enum Type{
        NY, CH, CA
    }

}
