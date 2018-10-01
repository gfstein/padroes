package drinks;

import java.math.BigDecimal;

public abstract class Beverage {

    private String description = "Unknown Beverage";
    private Size size = Size.GRANDE;

    public abstract BigDecimal cost();

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public enum Size {
        TALL, GRANDE, VENTI
    }

}

