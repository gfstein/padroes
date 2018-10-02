import model.Pizza;
import store.PizzaStore;

public class Main {

    public static void main(String[] args) {
        PizzaStore store = new PizzaStore();
        Pizza pizza = store.orderPizza();
        System.out.println(pizza);
    }

}
