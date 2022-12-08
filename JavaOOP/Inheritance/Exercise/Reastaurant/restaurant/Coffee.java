package JavaAdvance.JavaOOP.Inheritance.Exercise.Reastaurant.restaurant;

import java.math.BigDecimal;

public class Coffee extends HotBeverage{
    private final static double COFFEE_MILLILITERS = 50;
    private final static BigDecimal COFFEE_PRICE = BigDecimal.valueOf(3.50);
    private double caffeine;

    public double getCaffeine() {
        return caffeine;
    }

    public Coffee(String productName, double caffeine) {
        super(productName, COFFEE_PRICE, COFFEE_MILLILITERS);
        this.caffeine = caffeine;
    }
}
