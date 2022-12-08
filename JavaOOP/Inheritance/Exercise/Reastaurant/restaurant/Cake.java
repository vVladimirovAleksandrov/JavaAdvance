package JavaAdvance.JavaOOP.Inheritance.Exercise.Reastaurant.restaurant;

import java.math.BigDecimal;

public class Cake extends Dessert{
    private final static double CAKE_GRAMS = 250;
    private final static double CAKE_CALORIES = 1000;
    private final static BigDecimal CAKE_PRICE = BigDecimal.valueOf(5);

    public Cake(String productName) {
        super(productName, CAKE_PRICE, CAKE_GRAMS, CAKE_CALORIES);
    }
}
