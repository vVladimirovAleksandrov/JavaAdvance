package JavaAdvance.JavaOOP.Inheritance.Exercise.Reastaurant.restaurant;

import java.math.BigDecimal;

public class Salmon extends MainDish{
    private final static double SALMON_GRAMS = 22;

    public Salmon(String productName, BigDecimal price) {
        super(productName, price, SALMON_GRAMS);
    }
}
