package factory;

import model.ingredients.*;

import java.util.Collection;

public interface PizzaIngredientFactory {

    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Collection<Veggies> createVeggies();
    Pepperoni createPepperoni();
    Clam createClam();

}
