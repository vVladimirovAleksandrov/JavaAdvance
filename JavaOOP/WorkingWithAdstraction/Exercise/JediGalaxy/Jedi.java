package JavaOOP.WorkingWithAdstraction.Exercise.JediGalaxy;

public class Jedi {
    private int row;
    private int col;

    public Jedi(int[] position){
        this.row = position[0];
        this.col = position[1];
    }

    public int move(Field field) {
        int starsCollected = 0;
        while (row >= 0 && col < field.getColLenght()) {
            if (field.isInBounds(row, col)) {
                starsCollected += field.getValue(row, col);
            }
            col++;
            row--;
        }
        return starsCollected;
    }
}
