package JavaOOP.Encapsulation.Exercise.ShoppingSpree;

public class Product {
    private String productName;
    private double cost;

    public String getProductName() {
        return productName;
    }

    private void setProductName(String productName) {
        if(productName.trim().isBlank()){
            throw new IllegalArgumentException("Name cannot be blank");
        }
        this.productName = productName;
    }

    public double getCost() {
        return cost;
    }

    private void setCost(double cost) {
        if(cost < 0) {
            throw new IllegalArgumentException("Cost cannot be negative");
        }
        this.cost = cost;
    }

    public Product(String productName, double cost) {
        this.setProductName(productName);
        this.setCost(cost);
    }
}
