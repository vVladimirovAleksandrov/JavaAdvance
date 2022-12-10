package JavaAdvance.JavaOOP.Exam.christmasPastryShop.entities.delicacies;

public class Gingerbread extends BaseDelicacy{
    private final static double InitialGingerbreadPortion = 200;

    public Gingerbread(String delicacyName, double price) {
        super(delicacyName, InitialGingerbreadPortion, price);
    }
}
