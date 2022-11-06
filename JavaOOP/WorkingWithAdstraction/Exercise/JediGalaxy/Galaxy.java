package JavaOOP.WorkingWithAdstraction.Exercise.JediGalaxy;

public class Galaxy {
    private Field field;
    private Jedi jedi;
    private EvilPower evilPower;

    public Galaxy(Field field, Jedi jedi, EvilPower evil){
        this.field = field;
        this.jedi = jedi;
        this.evilPower = evil;
    }

    public int moveJedi() {
        return jedi.move(field);
    }

    public void moveEvil() {
        evilPower.move(field);
    }
}
