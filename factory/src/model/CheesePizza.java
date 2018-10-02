package model;

public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing: " + this.getClass().getSimpleName());
    }

    @Override
    public void bake() {
        System.out.println("Baking: " + this.getClass().getSimpleName());
    }

    @Override
    public void cut() {
        System.out.println("Cutting: " + this.getClass().getSimpleName());
    }

    @Override
    public void box() {
        System.out.println("Boxing: " + this.getClass().getSimpleName());
    }
}
