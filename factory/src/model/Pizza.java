package model;

import java.util.ArrayList;
import java.util.Collection;

public abstract class Pizza {

    protected String name;
    protected String dough;
    protected String sauce;
    protected Collection<String> toppings = new ArrayList<>();

    public void prepare() {
        System.out.println("Preparing: " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings: ");
        toppings.forEach(top -> {
            System.out.println("   " + top);
        });
    }

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
}
