package model;

import model.ingredients.*;

import java.util.Collection;

public abstract class Pizza {

    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Collection<Veggies> veggies;
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Clam clam;

    public abstract void prepare();

    public void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box(){
        System.out.println("Place pizza in official PizzaStore box");
    }

    @Override
    public String toString() {
        return "Pizza: " + this.getClass().getSimpleName();
    }

    public enum Type {
         CHEESE, GREEK, PEPPERONI, EMPTY
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
