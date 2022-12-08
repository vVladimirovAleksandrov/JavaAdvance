package JavaAdvance.JavaOOP.InterfacesAndAbstraction.Lab.CarShop;

public class Audi extends CarImpl implements Rentable{
    private int minPriceForDay;
    private double pricePerDay;



    public Audi(String model, String color, int horsePower, String countryProduced, int minPriceForDay, double pricePerDay) {
        super(model, color, horsePower, countryProduced);
        this.minPriceForDay = minPriceForDay;
        this.pricePerDay = pricePerDay;
    }

    @Override
    public String toString() {
        String result = String.format("This is %s produced in %s and have %d tires\n",
                this.getModel(),
                getCountryProduced(),
                TIRES);
        result += String.format("Minimum rental period of %d days. Price per day %f",
                this.getMinRentDay(),
                this.getPricePerDay());

        return result;
    }

    @Override
    public Integer getMinRentDay() {
        return this.minPriceForDay;
    }

    @Override
    public Double getPricePerDay() {
        return this.pricePerDay;
    }
}
