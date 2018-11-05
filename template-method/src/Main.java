import model.CaffeineBeverage;
import model.Coffee;
import model.Tea;

public class Main {

    public static void main(String[] args) {
        CaffeineBeverage tea = new Tea();
        tea.prepareRecipe();

        System.out.println("\n");

        var coffe = new Coffee();
        coffe.prepareRecipe();

    }

}
