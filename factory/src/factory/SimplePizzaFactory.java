package factory;

import model.CheesePizza;
import model.GreekPizza;
import model.PepperoniPizza;
import model.Pizza;

public class SimplePizzaFactory {

    public static Pizza createPizza(Pizza.Type type){
        switch (type){
            case CHEESE:
                return new CheesePizza();
            case GREEK:
                return new GreekPizza();
            case PEPPERONI:
                return new PepperoniPizza();
        }

        throw new UnsupportedOperationException("Pizza type " + type.name() + " unsupported");
    }

}
