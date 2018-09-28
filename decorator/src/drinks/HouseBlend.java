package drinks;

import java.math.BigDecimal;

public class HouseBlend extends Beverage {

    @Override
    BigDecimal coust() {
        return new BigDecimal(1.00);
    }

}
