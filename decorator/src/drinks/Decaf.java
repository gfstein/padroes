package drinks;

import java.math.BigDecimal;

public class Decaf extends Beverage {

    public Decaf() {
        setDescription(this.getClass().getSimpleName());
    }

    @Override
    public BigDecimal cost() {
        return new BigDecimal(.99);
    }
}
