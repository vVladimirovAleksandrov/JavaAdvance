package JavaAdvance.JavaOOP.ExamPrep.Structure.SupplementRepository;

public abstract class BaseSupplement {
    private int energy;
    private double price;

    public int getEnergy() {
        return energy;
    }

    public double getPrice() {
        return price;
    }

    public BaseSupplement(int energy, double price) {
        this.energy = energy;
        this.price = price;
    }
}
