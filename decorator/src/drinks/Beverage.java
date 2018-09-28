package drinks;

import java.math.BigDecimal;

abstract class Beverage {

    private String description;

    abstract BigDecimal coust();

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
