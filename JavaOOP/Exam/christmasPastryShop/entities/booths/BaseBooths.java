package JavaAdvance.JavaOOP.Exam.christmasPastryShop.entities.booths;

import JavaAdvance.JavaOOP.Exam.christmasPastryShop.entities.cocktails.interfaces.Cocktail;
import JavaAdvance.JavaOOP.Exam.christmasPastryShop.entities.delicacies.interfaces.Delicacy;

import java.util.Collection;

public abstract class BaseBooths {
    private Collection<Delicacy> delicacies;
    private Collection<Cocktail> cocktails;
    private int boothNumber;
    private int capacity;
    private int numberOfPeople;
    private double pricePerPerson;
    private boolean isReserved = false;
    private double price;


    public BaseBooths(int boothNumber, int capacity, double pricePerPerson) {
        this.boothNumber = boothNumber;
        this.capacity = capacity;
        this.pricePerPerson = pricePerPerson;
    }

    public void reserve(int numberOfPeople){
        if(numberOfPeople <= 0) {
            throw new IllegalArgumentException("Cannot place zero or less people!");
        }
        this.numberOfPeople = numberOfPeople;
        this.isReserved = true;
        this.price = this.pricePerPerson * numberOfPeople;
    }

    public double getBill() {
        return 0;
    }

    public void clear() {

    }
}
