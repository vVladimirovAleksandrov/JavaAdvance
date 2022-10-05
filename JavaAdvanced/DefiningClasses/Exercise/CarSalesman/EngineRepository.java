package JavaAdvanced.DefiningClasses.Exercise.CarSalesman;

import java.util.HashMap;
import java.util.Map;

class EngineRepository {
    private final Map<String, Engine> engines = new HashMap<>();

    public void add(Engine engine) {
        engines.put(engine.getModel(), engine);
    }

    public Engine get(String model) {
        return engines.get(model);
    }
}