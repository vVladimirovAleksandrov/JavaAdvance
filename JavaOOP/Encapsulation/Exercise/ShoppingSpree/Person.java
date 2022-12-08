package JavaAdvance.JavaOOP.Encapsulation.Exercise.ShoppingSpree;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Person {
    private String personName;
    private double money;
    private List<Product> products;

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        if(personName.trim().isBlank()){
            throw new IllegalArgumentException("Name cannot be blank");
        }
        this.personName = personName;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        if(money < 0) {
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.money = money;
    }

    public Person(String personName, double money) {
        this.setPersonName(personName);
        this.setMoney(money);
        this.products = new ArrayList<>();
    }

    public void buyProduct(Product product) {
        if(money < product.getCost()) {
            String message = String.format("%s can't afford %s", this.personName, product.getProductName());
            throw new IllegalArgumentException(message);
        }
        products.add(product);
        money -= product.getCost();
    }

    @Override
    public String toString() {
        StringBuilder sd = new StringBuilder();
        sd.append(personName).append(" - ");
        if(products.isEmpty()) {
            sd.append("Nothing bought");
        } else {
            sd.append(products.stream().map(Product::getProductName).collect(Collectors.joining(", ")));
        }
        return sd.toString();
    }
}
