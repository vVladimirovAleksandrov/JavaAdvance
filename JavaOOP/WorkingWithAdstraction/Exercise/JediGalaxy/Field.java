package JavaOOP.WorkingWithAdstraction.Exercise.JediGalaxy;

public class Field {
    private int[][] starsField;

    public Field(int row, int col){
        this.starsField = new int[row][col];
        fillInGalaxy(row, col, starsField);
    }

    private void fillInGalaxy(int rows, int cols, int[][] galaxy) {
        int value = 0;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                galaxy[row][col] = value++;
            }
        }
    }

    public boolean isInBounds(int row, int col) {
        return row >= 0 && row < starsField.length && col >= 0 && col < starsField[row].length;
    }

    public int getValue(int row, int col) {
        return this.starsField[row][col];
    }

    public void setValue(int row, int col, int newValue) {
        starsField[row][col] = newValue;
    }

    public int getColLenght(){
        return starsField[1].length;
    }
}
