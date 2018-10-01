import condiment.Mocha;
import condiment.Soy;
import condiment.Whip;
import drinks.Beverage;
import drinks.DarkRoast;
import drinks.Expresso;
import drinks.HouseBlend;

import java.math.RoundingMode;

public class StarbuzzCofee {

    public static void main(String[] args) {
        Beverage beverage = new Expresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost().setScale(2, RoundingMode.HALF_EVEN));

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost().setScale(2, RoundingMode.HALF_EVEN));

        Beverage beverage3 = new HouseBlend();
        beverage3.setSize(Beverage.Size.TALL);
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost().setScale(2, RoundingMode.HALF_EVEN));

    }

}
