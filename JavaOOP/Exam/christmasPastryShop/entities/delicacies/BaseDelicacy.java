package JavaAdvance.JavaOOP.Exam.christmasPastryShop.entities.delicacies;

public abstract class BaseDelicacy {
    private String delicacyName;
    private double portion;
    private double price;

    public String getDelicacyName() {
        return delicacyName;
    }

    public void setDelicacyName(String delicacyName) {
        if(delicacyName.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or white space!");
        }
        this.delicacyName = delicacyName;
    }

    public double getPortion() {
        return portion;
    }

    public void setPortion(double portion) {
        if(portion <= 0) {
            throw new IllegalArgumentException("Portion cannot be less or equal to zero!");
        }
        this.portion = portion;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price <= 0) {
            throw new IllegalArgumentException("Price cannot be less or equal to zero!");
        }
        this.price = price;
    }

    public BaseDelicacy(String delicacyName, double portion, double price) {
        setDelicacyName(delicacyName);
        setPortion(portion);
        setPrice(price);
    }

    @Override
    public String toString() {
        return String.format("%s: %.2fg - %d", this.delicacyName, this.portion, this.price);
    }
}
