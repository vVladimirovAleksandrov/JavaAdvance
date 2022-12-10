package JavaAdvance.JavaOOP.Exam.christmasPastryShop.entities.delicacies;

public class Stolen extends BaseDelicacy{
    private final static double InitialStolenPortion = 250;


    public Stolen(String delicacyName, double price) {
        super(delicacyName, InitialStolenPortion, price);
    }
}
