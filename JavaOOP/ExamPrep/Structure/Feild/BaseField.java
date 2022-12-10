package JavaAdvance.JavaOOP.ExamPrep.Structure.Feild;

import JavaAdvance.JavaOOP.ExamPrep.Structure.Player.BasePlayer;
import JavaAdvance.JavaOOP.ExamPrep.Structure.SupplementRepository.BaseSupplement;

import java.util.List;
import java.util.stream.Collectors;

public abstract class BaseField {
    private String name;
    private int capacity;
    private List<BaseSupplement> supplements;
    private List<BasePlayer> players;

    public BaseField(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public int sumEnergy(){
        return supplements.stream()
                .collect(Collectors.summingInt(BaseSupplement::getEnergy));
    }

    public void addPlayer(BasePlayer player) {
        if(capacity <= players.size()) {
            throw new IllegalStateException("Not enough capacity.");
        }
        players.add(player);
    }

    public void removePlayer(BasePlayer player) {
        players.remove(player);
    }
}
