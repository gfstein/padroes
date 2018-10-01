package drinks;

import java.math.BigDecimal;

public class Expresso extends Beverage {

    public Expresso() {
        setDescription(this.getClass().getSimpleName());
    }

    @Override
    public BigDecimal cost() {
        return new BigDecimal(1.99);
    }
}
