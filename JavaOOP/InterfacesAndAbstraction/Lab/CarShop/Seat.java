package JavaAdvance.JavaOOP.InterfacesAndAbstraction.Lab.CarShop;

public class Seat extends CarImpl implements Sellable{
    private double price;

    public Seat(String model, String color, int horsePower, String countryProduced, double price) {
        super(model, color, horsePower, countryProduced);
        this.price = price;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        String result = super.toString();
        result += String.format("%s sells for %f", getModel(), getPrice());
        return result;
    }
}
