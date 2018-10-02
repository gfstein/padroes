package store;

import model.Pizza;
import model.ny.NYStyleCheesePizza;
import model.ny.NYStyleGreekPizza;
import model.ny.NYStylePepperoniPizza;

public class NYPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(Pizza.Type type) {
        switch (type){
            case CHEESE:
                return new NYStyleCheesePizza();
            case GREEK:
                return new NYStyleGreekPizza();
            case PEPPERONI:
                return new NYStylePepperoniPizza();
        }

        throw new UnsupportedOperationException("Pizza type " + type.name() + " unsupported");
    }
}
