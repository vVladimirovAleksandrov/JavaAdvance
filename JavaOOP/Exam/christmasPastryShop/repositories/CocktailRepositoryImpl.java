package JavaAdvance.JavaOOP.Exam.christmasPastryShop.repositories;

import JavaAdvance.JavaOOP.Exam.christmasPastryShop.entities.cocktails.interfaces.Cocktail;
import JavaAdvance.JavaOOP.Exam.christmasPastryShop.repositories.interfaces.CocktailRepository;

import java.util.Collection;

public class CocktailRepositoryImpl implements CocktailRepository<Cocktail> {
    public Collection<Cocktail> model;

    @Override
    public Cocktail getByName(String name) {
        return null;
    }

    @Override
    public Collection<Cocktail> getAll() {
        return null;
    }

    @Override
    public void add(Cocktail cocktail) {

    }
}
