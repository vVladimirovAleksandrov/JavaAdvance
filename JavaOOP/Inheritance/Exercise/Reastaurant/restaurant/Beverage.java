package JavaAdvance.JavaOOP.Inheritance.Exercise.Reastaurant.restaurant;

import java.math.BigDecimal;

public class Beverage extends Product{
    private double milliliters;

    public double getMilliliters() {
        return milliliters;
    }

    public Beverage(String productName, BigDecimal price, double milliliters) {
        super(productName, price);
        this.milliliters = milliliters;
    }
}
