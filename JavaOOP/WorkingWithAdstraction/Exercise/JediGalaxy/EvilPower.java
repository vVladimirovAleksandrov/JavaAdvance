package JavaOOP.WorkingWithAdstraction.Exercise.JediGalaxy;

public class EvilPower {
    private int row;
    private int col;

    public EvilPower(int[] position) {
        this.row = position[0];
        this.col = position[1];
    }

    public void move(Field field) {
        while (row >= 0 && col >= 0) {
            if (field.isInBounds(row, col)) {
                field.setValue(row, col, 0);
            }
            row--;
            col--;
        }
    }
}
