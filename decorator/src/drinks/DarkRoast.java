package drinks;

import java.math.BigDecimal;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        setDescription(this.getClass().getSimpleName());
    }

    @Override
    public BigDecimal cost() {
        return new BigDecimal(.99);
    }

}
