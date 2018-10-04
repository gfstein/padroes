package store;

import model.Pizza;
import model.ch.CHStyleCheesePizza;
import model.ch.CHStyleGreekPizza;
import model.ch.CHStylePepperoniPizza;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(Pizza.Type type) {
        switch (type){
            case CHEESE:
                return new CHStyleCheesePizza();
            case GREEK:
                return new CHStyleGreekPizza();
            case PEPPERONI:
                return new CHStylePepperoniPizza();
        }

        throw new UnsupportedOperationException("Pizza type " + type.name() + " unsupported");
    }
}
