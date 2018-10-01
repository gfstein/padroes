package drinks;

import java.math.BigDecimal;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        setDescription(this.getClass().getSimpleName());
    }

    @Override
    public BigDecimal cost() {
        return new BigDecimal(.89);
    }

}
