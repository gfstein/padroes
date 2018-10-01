package condiment;

import drinks.Beverage;

import java.math.BigDecimal;

public class Soy extends CondimentDecorator {

    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public BigDecimal cost() {
        BigDecimal cost = beverage.cost();
        switch (beverage.getSize()){
            case TALL:
                return cost.add(new BigDecimal(.10));
            case GRANDE:
                return cost.add(new BigDecimal(.15));
            case VENTI:
                return cost.add(new BigDecimal(.20));
        }

        return cost;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", " + this.getClass().getSimpleName();
    }
}
