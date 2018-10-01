package condiment;

import drinks.Beverage;

import java.math.BigDecimal;

public class Whip extends CondimentDecorator{

    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public BigDecimal cost() {
        return new BigDecimal(.10).add(beverage.cost());
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", " + this.getClass().getSimpleName();
    }
}
