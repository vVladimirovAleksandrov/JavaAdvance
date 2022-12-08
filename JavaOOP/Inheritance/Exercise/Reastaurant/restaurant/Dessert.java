package JavaAdvance.JavaOOP.Inheritance.Exercise.Reastaurant.restaurant;

import java.math.BigDecimal;

public class Dessert extends Food{
    private double calories;

    public Dessert(String productName, BigDecimal price, double grams, double calories) {
        super(productName, price, grams);
        this.calories = calories;
    }

    public double getCalories() {
        return calories;
    }
}
