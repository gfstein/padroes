package store;

import model.Pizza;

public class PizzaStore {

    public Pizza orderPizza() {
        Pizza pizza = new Pizza();
        pizza.setName("teste");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

}
