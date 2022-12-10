package JavaAdvance.JavaOOP.Exam.christmasPastryShop.entities.cocktails;

public abstract class BaseCocktails {
    private String cocktailName;
    private int size;
    private double price;
    private String brand;

    public void setCocktailName(String cocktailName) {
        if(cocktailName.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or white space!");
        }
        this.cocktailName = cocktailName;
    }

    public void setSize(int size) {
        if(size <= 0){
            throw new IllegalArgumentException("Size cannot be less or equal to zero!");
        }
        this.size = size;
    }

    public void setPrice(double price) {
        if(price <= 0) {
            throw new IllegalArgumentException("Price cannot be less or equal to zero!");
        }
        this.price = price;
    }

    public void setBrand(String brand) {
        if(brand.trim().isEmpty()) {
            throw new IllegalArgumentException("Brand cannot be null or white space!");
        }
        this.brand = brand;
    }

    public BaseCocktails(String cocktailName, int size, double price, String brand) {
        setCocktailName(cocktailName);
        setSize(size);
        setPrice(price);
        setBrand(brand);
    }

    @Override
    public String toString() {
        return String.format("%s %s - %dml - %.2flv", this.cocktailName, this.brand, this.size, this.price);
    }
}
