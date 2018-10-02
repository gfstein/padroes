package store;

import factory.SimplePizzaFactory;
import model.Pizza;

public class PizzaStore {

    public Pizza orderPizza() {
        Pizza pizza = SimplePizzaFactory.createPizza(Pizza.Type.CHEESE);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

}
