package drinks;

import java.math.BigDecimal;

public class DarkRoast extends Beverage {

    @Override
    BigDecimal coust() {
        return new BigDecimal(1.10);
    }

}
