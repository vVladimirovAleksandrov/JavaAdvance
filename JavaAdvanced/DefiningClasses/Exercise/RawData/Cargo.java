package JavaAdvance.JavaAdvanced.DefiningClasses.Exercise.RawData;

public class Cargo {
    private String type;
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    private int weight;
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Cargo(int weight, String type) {
        this.type = type;
        this.weight = weight;
    }
}
