package JavaAdvance.JavaOOP.Exam.christmasPastryShop.entities.cocktails;

public class MulledWine extends BaseCocktails{
    private final static double MULLEDWINEPRICE = 3.50;

    public MulledWine(String cocktailName, int size, String brand) {
        super(cocktailName, size, MULLEDWINEPRICE, brand);
    }
}
