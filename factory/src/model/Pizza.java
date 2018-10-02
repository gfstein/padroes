package model;

public abstract class Pizza {

    public abstract void prepare();

    public abstract void bake();

    public abstract void cut();

    public abstract void box();

    @Override
    public String toString() {
        return "Pizza: " + this.getClass().getSimpleName();
    }

    public enum Type {
         CHEESE, GREEK, PEPPERONI, EMPTY
    }

}
