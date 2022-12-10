package JavaAdvance.JavaOOP.Exam.christmasPastryShop.repositories;

import JavaAdvance.JavaOOP.Exam.christmasPastryShop.entities.delicacies.interfaces.Delicacy;
import JavaAdvance.JavaOOP.Exam.christmasPastryShop.repositories.interfaces.DelicacyRepository;

import java.util.Collection;

public class DelicacyRepositoryImp implements DelicacyRepository<Delicacy> {
    public Collection<Delicacy> model;


    @Override
    public Delicacy getByName(String name) {
        return null;
    }

    @Override
    public Collection<Delicacy> getAll() {
        return null;
    }

    @Override
    public void add(Delicacy delicacy) {

    }
}
