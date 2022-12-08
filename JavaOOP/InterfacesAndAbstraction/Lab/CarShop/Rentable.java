package JavaAdvance.JavaOOP.InterfacesAndAbstraction.Lab.CarShop;

public interface Rentable extends Car{
    Integer getMinRentDay();

    Double getPricePerDay();
}
