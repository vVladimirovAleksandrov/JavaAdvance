package JavaAdvance.JavaOOP.ReflectionAndAnnotation.Exercise.barracksWars;

import JavaAdvance.JavaOOP.ReflectionAndAnnotation.Exercise.barracksWars.core.Engine;
import JavaAdvance.JavaOOP.ReflectionAndAnnotation.Exercise.barracksWars.core.factories.UnitFactoryImpl;
import JavaAdvance.JavaOOP.ReflectionAndAnnotation.Exercise.barracksWars.data.UnitRepository;
import JavaAdvance.JavaOOP.ReflectionAndAnnotation.Exercise.barracksWars.interfaces.Repository;
import JavaAdvance.JavaOOP.ReflectionAndAnnotation.Exercise.barracksWars.interfaces.UnitFactory;

public class Main {

    public static void main(String[] args) {
        Repository repository = new UnitRepository();
        UnitFactory unitFactory = new UnitFactoryImpl();

        Engine engine = new Engine(repository, unitFactory);
        engine.run();
    }
}
