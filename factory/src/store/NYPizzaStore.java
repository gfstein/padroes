package store;

import factory.NYPizzaIngredientFactory;
import factory.PizzaIngredientFactory;
import model.CheesePizza;
import model.Pizza;

public class NYPizzaStore extends PizzaStore {

    private PizzaIngredientFactory factory = new NYPizzaIngredientFactory();

    @Override
    protected Pizza createPizza(Pizza.Type type) {

        Pizza pizza = null;

        if (type.equals(Pizza.Type.CHEESE)){
            pizza = new CheesePizza(factory);
            pizza.setName("Pizza de Queijo no Estilo de Nova York");
        }

        return pizza;
    }
}
