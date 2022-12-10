package JavaAdvance.JavaOOP.ExamPrep.Structure.Player;

public class Women extends BasePlayer {
    private final static double KG = 60;

    public Women(String name, String nationality, int strength) {
        super(name, nationality, KG, strength);
    }

    @Override
    public void stimulation() {
        setStrength(getStrength() + 115);
    }
}
