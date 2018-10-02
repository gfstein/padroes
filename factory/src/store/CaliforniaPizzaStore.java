package store;

import model.Pizza;
import model.ca.CAStyleCheesePizza;
import model.ca.CAStyleGreekPizza;
import model.ca.CAStylePepperoniPizza;

public class CaliforniaPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(Pizza.Type type) {
        switch (type){
            case CHEESE:
                return new CAStyleCheesePizza();
            case GREEK:
                return new CAStyleGreekPizza();
            case PEPPERONI:
                return new CAStylePepperoniPizza();
        }

        throw new UnsupportedOperationException("Pizza type " + type.name() + " unsupported");
    }
}
