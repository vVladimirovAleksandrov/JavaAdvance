package JavaAdvance.JavaOOP.Exam.christmasPastryShop.entities.booths;

public class PrivateBooth extends BaseBooths {
    private final static double PRICEPERPERCON = 3.50;

    public PrivateBooth(int boothNumber, int capacity) {
        super(boothNumber, capacity, PRICEPERPERCON);
    }
}
