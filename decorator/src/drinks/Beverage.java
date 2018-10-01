package drinks;

import java.math.BigDecimal;

public abstract class Beverage {

    private String description = "Unknown Beverage";

    public abstract BigDecimal cost();

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
