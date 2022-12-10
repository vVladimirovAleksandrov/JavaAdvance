package JavaAdvance.JavaOOP.ExamPrep.Structure.Player;

public class Men extends BasePlayer{
    private final static double KG = 85.5;

    public Men(String name, String nationality, int strength) {
        super(name, nationality, KG, strength);
    }

    @Override
    public void stimulation() {
        setStrength(getStrength() + 145);
    }
}
