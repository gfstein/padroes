package model;

public abstract class CaffeineBeverage {

    /**
     * O Padr�o Template Method define o esqueleto de um algoritmo dentro de um m�todo,
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
