package JavaAdvance.JavaOOP.Exam.christmasPastryShop.repositories;

import JavaAdvance.JavaOOP.Exam.christmasPastryShop.repositories.interfaces.BoothRepository;
import christmasPastryShop.entities.booths.interfaces.Booth;

import java.util.Collection;

public class BoothRepositoryImpl implements BoothRepository<Booth> {
    private Collection<Booth> model;

    @Override
    public Booth getByNumber(int number) {
        return null;
    }

    @Override
    public Collection<Booth> getAll() {
        return null;
    }

    @Override
    public void add(Booth booth) {

    }
}
