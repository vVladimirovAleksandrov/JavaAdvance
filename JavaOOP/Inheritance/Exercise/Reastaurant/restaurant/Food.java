package JavaAdvance.JavaOOP.Inheritance.Exercise.Reastaurant.restaurant;

import java.math.BigDecimal;

public class Food extends Product{
    private double grams;

    public double getGrams() {
        return grams;
    }

    public Food(String productName, BigDecimal price, double grams) {
        super(productName, price);
        this.grams = grams;
    }
}
