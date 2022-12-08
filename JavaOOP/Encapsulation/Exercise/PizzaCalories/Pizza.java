package JavaAdvance.JavaOOP.Encapsulation.Exercise.PizzaCalories;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String pizzaName;
    private Dough dough;
    private List<Topping> toppingList;

    public Pizza(String pizzaName, int countOfToppings) {
        this.setPizzaName(pizzaName);
        this.setToppingList(countOfToppings);
    }

    private void setPizzaName(String pizzaName) {
        if(pizzaName.trim().isBlank() || pizzaName.length() > 15) {
            throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
        }
        this.pizzaName = pizzaName;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    private void setToppingList(int countOfToppings) {
        if(countOfToppings < 0 || countOfToppings > 10) {
            throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
        }
        this.toppingList = new ArrayList<>();
    }

    public void addTopping(Topping topping) {
        toppingList.add(topping);
    }

    public String getPizzaName() {
        return pizzaName;
    }

    public double getOverallCalories() {
        return dough.calculateCalories() + toppingList.stream().mapToDouble(Topping::calculateCalories).sum();
    }
}