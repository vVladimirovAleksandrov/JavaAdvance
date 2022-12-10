package JavaAdvance.JavaOOP.Exam.christmasPastryShop.entities.cocktails;

public class Hibernation extends BaseCocktails {
    private final static double HIBERNATIONPRICE = 4.50;

    public Hibernation(String cocktailName, int size, String brand) {
        super(cocktailName, size, HIBERNATIONPRICE, brand);
    }
}
