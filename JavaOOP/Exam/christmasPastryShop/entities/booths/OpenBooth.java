package JavaAdvance.JavaOOP.Exam.christmasPastryShop.entities.booths;

public class OpenBooth extends BaseBooths {
    private final static double PRICEPERPERCON = 2.50;

    public OpenBooth(int boothNumber, int capacity) {
        super(boothNumber, capacity, PRICEPERPERCON);
    }
}
