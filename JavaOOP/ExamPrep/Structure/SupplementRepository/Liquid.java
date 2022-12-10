package JavaAdvance.JavaOOP.ExamPrep.Structure.SupplementRepository;

public class Liquid extends BaseSupplement{
    private final static int ENERGY = 120;
    private final static double PRICE = 15;

    public Liquid() {
        super(ENERGY, PRICE);
    }
}
