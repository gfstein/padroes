package model;

public abstract class CaffeineBeverage {

    /**
     * O Padrão Template Method define o esqueleto de um algoritmo dentro de um método,
     * transferindo alguns de seus passos para as subclasses.
     * */
    final public void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract protected void brew();

    abstract protected void addCondiments();

    private void boilWater() {
        System.out.println("Boiling water");
    }

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

}
