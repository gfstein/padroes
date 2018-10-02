import factory.SimpleStoreFactory;
import model.Pizza;
import store.PizzaStore;

public class Main {

    public static void main(String[] args) {
        PizzaStore nyStore = SimpleStoreFactory.createStore(PizzaStore.Type.NY);
        PizzaStore chStore = SimpleStoreFactory.createStore(PizzaStore.Type.CH);

        Pizza pizza = nyStore.orderPizza(Pizza.Type.CHEESE);
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chStore.orderPizza(Pizza.Type.CHEESE);
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }

}
