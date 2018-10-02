package factory;

import store.CaliforniaPizzaStore;
import store.ChicagoPizzaStore;
import store.NYPizzaStore;
import store.PizzaStore;

public class SimpleStoreFactory {

    public static PizzaStore createStore(PizzaStore.Type type) {
        switch (type){
            case CA:
                return new CaliforniaPizzaStore();
            case CH:
                return new ChicagoPizzaStore();
            case NY:
                return new NYPizzaStore();
        }

        throw new UnsupportedOperationException("Unsupported type: " + type.name());
    }

}
