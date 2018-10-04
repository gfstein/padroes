package factory;

import model.ingredients.*;

import java.util.ArrayList;
import java.util.Collection;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Collection<Veggies> createVeggies() {
        Collection<Veggies> veggies = new ArrayList<>();
        veggies.add(new Garlic());
        veggies.add(new Onion());
        veggies.add(new Mushroom());
        veggies.add(new RedPepper());

        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clam createClam() {
        return new FreshClam();
    }
}
